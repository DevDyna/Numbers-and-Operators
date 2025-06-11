package com.devdyna.math.init.types;

import com.devdyna.math.Main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class zBlocks {
        public static void register(IEventBus bus) {
                registerLists();
                zBlock.register(bus);
                zBlockItem.register(bus);
        }

        // ---------------------------------------------------------------------------------------//
        public static final DeferredRegister.Blocks zBlock = DeferredRegister.createBlocks(Main.MODID);
        public static final DeferredRegister.Blocks zBlockItem = DeferredRegister.createBlocks(Main.MODID);
        // ---------------------------------------------------------------------------------------//

        // public static final DeferredHolder<Block, ?> BK = zBlock.register("bk",() ->
        // new BK());

        // ---------------------------------------------------------------------------------------//

        public static void registerLists() {

                // List.of(...).forEach(p -> ??);

        }

}
