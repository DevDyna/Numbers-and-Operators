package com.devdyna.math.init.types;

import static com.devdyna.math.Main.MODID;

import com.devdyna.math.init.Material;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class zMultiTags {

    // public static final MultiTag X = new MultiTag("minecraft", "block");

}

class MultiTag {

    private TagKey<Item> item;
    private TagKey<Block> block;

    public MultiTag(String modname, String name) {
        this.block = Material.tagBlock(modname, name);
        this.item = Material.tagItem(modname, name);
    }

    public MultiTag(String name) {
        this(MODID, name);
    }

    public TagKey<Item> item() {
        return item;
    }

    public TagKey<Block> block() {
        return block;
    }

}