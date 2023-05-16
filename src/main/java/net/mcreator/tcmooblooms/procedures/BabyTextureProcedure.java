package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.entity.MoobloomEntity;

public class BabyTextureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MoobloomEntity) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) {
				if (entity instanceof MoobloomEntity animatable)
					animatable.setTexture("babymoobloom.png");
			}
		}
	}
}
