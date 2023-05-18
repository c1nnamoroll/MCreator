
package net.mcreator.tcmooblooms.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;

import net.mcreator.tcmooblooms.procedures.BeeHypnoOnEffectActiveTickProcedure;
import net.mcreator.tcmooblooms.procedures.BeeHypnoEffectExpiresProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

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

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
