package com.devdyna.math.init.types;

import com.devdyna.math.Main;
import com.devdyna.math.init.Material;
import com.devdyna.math.init.builder.BaseItemCraftingRemain;
import com.devdyna.math.init.builder.NumberItem;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class zItems {
    public static void register(IEventBus bus) {
        zItem.register(bus);
        zTool.register(bus);
        zBlockItem.register(bus);
        zNumbers.register(bus);
        zOperators.register(bus);
        itemRegister();
    }

    // ---------------------------------------------------------------------------------------//
    public static final DeferredRegister.Items zTool = DeferredRegister.createItems(Main.MODID);
    public static final DeferredRegister.Items zNumbers = DeferredRegister.createItems(Main.MODID);
    public static final DeferredRegister.Items zOperators = DeferredRegister.createItems(Main.MODID);

    // DONT USE IT , ONLY FUNCTIONAL
    public static final DeferredRegister.Items zBlockItem = DeferredRegister.createItems(Main.MODID);
    public static final DeferredRegister.Items zItem = DeferredRegister.createItems(Main.MODID);
    // ---------------------------------------------------------------------------------------//

    public static DeferredItem<BaseItemCraftingRemain> PLUS = zOperators.register("plus", () -> new BaseItemCraftingRemain());

    public static void itemRegister() {

        for (int i = 0; i < 100; i++) {
            zNumbers.register("value_" + i,
                    () -> new NumberItem(Material.iProp));

        }
    }

}
