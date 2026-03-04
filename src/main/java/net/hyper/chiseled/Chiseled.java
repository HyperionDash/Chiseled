package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.hyper.chiseled.registry.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chiseled implements ModInitializer {
	public static final String MOD_ID = "chiseled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ChiseledItemGroups.registerItemGroups();
		ChiseledBlocks.registerBlocks();

		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.OAK_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_SLAB, 5, 20);

		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ChiseledBlocks.OAK_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_SLAB, 300);
		});

	}
}