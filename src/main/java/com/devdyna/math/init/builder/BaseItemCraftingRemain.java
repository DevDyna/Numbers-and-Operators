package com.devdyna.math.init.builder;

import com.devdyna.math.init.Material;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

@SuppressWarnings("null")
public class BaseItemCraftingRemain extends Item {

    public BaseItemCraftingRemain() {
        super(Material.iProp.rarity(Rarity.RARE));
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return itemStack.copyWithCount(1);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
