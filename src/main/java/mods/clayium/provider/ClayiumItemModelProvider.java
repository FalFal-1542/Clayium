package mods.clayium.provider;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import mods.clayium.EnumUtil;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

import static mods.clayium.Clayium.Items.*;

public class ClayiumItemModelProvider extends ItemModelProvider {
    public ClayiumItemModelProvider(DataGenerator gen, String modId, ExistingFileHelper existingFileHelper) {
        super(gen, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //CLAY(Tier1)
        simpleItem(CLAY_SHOVEL.get());
        simpleItem(CLAY_PICKAXE.get());

        simpleItem(CLAY_GEAR.get());

        simpleItem(CLAY_BEARING.get());
        simpleItem(CLAY_BLADE.get());
        simpleItem(CLAY_CUTTINGHEAD.get());
        simpleItem(CLAY_CYLINDER.get());
        simpleItem(CLAY_DISC.get());
        simpleItem(CLAY_GRINDINGHEAD.get());
        simpleItem(CLAY_LARGE_BALL.get());
        simpleItem(CLAY_LARGE_PLATE.get());
        simpleItem(CLAY_NEEDLE.get());
        simpleItem(CLAY_PIPE.get());
        simpleItem(CLAY_PLATE.get());
        simpleItem(CLAY_RING.get());
        simpleItem(CLAY_SHORT_STICK.get());
        simpleItem(CLAY_SMALL_DISC.get());
        simpleItem(CLAY_SMALL_RING.get());
        simpleItem(CLAY_SPINDLE.get());

        simpleItem(CLAY_STICK.get());
        simpleItem(CLAY_WATER_WHEEL.get());
        simpleItem(CLAY_DUST.get());
        simpleItem(CLAY_SHARD.get());


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
