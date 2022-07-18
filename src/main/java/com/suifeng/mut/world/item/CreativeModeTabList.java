package com.suifeng.mut.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeModeTabList {
    public static final CreativeModeTab TAB_MUT = new CreativeModeTab("MUT") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.SUPER_PICKAXE.get());
        }
    };
}
