package com.keletu.wizandfire.proxy;

import com.keletu.wizandfire.WizAndFire;
import com.keletu.wizandfire.item.ItemArmorDragonBattleMage;
import com.keletu.wizandfire.item.ItemArmorDragonWarlock;
import com.keletu.wizandfire.item.ItemArmorDragonSage;
import com.keletu.wizandfire.util.IafRLCRecipes;
import com.keletu.wizandfire.util.IafRotnRecipes;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Map;

public class CommonProxy {
    public static ItemArmor.ArmorMaterial mat = EnumHelper.addArmorMaterial("DragonScales_special", "", 36, new int[]{5, 7, 9, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F);

    //Warlock
    public static Item HelmFireWarlock = new ItemArmorDragonWarlock("warlock_fire_helmet", EntityEquipmentSlot.HEAD, 0);
    public static Item ChestFireWarlock = new ItemArmorDragonWarlock("warlock_fire_chestplate", EntityEquipmentSlot.CHEST, 0);
    public static Item LegsFireWarlock = new ItemArmorDragonWarlock("warlock_fire_leggings", EntityEquipmentSlot.LEGS, 0);
    public static Item BootsFireWarlock = new ItemArmorDragonWarlock("warlock_fire_boots", EntityEquipmentSlot.FEET, 0);
    public static Item HelmIceWarlock = new ItemArmorDragonWarlock("warlock_ice_helmet", EntityEquipmentSlot.HEAD, 1);
    public static Item ChestIceWarlock = new ItemArmorDragonWarlock("warlock_ice_chestplate", EntityEquipmentSlot.CHEST, 1);
    public static Item LegsIceWarlock = new ItemArmorDragonWarlock("warlock_ice_leggings", EntityEquipmentSlot.LEGS, 1);
    public static Item BootsIceWarlock = new ItemArmorDragonWarlock("warlock_ice_boots", EntityEquipmentSlot.FEET, 1);
    public static Item HelmLightningWarlock = new ItemArmorDragonWarlock("warlock_lightning_helmet", EntityEquipmentSlot.HEAD, 2);
    public static Item ChestLightningWarlock = new ItemArmorDragonWarlock("warlock_lightning_chestplate", EntityEquipmentSlot.CHEST, 2);
    public static Item LegsLightningWarlock = new ItemArmorDragonWarlock("warlock_lightning_leggings", EntityEquipmentSlot.LEGS, 2);
    public static Item BootsLightningWarlock = new ItemArmorDragonWarlock("warlock_lightning_boots", EntityEquipmentSlot.FEET, 2);

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
        event.getRegistry().register(HelmIceWarlock);
        event.getRegistry().register(HelmFireWarlock);
        event.getRegistry().register(HelmLightningWarlock);

        event.getRegistry().register(ChestIceWarlock);
        event.getRegistry().register(ChestFireWarlock);
        event.getRegistry().register(ChestLightningWarlock);

        event.getRegistry().register(LegsIceWarlock);
        event.getRegistry().register(LegsFireWarlock);
        event.getRegistry().register(LegsLightningWarlock);

        event.getRegistry().register(BootsIceWarlock);
        event.getRegistry().register(BootsFireWarlock);
        event.getRegistry().register(BootsLightningWarlock);

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

        if(WizAndFire.isRotnEdition){
            IafRotnRecipes.registerRecipes();
        }else{
            IafRLCRecipes.registerRecipes();
        }

    }

    public void modelRegistryEvent(ModelRegistryEvent event) {

    }

    public Map<Item, ModelBiped> getWarlockModel() {
        return null;
    }

    public Map<Item, ModelBiped> getSageModel() {
        return null;
    }

    public Map<Item, ModelBiped> getBattlemageModel() {
        return null;
    }
}
