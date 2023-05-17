package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tcmooblooms.init.TcmoobloomsModMobEffects;
import net.mcreator.tcmooblooms.entity.MoobloomEntity;

public class BeeHypnoOnEffectActiveTickProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Bee) {
			if (true) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(TcmoobloomsModMobEffects.BEE_HYPNO.get(), 60, 1, (false), (true)));
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TcmoobloomsModMobEffects.BEE_HYPNO.get()) : false) && entity instanceof MoobloomEntity) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(x, y, z, 1.1);
				}
			}
		}
	}
}
