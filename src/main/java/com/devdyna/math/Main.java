package com.devdyna.math;

import com.devdyna.math.compat.core;
import com.devdyna.math.init.Material;
import com.devdyna.math.utils.LogUtil;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "math";

    public Main(IEventBus bus, ModContainer mc) {

        new LogUtil();

        Material.register(bus);
        core.registerCompat();

        // NeoForge.EVENT_BUS.register(new event());

    }
}
