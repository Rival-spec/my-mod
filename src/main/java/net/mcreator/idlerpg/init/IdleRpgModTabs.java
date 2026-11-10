/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idlerpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.idlerpg.IdleRpgMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IdleRpgModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IdleRpgMod.MODID);
	public static final RegistryObject<CreativeModeTab> IDLERPG = REGISTRY.register("idlerpg",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.idle_rpg.idlerpg")).icon(() -> new ItemStack(IdleRpgModItems.SETTINGSSTICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(IdleRpgModBlocks.COBBLESTONEGENERATOR.get().asItem());
				tabData.accept(IdleRpgModItems.SETTINGSSTICK.get());
				tabData.accept(IdleRpgModBlocks.STONEGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.COALGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.IROBGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.GOLDGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.LAPISGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.REDSTONEGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.EMERALDGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.DIAMONDGENERATOR.get().asItem());
				tabData.accept(IdleRpgModBlocks.NETHERITEGENERATOR.get().asItem());
				tabData.accept(IdleRpgModItems.SWORDCUSTOM_1.get());
				tabData.accept(IdleRpgModBlocks.BLOCKRUDYDREVNIKH.get().asItem());
				tabData.accept(IdleRpgModItems.KINGALDREVNIH.get());
				tabData.accept(IdleRpgModBlocks.TITANIUMORE.get().asItem());
				tabData.accept(IdleRpgModBlocks.ZIVOEDEREVO.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(IdleRpgModItems.BASICPICKAXEWOOD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(IdleRpgModItems.COBBLESTONEMINION_SPAWN_EGG.get());
		}
	}
}