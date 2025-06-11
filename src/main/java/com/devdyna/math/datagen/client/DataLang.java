package com.devdyna.math.datagen.client;

import static com.devdyna.math.Main.MODID;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class DataLang extends LanguageProvider {

    public DataLang(PackOutput o) {
        super(o, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(MODID + ".tab", "Numbers and Operators");

        for (int i = 0; i < 100; i++) {
            add("item." + MODID + ".value_" + i, "Rune " + i);
        }

    }

}
