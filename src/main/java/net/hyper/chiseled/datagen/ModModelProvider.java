package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EVIL_TEST_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEST_BLOCK)
                .stairs(ModBlocks.TEST_BLOCK_STAIRS)
                .slab(ModBlocks.TEST_BLOCK_SLAB)
                .wall(ModBlocks.TEST_BLOCK_WALL);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "Mod Model Provider";
    }
}