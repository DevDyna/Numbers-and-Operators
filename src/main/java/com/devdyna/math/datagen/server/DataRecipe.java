package com.devdyna.math.datagen.server;

import static com.devdyna.math.Main.MODID;
import static net.minecraft.data.recipes.RecipeCategory.MISC;

import java.util.concurrent.CompletableFuture;

import com.devdyna.math.init.types.zItems;
import com.devdyna.math.utils.DataGenUtil;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;

@SuppressWarnings("null")
public class DataRecipe extends RecipeProvider {

        public DataRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
                super(output, completableFuture);
        }

        @Override
        protected void buildRecipes(RecipeOutput c) {

                //TODO all recipes

                ShapelessRecipeBuilder.shapeless(MISC, DataGenUtil.getItem("value_2"), 1)
                                .requires(DataGenUtil.getItem("value_1"))
                                .requires(zItems.PLUS.get())
                                .requires(DataGenUtil.getItem("value_1"))
                                .group(MODID)
                                .unlockedBy(MODID, InventoryChangeTrigger.TriggerInstance
                                                .hasItems(zItems.PLUS.get()))
                                .save(c);
                
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