package com.techshroom.mods.crystalix;

import com.techshroom.mods.common.ClientProxy;
import com.techshroom.mods.common.Proxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

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

    @SidedProxy(clientSide = ClientProxy.QUALNAME, serverSide = Proxy.QUALNAME)
    private static Proxy PROXY;

    /**
     * Get the proxy currently in use.
     * 
     * @return a reference to the current Proxy in use.
     */
    public static Proxy proxy() {
        return PROXY;
    }

    {
        proxySetup();
    }

    /**
     * Initialization code to register everything to the proxy
     */
    private void proxySetup() {
    }
}
