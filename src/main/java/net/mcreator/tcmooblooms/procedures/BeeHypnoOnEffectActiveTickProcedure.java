package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tcmooblooms.init.TcmoobloomsModMobEffects;
import net.mcreator.tcmooblooms.entity.MoobloomEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BeeHypnoOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity instanceof MoobloomEntity) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Bee) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(TcmoobloomsModMobEffects.BEE_HYPNO.get(), 60, 1, (false), (true)));
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1.1);
					}
				}
			}
		}
	}
}
