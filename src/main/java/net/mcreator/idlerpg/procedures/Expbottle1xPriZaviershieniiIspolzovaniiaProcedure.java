package net.mcreator.idlerpg.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.idlerpg.network.IdleRpgModVariables;

public class Expbottle1xPriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			var _playerVars = entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElse(null);
			if (_playerVars != null) {
				_playerVars.survivability = entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElseGet(IdleRpgModVariables.PlayerVariables::new).survivability + 1;
				_playerVars.markSyncDirty();
			}
		}
	}
}