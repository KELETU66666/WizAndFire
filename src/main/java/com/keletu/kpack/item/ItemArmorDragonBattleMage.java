package com.keletu.kpack.item;

import com.google.common.collect.Multimap;
import com.keletu.kpack.KPack;
import com.keletu.kpack.proxy.CommonProxy;
import com.keletu.kpack.util.ModelFireBattleMage;
import com.keletu.kpack.util.ModelIceBattleMage;
import com.keletu.kpack.util.ModelLightningBattleMage;
import electroblob.wizardry.constants.Element;
import electroblob.wizardry.item.ItemWizardArmour;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = KPack.MOD_ID)
public class ItemArmorDragonBattleMage extends ItemWizardArmour implements IScaleArmor{
    public final EntityEquipmentSlot slot;
    public final int type;
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public ItemArmorDragonBattleMage(String name, EntityEquipmentSlot slot, int type) {
        super(ArmourClass.BATTLEMAGE, slot, type == 1 ? Element.ICE : type == 2 ? Element.LIGHTNING : Element.FIRE);
        this.slot = slot;
        this.type = type;
        setRegistryName(KPack.MOD_ID, name);
        setTranslationKey(KPack.MOD_ID + "." + name);

        this.setCreativeTab(KPack.tabKPG);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return super.getIsRepairable(toRepair, repair);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        switch (this.type){
            case 1:
                return "kpack:textures/models/armor/texture_battlemage_ice.png";
            case 2:
                return "kpack:textures/models/armor/texture_battlemage_lightning.png";
            default:
                return "kpack:textures/models/armor/texture_battlemage_fire.png";
        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _deafult) {
        switch (this.type){
            case 1:
                return new ModelIceBattleMage(this.slot == EntityEquipmentSlot.LEGS);
            case 2:
                return new ModelLightningBattleMage(this.slot == EntityEquipmentSlot.LEGS);
            default:
                return new ModelFireBattleMage(this.slot == EntityEquipmentSlot.LEGS);
        }
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
        if (slot == this.armorType && !((ItemWizardArmour)stack.getItem()).isManaEmpty(stack)) {
            multimap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIERS[slot.getIndex()], "Armor modifier", CommonProxy.mat.getDamageReductionAmount(slot), 0));
            multimap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(ARMOR_MODIFIERS[slot.getIndex()], "Armor toughness", CommonProxy.mat.getToughness(), 0));
        }

        return multimap;
    }

    //@Override
    //@SideOnly(Side.CLIENT)
    //public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
    //    tooltip.add(TextFormatting.DARK_PURPLE + I18n.format("kgears.dragonscale.ender"));
    //    tooltip.add(I18n.format("item.enderarmor_armor.desc5"));
    //    tooltip.add("");
//
    //    switch (slot) {
    //        case HEAD:
    //            tooltip.add(I18n.format("item.enderarmor_armor.desc1"));
    //            break;
    //        case CHEST:
    //            tooltip.add(I18n.format("item.enderarmor_armor.desc2") + " " + KPack.CONFIG.maxJumpCount + I18n.format("item.enderarmor_armor.desc2_1"));
    //            break;
    //        case LEGS:
    //            tooltip.add(I18n.format("item.enderarmor_armor.desc3"));
    //            break;
    //        case FEET:
    //            tooltip.add(I18n.format("item.enderarmor_armor.desc4"));
    //            break;
    //    }
//
    //    super.addInformation(stack, worldIn, tooltip, flagIn);
    //}
}
