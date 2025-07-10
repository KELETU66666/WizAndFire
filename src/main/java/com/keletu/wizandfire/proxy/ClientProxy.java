package com.keletu.wizandfire.proxy;

import com.keletu.wizandfire.WizAndFireConfig;
import com.keletu.wizandfire.model.*;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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

        armorModelsWarlock.put(HelmIceWarlock, IceModelWarlock);
        armorModelsWarlock.put(ChestIceWarlock, IceModelWarlock);
        armorModelsWarlock.put(LegsIceWarlock, IceModelLegsWarlock);
        armorModelsWarlock.put(BootsIceWarlock, IceModelWarlock);

        armorModelsSage.put(HelmIceSage, IceModelSage);
        armorModelsSage.put(ChestIceSage, IceModelSage);
        armorModelsSage.put(LegsIceSage, IceModelLegsSage);
        armorModelsSage.put(BootsIceSage, IceModelSage);

        armorModelsBattleMage.put(HelmIceBattleMage, IceModelBattleMage);
        armorModelsBattleMage.put(ChestIceBattleMage, IceModelBattleMage);
        armorModelsBattleMage.put(LegsIceBattleMage, IceModelLegsBattleMage);
        armorModelsBattleMage.put(BootsIceBattleMage, IceModelBattleMage);


        armorModelsWarlock.put(HelmFireWarlock, FireModelWarlock);
        armorModelsWarlock.put(ChestFireWarlock, FireModelWarlock);
        armorModelsWarlock.put(LegsFireWarlock, FireModelLegsWarlock);
        armorModelsWarlock.put(BootsFireWarlock, FireModelWarlock);

        armorModelsSage.put(HelmFireSage, FireModelSage);
        armorModelsSage.put(ChestFireSage, FireModelSage);
        armorModelsSage.put(LegsFireSage, FireModelLegsSage);
        armorModelsSage.put(BootsFireSage, FireModelSage);

        armorModelsBattleMage.put(HelmFireBattleMage, FireModelBattleMage);
        armorModelsBattleMage.put(ChestFireBattleMage, FireModelBattleMage);
        armorModelsBattleMage.put(LegsFireBattleMage, FireModelLegsBattleMage);
        armorModelsBattleMage.put(BootsFireBattleMage, FireModelBattleMage);


        armorModelsWarlock.put(HelmLightningWarlock, LightningModelWarlock);
        armorModelsWarlock.put(ChestLightningWarlock, LightningModelWarlock);
        armorModelsWarlock.put(LegsLightningWarlock, LightningModelLegsWarlock);
        armorModelsWarlock.put(BootsLightningWarlock, LightningModelWarlock);

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
        ModelLoader.setCustomModelResourceLocation(HelmIceWarlock, 0, new ModelResourceLocation(HelmIceWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestIceWarlock, 0, new ModelResourceLocation(ChestIceWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsIceWarlock, 0, new ModelResourceLocation(LegsIceWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsIceWarlock, 0, new ModelResourceLocation(BootsIceWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmFireWarlock, 0, new ModelResourceLocation(HelmFireWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestFireWarlock, 0, new ModelResourceLocation(ChestFireWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsFireWarlock, 0, new ModelResourceLocation(LegsFireWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsFireWarlock, 0, new ModelResourceLocation(BootsFireWarlock.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsLightningWarlock, 0, new ModelResourceLocation(BootsLightningWarlock.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(HelmIceSage, 0, new ModelResourceLocation(HelmIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestIceSage, 0, new ModelResourceLocation(ChestIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsIceSage, 0, new ModelResourceLocation(LegsIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsIceSage, 0, new ModelResourceLocation(BootsIceSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(HelmFireSage, 0, new ModelResourceLocation(HelmFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ChestFireSage, 0, new ModelResourceLocation(ChestFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(LegsFireSage, 0, new ModelResourceLocation(LegsFireSage.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(BootsFireSage, 0, new ModelResourceLocation(BootsFireSage.getRegistryName(), "inventory"));
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
        ModelLoader.setCustomModelResourceLocation(BootsLightningBattleMage, 0, new ModelResourceLocation(BootsLightningBattleMage.getRegistryName(), "inventory"));

        if(WizAndFireConfig.diamondLightning){
            ModelLoader.setCustomModelResourceLocation(HelmLightningWarlock, 0, new ModelResourceLocation(HelmLightningWarlock.getRegistryName() + "_diamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(ChestLightningWarlock, 0, new ModelResourceLocation(ChestLightningWarlock.getRegistryName() + "_diamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(LegsLightningWarlock, 0, new ModelResourceLocation(LegsLightningWarlock.getRegistryName() + "_diamond", "inventory"));

            ModelLoader.setCustomModelResourceLocation(HelmLightningSage, 0, new ModelResourceLocation(HelmLightningSage.getRegistryName() + "_diamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(ChestLightningSage, 0, new ModelResourceLocation(ChestLightningSage.getRegistryName() + "_diamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(LegsLightningSage, 0, new ModelResourceLocation(LegsLightningSage.getRegistryName() + "_diamond", "inventory"));

            ModelLoader.setCustomModelResourceLocation(LegsLightningBattleMage, 0, new ModelResourceLocation(LegsLightningBattleMage.getRegistryName() + "_diamond", "inventory"));

        }else {
            ModelLoader.setCustomModelResourceLocation(HelmLightningWarlock, 0, new ModelResourceLocation(HelmLightningWarlock.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(ChestLightningWarlock, 0, new ModelResourceLocation(ChestLightningWarlock.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(LegsLightningWarlock, 0, new ModelResourceLocation(LegsLightningWarlock.getRegistryName(), "inventory"));

            ModelLoader.setCustomModelResourceLocation(HelmLightningSage, 0, new ModelResourceLocation(HelmLightningSage.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(ChestLightningSage, 0, new ModelResourceLocation(ChestLightningSage.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(LegsLightningSage, 0, new ModelResourceLocation(LegsLightningSage.getRegistryName(), "inventory"));

            ModelLoader.setCustomModelResourceLocation(LegsLightningBattleMage, 0, new ModelResourceLocation(LegsLightningBattleMage.getRegistryName(), "inventory"));
        }
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
