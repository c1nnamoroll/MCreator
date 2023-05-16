package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.init.TcmoobloomsModParticleTypes;

public class MoobloomOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (TcmoobloomsModParticleTypes.BUTTERCUPS.get()), x, (y + 0.1), z, 6, (-0.5), 1, 0.5, 1);
			world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 1);
		}
	}
}
