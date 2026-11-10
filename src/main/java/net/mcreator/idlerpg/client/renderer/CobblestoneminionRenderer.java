package net.mcreator.idlerpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.idlerpg.entity.CobblestoneminionEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class CobblestoneminionRenderer extends MobRenderer<CobblestoneminionEntity, VillagerModel<CobblestoneminionEntity>> {
	private final ResourceLocation entityTexture = new ResourceLocation("idle_rpg:textures/entities/dr-trayaurus.png");

	public CobblestoneminionRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<CobblestoneminionEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
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