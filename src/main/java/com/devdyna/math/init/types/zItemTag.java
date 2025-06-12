package com.devdyna.math.init.types;

import com.devdyna.math.init.Material;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;

public class zItemTag {
    public static void register(IEventBus bus) {

    }

    public static final TagKey<Item> OPERATORS = Material.tagItem("operators");
    public static final TagKey<Item> NUMBERS = Material.tagItem("numbers");

}
