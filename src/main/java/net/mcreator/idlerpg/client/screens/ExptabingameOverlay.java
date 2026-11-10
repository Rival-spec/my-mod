package net.mcreator.idlerpg.client.screens;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.idlerpg.procedures.SurvivabilitystatsProcedure;
import net.mcreator.idlerpg.procedures.ExptabProcedure;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ExptabingameOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ExptabProcedure.execute(entity), 0, h / 2 + -19, -16737895, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SurvivabilitystatsProcedure.execute(entity), w / 2 + -90, h / 2 + 71, -39322, false);
		}
	}
}