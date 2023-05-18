package net.mcreator.tcmooblooms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.tcmooblooms.init.TcmoobloomsModParticleTypes;
import net.mcreator.tcmooblooms.init.TcmoobloomsModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MoobloomOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (TcmoobloomsModParticleTypes.BUTTERCUPS.get()), x, (y + 0.1), z, 6, (-0.5), 1, 0.5, 1);
			world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 1);
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:bee")))) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1.3);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:bee")))
							&& (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(TcmoobloomsModMobEffects.BEE_HYPNO.get()) ? _livEnt.getEffect(TcmoobloomsModMobEffects.BEE_HYPNO.get()).getAmplifier() : 0) == 0
							&& !((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(TcmoobloomsModMobEffects.BEE_HYPNO_IMMUNITY.get())
									? _livEnt.getEffect(TcmoobloomsModMobEffects.BEE_HYPNO_IMMUNITY.get()).getAmplifier()
									: 0) >= 1)) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(TcmoobloomsModMobEffects.BEE_HYPNO.get(), 600, 1, (false), (true)));
					}
				}
			}
		}
	}
}
