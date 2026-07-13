package net.hyper.chiseled.registry;

import net.hyper.chiseled.block.*;
import net.hyper.chiseled.refrence.ChiseledBlockItemIds;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static net.hyper.silliestlib.utils.SilliestLibRegUtils.*;

public interface ChiseledBlocks {
    Block STONE_WALL = regBlock(ChiseledBlockItemIds.STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_STONE = regBlock(ChiseledBlockItemIds.POLISHED_STONE,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_STONE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_STONE_STAIRS,
            properties -> new StairBlock(POLISHED_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_STONE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_STONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_STONE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block SMOOTH_STONE_STAIRS = regBlock(ChiseledBlockItemIds.SMOOTH_STONE_STAIRS,
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_STONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_STONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_STONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_STONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_CUT_STONE_BRICKS = regBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_CUT_STONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_STAIRS,
            properties -> new StairBlock(MOSSY_CUT_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_CUT_STONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_CUT_STONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block STONE_TILES = regBlock(ChiseledBlockItemIds.STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_STONE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block STONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.STONE_TILE_STAIRS,
            properties -> new StairBlock(STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block STONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.STONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block STONE_TILE_WALL = regBlock(ChiseledBlockItemIds.STONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_STONE_TILES = regBlock(ChiseledBlockItemIds.MOSSY_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_STONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_STONE_TILE_STAIRS,
            properties -> new StairBlock(MOSSY_STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_STONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_STONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block MOSSY_STONE_TILE_WALL = regBlock(ChiseledBlockItemIds.MOSSY_STONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block POLISHED_GRANITE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_BRICKS = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_GRANITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_STAIRS,
            properties -> new StairBlock(POLISHED_GRANITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_BRICK_WALL = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_PILLAR = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_PILLAR,
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_GRANITE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_POLISHED_GRANITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_GRANITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_GRANITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_POLISHED_GRANITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_GRANITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_POLISHED_GRANITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_TILES = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_GRANITE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_GRANITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_STAIRS,
            properties -> new StairBlock(POLISHED_GRANITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_TILE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_GRANITE_TILE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_GRANITE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block POLISHED_DIORITE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_BRICKS = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_DIORITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_STAIRS,
            properties -> new StairBlock(POLISHED_DIORITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_BRICK_WALL = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_PILLAR = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_PILLAR,
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_DIORITE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_POLISHED_DIORITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_DIORITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_DIORITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_POLISHED_DIORITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_DIORITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_POLISHED_DIORITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_TILES = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_DIORITE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_DIORITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_STAIRS,
            properties -> new StairBlock(POLISHED_DIORITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_TILE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DIORITE_TILE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_DIORITE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block POLISHED_ANDESITE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_BRICKS = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_ANDESITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_STAIRS,
            properties -> new StairBlock(POLISHED_ANDESITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_BRICK_WALL = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_PILLAR = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_PILLAR,
            properties -> new RotatedPillarBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_ANDESITE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_POLISHED_ANDESITE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_ANDESITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_ANDESITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_POLISHED_ANDESITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_ANDESITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_POLISHED_ANDESITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_TILES = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_ANDESITE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_ANDESITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_STAIRS,
            properties -> new StairBlock(POLISHED_ANDESITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_TILE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_ANDESITE_TILE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_ANDESITE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block CUT_DEEPSLATE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    Block CRACKED_CUT_DEEPSLATE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_DEEPSLATE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    Block CUT_DEEPSLATE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_DEEPSLATE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    Block CUT_DEEPSLATE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_DEEPSLATE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));

    Block CALCITE_STAIRS = regBlock(ChiseledBlockItemIds.CALCITE_STAIRS,
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    Block CALCITE_SLAB = regBlock(ChiseledBlockItemIds.CALCITE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    Block CALCITE_WALL = regBlock(ChiseledBlockItemIds.CALCITE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    Block POLISHED_CALCITE = regBlock(ChiseledBlockItemIds.POLISHED_CALCITE,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block POLISHED_CALCITE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_CALCITE_STAIRS,
            properties -> new StairBlock(POLISHED_CALCITE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block POLISHED_CALCITE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_CALCITE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block POLISHED_CALCITE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_CALCITE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_BRICKS = regBlock(ChiseledBlockItemIds.CALCITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CALCITE_BRICK_STAIRS,
            properties -> new StairBlock(CALCITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CALCITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_BRICK_WALL = regBlock(ChiseledBlockItemIds.CALCITE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CUT_CALCITE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_CALCITE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CUT_CALCITE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_CALCITE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_CALCITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CUT_CALCITE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_CALCITE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_TILES = regBlock(ChiseledBlockItemIds.CALCITE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.CALCITE_TILE_STAIRS,
            properties -> new StairBlock(CALCITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_TILE_SLAB = regBlock(ChiseledBlockItemIds.CALCITE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));
    Block CALCITE_TILE_WALL = regBlock(ChiseledBlockItemIds.CALCITE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(1.5F, 4.0F)));

    Block DRIPSTONE_STAIRS = regBlock(ChiseledBlockItemIds.DRIPSTONE_STAIRS,
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    Block DRIPSTONE_SLAB = regBlock(ChiseledBlockItemIds.DRIPSTONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    Block DRIPSTONE_WALL = regBlock(ChiseledBlockItemIds.DRIPSTONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    Block POLISHED_DRIPSTONE = regBlock(ChiseledBlockItemIds.POLISHED_DRIPSTONE,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DRIPSTONE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_DRIPSTONE_STAIRS,
            properties -> new StairBlock(POLISHED_DRIPSTONE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DRIPSTONE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_DRIPSTONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_DRIPSTONE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_DRIPSTONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_BRICKS = regBlock(ChiseledBlockItemIds.DRIPSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.DRIPSTONE_BRICK_STAIRS,
            properties -> new StairBlock(DRIPSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.DRIPSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_BRICK_WALL = regBlock(ChiseledBlockItemIds.DRIPSTONE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DRIPSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DRIPSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_DRIPSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DRIPSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_DRIPSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_TILES = regBlock(ChiseledBlockItemIds.DRIPSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.DRIPSTONE_TILE_STAIRS,
            properties -> new StairBlock(DRIPSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.DRIPSTONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DRIPSTONE_TILE_WALL = regBlock(ChiseledBlockItemIds.DRIPSTONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block MIXED_BRICKS = regBlock(ChiseledBlockItemIds.MIXED_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MIXED_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MIXED_BRICK_STAIRS,
            properties -> new StairBlock(MIXED_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MIXED_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MIXED_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MIXED_BRICK_WALL = regBlock(ChiseledBlockItemIds.MIXED_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MOSSY_BRICKS = regBlock(ChiseledBlockItemIds.MOSSY_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MOSSY_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_BRICK_STAIRS,
            properties -> new StairBlock(MOSSY_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MOSSY_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block MOSSY_BRICK_WALL = regBlock(ChiseledBlockItemIds.MOSSY_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    Block PACKED_MUD_STAIRS = regBlock(ChiseledBlockItemIds.PACKED_MUD_STAIRS,
            properties -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    Block PACKED_MUD_SLAB = regBlock(ChiseledBlockItemIds.PACKED_MUD_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    Block PACKED_MUD_WALL = regBlock(ChiseledBlockItemIds.PACKED_MUD_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    Block POLISHED_MUD = regBlock(ChiseledBlockItemIds.POLISHED_MUD,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block POLISHED_MUD_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_MUD_STAIRS,
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block POLISHED_MUD_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_MUD_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block POLISHED_MUD_WALL = regBlock(ChiseledBlockItemIds.POLISHED_MUD_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_BRICKS = regBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICK_STAIRS,
            properties -> new StairBlock(MOSSY_MUD_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_BRICK_WALL = regBlock(ChiseledBlockItemIds.MOSSY_MUD_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block CUT_MUD_BRICKS = regBlock(ChiseledBlockItemIds.CUT_MUD_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block CUT_MUD_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_MUD_BRICK_STAIRS,
            properties -> new StairBlock(CUT_MUD_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block CUT_MUD_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_MUD_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_CUT_MUD_BRICKS = regBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_CUT_MUD_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_STAIRS,
            properties -> new StairBlock(MOSSY_CUT_MUD_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_CUT_MUD_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_CUT_MUD_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MUD_TILES = regBlock(ChiseledBlockItemIds.MUD_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MUD_TILE_STAIRS = regBlock(ChiseledBlockItemIds.MUD_TILE_STAIRS,
            properties -> new StairBlock(MUD_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MUD_TILE_SLAB = regBlock(ChiseledBlockItemIds.MUD_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MUD_TILE_WALL = regBlock(ChiseledBlockItemIds.MUD_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_TILES = regBlock(ChiseledBlockItemIds.MOSSY_MUD_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_TILE_STAIRS = regBlock(ChiseledBlockItemIds.MOSSY_MUD_TILE_STAIRS,
            properties -> new StairBlock(MOSSY_MUD_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_TILE_SLAB = regBlock(ChiseledBlockItemIds.MOSSY_MUD_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    Block MOSSY_MUD_TILE_WALL = regBlock(ChiseledBlockItemIds.MOSSY_MUD_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));

    Block HONEYCOMB_STAIRS = regBlock(ChiseledBlockItemIds.HONEYCOMB_STAIRS,
            properties -> new StairBlock(Blocks.HONEYCOMB_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_SLAB = regBlock(ChiseledBlockItemIds.HONEYCOMB_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_WALL = regBlock(ChiseledBlockItemIds.HONEYCOMB_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_BRICKS = regBlock(ChiseledBlockItemIds.HONEYCOMB_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.HONEYCOMB_BRICK_STAIRS,
            properties -> new StairBlock(HONEYCOMB_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_BRICK_SLAB = regBlock(ChiseledBlockItemIds.HONEYCOMB_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_BRICK_WALL = regBlock(ChiseledBlockItemIds.HONEYCOMB_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block CUT_HONEYCOMB_BRICKS = regBlock(ChiseledBlockItemIds.CUT_HONEYCOMB_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block CUT_HONEYCOMB_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_HONEYCOMB_BRICK_STAIRS,
            properties -> new StairBlock(CUT_HONEYCOMB_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block CUT_HONEYCOMB_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_HONEYCOMB_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_TILES = regBlock(ChiseledBlockItemIds.HONEYCOMB_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_TILE_STAIRS = regBlock(ChiseledBlockItemIds.HONEYCOMB_TILE_STAIRS,
            properties -> new StairBlock(HONEYCOMB_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_TILE_SLAB = regBlock(ChiseledBlockItemIds.HONEYCOMB_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    Block HONEYCOMB_TILE_WALL = regBlock(ChiseledBlockItemIds.HONEYCOMB_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 3.0F).sound(SoundType.CORAL_BLOCK)));
    
    Block SMOOTH_SANDSTONE_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_SANDSTONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_BRICKS = regBlock(ChiseledBlockItemIds.SANDSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.SANDSTONE_BRICK_STAIRS,
            properties -> new StairBlock(SANDSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.SANDSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_BRICK_WALL = regBlock(ChiseledBlockItemIds.SANDSTONE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_SANDSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_SANDSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_SANDSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_SANDSTONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_SANDSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_SANDSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_SANDSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_TILES = regBlock(ChiseledBlockItemIds.SANDSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.SANDSTONE_TILE_STAIRS,
            properties -> new StairBlock(SANDSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.SANDSTONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block SANDSTONE_TILE_WALL = regBlock(ChiseledBlockItemIds.SANDSTONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    
    Block SMOOTH_RED_SANDSTONE_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_RED_SANDSTONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_BRICKS = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_STAIRS,
            properties -> new StairBlock(RED_SANDSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_BRICK_WALL = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_RED_SANDSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_RED_SANDSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_RED_SANDSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block CUT_RED_SANDSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_RED_SANDSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_TILES = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_TILE_STAIRS,
            properties -> new StairBlock(RED_SANDSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block RED_SANDSTONE_TILE_WALL = regBlock(ChiseledBlockItemIds.RED_SANDSTONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    Block CUT_CINNABAR_BRICKS = regBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICKS,
            properties -> new Block(properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_CINNABAR_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_STAIRS,
            properties -> new StairBlock(CUT_CINNABAR_BRICKS.defaultBlockState(),properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_CINNABAR_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_CINNABAR_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CINNABAR_TILES = regBlock(ChiseledBlockItemIds.CINNABAR_TILES,
            properties -> new Block(properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CINNABAR_TILE_STAIRS = regBlock(ChiseledBlockItemIds.CINNABAR_TILE_STAIRS,
            properties -> new StairBlock(CINNABAR_TILES.defaultBlockState(),properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CINNABAR_TILE_SLAB = regBlock(ChiseledBlockItemIds.CINNABAR_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CINNABAR_TILE_WALL = regBlock(ChiseledBlockItemIds.CINNABAR_TILE_WALL,
            properties -> new WallBlock(properties
                    .sound(SoundType.CINNABAR).mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block CUT_SULFUR_BRICKS = regBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICKS,
            properties -> new Block(properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_SULFUR_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICK_STAIRS,
            properties -> new StairBlock(CUT_SULFUR_BRICKS.defaultBlockState(),properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_SULFUR_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_SULFUR_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block SULFUR_TILES = regBlock(ChiseledBlockItemIds.SULFUR_TILES,
            properties -> new Block(properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block SULFUR_TILE_STAIRS = regBlock(ChiseledBlockItemIds.SULFUR_TILE_STAIRS,
            properties -> new StairBlock(SULFUR_TILES.defaultBlockState(),properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block SULFUR_TILE_SLAB = regBlock(ChiseledBlockItemIds.SULFUR_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block SULFUR_TILE_WALL = regBlock(ChiseledBlockItemIds.SULFUR_TILE_WALL,
            properties -> new WallBlock(properties
                    .sound(SoundType.SULFUR).mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    
    Block PRISMARINE_BRICK_WALL = regBlock(ChiseledBlockItemIds.PRISMARINE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_PRISMARINE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_PRISMARINE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_PRISMARINE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_PRISMARINE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_PRISMARINE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DARK_PRISMARINE_WALL = regBlock(ChiseledBlockItemIds.DARK_PRISMARINE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DARK_PRISMARINE_BRICKS = regBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DARK_PRISMARINE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_STAIRS,
            properties -> new StairBlock(DARK_PRISMARINE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DARK_PRISMARINE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block DARK_PRISMARINE_BRICK_WALL = regBlock(ChiseledBlockItemIds.DARK_PRISMARINE_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DARK_PRISMARINE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DARK_PRISMARINE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_DARK_PRISMARINE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_DARK_PRISMARINE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_DARK_PRISMARINE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIAMOND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block PACKED_SNOW_BRICKS = regBlock(ChiseledBlockItemIds.PACKED_SNOW_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block PACKED_SNOW_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.PACKED_SNOW_BRICK_STAIRS,
            properties -> new StairBlock(PACKED_SNOW_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block PACKED_SNOW_BRICK_SLAB = regBlock(ChiseledBlockItemIds.PACKED_SNOW_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block CUT_PACKED_SNOW_BRICKS = regBlock(ChiseledBlockItemIds.CUT_PACKED_SNOW_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block CUT_PACKED_SNOW_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_PACKED_SNOW_BRICK_STAIRS,
            properties -> new StairBlock(CUT_PACKED_SNOW_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block CUT_PACKED_SNOW_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_PACKED_SNOW_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block PACKED_SNOW_TILES = regBlock(ChiseledBlockItemIds.PACKED_SNOW_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block PACKED_SNOW_TILE_STAIRS = regBlock(ChiseledBlockItemIds.PACKED_SNOW_TILE_STAIRS,
            properties -> new StairBlock(PACKED_SNOW_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));
    Block PACKED_SNOW_TILE_SLAB = regBlock(ChiseledBlockItemIds.PACKED_SNOW_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SNOW).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.SNOW)));

    Block TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block WHITE_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block WHITE_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(WHITE_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block WHITE_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block WHITE_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.WHITE_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_GRAY_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(LIGHT_GRAY_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.LIGHT_GRAY_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GRAY_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GRAY_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(GRAY_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GRAY_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GRAY_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.GRAY_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLACK_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLACK_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(BLACK_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLACK_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLACK_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.BLACK_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BROWN_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BROWN_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(BROWN_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BROWN_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BROWN_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.BROWN_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block RED_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block RED_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(RED_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block RED_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block RED_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.RED_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block ORANGE_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block ORANGE_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(ORANGE_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block ORANGE_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block ORANGE_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.ORANGE_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block YELLOW_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block YELLOW_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(YELLOW_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block YELLOW_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block YELLOW_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.YELLOW_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIME_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIME_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(LIME_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIME_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIME_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.LIME_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GREEN_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GREEN_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(GREEN_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GREEN_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block GREEN_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.GREEN_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block CYAN_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block CYAN_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(CYAN_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block CYAN_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block CYAN_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.CYAN_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_BLUE_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(LIGHT_BLUE_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.LIGHT_BLUE_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLUE_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLUE_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(BLUE_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLUE_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block BLUE_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.BLUE_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PURPLE_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PURPLE_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(PURPLE_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PURPLE_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PURPLE_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.PURPLE_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block MAGENTA_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block MAGENTA_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(MAGENTA_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block MAGENTA_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block MAGENTA_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.MAGENTA_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PINK_TERRACOTTA_BRICKS = regBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PINK_TERRACOTTA_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_STAIRS,
            properties -> new StairBlock(PINK_TERRACOTTA_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PINK_TERRACOTTA_BRICK_SLAB = regBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    Block PINK_TERRACOTTA_BRICK_WALL = regBlock(ChiseledBlockItemIds.PINK_TERRACOTTA_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    
    Block CRACKED_RED_NETHER_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_RED_NETHER_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    Block RED_NETHER_BRICK_FENCE = regBlock(ChiseledBlockItemIds.RED_NETHER_BRICK_FENCE,
            properties -> new FenceBlock(properties
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));
    Block CHISELED_RED_NETHER_BRICKS = regBlock(ChiseledBlockItemIds.CHISELED_RED_NETHER_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.NETHER_BRICKS)));

    Block SMOOTH_BASALT_STAIRS = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_STAIRS,
            properties -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block SMOOTH_BASALT_SLAB = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block SMOOTH_BASALT_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_BASALT_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT)));
    Block BASALT_BRICKS = regBlock(ChiseledBlockItemIds.BASALT_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.BASALT_BRICK_STAIRS,
            properties -> new StairBlock(BASALT_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_SLAB = regBlock(ChiseledBlockItemIds.BASALT_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_BRICK_WALL = regBlock(ChiseledBlockItemIds.BASALT_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICKS = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICK_STAIRS,
            properties -> new StairBlock(CUT_BASALT_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block CUT_BASALT_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_BASALT_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILES = regBlock(ChiseledBlockItemIds.BASALT_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_STAIRS = regBlock(ChiseledBlockItemIds.BASALT_TILE_STAIRS,
            properties -> new StairBlock(BASALT_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_SLAB = regBlock(ChiseledBlockItemIds.BASALT_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));
    Block BASALT_TILE_WALL = regBlock(ChiseledBlockItemIds.BASALT_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.BASALT)));

    Block CUT_POLISHED_BLACKSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_BLACKSTONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CUT_POLISHED_BLACKSTONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_POLISHED_BLACKSTONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILES = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block CRACKED_POLISHED_BLACKSTONE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_POLISHED_BLACKSTONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_STAIRS,
            properties -> new StairBlock(POLISHED_BLACKSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    Block POLISHED_BLACKSTONE_TILE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_BLACKSTONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    Block END_STONE_STAIRS = regBlock(ChiseledBlockItemIds.END_STONE_STAIRS,
            properties -> new StairBlock(Blocks.END_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_SLAB = regBlock(ChiseledBlockItemIds.END_STONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_WALL = regBlock(ChiseledBlockItemIds.END_STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_STAIRS = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_STAIRS,
            properties -> new StairBlock(POLISHED_END_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_SLAB = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block POLISHED_END_STONE_WALL = regBlock(ChiseledBlockItemIds.POLISHED_END_STONE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_CUT_END_STONE_BRICKS = regBlock(ChiseledBlockItemIds.CRACKED_CUT_END_STONE_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICK_STAIRS,
            properties -> new StairBlock(CUT_END_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CUT_END_STONE_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_END_STONE_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILES = regBlock(ChiseledBlockItemIds.END_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block CRACKED_END_STONE_TILES = regBlock(ChiseledBlockItemIds.CRACKED_END_STONE_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_STAIRS = regBlock(ChiseledBlockItemIds.END_STONE_TILE_STAIRS,
            properties -> new StairBlock(END_STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_SLAB = regBlock(ChiseledBlockItemIds.END_STONE_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));
    Block END_STONE_TILE_WALL = regBlock(ChiseledBlockItemIds.END_STONE_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F)));

    Block QUARTZ_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block SMOOTH_QUARTZ_WALL = regBlock(ChiseledBlockItemIds.SMOOTH_QUARTZ_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    Block QUARTZ_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_STAIRS,
            properties -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_BRICK_SLAB = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_BRICK_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_BRICK_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICKS = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICKS,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_STAIRS,
            properties -> new StairBlock(CUT_QUARTZ_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block CUT_QUARTZ_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_QUARTZ_BRICK_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILES = regBlock(ChiseledBlockItemIds.QUARTZ_TILES,
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_STAIRS = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_STAIRS,
            properties -> new StairBlock(QUARTZ_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_SLAB = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_SLAB,
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));
    Block QUARTZ_TILE_WALL = regBlock(ChiseledBlockItemIds.QUARTZ_TILE_WALL,
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F)));

    Block AMETHYST_STAIRS = regBlock(ChiseledBlockItemIds.AMETHYST_STAIRS,
            properties -> new AmethystStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_SLAB = regBlock(ChiseledBlockItemIds.AMETHYST_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_WALL = regBlock(ChiseledBlockItemIds.AMETHYST_WALL,
            properties -> new AmethystWallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICKS = regBlock(ChiseledBlockItemIds.AMETHYST_BRICKS,
            properties -> new AmethystBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_STAIRS,
            properties -> new AmethystStairBlock(AMETHYST_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_SLAB = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_BRICK_WALL = regBlock(ChiseledBlockItemIds.AMETHYST_BRICK_WALL,
            properties -> new AmethystWallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICKS = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICKS,
            properties -> new AmethystBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICK_STAIRS = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICK_STAIRS,
            properties -> new AmethystStairBlock(CUT_AMETHYST_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block CUT_AMETHYST_BRICK_SLAB = regBlock(ChiseledBlockItemIds.CUT_AMETHYST_BRICK_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_TILES = regBlock(ChiseledBlockItemIds.AMETHYST_TILES,
            properties -> new AmethystBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_TILE_STAIRS = regBlock(ChiseledBlockItemIds.AMETHYST_TILE_STAIRS,
            properties -> new AmethystStairBlock(AMETHYST_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_TILE_SLAB = regBlock(ChiseledBlockItemIds.AMETHYST_TILE_SLAB,
            properties -> new AmethystSlabBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    Block AMETHYST_TILE_WALL = regBlock(ChiseledBlockItemIds.AMETHYST_TILE_WALL,
            properties -> new AmethystWallBlock(properties
                    .mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 3.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    
    Block NETHERITE_STAIRS = regBlock(ChiseledBlockItemIds.NETHERITE_STAIRS,
            properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    static void init() {}
}