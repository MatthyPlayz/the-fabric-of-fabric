package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

	public static final Item EXAMPLE_ITEM = new Item(new FabricItemSettings());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("hello world!!");
		Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), EXAMPLE_ITEM);
	}
}
