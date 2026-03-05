package net.hyper.chiseled.registry;

import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ChiseledBlocks {
    public static final Block OAK_TRIM = registerBlock("oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_STAIRS = registerBlock("vertical_oak_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_OAK_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_SLAB = registerBlock("vertical_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block SPRUCE_TRIM = registerBlock("spruce_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_SPRUCE_STAIRS = registerBlock("vertical_spruce_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_SPRUCE_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_SPRUCE_SLAB = registerBlock("vertical_spruce_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BIRCH_TRIM = registerBlock("birch_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_BIRCH_STAIRS = registerBlock("vertical_birch_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_BIRCH_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_BIRCH_SLAB = registerBlock("vertical_birch_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block JUNGLE_TRIM = registerBlock("jungle_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_JUNGLE_STAIRS = registerBlock("vertical_jungle_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_JUNGLE_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_JUNGLE_SLAB = registerBlock("vertical_jungle_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block ACACIA_TRIM = registerBlock("acacia_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_ACACIA_STAIRS = registerBlock("vertical_acacia_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_ACACIA_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_ACACIA_SLAB = registerBlock("vertical_acacia_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block DARK_OAK_TRIM = registerBlock("dark_oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_DARK_OAK_STAIRS = registerBlock("vertical_dark_oak_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_DARK_OAK_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_DARK_OAK_SLAB = registerBlock("vertical_dark_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MANGROVE_TRIM = registerBlock("mangrove_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_MANGROVE_STAIRS = registerBlock("vertical_mangrove_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_MANGROVE_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_MANGROVE_SLAB = registerBlock("vertical_mangrove_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CHERRY_TRIM = registerBlock("cherry_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block VERTICAL_CHERRY_STAIRS = registerBlock("vertical_cherry_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_CHERRY_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block VERTICAL_CHERRY_SLAB = registerBlock("vertical_cherry_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block PALE_OAK_TRIM = registerBlock("pale_oak_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_PALE_OAK_PLANKS = registerBlock("vertical_pale_oak_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_PALE_OAK_STAIRS = registerBlock("vertical_pale_oak_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_PALE_OAK_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_PALE_OAK_SLAB = registerBlock("vertical_pale_oak_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BAMBOO_TRIM = registerBlock("bamboo_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block VERTICAL_BAMBOO_STAIRS = registerBlock("vertical_bamboo_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_BAMBOO_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block VERTICAL_BAMBOO_SLAB = registerBlock("vertical_bamboo_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block CRIMSON_TRIM = registerBlock("crimson_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_STAIRS = registerBlock("vertical_crimson_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_CRIMSON_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_CRIMSON_SLAB = registerBlock("vertical_crimson_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_TRIM = registerBlock("warped_trim",
            properties -> new Block(properties
                    .mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks",
            properties -> new Block(properties
                    .mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_STAIRS = registerBlock("vertical_warped_stairs",
            properties -> new StairsBlock(ChiseledBlocks.VERTICAL_WARPED_PLANKS.getDefaultState(),properties
                    .mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block VERTICAL_WARPED_SLAB = registerBlock("vertical_warped_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            properties -> new StairsBlock(ChiseledBlocks.POLISHED_STONE.getDefaultState(),properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            properties -> new Block(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            properties -> new StairsBlock(ChiseledBlocks.MOSSY_POLISHED_STONE.getDefaultState(),properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            properties -> new WallBlock(properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),properties
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Chiseled.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Chiseled.MOD_ID, name)))));
    }

    public static void registerBlocks() {
        Chiseled.LOGGER.info("Chiseling Bricks");
    }
}