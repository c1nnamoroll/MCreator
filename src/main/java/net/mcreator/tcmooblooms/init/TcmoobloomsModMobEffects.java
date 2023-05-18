
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.tcmooblooms.potion.BeeHypnoMobEffect;
import net.mcreator.tcmooblooms.potion.BeeHypnoImmunityMobEffect;
import net.mcreator.tcmooblooms.TcmoobloomsMod;

public class TcmoobloomsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TcmoobloomsMod.MODID);
	public static final RegistryObject<MobEffect> BEE_HYPNO_IMMUNITY = REGISTRY.register("bee_hypno_immunity", () -> new BeeHypnoImmunityMobEffect());
	public static final RegistryObject<MobEffect> BEE_HYPNO = REGISTRY.register("bee_hypno", () -> new BeeHypnoMobEffect());
}
