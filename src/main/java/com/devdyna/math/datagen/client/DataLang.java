package com.devdyna.math.datagen.client;

import static com.devdyna.math.Main.MODID;

import com.devdyna.math.init.types.zItems;

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

        zItems.zOperators.getEntries().forEach(item -> {
            addItem(item, named(item.getRegisteredName()));
        });

    }

    private String named(String text) {

        StringBuilder result = new StringBuilder();
        for (String word : text.replace(MODID + ":", "").replaceAll("_", " ").split(" ")) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

}
