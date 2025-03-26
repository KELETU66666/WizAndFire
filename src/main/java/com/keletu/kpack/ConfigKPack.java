package com.keletu.kpack;

import net.minecraftforge.common.config.Configuration;

public class ConfigKPack {

    public double enderScytheBaseDamage = 20.0;
    public int enderScytheBaseDurability = 3000;
    public int enderScaleBaseArmor = 11;
    public int enderScaleBaseDurability = 4000;
    public int maxJumpCount = 5;
    public boolean strictJumpHeight = false;

    public void init(Configuration config) {
        this.enderScytheBaseDamage = config.getFloat("Ender Scythe Base Attack Strength", "scythe", 20, 5, Integer.MAX_VALUE, "Default attack strength of a enderscale scythe.");
        this.enderScytheBaseDurability = config.getInt("Ender Dragon Scythe Durability", "scythe", 3000, 1, Integer.MAX_VALUE, "Default durability value of enderscale scythe.");
        this.enderScaleBaseArmor = config.getInt("Ender Dragon Suit Base Armor", "suit", 11, 7, Integer.MAX_VALUE, "Default armor value of enderscale chestplate.");
        this.enderScaleBaseDurability = config.getInt("Ender Dragon Suit Base Durability", "suit", 4000, 1, Integer.MAX_VALUE, "Default durability value of enderscale suit.");
        this.maxJumpCount = config.getInt("Ender Dragon Armor Multi-Jump", "chestplate", 5, 1, Integer.MAX_VALUE, "Maximum count of mid-air jump when wear enderscale chestplate.");
        this.strictJumpHeight = config.getBoolean("Limited Mid-air Jump Height", "chestplate", false, "Should mid-air jumps performs like normal jumps?");

    }
}
