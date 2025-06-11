package com.devdyna.math.datagen.client;

import static com.devdyna.math.Main.MODID;

import com.devdyna.math.init.types.zBlocks;
import com.devdyna.math.init.types.zItems;
import com.devdyna.math.utils.DataGenUtil;

import net.minecraft.data.PackOutput;
import net.minecraft.util.FastColor;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DataItemModel extends ItemModelProvider {

    public DataItemModel(PackOutput o, ExistingFileHelper f) {
        super(o, MODID, f);
    }

    @Override
    protected void registerModels() {

        zItems.zTool.getEntries().forEach(item -> {
            try {
                DataGenUtil.itemTool(item.get(), this);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        zItems.zItem.getEntries().forEach(item -> {

            try {
                DataGenUtil.itemModel(item.get(), this);
            } catch (Exception e) {
                System.out.println(e);
            }

        });

        zBlocks.zBlockItem.getEntries().forEach(block -> {
            try {
                DataGenUtil.itemBlock(block.get(), this);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        // int[] colors = {
        // FastColor.ARGB32.color(255, 255, 0, 0),
        // FastColor.ARGB32.color(255, 0, 0, 255),
        // FastColor.ARGB32.color(255, 0, 255, 0),
        // FastColor.ARGB32.color(255, 255, 255, 0),
        // FastColor.ARGB32.color(255, 255, 165, 0),
        // FastColor.ARGB32.color(255, 128, 0, 128),
        // FastColor.ARGB32.color(255, 255, 192, 203),
        // FastColor.ARGB32.color(255, 165, 42, 42),
        // FastColor.ARGB32.color(255, 0, 0, 0),
        // FastColor.ARGB32.color(255, 255, 255, 255),
        // };

        int[] red = { 255, 0, 0, 255, 255, 128, 255, 165, 0, 255 };

        int[] green = { 0, 0, 255, 255, 165, 0, 192, 42, 0, 255 };

        int[] blue = { 0, 255, 0, 0, 0, 128, 203, 42, 0, 255 };


        for (int decimal = 0; decimal < 10; decimal++) {

            for (int unit = 0; unit < 10; unit++) {
                int number = decimal * 10 + unit;

                withExistingParent("value_" + number,
                        mcLoc("item/generated"))
                        .texture("layer0", MODID + ":item/rune")
                        // .texture("layer1", MODID + ":item/handler")
                        .texture("layer1", MODID + ":item/numbers/" + unit)
                        .customLoader(ItemLayerModelBuilder::begin)
                        .color(FastColor.ARGB32.color(
                                255,
                                red[decimal],
                                green[decimal],
                                blue[decimal]), 1)

                        // .color(FastColor.ARGB32.color(
                        //         255,
                        //          newRed[decimal],
                        //          newGreen[decimal],
                        //          newBlue[decimal]), 2)
                        ;
                        
                // .emissive(emissivity, emissivity, 0).renderType("minecraft:translucent", 0)
            }
        }

    }

}
