package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import java.util.function.Function;

public class ChiseledBlocks {
    public static final Block OAK_TRIM = registerBlock("oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs",
            properties -> new StairBlock(VERTICAL_OAK_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block SPRUCE_TRIM = registerBlock("spruce_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs",
            properties -> new StairBlock(VERTICAL_SPRUCE_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BIRCH_TRIM = registerBlock("birch_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs",
            properties -> new StairBlock(VERTICAL_BIRCH_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block JUNGLE_TRIM = registerBlock("jungle_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs",
            properties -> new StairBlock(VERTICAL_JUNGLE_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block ACACIA_TRIM = registerBlock("acacia_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs",
            properties -> new StairBlock(VERTICAL_ACACIA_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block DARK_OAK_TRIM = registerBlock("dark_oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs",
            properties -> new StairBlock(VERTICAL_DARK_OAK_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block MANGROVE_TRIM = registerBlock("mangrove_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs",
            properties -> new StairBlock(VERTICAL_MANGROVE_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block CHERRY_TRIM = registerBlock("cherry_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs",
            properties -> new StairBlock(VERTICAL_CHERRY_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final Block PALE_OAK_TRIM = registerBlock("pale_oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_PALE_OAK_PLANKS = registerBlock("vertical_pale_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_PALE_OAK_STAIRS = registerBlock("vertical_pale_oak_stairs",
            properties -> new StairBlock(VERTICAL_PALE_OAK_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block VERTICAL_PALE_OAK_SLAB = registerBlock("vertical_pale_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final Block BAMBOO_TRIM = registerBlock("bamboo_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));
    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs",
            properties -> new StairBlock(VERTICAL_BAMBOO_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));
    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava()));
    public static final Block CRIMSON_TRIM = registerBlock("crimson_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs",
            properties -> new StairBlock(VERTICAL_CRIMSON_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.CRIMSON_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block WARPED_TRIM = registerBlock("warped_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.WARPED_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.WARPED_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs",
            properties -> new StairBlock(VERTICAL_WARPED_PLANKS.defaultBlockState(),properties
                    .mapColor(MapColor.WARPED_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.WARPED_STEM).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            properties -> new StairBlock(POLISHED_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_STONE_BRICKS = registerBlock("cut_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_CUT_STONE_BRICKS = registerBlock("cracked_cut_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_STONE_BRICK_STAIRS = registerBlock("cut_stone_brick_stairs",
            properties -> new StairBlock(CUT_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_STONE_BRICK_SLAB = registerBlock("cut_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CUT_STONE_BRICKS = registerBlock("mossy_cut_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CUT_STONE_BRICK_STAIRS = registerBlock("mossy_cut_stone_brick_stairs",
            properties -> new StairBlock(MOSSY_CUT_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CUT_STONE_BRICK_SLAB = registerBlock("mossy_cut_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            properties -> new StairBlock(STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            properties -> new StairBlock(MOSSY_STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_GRANITE_BRICKS = registerBlock("cracked_polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            properties -> new StairBlock(POLISHED_GRANITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_GRANITE_BRICKS = registerBlock("cut_polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_CUT_POLISHED_GRANITE_BRICKS = registerBlock("cracked_cut_polished_granite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_GRANITE_BRICK_STAIRS = registerBlock("cut_polished_granite_brick_stairs",
            properties -> new StairBlock(CUT_POLISHED_GRANITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_GRANITE_BRICK_SLAB = registerBlock("cut_polished_granite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILES = registerBlock("polished_granite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_GRANITE_TILES = registerBlock("cracked_polished_granite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_STAIRS = registerBlock("polished_granite_tile_stairs",
            properties -> new StairBlock(POLISHED_GRANITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_SLAB = registerBlock("polished_granite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_WALL = registerBlock("polished_granite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_DIORITE_BRICKS = registerBlock("cracked_polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            properties -> new StairBlock(POLISHED_DIORITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_DIORITE_BRICKS = registerBlock("cut_polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_CUT_POLISHED_DIORITE_BRICKS = registerBlock("cracked_cut_polished_diorite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_DIORITE_BRICK_STAIRS = registerBlock("cut_polished_diorite_brick_stairs",
            properties -> new StairBlock(CUT_POLISHED_DIORITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_DIORITE_BRICK_SLAB = registerBlock("cut_polished_diorite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILES = registerBlock("polished_diorite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_DIORITE_TILES = registerBlock("cracked_polished_diorite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_STAIRS = registerBlock("polished_diorite_tile_stairs",
            properties -> new StairBlock(POLISHED_DIORITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_SLAB = registerBlock("polished_diorite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_WALL = registerBlock("polished_diorite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_ANDESITE_BRICKS = registerBlock("cracked_polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            properties -> new StairBlock(POLISHED_ANDESITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_ANDESITE_BRICKS = registerBlock("cut_polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_CUT_POLISHED_ANDESITE_BRICKS = registerBlock("cracked_cut_polished_andesite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("cut_polished_andesite_brick_stairs",
            properties -> new StairBlock(CUT_POLISHED_ANDESITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_POLISHED_ANDESITE_BRICK_SLAB = registerBlock("cut_polished_andesite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILES = registerBlock("polished_andesite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_ANDESITE_TILES = registerBlock("cracked_polished_andesite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_STAIRS = registerBlock("polished_andesite_tile_stairs",
            properties -> new StairBlock(POLISHED_ANDESITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_SLAB = registerBlock("polished_andesite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_WALL = registerBlock("polished_andesite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block CUT_DEEPSLATE_BRICKS = registerBlock("cut_deepslate_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_CUT_DEEPSLATE_BRICKS = registerBlock("cracked_cut_deepslate_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final Block CUT_DEEPSLATE_BRICK_STAIRS = registerBlock("cut_deepslate_brick_stairs",
            properties -> new StairBlock(CUT_DEEPSLATE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final Block CUT_DEEPSLATE_BRICK_SLAB = registerBlock("cut_deepslate_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairBlock(Blocks.CALCITE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairBlock(POLISHED_CALCITE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairBlock(CALCITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CUT_CALCITE_BRICKS = registerBlock("cut_calcite_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CUT_CALCITE_BRICK_STAIRS = registerBlock("cut_calcite_brick_stairs",
            properties -> new StairBlock(CUT_CALCITE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CUT_CALCITE_BRICK_SLAB = registerBlock("cut_calcite_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs",
            properties -> new StairBlock(CALCITE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
    public static final Block CALCITE_TILE_WALL = registerBlock("calcite_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));

    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            properties -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            properties -> new StairBlock(POLISHED_DRIPSTONE.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            properties -> new StairBlock(DRIPSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block CUT_DRIPSTONE_BRICKS = registerBlock("cut_dripstone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block CUT_DRIPSTONE_BRICK_STAIRS = registerBlock("cut_dripstone_brick_stairs",
            properties -> new StairBlock(CUT_DRIPSTONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block CUT_DRIPSTONE_BRICK_SLAB = registerBlock("cut_dripstone_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            properties -> new StairBlock(DRIPSTONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
    public static final Block DRIPSTONE_TILE_WALL = registerBlock("dripstone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));

    public static final Block MIXED_BRICKS = registerBlock("mixed_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MIXED_BRICK_STAIRS = registerBlock("mixed_brick_stairs",
            properties -> new StairBlock(MIXED_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MIXED_BRICK_SLAB = registerBlock("mixed_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MIXED_BRICK_WALL = registerBlock("mixed_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            properties -> new StairBlock(MOSSY_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.DIRT).strength(1.0F, 3.0F).sound(SoundType.PACKED_MUD)));
    public static final Block POLISHED_MUD = registerBlock("polished_mud",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block POLISHED_MUD_STAIRS = registerBlock("polished_mud_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block POLISHED_MUD_SLAB = registerBlock("polished_mud_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block POLISHED_MUD_WALL = registerBlock("polished_mud_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block CUT_MUD_BRICKS = registerBlock("cut_mud_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block CUT_MUD_BRICK_STAIRS = registerBlock("cut_mud_brick_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block CUT_MUD_BRICK_SLAB = registerBlock("cut_mud_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_CUT_MUD_BRICKS = registerBlock("mossy_cut_mud_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_CUT_MUD_BRICK_STAIRS = registerBlock("mossy_cut_mud_brick_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_CUT_MUD_BRICK_SLAB = registerBlock("mossy_cut_mud_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MUD_TILES = registerBlock("mud_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MUD_TILE_STAIRS = registerBlock("mud_tile_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MUD_TILE_SLAB = registerBlock("mud_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MUD_TILE_WALL = registerBlock("mud_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILES = registerBlock("mossy_mud_tiles",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_STAIRS = registerBlock("mossy_mud_tile_stairs",
            properties -> new StairBlock(POLISHED_MUD.defaultBlockState(),properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_SLAB = registerBlock("mossy_mud_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_WALL = registerBlock("mossy_mud_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 3.0F).sound(SoundType.MUD_BRICKS)));
    
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Chiseled.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Chiseled.MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Chiseled.MOD_ID, name)))));
    }

    public static void registerBlocks() {
        FlammableBlockRegistry.getDefaultInstance().add(OAK_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(SPRUCE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_SPRUCE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_SPRUCE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_SPRUCE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BIRCH_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BIRCH_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BIRCH_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_JUNGLE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_JUNGLE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_JUNGLE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ACACIA_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_ACACIA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_ACACIA_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_ACACIA_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(DARK_OAK_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_DARK_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_DARK_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_DARK_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(MANGROVE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_MANGROVE_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_MANGROVE_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_MANGROVE_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(CHERRY_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_CHERRY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_CHERRY_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_CHERRY_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(PALE_OAK_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_PALE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_PALE_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_PALE_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BAMBOO_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BAMBOO_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BAMBOO_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(VERTICAL_BAMBOO_SLAB, 5, 20);

        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(OAK_TRIM, 300);
            builder.add(VERTICAL_OAK_PLANKS, 300);
            builder.add(VERTICAL_OAK_STAIRS, 300);
            builder.add(VERTICAL_OAK_SLAB, 300);
            builder.add(SPRUCE_TRIM, 300);
            builder.add(VERTICAL_SPRUCE_PLANKS, 300);
            builder.add(VERTICAL_SPRUCE_STAIRS, 300);
            builder.add(VERTICAL_SPRUCE_SLAB, 300);
            builder.add(BIRCH_TRIM, 300);
            builder.add(VERTICAL_BIRCH_PLANKS, 300);
            builder.add(VERTICAL_BIRCH_STAIRS, 300);
            builder.add(VERTICAL_BIRCH_SLAB, 300);
            builder.add(JUNGLE_TRIM, 300);
            builder.add(VERTICAL_JUNGLE_PLANKS, 300);
            builder.add(VERTICAL_JUNGLE_STAIRS, 300);
            builder.add(VERTICAL_JUNGLE_SLAB, 300);
            builder.add(ACACIA_TRIM, 300);
            builder.add(VERTICAL_ACACIA_PLANKS, 300);
            builder.add(VERTICAL_ACACIA_STAIRS, 300);
            builder.add(VERTICAL_ACACIA_SLAB, 300);
            builder.add(DARK_OAK_TRIM, 300);
            builder.add(VERTICAL_DARK_OAK_PLANKS, 300);
            builder.add(VERTICAL_DARK_OAK_STAIRS, 300);
            builder.add(VERTICAL_DARK_OAK_SLAB, 300);
            builder.add(MANGROVE_TRIM, 300);
            builder.add(VERTICAL_MANGROVE_PLANKS, 300);
            builder.add(VERTICAL_MANGROVE_STAIRS, 300);
            builder.add(VERTICAL_MANGROVE_SLAB, 300);
            builder.add(CHERRY_TRIM, 300);
            builder.add(VERTICAL_CHERRY_PLANKS, 300);
            builder.add(VERTICAL_CHERRY_STAIRS, 300);
            builder.add(VERTICAL_CHERRY_SLAB, 300);
            builder.add(PALE_OAK_TRIM, 300);
            builder.add(VERTICAL_PALE_OAK_PLANKS, 300);
            builder.add(VERTICAL_PALE_OAK_STAIRS, 300);
            builder.add(VERTICAL_PALE_OAK_SLAB, 300);
            builder.add(BAMBOO_TRIM, 300);
            builder.add(VERTICAL_BAMBOO_PLANKS, 300);
            builder.add(VERTICAL_BAMBOO_STAIRS, 300);
            builder.add(VERTICAL_BAMBOO_SLAB, 300);
        });
    }
}