package com.example.starforge;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(StarforgeMod.MOD_ID)
public class StarforgeMod {
    public static final String MOD_ID = "starforge";
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> ITEM_1 = ITEMS.register("item_1", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Block> BLOCK_2 = BLOCKS.register("block_2", () -> new Block(BlockBehaviour.Properties.of().strength(3.0f)));
    public static final RegistryObject<Item> BLOCK_2_ITEM = ITEMS.register("block_2", () -> new BlockItem(BLOCK_2.get(), new Item.Properties()));

    public StarforgeMod(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        modBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ITEM_1);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(BLOCK_2_ITEM);
        }
    }
}
