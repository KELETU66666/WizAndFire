package com.keletu.kpack.util;

import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import static com.github.alexthe666.iceandfire.item.IafDragonForgeRecipeRegistry.*;
import com.github.alexthe666.iceandfire.recipe.DragonForgeRecipe;
import com.keletu.kpack.item.ItemWizardArmorSpecial;
import static com.keletu.kpack.proxy.CommonProxy.*;
import electroblob.wizardry.constants.Element;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class IafRLCRecipes {

    public static void registerRecipes(){

        for (EnumDragonArmor input : EnumDragonArmor.values()) {
            for (Element element : Element.values()) {

                Item sageHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.HEAD);
                Item sageChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.CHEST);
                Item sageLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.LEGS);
                Item sageBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.FEET);
                Item battlemageHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.HEAD);
                Item battlemageChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.CHEST);
                Item battlemageLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.LEGS);
                Item battlemageBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.FEET);
                Item warlockHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.HEAD);
                Item warlockChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.CHEST);
                Item warlockLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.LEGS);
                Item warlockBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.FEET);

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
}
