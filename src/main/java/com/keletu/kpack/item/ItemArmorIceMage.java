package com.keletu.kpack.item;

import com.keletu.kpack.KPack;
import com.keletu.kpack.util.ModelIceMageArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = KPack.MOD_ID)
public class ItemArmorIceMage extends ItemArmor {
    public final EntityEquipmentSlot slot;

    public ItemArmorIceMage(String name, EntityEquipmentSlot slot) {
        super(ArmorMaterial.DIAMOND, 0, slot);
        this.slot = slot;
        setRegistryName(KPack.MOD_ID, name);
        setTranslationKey(name);
        setCreativeTab(CreativeTabs.COMBAT);
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
        return "kpack:textures/models/armor/texture_mage_ice.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _deafult) {
        return new ModelIceMageArmor(
                this.slot == EntityEquipmentSlot.LEGS
        );
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
