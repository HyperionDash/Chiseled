package net.hyper.chiseled.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class AmethystStairBlock extends StairBlock {
    public static final MapCodec<AmethystStairBlock> CODEC = RecordCodecBuilder.mapCodec((i) -> i.group(BlockState.CODEC.fieldOf("base_state").forGetter((b) -> b.baseState), propertiesCodec()).apply(i, AmethystStairBlock::new));

    public MapCodec<? extends AmethystStairBlock> codec() {
        return CODEC;
    }

    public AmethystStairBlock(final BlockState baseState, final BlockBehaviour.Properties properties) {
        super(baseState, properties);
    }

    protected void onProjectileHit(final Level level, final BlockState state, final BlockHitResult hitResult, final Projectile projectile) {
        if (!level.isClientSide()) {
            BlockPos hitPos = hitResult.getBlockPos();
            level.playSound((Entity)null, hitPos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.0F, 0.5F + level.getRandom().nextFloat() * 1.2F);
        }

    }
}
