package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.advancements.*;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static net.minecraft.advancements.triggers.InventoryChangeTrigger.TriggerInstance.hasItems;

public class ChiseledAdvancementGen extends AdvancementProvider {
    public ChiseledAdvancementGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, List.of(new ChiseledAdvancements()));
    }

    public static class ChiseledAdvancements implements AdvancementSubProvider {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> output) {
            var items = registries.lookupOrThrow(Registries.ITEM);

            AdvancementHolder SWAGGIEST_STAIRS_EVER = Advancement.Builder.advancement()
                    .parent(Identifier.withDefaultNamespace("nether/obtain_ancient_debris"))
                    .display(
                            ChiseledBlocks.NETHERITE_STAIRS,
                            Component.translatable("advancements.chiseled.swaggiest_stairs_ever.title"),
                            Component.translatable("advancements.chiseled.swaggiest_stairs_ever.description"),
                            null,
                            AdvancementType.CHALLENGE,
                            true,
                            true,
                            true)
                    .requirements(AdvancementRequirements.Strategy.OR)
                    .addCriterion("has_netherite_stairs", hasItems(ItemPredicate.Builder.item().of(items, ChiseledBlocks.NETHERITE_STAIRS)))
                    .rewards(AdvancementRewards.Builder.experience(750))
                    .save(output, Chiseled.MOD_ID + ":nether/swaggiest_stairs_ever");
        }
    }
}