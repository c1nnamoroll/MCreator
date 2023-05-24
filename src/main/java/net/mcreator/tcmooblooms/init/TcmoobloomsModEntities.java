
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tcmooblooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.tcmooblooms.entity.MoolipEntity;
import net.mcreator.tcmooblooms.entity.MoobloomEntity;
import net.mcreator.tcmooblooms.entity.BabyMoolipEntity;
import net.mcreator.tcmooblooms.entity.BabyMoobloomEntity;
import net.mcreator.tcmooblooms.TcmoobloomsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TcmoobloomsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TcmoobloomsMod.MODID);
	public static final RegistryObject<EntityType<MoobloomEntity>> MOOBLOOM = register("moobloom",
			EntityType.Builder.<MoobloomEntity>of(MoobloomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoobloomEntity::new)

					.sized(0.9f, 1.4000000000000001f));
	public static final RegistryObject<EntityType<BabyMoobloomEntity>> BABY_MOOBLOOM = register("baby_moobloom",
			EntityType.Builder.<BabyMoobloomEntity>of(BabyMoobloomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMoobloomEntity::new)

					.sized(0.7f, 0.45f));
	public static final RegistryObject<EntityType<MoolipEntity>> MOOLIP = register("moolip",
			EntityType.Builder.<MoolipEntity>of(MoolipEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoolipEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<BabyMoolipEntity>> BABY_MOOLIP = register("baby_moolip",
			EntityType.Builder.<BabyMoolipEntity>of(BabyMoolipEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMoolipEntity::new)

					.sized(0.7f, 0.45f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoobloomEntity.init();
			BabyMoobloomEntity.init();
			MoolipEntity.init();
			BabyMoolipEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOOBLOOM.get(), MoobloomEntity.createAttributes().build());
		event.put(BABY_MOOBLOOM.get(), BabyMoobloomEntity.createAttributes().build());
		event.put(MOOLIP.get(), MoolipEntity.createAttributes().build());
		event.put(BABY_MOOLIP.get(), BabyMoolipEntity.createAttributes().build());
	}
}
