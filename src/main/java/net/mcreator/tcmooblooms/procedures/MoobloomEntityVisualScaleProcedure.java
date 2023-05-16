package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MoobloomEntityVisualScaleProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) ? 0.6 : 1;
	}
}
