package com.devdyna.math.init.types;

import static com.devdyna.math.Main.MODID;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class zContainer {
            public static void register(IEventBus bus) {
                zCTNR.register(bus);
        }

        public static final DeferredRegister<MenuType<?>> zCTNR = DeferredRegister.create(Registries.MENU, MODID);

        // public static final DeferredHolder<MenuType<?>, MenuType<GUI>> GUI = zCTNR
        //                 .register("name",
        //                                 () -> IMenuTypeExtension.create(GUI::new));
}
