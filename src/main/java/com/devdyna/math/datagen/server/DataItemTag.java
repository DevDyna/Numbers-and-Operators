package com.devdyna.math.datagen.server;

import java.util.concurrent.CompletableFuture;

import com.devdyna.math.init.types.zItemTag;
import com.devdyna.math.init.types.zItems;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("null")

public class DataItemTag extends ItemTagsProvider {

    public DataItemTag(PackOutput o, CompletableFuture<Provider> p, CompletableFuture<TagLookup<Block>> b) {
        super(o, p, b);
    }

    @Override
    protected void addTags(Provider p) {
        
        zItems.zOperators.getEntries().forEach(it->tag(zItemTag.OPERATORS).add(it.get()));
        zItems.zNumbers.getEntries().forEach(it->tag(zItemTag.NUMBERS).add(it.get()));
    
    }

}