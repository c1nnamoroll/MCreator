package net.mcreator.tcmooblooms.entity.model;

public class MoobloomModel extends AnimatedGeoModel<MoobloomEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoobloomEntity entity) {
		return new ResourceLocation("tcmooblooms", "animations/moobloom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoobloomEntity entity) {
		return new ResourceLocation("tcmooblooms", "geo/moobloom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoobloomEntity entity) {
		return new ResourceLocation("tcmooblooms", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MoobloomEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}