package com.keletu.wizandfire.util;

import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.keletu.wizandfire.item.ItemWizardArmorSpecial;
import electroblob.wizardry.constants.Element;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.keletu.wizandfire.proxy.CommonProxy.*;

//Okay, Dragon Forge, you won :(
public class CraftingRecipes {

    public static void init() {
        registerRecipes();
    }

    private static void registerRecipes() {
        int recipeIndex = 0;
        
        for (EnumDragonArmor dragonArmor : EnumDragonArmor.values()) {
            Element element;

            switch (dragonArmor.eggType) {
                case BLUE:
                case WHITE:
                case SAPPHIRE:
                case SILVER:
                    element = Element.ICE;
                    recipeIndex = registerArmorSet(dragonArmor, element, recipeIndex,
                        HelmIceSage, ChestIceSage, LegsIceSage, BootsIceSage,
                        HelmIceWarlock, ChestIceWarlock, LegsIceWarlock, BootsIceWarlock,
                        HelmIceBattleMage, ChestIceBattleMage, LegsIceBattleMage, BootsIceBattleMage);
                    break;
                    
                case ELECTRIC:
                case AMETHYST:
                case COPPER:
                case BLACK:
                    element = Element.LIGHTNING;
                    recipeIndex = registerArmorSet(dragonArmor, element, recipeIndex,
                        HelmLightningSage, ChestLightningSage, LegsLightningSage, BootsLightningSage,
                        HelmLightningWarlock, ChestLightningWarlock, LegsLightningWarlock, BootsLightningWarlock,
                        HelmLightningBattleMage, ChestLightningBattleMage, LegsLightningBattleMage, BootsLightningBattleMage);
                    break;
                    
                default: // FIRE
                    element = Element.FIRE;
                    recipeIndex = registerArmorSet(dragonArmor, element, recipeIndex,
                        HelmFireSage, ChestFireSage, LegsFireSage, BootsFireSage,
                        HelmFireWarlock, ChestFireWarlock, LegsFireWarlock, BootsFireWarlock,
                        HelmFireBattleMage, ChestFireBattleMage, LegsFireBattleMage, BootsFireBattleMage);
                    break;
            }
        }
    }

    private static int registerArmorSet(EnumDragonArmor dragonArmor, Element element, int startIndex,
                                        Item sageHelm, Item sageChest, Item sageLegs, Item sageBoots,
                                        Item warlockHelm, Item warlockChest, Item warlockLegs, Item warlockBoots,
                                        Item battlemageHelm, Item battlemageChest, Item battlemageLegs, Item battlemageBoots) {
        
        int index = startIndex;

        Item wizardSageHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.HEAD);
        Item wizardSageChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.CHEST);
        Item wizardSageLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.LEGS);
        Item wizardSageBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.SAGE, EntityEquipmentSlot.FEET);

        Item wizardWarlockHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.HEAD);
        Item wizardWarlockChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.CHEST);
        Item wizardWarlockLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.LEGS);
        Item wizardWarlockBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.WARLOCK, EntityEquipmentSlot.FEET);

        Item wizardBattlemageHead = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.HEAD);
        Item wizardBattlemageChest = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.CHEST);
        Item wizardBattlemageLegs = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.LEGS);
        Item wizardBattlemageBoots = ItemWizardArmorSpecial.getArmour(element, ItemWizardArmorSpecial.ArmourClass.BATTLEMAGE, EntityEquipmentSlot.FEET);

        index = addRecipe(dragonArmor.helmet, wizardSageHead, sageHelm, index);
        index = addRecipe(dragonArmor.chestplate, wizardSageChest, sageChest, index);
        index = addRecipe(dragonArmor.leggings, wizardSageLegs, sageLegs, index);
        index = addRecipe(dragonArmor.boots, wizardSageBoots, sageBoots, index);

        index = addRecipe(dragonArmor.helmet, wizardWarlockHead, warlockHelm, index);
        index = addRecipe(dragonArmor.chestplate, wizardWarlockChest, warlockChest, index);
        index = addRecipe(dragonArmor.leggings, wizardWarlockLegs, warlockLegs, index);
        index = addRecipe(dragonArmor.boots, wizardWarlockBoots, warlockBoots, index);

        index = addRecipe(dragonArmor.helmet, wizardBattlemageHead, battlemageHelm, index);
        index = addRecipe(dragonArmor.chestplate, wizardBattlemageChest, battlemageChest, index);
        index = addRecipe(dragonArmor.leggings, wizardBattlemageLegs, battlemageLegs, index);
        index = addRecipe(dragonArmor.boots, wizardBattlemageBoots, battlemageBoots, index);
        
        return index;
    }

    private static int addRecipe(Item dragonArmor, Item wizardArmor, Item output, int index) {
        ResourceLocation recipeName = new ResourceLocation("wizandfire", "dragon_wizard_armor_" + index);
        
        IRecipe recipe = new ShapelessOreRecipe(
            new ResourceLocation(""),
            new ItemStack(output),
            Ingredient.fromStacks(new ItemStack(dragonArmor)),
            Ingredient.fromStacks(new ItemStack(wizardArmor))
        ).setRegistryName(recipeName);
        
        GameRegistry.findRegistry(IRecipe.class).register(recipe);
        
        return index + 1;
    }
}