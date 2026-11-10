/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.idlerpg.enchantment.BlagoslovleniewitheraEnchantment;
import net.mcreator.idlerpg.IdleRpgMod;

public class IdleRpgModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, IdleRpgMod.MODID);
	public static final RegistryObject<Enchantment> BLAGOSLOVLENIEWITHERA = REGISTRY.register("blagoslovleniewithera", BlagoslovleniewitheraEnchantment::new);
}