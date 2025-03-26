package com.keletu.kpack.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.awt.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
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
    }

    @Override
    public void spawnParticle(EnumParticleTypes type, double x, double y, double z, Color color, double velX, double velY, double velZ) {
        Particle particle = Minecraft.getMinecraft().effectRenderer.spawnEffectParticle(type.getParticleID(), x, y, z, velX, velY, velZ);
        float randBrightness = 0.5F + (float) Math.random();
        particle.setRBGColorF((color.getRed() / 255.0F) * randBrightness, (color.getGreen() / 255.0F) * randBrightness, (color.getBlue() / 255.0F) * randBrightness);
    }
}
