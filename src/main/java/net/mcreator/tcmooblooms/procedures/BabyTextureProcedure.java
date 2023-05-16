package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
