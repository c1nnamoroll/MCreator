
package net.mcreator.tcmooblooms.potion;

public class BeeHypnoMobEffect extends MobEffect {

	public BeeHypnoMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tcmooblooms.bee_hypno";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
