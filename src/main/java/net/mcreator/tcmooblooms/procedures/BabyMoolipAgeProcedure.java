package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.tcmooblooms.init.TcmoobloomsModEntities;
import net.mcreator.tcmooblooms.entity.MoolipEntity;
import net.mcreator.tcmooblooms.entity.BabyMoolipEntity;

public class BabyMoolipAgeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyMoolipEntity) {
			entity.getPersistentData().putDouble("age", (entity.getPersistentData().getDouble("age") + 1));
			if (entity.getPersistentData().getDouble("age") == 6000) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MoolipEntity(TcmoobloomsModEntities.MOOLIP.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
