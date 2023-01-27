package com.example.kyrsovaya.model;

public enum Size {
    SIZE_36(36),
    SIZE_37(37),
    SIZE_37_5(37.5F);

    private final float size;

    Size(float size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }
}
