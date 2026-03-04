package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChiseledLootTableGen extends FabricBlockLootTableProvider {
    public ChiseledLootTableGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ChiseledBlocks.OAK_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_OAK_SLAB, slabDrops(ChiseledBlocks.VERTICAL_OAK_SLAB));
        addDrop(ChiseledBlocks.SPRUCE_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_SPRUCE_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_SPRUCE_SLAB, slabDrops(ChiseledBlocks.VERTICAL_SPRUCE_SLAB));
        addDrop(ChiseledBlocks.BIRCH_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_BIRCH_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_BIRCH_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_BIRCH_SLAB, slabDrops(ChiseledBlocks.VERTICAL_BIRCH_SLAB));
        addDrop(ChiseledBlocks.JUNGLE_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_JUNGLE_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_JUNGLE_SLAB, slabDrops(ChiseledBlocks.VERTICAL_JUNGLE_SLAB));
        addDrop(ChiseledBlocks.ACACIA_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_ACACIA_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_ACACIA_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_ACACIA_SLAB, slabDrops(ChiseledBlocks.VERTICAL_ACACIA_SLAB));
        addDrop(ChiseledBlocks.DARK_OAK_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_DARK_OAK_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB, slabDrops(ChiseledBlocks.VERTICAL_DARK_OAK_SLAB));
        addDrop(ChiseledBlocks.MANGROVE_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_MANGROVE_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_MANGROVE_SLAB, slabDrops(ChiseledBlocks.VERTICAL_MANGROVE_SLAB));
        addDrop(ChiseledBlocks.CHERRY_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_CHERRY_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_CHERRY_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_CHERRY_SLAB, slabDrops(ChiseledBlocks.VERTICAL_CHERRY_SLAB));
        addDrop(ChiseledBlocks.PALE_OAK_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_PALE_OAK_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB, slabDrops(ChiseledBlocks.VERTICAL_PALE_OAK_SLAB));
        addDrop(ChiseledBlocks.BAMBOO_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_BAMBOO_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_BAMBOO_SLAB, slabDrops(ChiseledBlocks.VERTICAL_BAMBOO_SLAB));
        addDrop(ChiseledBlocks.CRIMSON_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_CRIMSON_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_CRIMSON_SLAB, slabDrops(ChiseledBlocks.VERTICAL_CRIMSON_SLAB));
        addDrop(ChiseledBlocks.WARPED_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_WARPED_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_WARPED_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_WARPED_SLAB, slabDrops(ChiseledBlocks.VERTICAL_WARPED_SLAB));
    }
}