package net.mcreator.idlerpg.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class BlockrudydrevnikhBlock extends Block {
	public BlockrudydrevnikhBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
		return Mth.randomBetweenInclusive(randomSource, 0, 5);
	}
}