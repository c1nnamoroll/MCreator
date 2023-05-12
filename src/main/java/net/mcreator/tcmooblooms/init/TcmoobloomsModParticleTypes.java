
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.tcmooblooms.TcmoobloomsMod;

public class TcmoobloomsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TcmoobloomsMod.MODID);
	public static final RegistryObject<SimpleParticleType> BUTTERCUPS = REGISTRY.register("buttercups", () -> new SimpleParticleType(false));
}
