package com.devdyna.math.datagen.server;

import static com.devdyna.math.Main.MODID;
import static net.minecraft.data.recipes.RecipeCategory.MISC;

import java.util.concurrent.CompletableFuture;

import com.devdyna.math.Values;
import com.devdyna.math.init.types.zItems;
import com.devdyna.math.utils.DataGenUtil;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;

@SuppressWarnings("null")
public class DataRecipe extends RecipeProvider {

        public DataRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
                super(output, completableFuture);
        }

        @Override
        protected void buildRecipes(RecipeOutput c) {

                for (int x = 0; x < Values.MAX_VALUE; x++)
                        for (int y = 0; y < Values.MAX_VALUE; y++)
                                for (int z = 0; z < Values.MAX_VALUE; z++) {

                                        if (x + y == z)
                                                recipe(zItems.PLUS.asItem(), x, y, z, c);

                                        if (x - y == z)
                                                recipe(zItems.LESS.asItem(), x, y, z, c);

                                        if (x * y == z)
                                                recipe(zItems.FOR.asItem(), x, y, z, c);

                                        if (x != 0 && y != 0)
                                                if (y * z == x)
                                                        recipe(zItems.DIV.asItem(), x, y, z, c);

                                }

        }

        private void recipe(Item operator, int value_1, int value_2, int result, RecipeOutput c) {
                ShapelessRecipeBuilder.shapeless(MISC, DataGenUtil.getItem("value_" + result), 1)
                                .requires(operator)
                                .requires(DataGenUtil.getItem("value_" + value_1))
                                .requires(DataGenUtil.getItem("value_" + value_2))
                                .group(MODID)
                                .unlockedBy(MODID, InventoryChangeTrigger.TriggerInstance
                                                .hasItems(operator))
                                .save(c, MODID + ":" + operator.getDescriptionId().replace("item." + MODID + ".", "")
                                                + "/" + value_1 + "_" + value_2);
        }

        /*
         * //crafting
         * ShapedRecipeBuilder.shaped(MISC, null, 0)
         * ShapelessRecipeBuilder.shapeless(MISC, null, 0)
         * //cooking
         * SimpleCookingRecipeBuilder.smelting(null, null, null, 0, 0)
         * SimpleCookingRecipeBuilder.campfireCooking(null, null, null, 0, 0)
         * SimpleCookingRecipeBuilder.smoking(null, null, null, 0, 0)
         * SimpleCookingRecipeBuilder.blasting(null, null, null, 0, 0)
         * //stonecutting
         * SingleItemRecipeBuilder.stonecutting(null, null, null);
         * //smithing
         * SmithingTransformRecipeBuilder.smithing(null, null, null, null, null)
         */
}