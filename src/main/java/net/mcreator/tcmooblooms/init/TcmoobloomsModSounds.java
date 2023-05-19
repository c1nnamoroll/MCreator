
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.tcmooblooms.TcmoobloomsMod;

public class TcmoobloomsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TcmoobloomsMod.MODID);
	public static final RegistryObject<SoundEvent> BABYIDLESOUNDS = REGISTRY.register("babyidlesounds", () -> new SoundEvent(new ResourceLocation("tcmooblooms", "babyidlesounds")));
}
