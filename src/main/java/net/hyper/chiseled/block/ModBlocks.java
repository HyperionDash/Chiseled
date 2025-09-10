package net.hyper.chiseled.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.StringTokenizer;
import java.util.function.Function;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            properties -> new Block(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_STAIRS = registerBlock("test_block_stairs",
            properties -> new StairsBlock(ModBlocks.TEST_BLOCK.getDefaultState(), properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_SLAB = registerBlock("test_block_slab",
            properties -> new SlabBlock(properties
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_WALL = registerBlock("test_block_wall",
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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.TEST_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.TEST_BLOCK_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.TEST_BLOCK_SLAB);
            fabricItemGroupEntries.add(ModBlocks.TEST_BLOCK_WALL);
        });
    }
}
