package net.hyper.chiseled.block;

import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block CRACKED_POLISHED_STONE = registerBlock("cracked_polished_stone",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block CRACKED_CHISELED_STONE_BRICKS = registerBlock("cracked_chiseled_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block STONE_TILES = registerBlock("stone_tiles",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STONE_TILES_STAIRS = registerBlock("stone_tile_stairs",
            properties -> new StairsBlock(ModBlocks.STONE_TILES.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            properties -> new StairsBlock(ModBlocks.SMALL_STONE_BRICKS.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block STACKED_STONE_BRICKS = registerBlock("stacked_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block CRACKED_STACKED_STONE_BRICKS = registerBlock("cracked_stacked_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STACKED_STONE_BRICK_STAIRS = registerBlock("stacked_stone_brick_stairs",
            properties -> new StairsBlock(ModBlocks.STACKED_STONE_BRICKS.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STACKED_STONE_BRICK_SLAB = registerBlock("stacked_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block STACKED_STONE_BRICK_WALL = registerBlock("stacked_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_POLISHED_STONE.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STONE_TILES_STAIRS = registerBlock("mossy_stone_tile_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_STONE_TILES.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block MOSSY_SMALL_STONE_BRICKS = registerBlock("mossy_small_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_SMALL_STONE_BRICKS.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    public static final Block MOSSY_STACKED_STONE_BRICKS = registerBlock("mossy_stacked_stone_bricks",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STACKED_STONE_BRICK_STAIRS = registerBlock("mossy_stacked_stone_brick_stairs",
            properties -> new StairsBlock(ModBlocks.MOSSY_STACKED_STONE_BRICKS.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STACKED_STONE_BRICK_SLAB = registerBlock("mossy_stacked_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block MOSSY_STACKED_STONE_BRICK_WALL = registerBlock("mossy_stacked_stone_brick_wall",
            properties -> new WallBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Chiseled.MOD_ID))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Chiseled.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Chiseled.LOGGER.info("Registering Mod Blocks for " + Chiseled.MOD_ID);
    }
}