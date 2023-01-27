package com.example.kyrsovaya.model;

import org.springframework.lang.Nullable;

public enum Color {
    RED,
    GREEN,
    GREY,
    BLACK,
    WHITE;

    @Nullable
    public static Color parse(String color) {
        for (Color c : values()) {
            if (c.name().equals(color)) {
                return c;
            }
        }
        return null;
    }
}
