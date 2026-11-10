/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.idlerpg.client.renderer.CobblestoneminionRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IdleRpgModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(IdleRpgModEntities.COBBLESTONEMINION.get(), CobblestoneminionRenderer::new);
	}
}