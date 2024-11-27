package com.xelbayria.sweetofhome.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class SweetOfHomeFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded("connector")) {
			return;
		}
	}
}
