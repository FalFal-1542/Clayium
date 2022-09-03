package mods.clayium;


//import mods.clayium.item.ClayPickaxe;

import mods.clayium.item.ClayPickaxe;
import mods.clayium.item.ClayShovel;
import mods.clayium.provider.ClayiumBlockStateProvider;
import mods.clayium.provider.ClayiumEnUsLanguageProvider;
import mods.clayium.provider.ClayiumItemModelProvider;
import mods.clayium.provider.ClayiumJaJpLanguageProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static mods.clayium.item.common.ClayiumMaterial.clay;
import static mods.clayium.item.common.ClayiumShape.*;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Clayium.MOD_ID)
public class Clayium {
    public static final String MOD_ID = "clayium";

    public static final ItemGroup CLAYIUM_TAB = new ItemGroup("clayium") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(net.minecraft.item.Items.CLAY_BALL.getItem());
        }
    };

    //ItemRegisterみたいな感じに独立させたい

    public Clayium() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modEventBus);
        Items.register(modEventBus);
        modEventBus.addListener(this::registerProviders);
    }

    private void registerProviders(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeClient()) {
            gen.addProvider(new ClayiumBlockStateProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new ClayiumItemModelProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new ClayiumEnUsLanguageProvider(gen, MOD_ID));
            gen.addProvider(new ClayiumJaJpLanguageProvider(gen, MOD_ID));
        }
        // if (event.includeServer()) {
        //gen.addProvider(new ClayiumRecipeProvider(gen));
        // gen.addProvider(new ClayiumLootTableProvider(gen));
         //  }
    }

    public interface Blocks {
        DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
        RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", Blocks::get);
        RegistryObject<Block> DENSE_CLAY = BLOCKS.register("dense_clay",Blocks::get);
        RegistryObject<Block> CLAY_TABLE = BLOCKS.register("clay_table",Blocks::get);
        static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }

        static Block get() {
            return new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.CLAY).hardnessAndResistance(0.6F).sound(SoundType.GROUND).harvestTool(ToolType.SHOVEL));
        }
    }

    public interface Items {
        DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        //item register
        RegistryObject<ClayShovel> CLAY_SHOVEL = ITEMS.register("clay_shovel", ClayShovel::new);
        RegistryObject<ClayPickaxe> CLAY_PICKAXE = ITEMS.register("clay_pickaxe", ClayPickaxe::new);
        //誰か自動でこいつら登録した後にModelProviderにぶち込ませる機構を作ってくれないかなぁ
        RegistryObject<Item> CLAY_GEAR = ITEMS.register(clay +"_"+gear, Clayium::item);
        RegistryObject<Item> CLAY_STICK = ITEMS.register(clay +"_"+stick, Clayium::item);
        RegistryObject<Item> CLAY_SHORT_STICK = ITEMS.register(clay +"_"+short_stick, Clayium::item);
        RegistryObject<Item> CLAY_DISC = ITEMS.register(clay +"_"+disc, Clayium::item);
        RegistryObject<Item> CLAY_SMALL_DISC = ITEMS.register(clay +"_"+small_disc, Clayium::item);
        RegistryObject<Item> CLAY_CUTTINGHEAD = ITEMS.register(clay +"_"+cuttinghead, Clayium::item);
        RegistryObject<Item> CLAY_RING = ITEMS.register(clay +"_"+ring, Clayium::item);
        RegistryObject<Item> CLAY_SMALL_RING = ITEMS.register(clay +"_"+small_ring, Clayium::item);
        RegistryObject<Item> CLAY_GRINDINGHEAD = ITEMS.register(clay +"_"+grindinghead, Clayium::item);
        RegistryObject<Item> CLAY_LARGE_BALL = ITEMS.register(clay +"_"+large_ball, Clayium::item);
        RegistryObject<Item> CLAY_WATER_WHEEL = ITEMS.register(clay +"_"+waterwheel, Clayium::item);
        RegistryObject<Item> CLAY_SPINDLE = ITEMS.register(clay +"_"+spindle, Clayium::item);
        RegistryObject<Item> CLAY_NEEDLE = ITEMS.register(clay +"_"+needle, Clayium::item);
        RegistryObject<Item> CLAY_CYLINDER = ITEMS.register(clay +"_"+cylinder, Clayium::item);
        RegistryObject<Item> CLAY_BEARING = ITEMS.register(clay +"_"+bearing, Clayium::item);
        RegistryObject<Item> CLAY_BLADE = ITEMS.register(clay +"_"+blade, Clayium::item);
        RegistryObject<Item> CLAY_PIPE = ITEMS.register(clay +"_"+pipe, Clayium::item);
        RegistryObject<Item> CLAY_PLATE = ITEMS.register(clay +"_"+plate, Clayium::item);
        RegistryObject<Item> CLAY_LARGE_PLATE = ITEMS.register(clay +"_"+large_plate, Clayium::item);
        RegistryObject<Item> CLAY_DUST = ITEMS.register(clay +"_"+dust, Clayium::item);
        RegistryObject<Item> CLAY_SHARD = ITEMS.register(clay +"_"+shard, Clayium::item);



        //block register
        RegistryObject<Item> TITANIUM_BLOCK = ITEMS.register("titanium_block", () -> new BlockItem(Blocks.TITANIUM_BLOCK.get(), itemB()));
        RegistryObject<Item> DENSE_CLAY = ITEMS.register("dense_clay",() -> new BlockItem(Blocks.DENSE_CLAY.get(), itemB()));


        static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }

    private static Item item() {
        return new Item(new Item.Properties().group(CLAYIUM_TAB));
    }
    private static Item.Properties itemB() {
        return new Item.Properties().group(CLAYIUM_TAB);
    }
}
