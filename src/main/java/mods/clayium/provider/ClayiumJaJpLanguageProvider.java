package mods.clayium.provider;


import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static mods.clayium.Clayium.Items.*;
public class ClayiumJaJpLanguageProvider extends LanguageProvider {
    public ClayiumJaJpLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        add(CLAY_SHOVEL.get(),"粘土シャベル");
        add(CLAY_PICKAXE.get(),"粘土ツルハシ");




        add(DENSE_CLAY.get(),"高密度粘土");
        add(TITANIUM_BLOCK.get(), "チタンブロック");
    }
}