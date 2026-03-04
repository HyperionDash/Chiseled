package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.client.data.*;

public class ChiseledModelGen extends FabricModelProvider {
    public ChiseledModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool verticalOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        verticalOakPool.stairs(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        verticalOakPool.slab(ChiseledBlocks.VERTICAL_OAK_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}