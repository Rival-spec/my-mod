package net.mcreator.idlerpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.idlerpg.entity.CobblestoneminionEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CobblestoneminionRenderer extends MobRenderer<CobblestoneminionEntity, VillagerModel<CobblestoneminionEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("idle_rpg:textures/entities/dr-trayaurus.png");

	public CobblestoneminionRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<CobblestoneminionEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
		this.addLayer(new RenderLayer<CobblestoneminionEntity, VillagerModel<CobblestoneminionEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("idle_rpg:textures/entities/dr-trayaurus.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CobblestoneminionEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(CobblestoneminionEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(CobblestoneminionEntity entity) {
		return entityTexture;
	}
}