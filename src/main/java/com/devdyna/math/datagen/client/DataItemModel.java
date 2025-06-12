package com.devdyna.math.datagen.client;

import static com.devdyna.math.Main.MODID;

import com.devdyna.math.Values;
import com.devdyna.math.init.types.zItems;
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

        // zItems.zTool.getEntries().forEach(item -> {
        //     try {
        //         DataGenUtil.itemTool(item.get(), this);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        // });

        // zItems.zItem.getEntries().forEach(item -> {

        //     try {
        //         DataGenUtil.itemModel(item.get(), this);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }

        // });

        // zBlocks.zBlockItem.getEntries().forEach(block -> {
        //     try {
        //         DataGenUtil.itemBlock(block.get(), this);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        // });

        zItems.zOperators.getEntries()
                .forEach(item -> withExistingParent(item.getRegisteredName(), mcLoc("item/generated")).texture("layer0",
                        MODID + ":item/operators/" + item.getRegisteredName().replace(MODID + ":", "")));

        int[] red = { 255, 0, 0, 255, 255, 128, 255, 165, 0, 255 };

        int[] green = { 0, 0, 255, 255, 165, 0, 192, 42, 0, 255 };

        int[] blue = { 0, 255, 0, 0, 0, 128, 203, 42, 0, 255 };

        for (int decimal = 0; decimal < Values.MAX_VALUE/10; decimal++) {

            for (int unit = 0; unit < Values.MAX_VALUE/10; unit++) {
                int number = decimal * Values.MAX_VALUE/10 + unit;

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
                                blue[decimal]), 1);
            }
        }

    }

}
