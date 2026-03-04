package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ChiseledLootTableGen extends FabricBlockLootTableProvider {
    public ChiseledLootTableGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ChiseledBlocks.OAK_TRIM);
        addDrop(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        addDrop(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        addDrop(ChiseledBlocks.VERTICAL_OAK_SLAB, slabDrops(ChiseledBlocks.VERTICAL_OAK_SLAB));
    }
}
