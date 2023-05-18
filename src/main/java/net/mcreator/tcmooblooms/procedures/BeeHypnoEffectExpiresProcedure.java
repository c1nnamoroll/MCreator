package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tcmooblooms.init.TcmoobloomsModMobEffects;

public class BeeHypnoEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(TcmoobloomsModMobEffects.BEE_HYPNO_IMMUNITY.get(), 120, 1));
	}
}
