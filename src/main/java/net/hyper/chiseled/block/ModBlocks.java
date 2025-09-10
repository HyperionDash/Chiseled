package net.hyper.chiseled.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_STAIRS = registerBlock("test_block_stairs",
            new StairsBlock(ModBlocks.TEST_BLOCK.getDefaultState(), AbstractBlock.Settings.create()
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_SLAB = registerBlock("test_block_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TEST_BLOCK_WALL = registerBlock("test_block_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .strength(1.5f).resistance(6).requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
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
