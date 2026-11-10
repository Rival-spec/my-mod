package net.mcreator.idlerpg.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.idlerpg.network.IdleRpgModVariables;

public class SurvivabilitystatsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElseGet(IdleRpgModVariables.PlayerVariables::new).survivability;
	}
}