package mods.clayium.provider;

import mods.clayium.Clayium;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ClayiumEnUsLanguageProvider extends LanguageProvider {
    public ClayiumEnUsLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Clayium.CLAYIUM_TAB.getPath(), "Clayium");

        add(Clayium.Items.CLAY_STICK.get(), "Clay Stick");
        add(Clayium.Items.CLAY_PLATE.get(), "Clay Plate");
        add(Clayium.Items.CLAY_SHOVEL.get(), "Clay Shovel");
        add(Clayium.Items.TITANIUM_BLOCK.get(), "Block of Titanium");
    }
}