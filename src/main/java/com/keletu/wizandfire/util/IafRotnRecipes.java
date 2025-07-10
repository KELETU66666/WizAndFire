package com.keletu.wizandfire.util;

import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.github.alexthe666.iceandfire.recipe.DragonForgeRecipe;
import static com.github.alexthe666.iceandfire.recipe.IafRecipeRegistry.*;
import com.keletu.wizandfire.item.ItemWizardArmorSpecial;
import static com.keletu.wizandfire.proxy.CommonProxy.*;
import electroblob.wizardry.constants.Element;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class IafRotnRecipes {

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
                switch (input.eggType) {
                    case BLUE:
                        recipes = ICE_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmIceWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestIceWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsIceWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsIceBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsIceSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsIceWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsIceBattleMage), true));
                        break;
                    case ELECTRIC:
                        recipes = LIGHTNING_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmLightningWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestLightningWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsLightningWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsLightningBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsLightningSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsLightningWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsLightningBattleMage), true));
                        break;
                    default:
                        recipes = FIRE_FORGE_RECIPES;
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(sageHead), new ItemStack(HelmFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(warlockHead), new ItemStack(HelmFireWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.helmet), new ItemStack(battlemageHead), new ItemStack(HelmFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(sageChest), new ItemStack(ChestFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(warlockChest), new ItemStack(ChestFireWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.chestplate), new ItemStack(battlemageChest), new ItemStack(ChestFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(sageLegs), new ItemStack(LegsFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(warlockLegs), new ItemStack(LegsFireWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.leggings), new ItemStack(battlemageLegs), new ItemStack(LegsFireBattleMage), true));

                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(sageBoots), new ItemStack(BootsFireSage), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(warlockBoots), new ItemStack(BootsFireWarlock), true));
                        recipes.add(new DragonForgeRecipe(new ItemStack(input.boots), new ItemStack(battlemageBoots), new ItemStack(BootsFireBattleMage), true));
                }
            }
        }
    }
}
