package com.szilard.shlurdmod;

import com.szilard.shlurdmod.block.ModBlocks;
import com.szilard.shlurdmod.item.ModItemGroups;
import com.szilard.shlurdmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shlurdmod implements ModInitializer {
	public static final String MOD_ID = "shlurdmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}