
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imthebeemoplush.boatsigns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.imthebeemoplush.boatsigns.BoatSignsMod;

public class BoatSignsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BoatSignsMod.MODID);
	public static final RegistryObject<Item> BOAT_HEIGHT_SIGN_35 = block(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_35);
	public static final RegistryObject<Item> BOAT_HEIGHT_SIGN_127 = block(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_127);
	public static final RegistryObject<Item> BOAT_HEIGHT_SIGN_20 = block(BoatSignsModBlocks.BOAT_HEIGHT_SIGN_20);
	public static final RegistryObject<Item> BOAT_OPEN_BRIDGE_SIGN = block(BoatSignsModBlocks.BOAT_OPEN_BRIDGE_SIGN);
	public static final RegistryObject<Item> BOAT_FISHING_GEAR_SIGN = block(BoatSignsModBlocks.BOAT_FISHING_GEAR_SIGN);
	public static final RegistryObject<Item> BOAT_NO_ANCHOR_SIGN = block(BoatSignsModBlocks.BOAT_NO_ANCHOR_SIGN);
	public static final RegistryObject<Item> BOAT_NO_MOOR_SIGN = block(BoatSignsModBlocks.BOAT_NO_MOOR_SIGN);
	public static final RegistryObject<Item> BOAT_NO_WATER_SCOOTER_SIGN = block(BoatSignsModBlocks.BOAT_NO_WATER_SCOOTER_SIGN);
	public static final RegistryObject<Item> BOAT_DISTANCE_TO_SIGN_100 = block(BoatSignsModBlocks.BOAT_DISTANCE_TO_SIGN_100);
	public static final RegistryObject<Item> BOAT_DISTANCE_TO_SIGN_200 = block(BoatSignsModBlocks.BOAT_DISTANCE_TO_SIGN_200);
	public static final RegistryObject<Item> BOAT_CABLE_SIGN = block(BoatSignsModBlocks.BOAT_CABLE_SIGN);
	public static final RegistryObject<Item> BOAT_SPEED_LIMIT_SIGN_3 = block(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_3);
	public static final RegistryObject<Item> BOAT_SPEED_LIMIT_SIGN_15 = block(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_15);
	public static final RegistryObject<Item> BOAT_SPEED_LIMIT_SIGN_10 = block(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_10);
	public static final RegistryObject<Item> BOAT_SPEED_LIMIT_SIGN_5 = block(BoatSignsModBlocks.BOAT_SPEED_LIMIT_SIGN_5);
	public static final RegistryObject<Item> SMALL_STEEL_TRUSS = block(BoatSignsModBlocks.SMALL_STEEL_TRUSS);
	public static final RegistryObject<Item> SMALL_STEEL_TRUSS_HOLDER = block(BoatSignsModBlocks.SMALL_STEEL_TRUSS_HOLDER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
