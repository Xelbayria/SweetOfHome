package net.xelbayria.sweetofhome.forge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xelbayria.sweetofhome.SweetOfHome;

@Mod(SweetOfHome.MOD_ID)
public class SweetOfHomeForge {
	public SweetOfHomeForge() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	}

	private void setupClient(FMLClientSetupEvent event) {
	}

}
