package net.xelbayria.examplemod.forge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xelbayria.examplemod.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
	public ExampleModForge() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	}

	private void setupClient(FMLClientSetupEvent event) {
	}

}
