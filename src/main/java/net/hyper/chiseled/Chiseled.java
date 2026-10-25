package net.hyper.chiseled;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.chiseled.config.ChiseledConfig;
import net.hyper.chiseled.registry.*;
import net.hyper.silliestlib.SilliestLib;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import org.slf4j.LoggerFactory;

// Main Entrypoint
public class Chiseled implements ModInitializer {
	public static final String MOD_ID = "chiseled";
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		SilliestLib.init(MOD_ID);
		MidnightConfig.register(MOD_ID, ChiseledConfig.class);
		LoggerFactory.getLogger(MOD_ID).info("Chiseling Bricks");

		ChiseledBlocks.init();
		ChiseledItems.init();
		ChiseledCreativeModeTabs.init();
		ChiseledBlockTransformers.init();

		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> ResourceLoader.registerBuiltinPack(id("data_overrides"), modContainer, Component.translatable("pack.chiseled.data_overrides"), PackActivationType.ALWAYS_ENABLED));
	}
}
