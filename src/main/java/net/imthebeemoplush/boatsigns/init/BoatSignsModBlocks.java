
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imthebeemoplush.boatsigns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.imthebeemoplush.boatsigns.block.SmallSteelTrussHolderBlock;
import net.imthebeemoplush.boatsigns.block.SmallSteelTrussBlock;
import net.imthebeemoplush.boatsigns.block.BoatSpeedLimitSign5Block;
import net.imthebeemoplush.boatsigns.block.BoatSpeedLimitSign3Block;
import net.imthebeemoplush.boatsigns.block.BoatSpeedLimitSign15Block;
import net.imthebeemoplush.boatsigns.block.BoatSpeedLimitSign10Block;
import net.imthebeemoplush.boatsigns.block.BoatOpenBridgeSignBlock;
import net.imthebeemoplush.boatsigns.block.BoatNoWaterScooterSignBlock;
import net.imthebeemoplush.boatsigns.block.BoatNoMoorSignBlock;
import net.imthebeemoplush.boatsigns.block.BoatNoAnchorSignBlock;
import net.imthebeemoplush.boatsigns.block.BoatHeightSign35Block;
import net.imthebeemoplush.boatsigns.block.BoatHeightSign20Block;
import net.imthebeemoplush.boatsigns.block.BoatHeightSign127Block;
import net.imthebeemoplush.boatsigns.block.BoatFishingGearSignBlock;
import net.imthebeemoplush.boatsigns.block.BoatDistanceToSign200Block;
import net.imthebeemoplush.boatsigns.block.BoatDistanceToSign100Block;
import net.imthebeemoplush.boatsigns.block.BoatCableSignBlock;
import net.imthebeemoplush.boatsigns.BoatSignsMod;

public class BoatSignsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BoatSignsMod.MODID);
	public static final RegistryObject<Block> BOAT_HEIGHT_SIGN_35 = REGISTRY.register("boat_height_sign_35", () -> new BoatHeightSign35Block());
	public static final RegistryObject<Block> BOAT_HEIGHT_SIGN_127 = REGISTRY.register("boat_height_sign_127", () -> new BoatHeightSign127Block());
	public static final RegistryObject<Block> BOAT_HEIGHT_SIGN_20 = REGISTRY.register("boat_height_sign_20", () -> new BoatHeightSign20Block());
	public static final RegistryObject<Block> BOAT_OPEN_BRIDGE_SIGN = REGISTRY.register("boat_open_bridge_sign", () -> new BoatOpenBridgeSignBlock());
	public static final RegistryObject<Block> BOAT_FISHING_GEAR_SIGN = REGISTRY.register("boat_fishing_gear_sign", () -> new BoatFishingGearSignBlock());
	public static final RegistryObject<Block> BOAT_NO_ANCHOR_SIGN = REGISTRY.register("boat_no_anchor_sign", () -> new BoatNoAnchorSignBlock());
	public static final RegistryObject<Block> BOAT_NO_MOOR_SIGN = REGISTRY.register("boat_no_moor_sign", () -> new BoatNoMoorSignBlock());
	public static final RegistryObject<Block> BOAT_NO_WATER_SCOOTER_SIGN = REGISTRY.register("boat_no_water_scooter_sign", () -> new BoatNoWaterScooterSignBlock());
	public static final RegistryObject<Block> BOAT_DISTANCE_TO_SIGN_100 = REGISTRY.register("boat_distance_to_sign_100", () -> new BoatDistanceToSign100Block());
	public static final RegistryObject<Block> BOAT_DISTANCE_TO_SIGN_200 = REGISTRY.register("boat_distance_to_sign_200", () -> new BoatDistanceToSign200Block());
	public static final RegistryObject<Block> BOAT_CABLE_SIGN = REGISTRY.register("boat_cable_sign", () -> new BoatCableSignBlock());
	public static final RegistryObject<Block> BOAT_SPEED_LIMIT_SIGN_3 = REGISTRY.register("boat_speed_limit_sign_3", () -> new BoatSpeedLimitSign3Block());
	public static final RegistryObject<Block> BOAT_SPEED_LIMIT_SIGN_15 = REGISTRY.register("boat_speed_limit_sign_15", () -> new BoatSpeedLimitSign15Block());
	public static final RegistryObject<Block> BOAT_SPEED_LIMIT_SIGN_10 = REGISTRY.register("boat_speed_limit_sign_10", () -> new BoatSpeedLimitSign10Block());
	public static final RegistryObject<Block> BOAT_SPEED_LIMIT_SIGN_5 = REGISTRY.register("boat_speed_limit_sign_5", () -> new BoatSpeedLimitSign5Block());
	public static final RegistryObject<Block> SMALL_STEEL_TRUSS = REGISTRY.register("small_steel_truss", () -> new SmallSteelTrussBlock());
	public static final RegistryObject<Block> SMALL_STEEL_TRUSS_HOLDER = REGISTRY.register("small_steel_truss_holder", () -> new SmallSteelTrussHolderBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
