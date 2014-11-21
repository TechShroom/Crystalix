package com.techshroom.mods.crystalix;

import cpw.mods.fml.common.Mod;

/**
 * Crystalix's main mod class.
 * 
 * @author Kenzie Togami
 */
@Mod(modid = CrystalixMod.ID, name = CrystalixMod.USER_FRIENDLY_NAME,
        acceptedMinecraftVersions = CrystalixMod.ACCEPTED_VERSIONS,
        version = CrystalixMod.VERSION)
public class CrystalixMod {
    /**
     * Crystalix's mod ID
     */
    public static final String ID = "@MODID@";
    /**
     * Mod version
     */
    public static final String VERSION = "@VERSION@";
    /**
     * Accepted Minecraft versions
     */
    public static final String ACCEPTED_VERSIONS = "@SUPPORTED_VERSIONS@";
    /**
     * End-user name for the mod.
     */
    public static final String USER_FRIENDLY_NAME = "Crystalix";
}
