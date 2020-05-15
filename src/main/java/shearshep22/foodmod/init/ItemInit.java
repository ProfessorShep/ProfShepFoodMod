package shearshep22.foodmod.init;

import shearshep22.foodmod.ShepFood;
import shearshep22.foodmod.objects.items.TomatoSauceItem;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ShepFood.MOD_ID);
	public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
			() -> new BlockItem(BlockInit.TOMATO_PLANT.get(), new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
			() -> new BlockItem(BlockInit.RICE_PLANT.get(), new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> COOKED_CHEESE_PIZZA = ITEMS.register("cooked_cheese_pizza",
			() -> new BlockItem(BlockInit.CHEESE_PIZZA.get(), new Item.Properties().maxStackSize(1).group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> COOKED_PEPPERONI_PIZZA = ITEMS.register("cooked_pepperoni_pizza",
			() -> new BlockItem(BlockInit.PEPPERONI_PIZZA.get(), new Item.Properties().maxStackSize(1).group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> UNCOOKED_CHEESE_PIZZA = ITEMS.register("uncooked_cheese_pizza",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> UNCOOKED_PEPPERONI_PIZZA = ITEMS.register("uncooked_pepperoni_pizza",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> ONION = ITEMS.register("onion",
			() -> new BlockItem(BlockInit.ONION_PLANT.get(), new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(1).saturation(1f).build())));
	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> COOKED_EGG = ITEMS.register("cooked_egg",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> HOTDOG = ITEMS.register("hotdog",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(5).saturation(2f).build())));
	public static final RegistryObject<Item> YEAST = ITEMS.register("yeast",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> CHEESE_PIZZA_SLICE = ITEMS.register("cheese_pizza_slice",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> PEPPERONI_PIZZA_SLICE = ITEMS.register("pepperoni_pizza_slice",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())));
	public static final RegistryObject<Item> MUFFIN = ITEMS.register("muffin",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(3).saturation(2f).build())));
	public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(1).fastToEat().saturation(2f).build())));
	public static final RegistryObject<Item> RAW_CHICKEN_NUGGET = ITEMS.register("raw_chicken_nugget",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().meat().hunger(1).saturation(2f).fastToEat().effect(new EffectInstance(Effects.HUNGER, 600), 0.3f).build())));
	public static final RegistryObject<Item> TOMATO_SAUCE_BOTTLE = ITEMS.register("tomato_sauce_bottle",
			() -> new TomatoSauceItem((new Item.Properties()).maxStackSize(16).containerItem(Items.GLASS_BOTTLE).group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(1).fastToEat().saturation(2f).build())));
	public static final RegistryObject<Item> RICE_BOWL = ITEMS.register("rice_bowl",
			() -> new SoupItem(new Item.Properties().group(ShepFood.shepfoodTab.instance).maxStackSize(1).food(new Food.Builder().hunger(6).saturation(3f).build())));
	public static final RegistryObject<Item> RICE = ITEMS.register("rice",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> BURGER_BUN = ITEMS.register("burger_bun",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> MEATBALL = ITEMS.register("meatball",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> PEPPERONI = ITEMS.register("pepperoni",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance)));
	public static final RegistryObject<Item> NOODLE_SOUP = ITEMS.register("noodle_soup",
			() -> new SoupItem(new Item.Properties().group(ShepFood.shepfoodTab.instance).maxStackSize(1).food(new Food.Builder().hunger(6).saturation(3f).build())));
	public static final RegistryObject<Item> SPAGHETTI = ITEMS.register("spaghetti",
			() -> new SoupItem(new Item.Properties().group(ShepFood.shepfoodTab.instance).maxStackSize(1).food(new Food.Builder().hunger(6).saturation(3f).build())));
	public static final RegistryObject<Item> SPAGHETTI_MEATBALLS = ITEMS.register("spaghetti_meatballs",
			() -> new SoupItem(new Item.Properties().group(ShepFood.shepfoodTab.instance).maxStackSize(1).food(new Food.Builder().hunger(7).saturation(3f).build())));
	public static final RegistryObject<Item> DUMPLING = ITEMS.register("dumpling",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).fastToEat().saturation(2f).build())));
	public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(4).saturation(3f).build())));
	public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(4).saturation(3f).build())));
	public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi",
			() -> new Item(new Item.Properties().group(ShepFood.shepfoodTab.instance).food(new Food.Builder().hunger(2).fastToEat().saturation(2f).build())));
}