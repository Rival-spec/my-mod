package net.mcreator.idlerpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.idlerpg.init.IdleRpgModEnchantments;
import net.mcreator.idlerpg.IdleRpgMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlagoslovleniewitheraeffectProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double effect = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(IdleRpgModEnchantments.BLAGOSLOVLENIEWITHERA.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0) {
			effect = effect + 1;
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(IdleRpgModEnchantments.BLAGOSLOVLENIEWITHERA.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0) {
			effect = effect + 1;
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(IdleRpgModEnchantments.BLAGOSLOVLENIEWITHERA.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
			effect = effect + 1;
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(IdleRpgModEnchantments.BLAGOSLOVLENIEWITHERA.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
			effect = effect + 1;
		}
		while (effect >= 1) {
			IdleRpgMod.queueServerWork(40, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 60, 1));
			});
		}
	}
}