package net.hyper.chiseled;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hyper.chiseled.datagen.*;
import net.hyper.chiseled.datagen.tag.*;

// DataGenerator Entrypoint
public class ChiseledDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ChiseledBlockLootGen::new);
		pack.addProvider(ChiseledLangGen::new);
		pack.addProvider(ChiseledModelGen::new);
		pack.addProvider(ChiseledRecipeGen::new);

		pack.addProvider(ChiseledBlockTagGen::new);
		pack.addProvider(ChiseledItemTagGen::new);
	}
}
