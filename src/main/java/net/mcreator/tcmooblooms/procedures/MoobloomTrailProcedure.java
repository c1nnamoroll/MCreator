package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.entity.MoobloomEntity;
import net.mcreator.tcmooblooms.entity.BabyMoobloomEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MoobloomTrailProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MoobloomEntity && !(entity instanceof BabyMoobloomEntity)) {
			if (entity.getDeltaMovement().x() > 0 && entity.getDeltaMovement().z() > 0) {
				if (Math.random() < 0.008) {
					world.setBlock(new BlockPos(x, y, z), Blocks.DANDELION.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.SUNFLOWER.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.ORANGE_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.POPPY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.RED_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.OXEYE_DAISY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.TALL_GRASS.defaultBlockState(), 3);
				}
				if (Math.random() < 0.004) {
					world.setBlock(new BlockPos(x, y, z), Blocks.GRASS.defaultBlockState(), 3);
				}
			}
		}
	}
}
