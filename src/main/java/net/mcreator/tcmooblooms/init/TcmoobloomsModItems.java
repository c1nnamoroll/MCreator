
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.tcmooblooms.TcmoobloomsMod;

public class TcmoobloomsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TcmoobloomsMod.MODID);
	public static final RegistryObject<Item> MOOBLOOM_SPAWN_EGG = REGISTRY.register("moobloom_spawn_egg", () -> new ForgeSpawnEggItem(TcmoobloomsModEntities.MOOBLOOM, -207868, -528971, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOOLIP_SPAWN_EGG = REGISTRY.register("moolip_spawn_egg", () -> new ForgeSpawnEggItem(TcmoobloomsModEntities.MOOLIP, -2215556, -5748109, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
