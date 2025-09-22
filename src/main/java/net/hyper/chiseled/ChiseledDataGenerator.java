package net.hyper.chiseled;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hyper.chiseled.datagen.ModBlockTagProvider;
import net.hyper.chiseled.datagen.ModItemTagProvider;
import net.hyper.chiseled.datagen.ModLootTableProvider;
import net.hyper.chiseled.datagen.ModModelProvider;

public class ChiseledDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagProvider::new);
	}
}