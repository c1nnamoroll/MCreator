package net.mcreator.tcmooblooms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.TcmoobloomsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BabyMoobloomOnEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("following")) {
			entity.getPersistentData().putBoolean("following", (true));
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(x, y, z, 0.8);
			TcmoobloomsMod.queueServerWork(60, () -> {
				entity.getPersistentData().putBoolean("following", (false));
			});
		}
	}
}
