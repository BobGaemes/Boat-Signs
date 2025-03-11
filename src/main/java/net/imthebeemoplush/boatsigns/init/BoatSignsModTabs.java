
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imthebeemoplush.boatsigns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.imthebeemoplush.boatsigns.BoatSignsMod;

public class BoatSignsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoatSignsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BOAT_SIGNS_TAB = REGISTRY.register("boat_signs_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.boat_signs.boat_signs_tab")).icon(() -> new ItemStack(BoatSignsModBlocks.BOAT_NO_ANCHOR_SIGN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_35.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_127.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_20.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_OPEN_BRIDGE_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_FISHING_GEAR_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_NO_ANCHOR_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_NO_MOOR_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_NO_WATER_SCOOTER_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_DISTANCE_TO_SIGN_100.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_DISTANCE_TO_SIGN_200.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_CABLE_SIGN.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_3.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_5.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_10.get().asItem());
				tabData.accept(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_15.get().asItem());
				tabData.accept(BoatSignsModBlocks.SMALL_STEEL_TRUSS.get().asItem());
				tabData.accept(BoatSignsModBlocks.SMALL_STEEL_TRUSS_HOLDER.get().asItem());
			})

					.build());
}
