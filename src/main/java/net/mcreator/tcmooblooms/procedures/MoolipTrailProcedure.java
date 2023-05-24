package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.entity.MoolipEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MoolipTrailProcedure {
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
		if (entity instanceof MoolipEntity && !(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
			if (entity.getDeltaMovement().x() > 0 && entity.getDeltaMovement().z() > 0) {
				if (Math.random() < 0.0008) {
					world.setBlock(new BlockPos(x, y, z), Blocks.PINK_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.PEONY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.ALLIUM.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.BLUE_ORCHID.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.WHITE_TULIP.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0002) {
					world.setBlock(new BlockPos(x, y, z), Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0004) {
					world.setBlock(new BlockPos(x, y, z), Blocks.TALL_GRASS.defaultBlockState(), 3);
				}
				if (Math.random() < 0.0004) {
					world.setBlock(new BlockPos(x, y, z), Blocks.GRASS.defaultBlockState(), 3);
				}
			}
		}
	}
}
