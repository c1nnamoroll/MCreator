
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tcmooblooms.client.particle.TulipsParticle;
import net.mcreator.tcmooblooms.client.particle.ButtercupsParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TcmoobloomsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(TcmoobloomsModParticleTypes.TULIPS.get(), TulipsParticle::provider);
		event.register(TcmoobloomsModParticleTypes.BUTTERCUPS.get(), ButtercupsParticle::provider);
	}
}
