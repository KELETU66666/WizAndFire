package com.keletu.wizandfire;

import net.minecraftforge.common.config.Config;

@Config(modid = WizAndFire.MOD_ID)
public class WizAndFireConfig {
    @Config.Comment("Should use diamond style for lightning dragon armor?")
    @Config.Name("Diamond Styled Lightning")
    @Config.RequiresMcRestart
    public static boolean diamondLightning = false;
}
