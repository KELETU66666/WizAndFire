package com.keletu.kpack;

import com.keletu.kpack.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(
        modid = KPack.MOD_ID,
        name = KPack.MOD_NAME,
        version = KPack.VERSION,
        dependencies = "after:iceandfire"
)
public class KPack {

    public static final String MOD_ID = "kpack";
    public static final String MOD_NAME = "Keletu's Pack Gears";
    public static final String VERSION = "1.3.0";

    @SidedProxy(clientSide = "com.keletu.kpack.proxy.ClientProxy", serverSide = "com.keletu.kpack.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger("KPack");
    public static ConfigKPack CONFIG = new ConfigKPack();
    public static Configuration config;
    public static SimpleNetworkWrapper packetInstance;

    public static void loadConfig() {
        File configFile = new File(Loader.instance().getConfigDir(), "kpack_at.cfg");
        if (!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (Exception var2) {
                logger.warn("Could not create a new KPack mod config file.");
                logger.warn(var2.getLocalizedMessage());
            }
        }

        config = new Configuration(configFile);
        config.load();
    }

    public static void syncConfig() {
        CONFIG.init(config);
        config.save();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        loadConfig();
        syncConfig();

        packetInstance = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID.toLowerCase());

        proxy.preInit(event);
        //MinecraftForge.EVENT_BUS.register(new AbilityHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {

        @SubscribeEvent
        public static void addBlock(RegistryEvent.Register<Block> event) {
            proxy.registerBlocks(event);
        }

        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
            proxy.registerItems(event);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void modelRegistryEvent(ModelRegistryEvent event) {
            proxy.modelRegistryEvent(event);
        }

        @SubscribeEvent
        public static void entities(RegistryEvent.Register<EntityEntry> event) {
        }
    }
}
