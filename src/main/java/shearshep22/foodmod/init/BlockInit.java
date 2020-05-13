package shearshep22.foodmod.init;

import shearshep22.foodmod.ShepFood;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import shearshep22.foodmod.objects.blocks.OnionPlant;
import shearshep22.foodmod.objects.blocks.PizzaBlock;
import shearshep22.foodmod.objects.blocks.RicePlant;
import shearshep22.foodmod.objects.blocks.TomatoPlant;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			ShepFood.MOD_ID);
	public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant",
			() -> new TomatoPlant(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> ONION_PLANT = BLOCKS.register("onion_plant",
			() -> new OnionPlant(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> RICE_PLANT = BLOCKS.register("rice_plant",
			() -> new RicePlant(Block.Properties.from(Blocks.WHEAT)));
	//public static final RegistryObject<Block> UNKNOWN_BLOCK = BLOCKS.register("unknown_block",
	//		() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15.0f).sound(SoundType.METAL)));
	public static final RegistryObject<Block> CHEESE_PIZZA = BLOCKS.register("cheese_pizza",
			() -> new PizzaBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
	public static final RegistryObject<Block> PEPPERONI_PIZZA = BLOCKS.register("pepperoni_pizza",
			() -> new PizzaBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
}
