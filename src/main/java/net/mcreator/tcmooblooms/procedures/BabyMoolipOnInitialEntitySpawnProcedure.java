package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BabyMoolipOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.8) {
			world.setBlock(new BlockPos(x, y, z), Blocks.PINK_TULIP.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.PEONY.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.ALLIUM.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.BLUE_ORCHID.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.WHITE_TULIP.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 3);
		}
	}
}
