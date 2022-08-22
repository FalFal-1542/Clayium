package mods.clayium.provider;

import mods.clayium.Clayium;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ClayiumJaJpLanguageProvider extends LanguageProvider {
    public ClayiumJaJpLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        add(Clayium.Items.CLAY_STICK.get(), "粘土棒");
        add(Clayium.Items.CLAY_PLATE.get(), "粘土板");
        add(Clayium.Items.CLAY_SHOVEL.get(),"粘土シャベル");
        add(Clayium.Items.TITANIUM_BLOCK.get(), "チタンブロック");
    }
}