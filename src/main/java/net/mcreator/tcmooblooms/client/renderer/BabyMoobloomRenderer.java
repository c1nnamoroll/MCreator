
package net.mcreator.tcmooblooms.client.renderer;

public class BabyMoobloomRenderer extends GeoEntityRenderer<BabyMoobloomEntity> {
	public BabyMoobloomRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BabyMoobloomModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(BabyMoobloomEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}