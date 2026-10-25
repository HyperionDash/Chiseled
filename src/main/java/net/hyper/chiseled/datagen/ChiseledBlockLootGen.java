package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

// DataGenerator for Block loot
public class ChiseledBlockLootGen extends FabricBlockLootSubProvider {
    public ChiseledBlockLootGen(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        // Stone Block loot
        dropSelf(ChiseledBlocks.STONE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_STONE);
        dropSelf(ChiseledBlocks.POLISHED_STONE_STAIRS);
        add(ChiseledBlocks.POLISHED_STONE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_STONE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_STONE_WALL);
        dropSelf(ChiseledBlocks.STONE_PILLAR);
        dropSelf(ChiseledBlocks.CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_STONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_STONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_STONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_CUT_STONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.STONE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_STONE_TILES);
        dropSelf(ChiseledBlocks.STONE_TILE_STAIRS);
        add(ChiseledBlocks.STONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.STONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.STONE_TILE_WALL);
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILES);
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS);
        add(ChiseledBlocks.MOSSY_STONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_STONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_STONE_TILE_WALL);

        // Granite Block loot
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_PILLAR);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_GRANITE_TILE_WALL);

        // Diorite Block loot
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_PILLAR);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DIORITE_TILE_WALL);

        // Andesite Block loot
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_PILLAR);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        add(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL);

        // Deepslate Block loot
        dropSelf(ChiseledBlocks.DEEPSLATE_PILLAR);
        dropSelf(ChiseledBlocks.CUT_DEEPSLATE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_DEEPSLATE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_DEEPSLATE_BRICK_SLAB));

        // Brick Block loot
        dropSelf(ChiseledBlocks.CRACKED_BRICKS);
        dropSelf(ChiseledBlocks.WEATHERED_BRICKS);
        dropSelf(ChiseledBlocks.WEATHERED_BRICK_STAIRS);
        add(ChiseledBlocks.WEATHERED_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.WEATHERED_BRICK_SLAB));
        dropSelf(ChiseledBlocks.WEATHERED_BRICK_WALL);
        dropSelf(ChiseledBlocks.MOSSY_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_BRICK_WALL);

        // Packed Mud Block loot
        dropSelf(ChiseledBlocks.PACKED_MUD_STAIRS);
        add(ChiseledBlocks.PACKED_MUD_SLAB, createSlabItemTable(ChiseledBlocks.PACKED_MUD_SLAB));
        dropSelf(ChiseledBlocks.PACKED_MUD_WALL);
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_MUD_BRICKS);
        dropSelf(ChiseledBlocks.CUT_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_CUT_MUD_BRICKS);
        dropSelf(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_STAIRS);
        add(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_CUT_MUD_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MUD_TILES);
        dropSelf(ChiseledBlocks.MUD_TILE_STAIRS);
        add(ChiseledBlocks.MUD_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MUD_TILE_SLAB));
        dropSelf(ChiseledBlocks.MUD_TILE_WALL);
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILES);
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS);
        add(ChiseledBlocks.MOSSY_MUD_TILE_SLAB, createSlabItemTable(ChiseledBlocks.MOSSY_MUD_TILE_SLAB));
        dropSelf(ChiseledBlocks.MOSSY_MUD_TILE_WALL);

        // Sandstone Block loot
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_WALL);
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_PILLAR);
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_BRICKS);
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_SMOOTH_SANDSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_TILES);
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_STAIRS);
        add(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_SANDSTONE_TILE_WALL);

        // Red Sandstone Block loot
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL);
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_PILLAR);
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICKS);
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_SMOOTH_RED_SANDSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILES);
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_STAIRS);
        add(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.SMOOTH_RED_SANDSTONE_TILE_WALL);

        // Cinnabar Block loot
        dropSelf(ChiseledBlocks.CRACKED_CINNABAR_BRICKS);
        dropSelf(ChiseledBlocks.CUT_CINNABAR_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_CINNABAR_BRICKS);
        dropSelf(ChiseledBlocks.CUT_CINNABAR_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_CINNABAR_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_CINNABAR_BRICK_SLAB));
        dropSelf(ChiseledBlocks.CINNABAR_TILES);
        dropSelf(ChiseledBlocks.CRACKED_CINNABAR_TILES);
        dropSelf(ChiseledBlocks.CINNABAR_TILE_STAIRS);
        add(ChiseledBlocks.CINNABAR_TILE_SLAB, createSlabItemTable(ChiseledBlocks.CINNABAR_TILE_SLAB));
        dropSelf(ChiseledBlocks.CINNABAR_TILE_WALL);

        // Sulfur Block loot
        dropSelf(ChiseledBlocks.CRACKED_SULFUR_BRICKS);
        dropSelf(ChiseledBlocks.CUT_SULFUR_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_SULFUR_BRICKS);
        dropSelf(ChiseledBlocks.CUT_SULFUR_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_SULFUR_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_SULFUR_BRICK_SLAB));
        dropSelf(ChiseledBlocks.SULFUR_TILES);
        dropSelf(ChiseledBlocks.CRACKED_SULFUR_TILES);
        dropSelf(ChiseledBlocks.SULFUR_TILE_STAIRS);
        add(ChiseledBlocks.SULFUR_TILE_SLAB, createSlabItemTable(ChiseledBlocks.SULFUR_TILE_SLAB));
        dropSelf(ChiseledBlocks.SULFUR_TILE_WALL);

        // Prismarine Block loot
        dropSelf(ChiseledBlocks.POLISHED_PRISMARINE);
        dropSelf(ChiseledBlocks.POLISHED_PRISMARINE_STAIRS);
        add(ChiseledBlocks.POLISHED_PRISMARINE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_PRISMARINE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_PRISMARINE_WALL);
        dropSelf(ChiseledBlocks.PRISMARINE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_PRISMARINE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_PRISMARINE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_PRISMARINE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_PRISMARINE_BRICK_SLAB));

        // Dark Prismarine Block loot
        dropSelf(ChiseledBlocks.DARK_PRISMARINE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_DARK_PRISMARINE);
        dropSelf(ChiseledBlocks.POLISHED_DARK_PRISMARINE_STAIRS);
        add(ChiseledBlocks.POLISHED_DARK_PRISMARINE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_DARK_PRISMARINE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_DARK_PRISMARINE_WALL);
        dropSelf(ChiseledBlocks.DARK_PRISMARINE_BRICKS);
        dropSelf(ChiseledBlocks.DARK_PRISMARINE_BRICK_STAIRS);
        add(ChiseledBlocks.DARK_PRISMARINE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.DARK_PRISMARINE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.DARK_PRISMARINE_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_DARK_PRISMARINE_BRICK_SLAB));

        // Red Nether Brick Block loot
        dropSelf(ChiseledBlocks.CRACKED_RED_NETHER_BRICKS);
        dropSelf(ChiseledBlocks.RED_NETHER_BRICK_FENCE);
        dropSelf(ChiseledBlocks.CHISELED_RED_NETHER_BRICKS);

        // Blackstone Block loot
        dropSelf(ChiseledBlocks.POLISHED_BLACKSTONE_PILLAR);
        dropSelf(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_BLACKSTONE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        dropSelf(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        add(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_WALL);

        // End Stone Block loot
        dropSelf(ChiseledBlocks.END_STONE_STAIRS);
        add(ChiseledBlocks.END_STONE_SLAB, createSlabItemTable(ChiseledBlocks.END_STONE_SLAB));
        dropSelf(ChiseledBlocks.END_STONE_WALL);
        dropSelf(ChiseledBlocks.POLISHED_END_STONE);
        dropSelf(ChiseledBlocks.POLISHED_END_STONE_STAIRS);
        add(ChiseledBlocks.POLISHED_END_STONE_SLAB, createSlabItemTable(ChiseledBlocks.POLISHED_END_STONE_SLAB));
        dropSelf(ChiseledBlocks.POLISHED_END_STONE_WALL);
        dropSelf(ChiseledBlocks.END_STONE_PILLAR);
        dropSelf(ChiseledBlocks.CRACKED_END_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_END_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CRACKED_CUT_END_STONE_BRICKS);
        dropSelf(ChiseledBlocks.CUT_END_STONE_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_END_STONE_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_END_STONE_BRICK_SLAB));
        dropSelf(ChiseledBlocks.END_STONE_TILES);
        dropSelf(ChiseledBlocks.CRACKED_END_STONE_TILES);
        dropSelf(ChiseledBlocks.END_STONE_TILE_STAIRS);
        add(ChiseledBlocks.END_STONE_TILE_SLAB, createSlabItemTable(ChiseledBlocks.END_STONE_TILE_SLAB));
        dropSelf(ChiseledBlocks.END_STONE_TILE_WALL);

        // Quartz Block loot
        dropSelf(ChiseledBlocks.QUARTZ_WALL);
        dropSelf(ChiseledBlocks.SMOOTH_QUARTZ_WALL);
        dropSelf(ChiseledBlocks.QUARTZ_BRICK_STAIRS);
        add(ChiseledBlocks.QUARTZ_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.QUARTZ_BRICK_SLAB));
        dropSelf(ChiseledBlocks.QUARTZ_BRICK_WALL);
        dropSelf(ChiseledBlocks.CUT_QUARTZ_BRICKS);
        dropSelf(ChiseledBlocks.CUT_QUARTZ_BRICK_STAIRS);
        add(ChiseledBlocks.CUT_QUARTZ_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CUT_QUARTZ_BRICK_SLAB));
        dropSelf(ChiseledBlocks.QUARTZ_TILES);
        dropSelf(ChiseledBlocks.QUARTZ_TILE_STAIRS);
        add(ChiseledBlocks.QUARTZ_TILE_SLAB, createSlabItemTable(ChiseledBlocks.QUARTZ_TILE_SLAB));
        dropSelf(ChiseledBlocks.QUARTZ_TILE_WALL);

        // Terracotta Block loot
        dropSelf(ChiseledBlocks.TERRACOTTA_STAIRS);
        add(ChiseledBlocks.TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.WHITE_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.WHITE_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.WHITE_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.WHITE_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.WHITE_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.WHITE_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.WHITE_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.GRAY_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.GRAY_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.GRAY_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.GRAY_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.GRAY_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.GRAY_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.GRAY_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.BLACK_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.BLACK_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.BLACK_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.BLACK_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.BLACK_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.BLACK_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.BLACK_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.BROWN_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.BROWN_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.BROWN_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.BROWN_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.BROWN_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.BROWN_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.BROWN_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.RED_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.RED_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.RED_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.RED_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.RED_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.RED_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.RED_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.RED_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.RED_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.RED_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.ORANGE_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.ORANGE_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.ORANGE_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.ORANGE_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.ORANGE_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.ORANGE_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.YELLOW_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.YELLOW_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.YELLOW_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.YELLOW_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.YELLOW_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.YELLOW_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.LIME_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.LIME_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.LIME_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.LIME_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.LIME_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.LIME_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.LIME_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.LIME_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.LIME_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.GREEN_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.GREEN_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.GREEN_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.GREEN_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.GREEN_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.GREEN_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.GREEN_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.CYAN_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.CYAN_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.CYAN_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.CYAN_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.CYAN_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.CYAN_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.CYAN_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.BLUE_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.BLUE_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.BLUE_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.BLUE_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.BLUE_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.BLUE_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.BLUE_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.PURPLE_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.PURPLE_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.PURPLE_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.PURPLE_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.PURPLE_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.PURPLE_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.MAGENTA_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.MAGENTA_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.MAGENTA_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.MAGENTA_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.MAGENTA_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
        dropSelf(ChiseledBlocks.PINK_CONCRETE_WALL);
        dropSelf(ChiseledBlocks.PINK_TERRACOTTA_STAIRS);
        add(ChiseledBlocks.PINK_TERRACOTTA_SLAB, createSlabItemTable(ChiseledBlocks.PINK_TERRACOTTA_SLAB));
        dropSelf(ChiseledBlocks.PINK_TERRACOTTA_WALL);
        dropSelf(ChiseledBlocks.PINK_TERRACOTTA_BRICKS);
        dropSelf(ChiseledBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
        add(ChiseledBlocks.PINK_TERRACOTTA_BRICK_SLAB, createSlabItemTable(ChiseledBlocks.PINK_TERRACOTTA_BRICK_SLAB));
        dropSelf(ChiseledBlocks.PINK_TERRACOTTA_BRICK_WALL);
    }
}
