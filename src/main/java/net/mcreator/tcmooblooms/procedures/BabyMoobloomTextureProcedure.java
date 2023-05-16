package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.entity.MoobloomEntity;

public class BabyMoobloomTextureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) && entity instanceof MoobloomEntity) {
			if (entity instanceof MoobloomEntity animatable)
				animatable.setTexture("babymoobloom.png");
		}
	}
}
