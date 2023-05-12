
package net.mcreator.tcmooblooms.client.renderer;

public class MoobloomRenderer extends GeoEntityRenderer<MoobloomEntity> {
	public MoobloomRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MoobloomModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MoobloomEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}