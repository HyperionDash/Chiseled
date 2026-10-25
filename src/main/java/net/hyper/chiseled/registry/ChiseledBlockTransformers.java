package net.hyper.chiseled.registry;

import net.fabricmc.fabric.api.item.v1.BlockTransformerEvents;
import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.config.ChiseledConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;

public interface ChiseledBlockTransformers {
    ResourceKey<BlockTransformer> CRACKING = ResourceKey.create(Registries.BLOCK_TRANSFORMER, Chiseled.id("cracking"));

    static void addCrackingTransformer(Block block, Block crackedBlock) {
        addCrackingTransformer(block, crackedBlock, SoundEvents.STONE_BREAK);
    }
    static void addCrackingTransformer(Block block, Block crackedBlock, SoundEvent sound) {
        addCrackingTransformer(block, crackedBlock, sound, ChiseledConfig.crackableBricks);
    }
    static void addCrackingTransformer(Block block, Block crackedBlock, SoundEvent sound, boolean configOption) {
        if (ChiseledConfig.crackableBlocks && configOption) {
            BlockTransformerEvents.MODIFY.register(
                    (key, transforms, _, _) -> {
                        if (key == CRACKING) {
                            transforms.add(BlockTransformer.BlockTransformData.builder(BlockPredicate.matchesBlocks(block), crackedBlock).sound(Holder.direct(sound)).build());
                        }
                    }
            );
        }
    }
    static void init() {
        addCrackingTransformer(Blocks.STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS);
        addCrackingTransformer(Blocks.INFESTED_STONE_BRICKS, Blocks.INFESTED_CRACKED_STONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_STONE_BRICKS, ChiseledBlocks.CRACKED_CUT_STONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.STONE_TILES, ChiseledBlocks.CRACKED_STONE_TILES);
        addCrackingTransformer(ChiseledBlocks.POLISHED_GRANITE_BRICKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_POLISHED_GRANITE_BRICKS, ChiseledBlocks.CRACKED_CUT_POLISHED_GRANITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.POLISHED_GRANITE_TILES, ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
        addCrackingTransformer(ChiseledBlocks.POLISHED_DIORITE_BRICKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_POLISHED_DIORITE_BRICKS, ChiseledBlocks.CRACKED_CUT_POLISHED_DIORITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.POLISHED_DIORITE_TILES, ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
        addCrackingTransformer(ChiseledBlocks.POLISHED_ANDESITE_BRICKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_POLISHED_ANDESITE_BRICKS, ChiseledBlocks.CRACKED_CUT_POLISHED_ANDESITE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.POLISHED_ANDESITE_TILES, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        addCrackingTransformer(Blocks.DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS, SoundEvents.DEEPSLATE_BRICKS_BREAK);
        addCrackingTransformer(ChiseledBlocks.CUT_DEEPSLATE_BRICKS, ChiseledBlocks.CRACKED_CUT_DEEPSLATE_BRICKS, SoundEvents.DEEPSLATE_BRICKS_BREAK);
        addCrackingTransformer(Blocks.DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES, SoundEvents.DEEPSLATE_TILES_BREAK);
        addCrackingTransformer(Blocks.BRICKS, ChiseledBlocks.CRACKED_BRICKS);
        addCrackingTransformer(Blocks.CINNABAR_BRICKS, ChiseledBlocks.CRACKED_CINNABAR_BRICKS, SoundEvents.CINNABAR_BREAK);
        addCrackingTransformer(ChiseledBlocks.CUT_CINNABAR_BRICKS, ChiseledBlocks.CRACKED_CUT_CINNABAR_BRICKS, SoundEvents.CINNABAR_BREAK);
        addCrackingTransformer(ChiseledBlocks.CINNABAR_TILES, ChiseledBlocks.CRACKED_CINNABAR_TILES, SoundEvents.CINNABAR_BREAK);
        addCrackingTransformer(Blocks.SULFUR_BRICKS, ChiseledBlocks.CRACKED_SULFUR_BRICKS, SoundEvents.SULFUR_BREAK);
        addCrackingTransformer(ChiseledBlocks.CUT_SULFUR_BRICKS, ChiseledBlocks.CRACKED_CUT_SULFUR_BRICKS, SoundEvents.SULFUR_BREAK);
        addCrackingTransformer(ChiseledBlocks.SULFUR_TILES, ChiseledBlocks.CRACKED_SULFUR_TILES, SoundEvents.SULFUR_BREAK);
        addCrackingTransformer(Blocks.NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS, SoundEvents.NETHER_BRICKS_BREAK);
        addCrackingTransformer(Blocks.RED_NETHER_BRICKS, ChiseledBlocks.CRACKED_RED_NETHER_BRICKS, SoundEvents.NETHER_BRICKS_BREAK);
        addCrackingTransformer(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_POLISHED_BLACKSTONE_BRICKS, ChiseledBlocks.CRACKED_CUT_POLISHED_BLACKSTONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.POLISHED_BLACKSTONE_TILES, ChiseledBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        addCrackingTransformer(Blocks.END_STONE_BRICKS, ChiseledBlocks.CRACKED_END_STONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.CUT_END_STONE_BRICKS, ChiseledBlocks.CRACKED_CUT_END_STONE_BRICKS);
        addCrackingTransformer(ChiseledBlocks.END_STONE_TILES, ChiseledBlocks.CRACKED_END_STONE_TILES);
        addCrackingTransformer(Blocks.AMETHYST_BLOCK, Blocks.BUDDING_AMETHYST, SoundEvents.AMETHYST_BLOCK_BREAK, ChiseledConfig.crackableAmethyst);
    }
}
