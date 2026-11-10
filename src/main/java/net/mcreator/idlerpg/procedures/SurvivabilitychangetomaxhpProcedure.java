package net.mcreator.idlerpg.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.idlerpg.network.IdleRpgModVariables;

public class SurvivabilitychangetomaxhpProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElseGet(IdleRpgModVariables.PlayerVariables::new).survivability);
		return "" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
	}
}