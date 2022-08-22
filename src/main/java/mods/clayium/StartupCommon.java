package mods.clayium;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class StartupCommon {
    public static ItemVariants itemVariants;  // this holds the unique instance of the item

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        itemVariants = new ItemVariants();
        itemVariants.setRegistryName("mbe11_item_variants_registry_name");
        itemRegisterEvent.getRegistry().register(itemVariants);
    }
}
