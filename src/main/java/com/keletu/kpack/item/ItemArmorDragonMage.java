package com.keletu.kpack.item;

import com.keletu.kpack.KPack;
import electroblob.wizardry.constants.Element;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmorDragonMage extends ItemWizardArmorSpecial {
    public final EntityEquipmentSlot slot;
    public final int type;

    public ItemArmorDragonMage(String name, EntityEquipmentSlot slot, int type) {
        super(ArmourClass.WARLOCK, slot, type == 1 ? Element.ICE : type == 2 ? Element.LIGHTNING : Element.FIRE);
        this.slot = slot;
        this.type = type;
        this.setCreativeTab(KPack.tabKPG);
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
        switch (this.type) {
            case 1:
                return "kpack:textures/models/armor/texture_mage_ice.png";
            case 2:
                return "kpack:textures/models/armor/texture_mage_lightning.png";
            default:
                return "kpack:textures/models/armor/texture_mage_fire.png";
        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _deafult) {
        return KPack.proxy.getWarlockModel().get(this);
    }
}
