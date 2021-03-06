package gtPlusPlus.core.world.darkworld;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import gtPlusPlus.core.lib.CORE;
import gtPlusPlus.core.world.darkworld.block.blockDarkWorldPortal;
import gtPlusPlus.core.world.darkworld.item.itemDarkWorldPortalTrigger;
import gtPlusPlus.core.world.darkworld.world.WorldProviderMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;

public class Dimension_DarkWorld {

	public Object instance;
	public static int DIMID = CORE.DARKWORLD_ID;

	public static blockDarkWorldPortal portalBlock;
	public static itemDarkWorldPortalTrigger portalItem;
	public static Block blockTopLayer;
	public static Block blockSecondLayer;
	public static Block blockMainFiller = Blocks.stone;
	public static Block blockSecondaryFiller;
	public static Block blockFluidLakes;

	public static Block blockPortalFrame;

	static {
		
	}

	public Dimension_DarkWorld() {
	}

	public void load() {
		GameRegistry.registerBlock(portalBlock, "dimensionDarkWorld_portal");
		DimensionManager.registerProviderType(DIMID, WorldProviderMod.class, false);
		DimensionManager.registerDimension(DIMID, DIMID);
		// GameRegistry.addSmelting(Items.record_11, new ItemStack(block),
		// 1.0f);

	}

	public void registerRenderers() {
		
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
		
	}

	public void preInit(FMLPreInitializationEvent event) {
		
	}

}
