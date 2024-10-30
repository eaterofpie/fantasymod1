package dev.west.fantasymod;

import dev.west.fantasymod.init.BlockInit;
import dev.west.fantasymod.init.ItemGroupInit;
import dev.west.fantasymod.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasyMod implements ModInitializer {
	public static final String MOD_ID = "fantasymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("Fantasymod");

	@Override
	public void onInitialize() {
		ItemInit.load();
		ItemGroupInit.load();
		BlockInit.load();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

	}


		public static Identifier id (String path){
			return Identifier.of(MOD_ID, path);
		}
	}