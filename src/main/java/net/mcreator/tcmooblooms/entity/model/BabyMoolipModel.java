package net.mcreator.tcmooblooms.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.tcmooblooms.entity.BabyMoolipEntity;

public class BabyMoolipModel extends AnimatedGeoModel<BabyMoolipEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyMoolipEntity entity) {
		return new ResourceLocation("tcmooblooms", "animations/babymoolip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyMoolipEntity entity) {
		return new ResourceLocation("tcmooblooms", "geo/babymoolip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyMoolipEntity entity) {
		return new ResourceLocation("tcmooblooms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
