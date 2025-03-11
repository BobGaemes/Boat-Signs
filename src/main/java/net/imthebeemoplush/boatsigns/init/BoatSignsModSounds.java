
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imthebeemoplush.boatsigns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.imthebeemoplush.boatsigns.BoatSignsMod;

public class BoatSignsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BoatSignsMod.MODID);
	public static final RegistryObject<SoundEvent> BOAT_SIGN_PLACE = REGISTRY.register("boat_sign_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("boat_signs", "boat_sign_place")));
	public static final RegistryObject<SoundEvent> BOAT_SIGN_BREAK = REGISTRY.register("boat_sign_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("boat_signs", "boat_sign_break")));
}
