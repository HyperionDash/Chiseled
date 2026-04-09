package net.hyper.chiseled.registry;

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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_OAK_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_BIRCH_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_ACACIA_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_CHERRY_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.VERTICAL_WARPED_PLANKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.POLISHED_STONE.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.CUT_STONE_BRICKS.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block CUT_STONE_BRICK_SLAB = registerBlock("cut_stone_brick_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CUT_STONE_BRICKS = registerBlock("mossy_cut_stone_bricks",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CUT_STONE_BRICK_STAIRS = registerBlock("mossy_cut_stone_brick_stairs",
            properties -> new StairBlock(ChiseledBlocks.MOSSY_CUT_STONE_BRICKS.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.STONE_TILES.defaultBlockState(),properties
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
            properties -> new StairBlock(ChiseledBlocks.MOSSY_STONE_TILES.defaultBlockState(),properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlock("mossy_stone_tile_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

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
        Chiseled.LOGGER.info("Chiseling Bricks");
    }
}