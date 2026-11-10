/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.idlerpg.item.Swordcustom1Item;
import net.mcreator.idlerpg.item.SettingsstickItem;
import net.mcreator.idlerpg.item.KingaldrevnihItem;
import net.mcreator.idlerpg.item.Expbottle1xItem;
import net.mcreator.idlerpg.item.BasicpickaxewoodItem;
import net.mcreator.idlerpg.IdleRpgMod;

public class IdleRpgModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IdleRpgMod.MODID);
	public static final RegistryObject<Item> COBBLESTONEGENERATOR;
	public static final RegistryObject<Item> SETTINGSSTICK;
	public static final RegistryObject<Item> STONEGENERATOR;
	public static final RegistryObject<Item> COALGENERATOR;
	public static final RegistryObject<Item> IROBGENERATOR;
	public static final RegistryObject<Item> GOLDGENERATOR;
	public static final RegistryObject<Item> LAPISGENERATOR;
	public static final RegistryObject<Item> REDSTONEGENERATOR;
	public static final RegistryObject<Item> EMERALDGENERATOR;
	public static final RegistryObject<Item> DIAMONDGENERATOR;
	public static final RegistryObject<Item> NETHERITEGENERATOR;
	public static final RegistryObject<Item> COMPRESSEDCOBBLESTONE;
	public static final RegistryObject<Item> ENCHANTEDCOMPRESSEDCOBBLESTONE;
	public static final RegistryObject<Item> BASICPICKAXEWOOD;
	public static final RegistryObject<Item> SWORDCUSTOM_1;
	public static final RegistryObject<Item> COBBLESTONEMINION_SPAWN_EGG;
	public static final RegistryObject<Item> EXPBOTTLE_1X;
	public static final RegistryObject<Item> BLOCKRUDYDREVNIKH;
	public static final RegistryObject<Item> KINGALDREVNIH;
	public static final RegistryObject<Item> TITANIUMORE;
	public static final RegistryObject<Item> ZIVOEDEREVO;
	static {
		COBBLESTONEGENERATOR = block(IdleRpgModBlocks.COBBLESTONEGENERATOR);
		SETTINGSSTICK = REGISTRY.register("settingsstick", SettingsstickItem::new);
		STONEGENERATOR = block(IdleRpgModBlocks.STONEGENERATOR);
		COALGENERATOR = block(IdleRpgModBlocks.COALGENERATOR);
		IROBGENERATOR = block(IdleRpgModBlocks.IROBGENERATOR);
		GOLDGENERATOR = block(IdleRpgModBlocks.GOLDGENERATOR);
		LAPISGENERATOR = block(IdleRpgModBlocks.LAPISGENERATOR);
		REDSTONEGENERATOR = block(IdleRpgModBlocks.REDSTONEGENERATOR);
		EMERALDGENERATOR = block(IdleRpgModBlocks.EMERALDGENERATOR);
		DIAMONDGENERATOR = block(IdleRpgModBlocks.DIAMONDGENERATOR);
		NETHERITEGENERATOR = block(IdleRpgModBlocks.NETHERITEGENERATOR);
		COMPRESSEDCOBBLESTONE = block(IdleRpgModBlocks.COMPRESSEDCOBBLESTONE);
		ENCHANTEDCOMPRESSEDCOBBLESTONE = block(IdleRpgModBlocks.ENCHANTEDCOMPRESSEDCOBBLESTONE);
		BASICPICKAXEWOOD = REGISTRY.register("basicpickaxewood", BasicpickaxewoodItem::new);
		SWORDCUSTOM_1 = REGISTRY.register("swordcustom_1", Swordcustom1Item::new);
		COBBLESTONEMINION_SPAWN_EGG = REGISTRY.register("cobblestoneminion_spawn_egg", () -> new ForgeSpawnEggItem(IdleRpgModEntities.COBBLESTONEMINION, -6710887, -13421773, new Item.Properties()));
		EXPBOTTLE_1X = REGISTRY.register("expbottle_1x", Expbottle1xItem::new);
		BLOCKRUDYDREVNIKH = block(IdleRpgModBlocks.BLOCKRUDYDREVNIKH, new Item.Properties().rarity(Rarity.UNCOMMON));
		KINGALDREVNIH = REGISTRY.register("kingaldrevnih", KingaldrevnihItem::new);
		TITANIUMORE = block(IdleRpgModBlocks.TITANIUMORE);
		ZIVOEDEREVO = block(IdleRpgModBlocks.ZIVOEDEREVO);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}