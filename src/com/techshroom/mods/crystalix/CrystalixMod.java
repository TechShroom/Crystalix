package com.techshroom.mods.crystalix;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.techshroom.mods.common.ClientProxy;
import com.techshroom.mods.common.Proxy;
import com.techshroom.mods.common.proxybuilders.HarvestData;
import com.techshroom.mods.common.proxybuilders.PhasePrinter;
import com.techshroom.mods.common.proxybuilders.RBBuilder;
import com.techshroom.mods.common.proxybuilders.ToolLevel;
import com.techshroom.mods.common.proxybuilders.ToolType;
import com.techshroom.mods.crystalix.blocks.CrystalixOre;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLConstructionEvent;

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

    @Instance
    private static CrystalixMod MOD;

    /**
     * Mod instance.
     * 
     * @return the mod instance.
     */
    public static CrystalixMod mod() {
        return MOD;
    }

    /**
     * Get the proxy currently in use.
     * 
     * @return a reference to the current Proxy in use.
     */
    public static Proxy proxy() {
        return PROXY;
    }

    /**
     * Creative tab: blocks
     */
    public final CreativeTabs tabBlocks = new CreativeTabs("crystalixBlocks") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Block.getBlockFromName(ID
                    + ":oreCrystalix"));
        }
    };

    @SuppressWarnings("javadoc")
    @EventHandler
    public void construct(FMLConstructionEvent construct) {
        PhasePrinter.addPrinter(proxy(), ID);
        proxySetup();
    }

    private void proxySetup() {
        Proxy p = proxy();
        String oreBlockID = "oreCrystalix";
        RBBuilder.NoTile<CrystalixOre> oreBlock =
                new RBBuilder.NoTile<CrystalixOre>(CrystalixOre.class,
                        oreBlockID);
        oreBlock.setBlockName("oreCrystalix");
        oreBlock.setBlockTextureName(ID + ":crystalix_ore");
        oreBlock.setCreativeTab(tabBlocks);
        oreBlock.setHarvestData(HarvestData.create(ToolType.Pickaxe.TYPE,
                                                   ToolLevel.Iron.TYPE)
                .asBlockHarvestData());
        oreBlock.setSoundType(Block.soundTypeStone);
        p.registerRegisterableObject(oreBlock);
    }
}
