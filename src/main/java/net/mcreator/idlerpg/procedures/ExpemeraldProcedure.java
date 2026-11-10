package net.mcreator.idlerpg.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.mcreator.idlerpg.network.IdleRpgModVariables;
import net.mcreator.idlerpg.init.IdleRpgModItems;
import net.mcreator.idlerpg.init.IdleRpgModBlocks;
import net.mcreator.idlerpg.IdleRpgMod;

import java.util.List;

public class ExpemeraldProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			var _playerVars = entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElse(null);
			if (_playerVars != null) {
				_playerVars.mining_experience = entity.getCapability(IdleRpgModVariables.PLAYER_VARIABLES).orElseGet(IdleRpgModVariables.PlayerVariables::new).mining_experience + 5;
				_playerVars.markSyncDirty();
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), IdleRpgModBlocks.STONEGENERATOR.get().defaultBlockState(), 3);
		if (hasEntityInInventory(entity, new ItemStack(IdleRpgModItems.SETTINGSSTICK.get()))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else {
			IdleRpgMod.queueServerWork(300, () -> {
				world.setBlock(BlockPos.containing(x, y, z), IdleRpgModBlocks.EMERALDGENERATOR.get().defaultBlockState(), 3);
			});
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (!itemstack2.isEmpty() && ItemStack.isSameItem(itemstack2, itemstack)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}