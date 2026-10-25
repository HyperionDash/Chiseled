package net.hyper.chiseled.mixin;

import net.hyper.chiseled.registry.ChiseledBlockTransformers;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.Properties.class)
public class ItemPropertiesMixin {
    // Mixin into the ".pickaxe()" item property to add the "chiseled:cracking" BlockTransformer
    @Inject(method = "pickaxe", at = @At("HEAD"))
    private void chiseled$addCrackingTransformer(ToolMaterial material, float attackDamageBaseline, float attackSpeedBaseline, CallbackInfoReturnable<Item.Properties> cir) {
        ((Item.Properties) (Object) this).delayedComponent(DataComponents.BLOCK_TRANSFORMER, context -> context.getOrThrow(ChiseledBlockTransformers.CRACKING));
    }
}
