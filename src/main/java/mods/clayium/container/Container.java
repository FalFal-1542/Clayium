package mods.clayium.container;

import mods.clayium.Clayium;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Container {
    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, Clayium.MOD_ID);

    public static final RegistryObject<ContainerType<ClayTableContainer>> CLAY_TABLE_CONTAINER
            = CONTAINERS.register("lightning_channeler_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new ClayTableContainer(windowId, world, pos, inv, inv.player);
            })));


    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
