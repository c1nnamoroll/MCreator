
package net.mcreator.tcmooblooms.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BeeHypnoImmunityMobEffect extends MobEffect {
	public BeeHypnoImmunityMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tcmooblooms.bee_hypno_immunity";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
