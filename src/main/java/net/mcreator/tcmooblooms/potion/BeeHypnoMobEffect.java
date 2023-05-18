
package net.mcreator.tcmooblooms.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tcmooblooms.procedures.BeeHypnoOnEffectActiveTickProcedure;
import net.mcreator.tcmooblooms.procedures.BeeHypnoEffectExpiresProcedure;

public class BeeHypnoMobEffect extends MobEffect {
	public BeeHypnoMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tcmooblooms.bee_hypno";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BeeHypnoOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		BeeHypnoEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
