package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.YumMoreFood.YMoreFoodTab;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			YumMoreFood.MOD_ID);
	public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
			() -> new BlockItem(BlockInit.TOMATO_PLANT.get(), new Item.Properties().group(YMoreFoodTab.instance)));
	public static final RegistryObject<Item> ONION = ITEMS.register("onion",
			() -> new BlockItem(BlockInit.ONION_PLANT.get(), new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(1).saturation(1f).build())));
	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance)));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> YEAST = ITEMS.register("yeast",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance)));
	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance)));
	public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(1).fastToEat().saturation(2f).build())));
	public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget",
			() -> new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(1).saturation(2f).fastToEat().effect(new EffectInstance(Effects.HUNGER, 600), 0.3f).build())));

}