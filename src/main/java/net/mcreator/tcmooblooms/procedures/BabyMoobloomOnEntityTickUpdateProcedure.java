package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.entity.BabyMoobloomEntity;
import net.mcreator.tcmooblooms.TcmoobloomsMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BabyMoobloomOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BabyMoobloomEntity) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!entity.getPersistentData().getBoolean("following")) {
						entity.getPersistentData().putBoolean("following", (true));
						if (entityiterator instanceof Mob _entity)
							_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1);
						TcmoobloomsMod.queueServerWork(60, () -> {
							entity.getPersistentData().putBoolean("following", (false));
						});
					}
				}
			}
		}
	}
}
