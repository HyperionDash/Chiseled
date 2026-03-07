package net.hyper.chiseled;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class ChiseledClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(Chiseled.MOD_ID).ifPresent(modContainer ->
                ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath("chiseled","asset_overrides"), modContainer,
                        Component.translatable("text.chiseled.asset_overrides"), PackActivationType.DEFAULT_ENABLED));
    }
}
