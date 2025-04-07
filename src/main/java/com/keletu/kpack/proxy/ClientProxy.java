package com.keletu.kpack.proxy;

import com.keletu.kpack.util.*;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy {

    public static final Map<Item, ModelBiped> armorModelsWarlock = new HashMap<Item, ModelBiped>();
    private static final ModelIceMageArmor IceModelWarlock = new ModelIceMageArmor(false);
    private static final ModelIceMageArmor IceModelLegsWarlock = new ModelIceMageArmor(true);
    private static final ModelIceSageArmor IceModelSage = new ModelIceSageArmor(false);
    private static final ModelIceSageArmor IceModelLegsSage = new ModelIceSageArmor(true);
    private static final ModelIceBattleMage IceModelBattleMage = new ModelIceBattleMage(false);
    private static final ModelIceBattleMage IceModelLegsBattleMage = new ModelIceBattleMage(true);


    public static final Map<Item, ModelBiped> armorModelsSage = new HashMap<Item, ModelBiped>();
    private static final ModelFireMageArmor FireModelWarlock = new ModelFireMageArmor(false);
    private static final ModelFireMageArmor FireModelLegsWarlock = new ModelFireMageArmor(true);
    private static final ModelFireSageArmor FireModelSage = new ModelFireSageArmor(false);
    private static final ModelFireSageArmor FireModelLegsSage = new ModelFireSageArmor(true);
    private static final ModelFireBattleMage FireModelBattleMage = new ModelFireBattleMage(false);
    private static final ModelFireBattleMage FireModelLegsBattleMage = new ModelFireBattleMage(true);


    public static final Map<Item, ModelBiped> armorModelsBattleMage = new HashMap<Item, ModelBiped>();
    private static final ModelLightningMageArmor LightningModelWarlock = new ModelLightningMageArmor(false);
    private static final ModelLightningMageArmor LightningModelLegsWarlock = new ModelLightningMageArmor(true);
    private static final ModelLightningSageArmor LightningModelSage = new ModelLightningSageArmor(false);
    private static final ModelLightningSageArmor LightningModelLegsSage = new ModelLightningSageArmor(true);
    private static final ModelLightningBattleMage LightningModelBattleMage = new ModelLightningBattleMage(false);
    private static final ModelLightningBattleMage LightningModelLegsBattleMage = new ModelLightningBattleMage(true);


    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        armorModelsWarlock.put(HelmIceMage, IceModelWarlock);
        armorModelsWarlock.put(ChestIceMage, IceModelWarlock);
        armorModelsWarlock.put(LegsIceMage, IceModelLegsWarlock);
        armorModelsWarlock.put(BootsIceMage, IceModelWarlock);

        armorModelsSage.put(HelmIceSage, IceModelSage);
        armorModelsSage.put(ChestIceSage, IceModelSage);
        armorModelsSage.put(LegsIceSage, IceModelLegsSage);
        armorModelsSage.put(BootsIceSage, IceModelSage);

        armorModelsBattleMage.put(HelmIceBattleMage, IceModelBattleMage);
        armorModelsBattleMage.put(ChestIceBattleMage, IceModelBattleMage);
        armorModelsBattleMage.put(LegsIceBattleMage, IceModelLegsBattleMage);
        armorModelsBattleMage.put(BootsIceBattleMage, IceModelBattleMage);


        armorModelsWarlock.put(HelmFireMage, FireModelWarlock);
        armorModelsWarlock.put(ChestFireMage, FireModelWarlock);
        armorModelsWarlock.put(LegsFireMage, FireModelLegsWarlock);
        armorModelsWarlock.put(BootsFireMage, FireModelWarlock);

        armorModelsSage.put(HelmFireSage, FireModelSage);
        armorModelsSage.put(ChestFireSage, FireModelSage);
        armorModelsSage.put(LegsFireSage, FireModelLegsSage);
        armorModelsSage.put(BootsFireSage, FireModelSage);

        armorModelsBattleMage.put(HelmFireBattleMage, FireModelBattleMage);
        armorModelsBattleMage.put(ChestFireBattleMage, FireModelBattleMage);
        armorModelsBattleMage.put(LegsFireBattleMage, FireModelLegsBattleMage);
        armorModelsBattleMage.put(BootsFireBattleMage, FireModelBattleMage);


        armorModelsWarlock.put(HelmLightningMage, LightningModelWarlock);
        armorModelsWarlock.put(ChestLightningMage, LightningModelWarlock);
        armorModelsWarlock.put(LegsLightningMage, LightningModelLegsWarlock);
        armorModelsWarlock.put(BootsLightningMage, LightningModelWarlock);

        armorModelsSage.put(HelmLightningSage, LightningModelSage);
        armorModelsSage.put(ChestLightningSage, LightningModelSage);
        armorModelsSage.put(LegsLightningSage, LightningModelLegsSage);
        armorModelsSage.put(BootsLightningSage, LightningModelSage);

        armorModelsBattleMage.put(HelmLightningBattleMage, LightningModelBattleMage);
        armorModelsBattleMage.put(ChestLightningBattleMage, LightningModelBattleMage);
        armorModelsBattleMage.put(LegsLightningBattleMage, LightningModelLegsBattleMage);
        armorModelsBattleMage.put(BootsLightningBattleMage, LightningModelBattleMage);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void modelRegistryEvent(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(HelmIceMage, 0, new ModelResourceLocation(HelmIceMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestIceMage, 0, new ModelResourceLocation(ChestIceMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsIceMage, 0, new ModelResourceLocation(LegsIceMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsIceMage, 0, new ModelResourceLocation(BootsIceMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmFireMage, 0, new ModelResourceLocation(HelmFireMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestFireMage, 0, new ModelResourceLocation(ChestFireMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsFireMage, 0, new ModelResourceLocation(LegsFireMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsFireMage, 0, new ModelResourceLocation(BootsFireMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmLightningMage, 0, new ModelResourceLocation(HelmLightningMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestLightningMage, 0, new ModelResourceLocation(ChestLightningMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsLightningMage, 0, new ModelResourceLocation(LegsLightningMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsLightningMage, 0, new ModelResourceLocation(BootsLightningMage.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(HelmIceSage, 0, new ModelResourceLocation(HelmIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestIceSage, 0, new ModelResourceLocation(ChestIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsIceSage, 0, new ModelResourceLocation(LegsIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsIceSage, 0, new ModelResourceLocation(BootsIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmFireSage, 0, new ModelResourceLocation(HelmFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestFireSage, 0, new ModelResourceLocation(ChestFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsFireSage, 0, new ModelResourceLocation(LegsFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsFireSage, 0, new ModelResourceLocation(BootsFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmLightningSage, 0, new ModelResourceLocation(HelmLightningSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestLightningSage, 0, new ModelResourceLocation(ChestLightningSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsLightningSage, 0, new ModelResourceLocation(LegsLightningSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsLightningSage, 0, new ModelResourceLocation(BootsLightningSage.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(HelmIceBattleMage, 0, new ModelResourceLocation(HelmIceBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestIceBattleMage, 0, new ModelResourceLocation(ChestIceBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsIceBattleMage, 0, new ModelResourceLocation(LegsIceBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsIceBattleMage, 0, new ModelResourceLocation(BootsIceBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmFireBattleMage, 0, new ModelResourceLocation(HelmFireBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestFireBattleMage, 0, new ModelResourceLocation(ChestFireBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsFireBattleMage, 0, new ModelResourceLocation(LegsFireBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsFireBattleMage, 0, new ModelResourceLocation(BootsFireBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmLightningBattleMage, 0, new ModelResourceLocation(HelmLightningBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestLightningBattleMage, 0, new ModelResourceLocation(ChestLightningBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsLightningBattleMage, 0, new ModelResourceLocation(LegsLightningBattleMage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsLightningBattleMage, 0, new ModelResourceLocation(BootsLightningBattleMage.getRegistryName(), "inventory"));
    }

    @Override
    public Map<Item, ModelBiped> getWarlockModel() {
        return armorModelsWarlock;
    }

    @Override
    public Map<Item, ModelBiped> getSageModel() {
        return armorModelsSage;
    }

    @Override
    public Map<Item, ModelBiped> getBattlemageModel() {
        return armorModelsBattleMage;
    }
}
