package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.init.TcmoobloomsModParticleTypes;

public class MoobloomOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TcmoobloomsModParticleTypes.BUTTERCUPS.get()), x, (y + 0.1), z, 5, (-0.5), 1, 0.5, 1);
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 1);
	}
}
