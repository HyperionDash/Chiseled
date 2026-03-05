package net.hyper.chiseled;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ChiseledClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(Chiseled.MOD_ID).ifPresent(modContainer ->
                ResourceLoader.registerBuiltinPack(Identifier.of("chiseled","asset_overrides"), modContainer,
                        Text.translatable("text.chiseled.asset_overrides"), PackActivationType.DEFAULT_ENABLED));
    }
}
