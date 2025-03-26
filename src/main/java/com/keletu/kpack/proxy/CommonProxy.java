
package com.keletu.kpack.proxy;


import com.keletu.kpack.item.ItemArmorDragonBattleMage;
import com.keletu.kpack.item.ItemArmorDragonMage;
import com.keletu.kpack.item.ItemArmorDragonSage;
import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonProxy {
    //Mage
    public static Item HelmFireMage = new ItemArmorDragonMage("mage_fire_helmet", EntityEquipmentSlot.HEAD, 0);
    public static Item ChestFireMage = new ItemArmorDragonMage("mage_fire_chestplate", EntityEquipmentSlot.CHEST, 0);
    public static Item LegsFireMage = new ItemArmorDragonMage("mage_fire_leggings", EntityEquipmentSlot.LEGS, 0);
    public static Item BootsFireMage = new ItemArmorDragonMage("mage_fire_boots", EntityEquipmentSlot.FEET, 0);
    public static Item HelmIceMage = new ItemArmorDragonMage("mage_ice_helmet", EntityEquipmentSlot.HEAD, 1);
    public static Item ChestIceMage = new ItemArmorDragonMage("mage_ice_chestplate", EntityEquipmentSlot.CHEST, 1);
    public static Item LegsIceMage = new ItemArmorDragonMage("mage_ice_leggings", EntityEquipmentSlot.LEGS, 1);
    public static Item BootsIceMage = new ItemArmorDragonMage("mage_ice_boots", EntityEquipmentSlot.FEET, 1);
    public static Item HelmLightningMage = new ItemArmorDragonMage("mage_lightning_helmet", EntityEquipmentSlot.HEAD, 2);
    public static Item ChestLightningMage = new ItemArmorDragonMage("mage_lightning_chestplate", EntityEquipmentSlot.CHEST, 2);
    public static Item LegsLightningMage = new ItemArmorDragonMage("mage_lightning_leggings", EntityEquipmentSlot.LEGS, 2);
    public static Item BootsLightningMage = new ItemArmorDragonMage("mage_lightning_boots", EntityEquipmentSlot.FEET, 2);

    //Sage
    public static Item HelmFireSage = new ItemArmorDragonSage("sage_fire_helmet", EntityEquipmentSlot.HEAD, 0);
    public static Item ChestFireSage = new ItemArmorDragonSage("sage_fire_chestplate", EntityEquipmentSlot.CHEST, 0);
    public static Item LegsFireSage = new ItemArmorDragonSage("sage_fire_leggings", EntityEquipmentSlot.LEGS, 0);
    public static Item BootsFireSage = new ItemArmorDragonSage("sage_fire_boots", EntityEquipmentSlot.FEET, 0);
    public static Item HelmIceSage = new ItemArmorDragonSage("sage_ice_helmet", EntityEquipmentSlot.HEAD, 1);
    public static Item ChestIceSage = new ItemArmorDragonSage("sage_ice_chestplate", EntityEquipmentSlot.CHEST, 1);
    public static Item LegsIceSage = new ItemArmorDragonSage("sage_ice_leggings", EntityEquipmentSlot.LEGS, 1);
    public static Item BootsIceSage = new ItemArmorDragonSage("sage_ice_boots", EntityEquipmentSlot.FEET, 1);
    public static Item HelmLightningSage = new ItemArmorDragonSage("sage_lightning_helmet", EntityEquipmentSlot.HEAD, 2);
    public static Item ChestLightningSage = new ItemArmorDragonSage("sage_lightning_chestplate", EntityEquipmentSlot.CHEST, 2);
    public static Item LegsLightningSage = new ItemArmorDragonSage("sage_lightning_leggings", EntityEquipmentSlot.LEGS, 2);
    public static Item BootsLightningSage = new ItemArmorDragonSage("sage_lightning_boots", EntityEquipmentSlot.FEET, 2);


    //Battle Mage
    public static Item HelmFireBattleMage = new ItemArmorDragonBattleMage("battlemage_fire_helmet", EntityEquipmentSlot.HEAD, 0);
    public static Item ChestFireBattleMage = new ItemArmorDragonBattleMage("battlemage_fire_chestplate", EntityEquipmentSlot.CHEST, 0);
    public static Item LegsFireBattleMage = new ItemArmorDragonBattleMage("battlemage_fire_leggings", EntityEquipmentSlot.LEGS, 0);
    public static Item BootsFireBattleMage = new ItemArmorDragonBattleMage("battlemage_fire_boots", EntityEquipmentSlot.FEET, 0);
    public static Item HelmIceBattleMage = new ItemArmorDragonBattleMage("battlemage_ice_helmet", EntityEquipmentSlot.HEAD, 1);
    public static Item ChestIceBattleMage = new ItemArmorDragonBattleMage("battlemage_ice_chestplate", EntityEquipmentSlot.CHEST, 1);
    public static Item LegsIceBattleMage = new ItemArmorDragonBattleMage("battlemage_ice_leggings", EntityEquipmentSlot.LEGS, 1);
    public static Item BootsIceBattleMage = new ItemArmorDragonBattleMage("battlemage_ice_boots", EntityEquipmentSlot.FEET, 1);
    public static Item HelmLightningBattleMage = new ItemArmorDragonBattleMage("battlemage_lightning_helmet", EntityEquipmentSlot.HEAD, 2);
    public static Item ChestLightningBattleMage = new ItemArmorDragonBattleMage("battlemage_lightning_chestplate", EntityEquipmentSlot.CHEST, 2);
    public static Item LegsLightningBattleMage = new ItemArmorDragonBattleMage("battlemage_lightning_leggings", EntityEquipmentSlot.LEGS, 2);
    public static Item BootsLightningBattleMage = new ItemArmorDragonBattleMage("battlemage_lightning_boots", EntityEquipmentSlot.FEET, 2);

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

        event.getRegistry().register(HelmIceSage);
        event.getRegistry().register(HelmFireSage);
        event.getRegistry().register(HelmLightningSage);

        event.getRegistry().register(ChestIceSage);
        event.getRegistry().register(ChestFireSage);
        event.getRegistry().register(ChestLightningSage);

        event.getRegistry().register(LegsIceSage);
        event.getRegistry().register(LegsFireSage);
        event.getRegistry().register(LegsLightningSage);

        event.getRegistry().register(BootsIceSage);
        event.getRegistry().register(BootsFireSage);
        event.getRegistry().register(BootsLightningSage);

        event.getRegistry().register(HelmIceBattleMage);
        event.getRegistry().register(HelmFireBattleMage);
        event.getRegistry().register(HelmLightningBattleMage);

        event.getRegistry().register(ChestIceBattleMage);
        event.getRegistry().register(ChestFireBattleMage);
        event.getRegistry().register(ChestLightningBattleMage);

        event.getRegistry().register(LegsIceBattleMage);
        event.getRegistry().register(LegsFireBattleMage);
        event.getRegistry().register(LegsLightningBattleMage);

        event.getRegistry().register(BootsIceBattleMage);
        event.getRegistry().register(BootsFireBattleMage);
        event.getRegistry().register(BootsLightningBattleMage);

    }

    @SideOnly(Side.CLIENT)
    public void modelRegistryEvent(ModelRegistryEvent event) {

    }
}
