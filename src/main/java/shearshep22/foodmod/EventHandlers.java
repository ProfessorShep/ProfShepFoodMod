package shearshep22.foodmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ShepFood.MOD_ID)
public class EventHandlers {
    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft","chests/village/village_plains_house"))) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(ShepFood.MOD_ID,"chests/village_plains_house"))).build());
            ShepFood.LOGGER.debug("Registered plains house loot!");

        }
        ShepFood.LOGGER.debug("Registered loot!");
    }
}
