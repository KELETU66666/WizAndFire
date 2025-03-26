
package com.keletu.kpack.proxy;


import com.keletu.kpack.item.ItemArmorFireMage;
import com.keletu.kpack.item.ItemArmorIceMage;
import com.keletu.kpack.item.ItemArmorLightningMage;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;

public class CommonProxy {

    public static Item HelmIceMage = new ItemArmorIceMage("mage_ice_helmet", EntityEquipmentSlot.HEAD);
    public static Item ChestIceMage = new ItemArmorIceMage("mage_ice_chestplate", EntityEquipmentSlot.CHEST);
    public static Item LegsIceMage = new ItemArmorIceMage("mage_ice_leggings", EntityEquipmentSlot.LEGS);
    public static Item BootsIceMage = new ItemArmorIceMage("mage_ice_boots", EntityEquipmentSlot.FEET);
    public static Item HelmFireMage = new ItemArmorFireMage("mage_fire_helmet", EntityEquipmentSlot.HEAD);
    public static Item ChestFireMage = new ItemArmorFireMage("mage_fire_chestplate", EntityEquipmentSlot.CHEST);
    public static Item LegsFireMage = new ItemArmorFireMage("mage_fire_leggings", EntityEquipmentSlot.LEGS);
    public static Item BootsFireMage = new ItemArmorFireMage("mage_fire_boots", EntityEquipmentSlot.FEET);
    public static Item HelmLightningMage = new ItemArmorLightningMage("mage_lightning_helmet", EntityEquipmentSlot.HEAD);
    public static Item ChestLightningMage = new ItemArmorLightningMage("mage_lightning_chestplate", EntityEquipmentSlot.CHEST);
    public static Item LegsLightningMage = new ItemArmorLightningMage("mage_lightning_leggings", EntityEquipmentSlot.LEGS);
    public static Item BootsLightningMage = new ItemArmorLightningMage("mage_lightning_boots", EntityEquipmentSlot.FEET);
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(HelmIceMage);
        event.getRegistry().register(HelmFireMage);
        event.getRegistry().register(HelmLightningMage);

        event.getRegistry().register(ChestIceMage);
        event.getRegistry().register(ChestFireMage);
        event.getRegistry().register(ChestLightningMage);

        event.getRegistry().register(LegsIceMage);
        event.getRegistry().register(LegsFireMage);
        event.getRegistry().register(LegsLightningMage);

        event.getRegistry().register(BootsIceMage);
        event.getRegistry().register(BootsFireMage);
        event.getRegistry().register(BootsLightningMage);
    }

    @SideOnly(Side.CLIENT)
    public void modelRegistryEvent(ModelRegistryEvent event) {

    }

    public void spawnParticle(EnumParticleTypes type, double x, double y, double z, Color color, double velX, double velY, double velZ) {
    }
}
