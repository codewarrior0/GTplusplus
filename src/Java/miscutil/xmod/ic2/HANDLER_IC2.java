package miscutil.xmod.ic2;

import ic2.core.init.InternalName;
import miscutil.core.lib.LoadedMods;
import miscutil.xmod.ic2.block.RTGGenerator.BlockRTG;
import miscutil.xmod.ic2.item.IC2_Items;
import miscutil.xmod.ic2.recipe.RECIPE_IC2;

public class HANDLER_IC2{

	public static void preInit() {
		if (LoadedMods.IndustrialCraft2){
			IC2_Items.register();
		    new BlockRTG(InternalName.beer);
		}		
	}

	public static void init() {
		if (LoadedMods.IndustrialCraft2){
			
		}		
	}

	public static void postInit() {
		if (LoadedMods.IndustrialCraft2){
			RECIPE_IC2.initRecipes();
		}		
	}

}