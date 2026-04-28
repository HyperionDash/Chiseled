package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.chiseled.registry.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chiseled implements ModInitializer {
	public static final String MOD_ID = "chiseled";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ChiseledItemGroups.registerItemGroups();
		ChiseledBlocks.registerBlocks();

		LOGGER.info("Chiseling Bricks");

		FabricLoader.getInstance().getModContainer(Chiseled.MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(Chiseled.MOD_ID,"data_overrides"), modContainer,
						Component.translatable("text.chiseled.data_overrides"),PackActivationType.ALWAYS_ENABLED));
	}
}