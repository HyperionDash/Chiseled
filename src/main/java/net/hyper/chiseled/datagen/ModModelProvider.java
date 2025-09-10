package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool testBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEST_BLOCK);
        testBlockPool.stairs(ModBlocks.TEST_BLOCK_STAIRS);
        testBlockPool.slab(ModBlocks.TEST_BLOCK_SLAB);
        testBlockPool.wall(ModBlocks.TEST_BLOCK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
