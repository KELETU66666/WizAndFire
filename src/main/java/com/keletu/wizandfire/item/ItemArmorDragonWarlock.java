package com.keletu.wizandfire.item;

import com.keletu.wizandfire.WizAndFire;
import com.keletu.wizandfire.WizAndFireConfig;
import electroblob.wizardry.constants.Element;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmorDragonWarlock extends ItemWizardArmorSpecial {
    public final EntityEquipmentSlot slot;
    public final int type;

    public ItemArmorDragonWarlock(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot, int type) {
        super(material, renderIndex, slot, type == 1 ? Element.ICE : type == 2 ? Element.LIGHTNING : Element.FIRE);
        this.slot = slot;
        this.type = type;
        this.setCreativeTab(WizAndFire.tabKPG);
        setRegistryName(WizAndFire.MOD_ID, name);
        setTranslationKey(WizAndFire.MOD_ID + "." + name);

        this.setCreativeTab(WizAndFire.tabKPG);
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
        switch (this.type) {
            case 1:
                return "wizandfire:textures/models/armor/texture_warlock_ice.png";
            case 2:
                return "wizandfire:textures/models/armor/" + (WizAndFireConfig.diamondLightning ? "diamond_warlock_lightning.png": "texture_warlock_lightning.png");
            default:
                return "wizandfire:textures/models/armor/texture_warlock_fire.png";
        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _deafult) {
        return WizAndFire.proxy.getWarlockModel().get(this);
    }
}
