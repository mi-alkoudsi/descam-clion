package com.DeSCAM.Check;

import com.intellij.ide.util.PropertiesComponent;

public class Settings {
    private static final PropertiesComponent INSTANCE = PropertiesComponent.getInstance();

    public static void set(String key, String value) {
        INSTANCE.setValue(key, value);
    }

    public static String get(String key) {
        return INSTANCE.getValue(key);
    }
}