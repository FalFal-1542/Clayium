package mods.clayium.provider;


import mods.clayium.Clayium;
import mods.clayium.item.ClayShovel;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Objects;

public class ClayiumItemModelProvider extends ItemModelProvider {
    public ClayiumItemModelProvider(DataGenerator gen, String modId, ExistingFileHelper existingFileHelper) {
        super(gen, modId, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        simpleItem(Clayium.Items.CLAY_STICK.get());
        simpleItem(Clayium.Items.CLAY_PLATE.get());
        simpleItem(Clayium.Items.CLAY_SHOVEL.get());
        simpleItem(Clayium.Items.CLAY_PICKAXE.get());
    }

    private void simpleItem(Item item) {
        ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
        singleTexture(name.getPath(),
                mcLoc(folder + "/generated"),
                "layer0",
                new ResourceLocation(name.getNamespace(),
                        folder + "/" + name.getPath()));
    }


}