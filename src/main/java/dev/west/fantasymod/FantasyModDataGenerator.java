package dev.west.fantasymod;

import dev.west.fantasymod.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FantasyModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(FantasyBlockLootTableProvider::new);
		pack.addProvider(FantasyModBlockTagProvider::new);
		pack.addProvider(FantasyModItemTagProvider::new);
		pack.addProvider(FantasyModEnglishLanguageProvider::new);
		pack.addProvider(FantasyModModModelProvider::new);

	}
}
