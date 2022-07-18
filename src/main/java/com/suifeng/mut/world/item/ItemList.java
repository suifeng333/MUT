package com.suifeng.mut.world.item;

import com.suifeng.mut.MutMain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MutMain.MODID);
    public static final RegistryObject<Item> SUPER_PICKAXE =ITEMS.register("super_pickaxe",() -> new Item(new Item.Properties().tab(CreativeModeTabList.TAB_MUT)));
}
