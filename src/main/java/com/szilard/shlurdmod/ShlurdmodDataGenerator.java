package com.szilard.shlurdmod;

import com.szilard.shlurdmod.datagen.ModBlockTagProvider;
import com.szilard.shlurdmod.datagen.ModItemTagProvider;
import com.szilard.shlurdmod.datagen.ModLootTableProvider;
import com.szilard.shlurdmod.datagen.ModModelProvider;
import com.szilard.shlurdmod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ShlurdmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
