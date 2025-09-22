package net.hyper.chiseled.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        RegistryKey<Item> itemKey = keyOfItem(name);

        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
        Registry.register(Registries.ITEM, itemKey, blockItem);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Chiseled.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Chiseled.MOD_ID, name));
    }

    public static SlabBlock registerSlab(String name, AbstractBlock.Settings settings) {
        return (SlabBlock) register(name,
                SlabBlock::new,
                settings
        );
    }

    public static StairsBlock registerStairs(String name, Block baseBlock, AbstractBlock.Settings settings) {
        return (StairsBlock) register(name,
                s -> new StairsBlock(baseBlock.getDefaultState(), s),
                settings
        );
    }

    public static WallBlock registerWall(String name, AbstractBlock.Settings settings) {
        return (WallBlock) register(name,
                WallBlock::new,
                settings
        );
    }

    public static void initialize() {
    }
    public static final Block TEST_BLOCK = register("test_block", Block::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block EVIL_TEST_BLOCK = register("evil_test_block", Block::new, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final SlabBlock TEST_BLOCK_SLAB = registerSlab("test_block_slab", AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final StairsBlock TEST_BLOCK_STAIRS = registerStairs("test_block_stairs", TEST_BLOCK, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final WallBlock TEST_BLOCK_WALL = registerWall("test_block_wall", AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
}