package com.keletu.wizandfire;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = WizAndFire.MOD_ID)
public class WizAndFireConfig {
    @Config.Comment("Should use diamond style for lightning dragon armor?")
    @Config.Name("Diamond Styled Lightning")
    @Config.RequiresMcRestart
    public static boolean diamondLightning = false;

    @Mod.EventBusSubscriber(modid = WizAndFire.MOD_ID)
    public static class ConfigChangeListener {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(WizAndFire.MOD_ID)) {
                ConfigManager.sync(WizAndFire.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
