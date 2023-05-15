package net.waddo.spicy_vanilla.item;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.waddo.spicy_vanilla.Spicy_vanilla;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Spicy_vanilla.MOD_ID);

    public static final RegistryObject<Item> cucumer_seed = ITEMS.register("cucumber_seed",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TUTORIAL_TAB)
            ));
//            () -> new Item(new Item.Properties().food)

    //  this adds another item
        public static final RegistryObject<Item> cucumer = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
