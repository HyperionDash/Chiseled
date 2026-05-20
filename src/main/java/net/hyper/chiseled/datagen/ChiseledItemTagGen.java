package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import java.util.concurrent.CompletableFuture;

public class ChiseledItemTagGen extends FabricTagsProvider.ItemTagsProvider {
    public ChiseledItemTagGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(ItemTags.STAIRS)
                .add(ChiseledBlocks.POLISHED_STONE_STAIRS.asItem())
                .add(ChiseledBlocks.SMOOTH_STONE_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_STONE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.STONE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CALCITE_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_CALCITE_STAIRS.asItem())
                .add(ChiseledBlocks.CALCITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_CALCITE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CALCITE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.DRIPSTONE_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_DRIPSTONE_STAIRS.asItem())
                .add(ChiseledBlocks.DRIPSTONE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_DRIPSTONE_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.DRIPSTONE_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.MIXED_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.PACKED_MUD_STAIRS.asItem())
                .add(ChiseledBlocks.POLISHED_MUD_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.CUT_MUD_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS.asItem())
                .add(ChiseledBlocks.MUD_TILE_STAIRS.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ChiseledBlocks.POLISHED_STONE_SLAB.asItem())
                .add(ChiseledBlocks.CUT_STONE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.STONE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_STONE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CALCITE_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_CALCITE_SLAB.asItem())
                .add(ChiseledBlocks.CALCITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_CALCITE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CALCITE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.DRIPSTONE_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_DRIPSTONE_SLAB.asItem())
                .add(ChiseledBlocks.DRIPSTONE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_DRIPSTONE_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.DRIPSTONE_TILE_SLAB.asItem())
                .add(ChiseledBlocks.MIXED_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.PACKED_MUD_SLAB.asItem())
                .add(ChiseledBlocks.POLISHED_MUD_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.CUT_MUD_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB.asItem())
                .add(ChiseledBlocks.MUD_TILE_SLAB.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_TILE_SLAB.asItem());

        valueLookupBuilder(ItemTags.WALLS)
                .add(ChiseledBlocks.STONE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_STONE_WALL.asItem())
                .add(ChiseledBlocks.STONE_TILE_WALL.asItem())
                .add(ChiseledBlocks.MOSSY_STONE_TILE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL.asItem())
                .add(ChiseledBlocks.CALCITE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_CALCITE_WALL.asItem())
                .add(ChiseledBlocks.CALCITE_BRICK_WALL.asItem())
                .add(ChiseledBlocks.CALCITE_TILE_WALL.asItem())
                .add(ChiseledBlocks.DRIPSTONE_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_DRIPSTONE_WALL.asItem())
                .add(ChiseledBlocks.DRIPSTONE_BRICK_WALL.asItem())
                .add(ChiseledBlocks.DRIPSTONE_TILE_WALL.asItem())
                .add(ChiseledBlocks.MIXED_BRICK_WALL.asItem())
                .add(ChiseledBlocks.MOSSY_BRICK_WALL.asItem())
                .add(ChiseledBlocks.PACKED_MUD_WALL.asItem())
                .add(ChiseledBlocks.POLISHED_MUD_WALL.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_BRICK_WALL.asItem())
                .add(ChiseledBlocks.MUD_TILE_WALL.asItem())
                .add(ChiseledBlocks.MOSSY_MUD_TILE_WALL.asItem());

        valueLookupBuilder(ItemTags.STONE_BRICKS)
                .add(ChiseledBlocks.POLISHED_STONE.asItem())
                .add(ChiseledBlocks.CUT_STONE_BRICKS.asItem())
                .add(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS.asItem())
                .add(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS.asItem())
                .add(ChiseledBlocks.STONE_TILES.asItem())
                .add(ChiseledBlocks.CRACKED_STONE_TILES.asItem())
                .add(ChiseledBlocks.MOSSY_STONE_TILES.asItem());
    }
}