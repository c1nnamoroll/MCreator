package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BabyMoobloomOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.8) {
			world.setBlock(new BlockPos(x, y, z), Blocks.DANDELION.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SUNFLOWER.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.ORANGE_TULIP.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.POPPY.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.RED_TULIP.defaultBlockState(), 3);
		}
		if (Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.OXEYE_DAISY.defaultBlockState(), 3);
		}
	}
}
