package shearshep22.foodmod;

import shearshep22.foodmod.init.BlockInit;
import shearshep22.foodmod.init.ItemInit;
import shearshep22.foodmod.objects.blocks.PizzaBlock;
import shearshep22.foodmod.objects.blocks.RicePlant;
import shearshep22.foodmod.objects.blocks.TomatoPlant;
import shearshep22.foodmod.objects.blocks.OnionPlant;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// The value here should match an entry in the META-INF/mods.toml file
@Mod("shepfood")
@Mod.EventBusSubscriber(modid = ShepFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShepFood
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "shepfood";
    public static ShepFood instance;

    public ShepFood() {
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

        BlockInit.BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof OnionPlant)).filter(block -> !(block.get() instanceof TomatoPlant)).filter(block -> !(block.get() instanceof PizzaBlock)).filter(block -> !(block.get() instanceof OnionPlant)).filter(block -> !(block.get() instanceof RicePlant))
                .map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(shepfoodTab.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }
    /*@SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent e) {
        if (e.getName().toString().equals("minecraft:chests/village/village_plains_house.json")) {
            e.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(YumMoreFood.MOD_ID, "loot_tables/chests/village_house_plains"))).build());
        }
        LOGGER.debug("Registered loot!");
    }*/

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

    public static class shepfoodTab extends ItemGroup{
    	public static final shepfoodTab instance = new shepfoodTab(ItemGroup.GROUPS.length, "ymoretab");
    	private shepfoodTab(int index, String label) {
    		super(index, label);
    	}
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ItemInit.TOMATO.get());
    	}
    }
}
