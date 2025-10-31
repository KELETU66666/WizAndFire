package com.keletu.wizandfire.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Streams;
import com.keletu.wizandfire.WizAndFire;
import com.keletu.wizandfire.proxy.CommonProxy;
import electroblob.wizardry.Wizardry;
import electroblob.wizardry.client.DrawingUtils;
import electroblob.wizardry.constants.Element;
import electroblob.wizardry.event.SpellCastEvent;
import electroblob.wizardry.item.IManaStoringItem;
import electroblob.wizardry.item.IWorkbenchItem;
import electroblob.wizardry.item.ItemCrystal;
import electroblob.wizardry.registry.WizardryItems;
import electroblob.wizardry.registry.WizardryPotions;
import electroblob.wizardry.registry.WizardryRecipes;
import electroblob.wizardry.registry.WizardryTabs;
import electroblob.wizardry.spell.Spell;
import electroblob.wizardry.util.InventoryUtils;
import electroblob.wizardry.util.SpellModifiers;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentMending;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.EntityEquipmentSlot.Type;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Supplier;

@EventBusSubscriber
public class ItemWizardArmorSpecial extends ItemArmor implements IWorkbenchItem, IManaStoringItem {
    private static final UUID WARLOCK_SPEED_BOOST_UUID = UUID.fromString("4bad7152-2663-4b1b-bb59-552e92847031");
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public Element element;
    public final ArmourClass armourClass;

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        Multimap<String, AttributeModifier> multimap = this.getItemAttributeModifiers(slot);
        if (slot == this.armorType && !((ItemWizardArmorSpecial) stack.getItem()).isManaEmpty(stack)) {
            multimap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIERS[slot.getIndex()], "Armor modifier", CommonProxy.mat.getDamageReductionAmount(slot), 0));
            multimap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(ARMOR_MODIFIERS[slot.getIndex()], "Armor toughness", CommonProxy.mat.getToughness(), 0));
        }

        return multimap;
    }

    public ItemWizardArmorSpecial(ArmourClass armourClass, EntityEquipmentSlot armourType, Element element) {
        super(armourClass.material, 1, armourType);
        this.armourClass = armourClass;
        this.element = element;
        this.setCreativeTab(WizardryTabs.GEAR);
        WizardryRecipes.addToManaFlaskCharging(this);
    }

    public void setDamage(ItemStack stack, int damage) {
        if (stack.getItemDamage() < damage) {
            super.setDamage(stack, Math.min(damage, stack.getMaxDamage()));
        }

    }

    public void setMana(ItemStack stack, int mana) {
        super.setDamage(stack, this.getManaCapacity(stack) - mana);
    }

    public int getMana(ItemStack stack) {
        return this.getManaCapacity(stack) - this.getDamage(stack);
    }

    public int getManaCapacity(ItemStack stack) {
        return this.getMaxDamage(stack);
    }

    public int getRGBDurabilityForDisplay(ItemStack stack) {
        return DrawingUtils.mix(16747518, 9318116, (float) this.getDurabilityForDisplay(stack));
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();

        if (equipmentSlot == this.armorType) {
            multimap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor modifier", CommonProxy.mat.getDamageReductionAmount(equipmentSlot), 0));
            multimap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor toughness", CommonProxy.mat.getToughness(), 0));
        }

        return multimap;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced) {
        if (this.element != null) {
            tooltip.add(Wizardry.proxy.translate("item.ebwizardry:wizard_armour.element_cost_reduction", (new Style()).setColor(TextFormatting.DARK_GRAY), (int) (this.armourClass.elementalCostReduction * 100.0F), this.element.getDisplayName()));
        }

        if (this.armourClass == ItemWizardArmorSpecial.ArmourClass.SAGE) {
            tooltip.add(Wizardry.proxy.translate("item.ebwizardry:wizard_armour.enchantability", (new Style()).setColor(TextFormatting.BLUE)));
        }

        if (this.armourClass.cooldownReduction > 0.0F) {
            tooltip.add(Wizardry.proxy.translate("item.ebwizardry:wizard_armour.cooldown_reduction", (new Style()).setColor(TextFormatting.DARK_GRAY), (int) (this.armourClass.cooldownReduction * 100.0F)));
        }

        tooltip.add(Wizardry.proxy.translate("item.ebwizardry:wizard_armour.full_set", (new Style()).setColor(TextFormatting.AQUA)));
        Object args = new Object[0];
        if (this.armourClass == ItemWizardArmorSpecial.ArmourClass.SAGE) {
            args = 20;
        }

        if (this.armourClass == ItemWizardArmorSpecial.ArmourClass.WARLOCK) {
            args = 20;
        }

        tooltip.add(Wizardry.proxy.translate("item.ebwizardry:" + this.armourClass.name + "_armour.full_set_bonus", (new Style()).setColor(TextFormatting.AQUA), args));

        if (WizAndFire.isRotnEdition)
            tooltip.add(net.minecraft.client.resources.I18n.format("item.dragonscales_armor.desc"));
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (this.armorType == EntityEquipmentSlot.HEAD && player.ticksExisted % 20 == 0 && isWearingFullSet(player, this.element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE) && doAllArmourPiecesHaveMana(player)) {
            player.addPotionEffect(new PotionEffect(WizardryPotions.ward, 219, 0, true, false));
        }

    }

    protected void applySpellModifiers(EntityLivingBase caster, Spell spell, SpellModifiers modifiers) {
        if (spell.getElement() == this.element) {
            modifiers.set("cost", modifiers.get("cost") - this.armourClass.elementalCostReduction, false);
        }

        modifiers.set(WizardryItems.cooldown_upgrade, modifiers.get(WizardryItems.cooldown_upgrade) - this.armourClass.cooldownReduction, true);
        if (this.armorType == EntityEquipmentSlot.HEAD && isWearingFullSet(caster, this.element, this.armourClass) && doAllArmourPiecesHaveMana(caster) && this.armourClass == ItemWizardArmorSpecial.ArmourClass.SAGE && spell.getElement() != this.element) {
            modifiers.set("cost", 0.8F, false);
        }

    }

    public String getItemStackDisplayName(ItemStack stack) {
        return (this.element == null ? "" : this.element.getFormattingCode()) + super.getItemStackDisplayName(stack);
    }

    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armourSlot, ModelBiped original) {
        return armourSlot == EntityEquipmentSlot.LEGS && !entityLiving.isInvisible() ? null : Wizardry.proxy.getWizardArmourModel(this.getArmorMaterial());
    }

    public boolean getIsRepairable(ItemStack stack, ItemStack material) {
        return false;
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return !(enchantment instanceof EnchantmentMending) && super.canApplyAtEnchantingTable(stack, enchantment);
    }

    public boolean showTooltip(ItemStack stack) {
        return true;
    }

    public int getSpellSlotCount(ItemStack stack) {
        return 0;
    }

    public boolean onApplyButtonPressed(EntityPlayer player, Slot centre, Slot crystals, Slot upgrade, Slot[] spellBooks) {
        boolean changed = false;
        if (crystals.getStack() != ItemStack.EMPTY && !this.isManaFull(centre.getStack())) {
            int chargeDepleted = this.getManaCapacity(centre.getStack()) - this.getMana(centre.getStack());
            int manaPerItem = crystals.getStack().getItem() instanceof IManaStoringItem ? ((IManaStoringItem) crystals.getStack().getItem()).getMana(crystals.getStack()) : (crystals.getStack().getItem() instanceof ItemCrystal ? 100 : 10);
            if (crystals.getStack().getItem() == WizardryItems.crystal_shard) {
                manaPerItem = 10;
            }

            if (crystals.getStack().getItem() == WizardryItems.grand_crystal) {
                manaPerItem = 400;
            }

            if (crystals.getStack().getCount() * manaPerItem < chargeDepleted) {
                this.rechargeMana(centre.getStack(), crystals.getStack().getCount() * 100);
                crystals.decrStackSize(crystals.getStack().getCount());
            } else {
                this.setMana(centre.getStack(), this.getManaCapacity(centre.getStack()));
                crystals.decrStackSize((int) Math.ceil((double) chargeDepleted / 100.0));
            }

            changed = true;
        }

        return changed;
    }

    @SubscribeEvent
    public static void onLivingEquipmentChangeEvent(LivingEquipmentChangeEvent event) {
        IAttributeInstance movementSpeed = event.getEntityLiving().getAttributeMap().getAttributeInstance(SharedMonsterAttributes.MOVEMENT_SPEED);
        if (isWearingFullSet(event.getEntityLiving(), null, ItemWizardArmorSpecial.ArmourClass.WARLOCK) && doAllArmourPiecesHaveMana(event.getEntityLiving())) {
            if (movementSpeed.getModifier(WARLOCK_SPEED_BOOST_UUID) == null) {
                movementSpeed.applyModifier(new AttributeModifier(WARLOCK_SPEED_BOOST_UUID, "Warlock set bonus", 0.20000000298023224, 1));
            }
        } else {
            movementSpeed.removeModifier(WARLOCK_SPEED_BOOST_UUID);
        }

    }

    @SubscribeEvent(
            priority = EventPriority.LOW
    )
    public static void onSpellCastPreEvent(SpellCastEvent.Pre event) {
        if (event.getCaster() != null) {
            SpellModifiers armourModifiers = new SpellModifiers();
            Arrays.stream(InventoryUtils.ARMOUR_SLOTS).map((s) -> {
                return event.getCaster().getItemStackFromSlot(s).getItem();
            }).filter((i) -> {
                return i instanceof ItemWizardArmorSpecial;
            }).forEach((i) -> {
                ((ItemWizardArmorSpecial) i).applySpellModifiers(event.getCaster(), event.getSpell(), armourModifiers);
            });
            event.getModifiers().combine(armourModifiers);
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    public static int getMatchingArmourCount(EntityLivingBase entity, Element element) {
        return (int) Arrays.stream(InventoryUtils.ARMOUR_SLOTS).map((s) -> {
            return entity.getItemStackFromSlot(s).getItem();
        }).filter((i) -> {
            return i instanceof ItemWizardArmorSpecial && ((ItemWizardArmorSpecial) i).element == element;
        }).count();
    }

    public static Item getArmour(Element element, ArmourClass armourClass, EntityEquipmentSlot slot) {
        if (slot != null && slot.getSlotType() == Type.ARMOR) {
            if (element == null) {
                element = Element.MAGIC;
            }

            String registryName = armourClass.name + "_" + armourClass.armourPieceNames.get(slot);
            if (element != Element.MAGIC) {
                registryName = registryName + "_" + element.getName();
            }

            return Item.REGISTRY.getObject(new ResourceLocation("ebwizardry", registryName));
        } else {
            throw new IllegalArgumentException("Must be a valid armour slot");
        }
    }

    public static boolean isWearingFullSet(EntityLivingBase entity, @Nullable Element element, @Nullable ArmourClass armourClass) {
        ItemStack helmet = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (!(helmet.getItem() instanceof ItemWizardArmorSpecial)) {
            return false;
        } else {
            Element e = element == null ? ((ItemWizardArmorSpecial) helmet.getItem()).element : element;
            ArmourClass ac = armourClass == null ? ((ItemWizardArmorSpecial) helmet.getItem()).armourClass : armourClass;
            return Arrays.stream(InventoryUtils.ARMOUR_SLOTS).allMatch((s) -> {
                return entity.getItemStackFromSlot(s).getItem() instanceof ItemWizardArmorSpecial && ((ItemWizardArmorSpecial) entity.getItemStackFromSlot(s).getItem()).element == e && ((ItemWizardArmorSpecial) entity.getItemStackFromSlot(s).getItem()).armourClass == ac;
            });
        }
    }

    public static boolean doAllArmourPiecesHaveMana(EntityLivingBase entity) {
        return Arrays.stream(InventoryUtils.ARMOUR_SLOTS).noneMatch((s) -> {
            return entity.getItemStackFromSlot(s).getItem() instanceof IManaStoringItem && ((IManaStoringItem) entity.getItemStackFromSlot(s).getItem()).isManaEmpty(entity.getItemStackFromSlot(s));
        });
    }

    @SubscribeEvent
    public static void onLivingSetAttackTargetEvent(LivingSetAttackTargetEvent event) {
        if (event.getTarget() instanceof EntityPlayer && event.getEntityLiving() instanceof EntityLiving && event.getEntityLiving().isInvisible()) {
            int armourPieces = (int) Streams.stream(event.getTarget().getArmorInventoryList()).filter((s) -> {
                return !s.isEmpty() && !(s.getItem() instanceof ItemWizardArmorSpecial);
            }).count();
            if (armourPieces == 0) {
                return;
            }

            IAttributeInstance attribute = event.getEntityLiving().getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
            double followRange = attribute == null ? 16.0 : attribute.getAttributeValue();
            if (event.getTarget().isSneaking()) {
                followRange *= 0.8;
            }

            float f = (float) armourPieces / (float) ((EntityPlayer) event.getTarget()).inventory.armorInventory.size();
            if (f < 0.1F) {
                f = 0.1F;
            }

            followRange *= 0.7F * f;
            if ((double) event.getTarget().getDistance(event.getEntity()) > followRange) {
                ((EntityLiving) event.getEntityLiving()).setAttackTarget(null);
            }
        }

    }

    public enum ArmourClass {
        SAGE(CommonProxy.mat, () -> WizardryItems.resplendent_thread, "sage", 0.2F, 0.0F, "hat", "robe", "leggings", "boots"),
        BATTLEMAGE(CommonProxy.mat, () -> WizardryItems.crystal_silver_plating, "battlemage", 0.05F, 0.05F, "helmet", "chestplate", "leggings", "boots"),
        WARLOCK(CommonProxy.mat, () -> WizardryItems.ethereal_crystalweave, "warlock", 0.1F, 0.1F, "hood", "robe", "leggings", "boots");

        final ItemArmor.ArmorMaterial material;
        final Supplier<Item> upgradeItem;
        final float elementalCostReduction;
        final float cooldownReduction;
        final String name;
        final Map<EntityEquipmentSlot, String> armourPieceNames;

        ArmourClass(ItemArmor.ArmorMaterial material, Supplier upgradeItem, String name, float elementalCostReduction, float cooldownReduction, String... armourPieceNames) {
            this.material = material;
            this.upgradeItem = upgradeItem;
            this.name = name;
            this.elementalCostReduction = elementalCostReduction;
            this.cooldownReduction = cooldownReduction;
            if (armourPieceNames.length != 4) {
                throw new IllegalArgumentException("armourPieceNames must have a length of 4");
            } else {
                this.armourPieceNames = new EnumMap(EntityEquipmentSlot.class);
                this.armourPieceNames.put(EntityEquipmentSlot.HEAD, armourPieceNames[0]);
                this.armourPieceNames.put(EntityEquipmentSlot.CHEST, armourPieceNames[1]);
                this.armourPieceNames.put(EntityEquipmentSlot.LEGS, armourPieceNames[2]);
                this.armourPieceNames.put(EntityEquipmentSlot.FEET, armourPieceNames[3]);
            }
        }
    }
}
