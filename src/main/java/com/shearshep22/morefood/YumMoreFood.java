package com.shearshep22.morefood;

import com.shearshep22.morefood.init.BlockInit;
import com.shearshep22.morefood.init.ItemInit;
import com.shearshep22.morefood.objects.blocks.TomatoPlant;
import com.shearshep22.morefood.objects.blocks.OnionPlant;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// The value here should match an entry in the META-INF/mods.toml file
@Mod("ymorefood")
@Mod.EventBusSubscriber(modid = YumMoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class YumMoreFood
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ymorefood";
    public static YumMoreFood instance;

    public YumMoreFood() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        instance=this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof OnionPlant)).filter(block -> !(block.get() instanceof TomatoPlant))
                .map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(YMoreFoodTab.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ComposterBlock.registerCompostable(0.6f, ItemInit.TOMATO_SEEDS.get());
        ComposterBlock.registerCompostable(0.8f, ItemInit.TOMATO.get());
        ComposterBlock.registerCompostable(0.7f, ItemInit.ONION.get());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }
    public static class YMoreFoodTab extends ItemGroup{
    	public static final YMoreFoodTab instance = new YMoreFoodTab(ItemGroup.GROUPS.length, "ymoretab");
    	private YMoreFoodTab(int index, String label) {
    		super(index, label);
    	}
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ItemInit.TOMATO.get());
    	}
    }
}
