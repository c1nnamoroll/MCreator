package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.entity.MoobloomEntity;

public class MoobloomTrailProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MoobloomEntity && !(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
			if (entity.getDeltaMovement().x() > 0 && entity.getDeltaMovement().z() > 0) {
				if (Math.random() < 0.08) {
					world.setBlock(new BlockPos(x, y, z), Blocks.DANDELION.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.SUNFLOWER.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.ORANGE_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.POPPY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.RED_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.OXEYE_DAISY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.02) {
					world.setBlock(new BlockPos(x, y, z), Blocks.TALL_GRASS.defaultBlockState(), 3);
				}
				if (Math.random() < 0.04) {
					world.setBlock(new BlockPos(x, y, z), Blocks.GRASS.defaultBlockState(), 3);
				}
			}
		}
	}
}
