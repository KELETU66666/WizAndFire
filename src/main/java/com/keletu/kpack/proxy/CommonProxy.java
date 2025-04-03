package com.keletu.kpack.proxy;

import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.github.alexthe666.iceandfire.recipe.DragonForgeRecipe;
import com.keletu.kpack.item.ItemArmorDragonBattleMage;
import com.keletu.kpack.item.ItemArmorDragonMage;
import com.keletu.kpack.item.ItemArmorDragonSage;
import com.keletu.kpack.item.ItemWizardArmourSpecial;
import electroblob.wizardry.constants.Element;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.List;

import static com.github.alexthe666.iceandfire.item.IafDragonForgeRecipeRegistry.*;

public class CommonProxy {
    public static ItemArmor.ArmorMaterial mat = EnumHelper.addArmorMaterial("DragonScales_special", null, 36, new int[]{5, 7, 9, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F);

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

        for (EnumDragonArmor input : EnumDragonArmor.values()) {
            for (Element element : Element.values()) {

                Item sageHead = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.SAGE, EntityEquipmentSlot.HEAD);
                Item sageChest = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.SAGE, EntityEquipmentSlot.CHEST);
                Item sageLegs = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.SAGE, EntityEquipmentSlot.LEGS);
                Item sageBoots = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.SAGE, EntityEquipmentSlot.FEET);
                Item battlemageHead = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.HEAD);
                Item battlemageChest = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.CHEST);
                Item battlemageLegs = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.LEGS);
                Item battlemageBoots = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.FEET);
                Item warlockHead = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.HEAD);
                Item warlockChest = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.CHEST);
                Item warlockLegs = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.LEGS);
                Item warlockBoots = ItemWizardArmourSpecial.getArmour(element, ItemWizardArmourSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.FEET);

                List<DragonForgeRecipe> recipes;
                switch (input.eggType.dragonType) {
                    case ICE:
                        recipes = ICE_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmIceMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestIceMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsIceMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsIceMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsIceBattleMage), true));
                        break;
                    case LIGHTNING:
                        recipes = LIGHTNING_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmLightningMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestLightningMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsLightningMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsLightningMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsLightningBattleMage), true));
                        break;
                    default:
                        recipes = FIRE_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmFireMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestFireMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsFireMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsFireMage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsFireBattleMage), true));
                }
            }
        }
    }

    public void modelRegistryEvent(ModelRegistryEvent event) {

    }
}
