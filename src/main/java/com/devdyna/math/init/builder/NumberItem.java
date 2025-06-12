package com.devdyna.math.init.builder;

import com.devdyna.math.init.Material;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class NumberItem extends Item{

    public NumberItem() {
        super(Material.iProp.rarity(Rarity.UNCOMMON));
    }
    
}
