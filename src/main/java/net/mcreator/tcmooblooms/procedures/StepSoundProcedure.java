package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.entity.BabyMoobloomEntity;
import net.mcreator.tcmooblooms.TcmoobloomsMod;

public class StepSoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyMoobloomEntity && entity.getDeltaMovement().x() > 0 && entity.getDeltaMovement().z() > 0) {
			TcmoobloomsMod.queueServerWork(20, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.step")), SoundSource.NEUTRAL, (float) 0.3, (float) 1.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cow.step")), SoundSource.NEUTRAL, (float) 0.3, (float) 1.5, false);
					}
				}
			});
		}
	}
}
