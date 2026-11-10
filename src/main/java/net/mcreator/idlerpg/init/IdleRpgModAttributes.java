/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;

import net.mcreator.idlerpg.IdleRpgMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IdleRpgModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, IdleRpgMod.MODID);
	public static final RegistryObject<Attribute> SURVIVABILITY = REGISTRY.register("survivability", () -> new RangedAttribute("attribute.idle_rpg.survivability", 10d, 2d, 20000d).setSyncable(true));
	public static final RegistryObject<Attribute> ATTACKPOWER = REGISTRY.register("attackpower", () -> new RangedAttribute("attribute.idle_rpg.attackpower", 1d, 0d, 99999d).setSyncable(true));
	public static final RegistryObject<Attribute> CRITCHANCE = REGISTRY.register("critchance", () -> new RangedAttribute("attribute.idle_rpg.critchance", 0d, 0d, 100d).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, SURVIVABILITY.get()));
		event.getTypes().forEach(entity -> event.add(entity, ATTACKPOWER.get()));
		event.getTypes().forEach(entity -> event.add(entity, CRITCHANCE.get()));
	}

	@Mod.EventBusSubscriber
	public static class PlayerAttributesSync {
		@SubscribeEvent
		public static void playerClone(PlayerEvent.Clone event) {
			Player oldPlayer = event.getOriginal();
			Player newPlayer = event.getEntity();
			newPlayer.getAttribute(SURVIVABILITY.get()).setBaseValue(oldPlayer.getAttribute(SURVIVABILITY.get()).getBaseValue());
			newPlayer.getAttribute(ATTACKPOWER.get()).setBaseValue(oldPlayer.getAttribute(ATTACKPOWER.get()).getBaseValue());
			newPlayer.getAttribute(CRITCHANCE.get()).setBaseValue(oldPlayer.getAttribute(CRITCHANCE.get()).getBaseValue());
		}
	}
}