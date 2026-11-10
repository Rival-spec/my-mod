/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.idlerpg.block.*;
import net.mcreator.idlerpg.IdleRpgMod;

public class IdleRpgModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IdleRpgMod.MODID);
	public static final RegistryObject<Block> COBBLESTONEGENERATOR;
	public static final RegistryObject<Block> STONEGENERATOR;
	public static final RegistryObject<Block> COALGENERATOR;
	public static final RegistryObject<Block> IROBGENERATOR;
	public static final RegistryObject<Block> GOLDGENERATOR;
	public static final RegistryObject<Block> LAPISGENERATOR;
	public static final RegistryObject<Block> REDSTONEGENERATOR;
	public static final RegistryObject<Block> EMERALDGENERATOR;
	public static final RegistryObject<Block> DIAMONDGENERATOR;
	public static final RegistryObject<Block> NETHERITEGENERATOR;
	public static final RegistryObject<Block> COMPRESSEDCOBBLESTONE;
	public static final RegistryObject<Block> ENCHANTEDCOMPRESSEDCOBBLESTONE;
	public static final RegistryObject<Block> BLOCKRUDYDREVNIKH;
	public static final RegistryObject<Block> TITANIUMORE;
	public static final RegistryObject<Block> ZIVOEDEREVO;
	static {
		COBBLESTONEGENERATOR = REGISTRY.register("cobblestonegenerator", CobblestonegeneratorBlock::new);
		STONEGENERATOR = REGISTRY.register("stonegenerator", StonegeneratorBlock::new);
		COALGENERATOR = REGISTRY.register("coalgenerator", CoalgeneratorBlock::new);
		IROBGENERATOR = REGISTRY.register("irobgenerator", IrobgeneratorBlock::new);
		GOLDGENERATOR = REGISTRY.register("goldgenerator", GoldgeneratorBlock::new);
		LAPISGENERATOR = REGISTRY.register("lapisgenerator", LapisgeneratorBlock::new);
		REDSTONEGENERATOR = REGISTRY.register("redstonegenerator", RedstonegeneratorBlock::new);
		EMERALDGENERATOR = REGISTRY.register("emeraldgenerator", EmeraldgeneratorBlock::new);
		DIAMONDGENERATOR = REGISTRY.register("diamondgenerator", DiamondgeneratorBlock::new);
		NETHERITEGENERATOR = REGISTRY.register("netheritegenerator", NetheritegeneratorBlock::new);
		COMPRESSEDCOBBLESTONE = REGISTRY.register("compressedcobblestone", CompressedcobblestoneBlock::new);
		ENCHANTEDCOMPRESSEDCOBBLESTONE = REGISTRY.register("enchantedcompressedcobblestone", EnchantedcompressedcobblestoneBlock::new);
		BLOCKRUDYDREVNIKH = REGISTRY.register("blockrudydrevnikh", BlockrudydrevnikhBlock::new);
		TITANIUMORE = REGISTRY.register("titaniumore", TitaniumoreBlock::new);
		ZIVOEDEREVO = REGISTRY.register("zivoederevo", ZivoederevoBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}