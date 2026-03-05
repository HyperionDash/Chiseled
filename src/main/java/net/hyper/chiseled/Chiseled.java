package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.chiseled.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
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
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.SPRUCE_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.BIRCH_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BIRCH_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.JUNGLE_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.ACACIA_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_ACACIA_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.DARK_OAK_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.MANGROVE_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.CHERRY_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_CHERRY_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.PALE_OAK_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.BAMBOO_TRIM, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB, 5, 20);

		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ChiseledBlocks.OAK_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_OAK_SLAB, 300);
			builder.add(ChiseledBlocks.SPRUCE_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_SPRUCE_SLAB, 300);
			builder.add(ChiseledBlocks.BIRCH_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_BIRCH_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_BIRCH_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_BIRCH_SLAB, 300);
			builder.add(ChiseledBlocks.JUNGLE_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_JUNGLE_SLAB, 300);
			builder.add(ChiseledBlocks.ACACIA_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_ACACIA_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_ACACIA_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_ACACIA_SLAB, 300);
			builder.add(ChiseledBlocks.DARK_OAK_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, 300);
			builder.add(ChiseledBlocks.MANGROVE_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_MANGROVE_SLAB, 300);
			builder.add(ChiseledBlocks.CHERRY_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_CHERRY_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_CHERRY_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_CHERRY_SLAB, 300);
			builder.add(ChiseledBlocks.PALE_OAK_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, 300);
			builder.add(ChiseledBlocks.BAMBOO_TRIM, 300);
			builder.add(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS, 300);
			builder.add(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS, 300);
			builder.add(ChiseledBlocks.VERTICAL_BAMBOO_SLAB, 300);
		});
		FabricLoader.getInstance().getModContainer(Chiseled.MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.of("chiseled","data_overrides"), modContainer,
						Text.translatable("text.chiseled.data_overrides"),PackActivationType.DEFAULT_ENABLED));
	}
}