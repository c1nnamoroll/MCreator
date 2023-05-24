package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.entity.MoolipEntity;

import java.util.Comparator;

public class BeeHypnoPinkOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity Moolip = null;
		if (!world.getEntitiesOfClass(MoolipEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) {
			Moolip = (Entity) world.getEntitiesOfClass(MoolipEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null);
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((Moolip.getX()), (Moolip.getY() + 2), (Moolip.getZ()), 1);
		}
	}
}
