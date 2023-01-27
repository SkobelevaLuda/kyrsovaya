package com.example.kyrsovaya.model;

import java.util.Objects;

public class SockItem {
    private final Size size;
    private final Color color;
    private int cottonPart;
    private int quantity;

    public SockItem(Size size,
                    Color color,
                    int cottonPart,
                    int quantity) {
        this.size = size;
        this.color = color;
        this.cottonPart = cottonPart;
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public int getCottonPart() {
        return cottonPart;
    }

    public void setCottonPart(int cottonPart) {
        this.cottonPart = cottonPart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SockItem sockItem)) return false;
        return cottonPart == sockItem.cottonPart && size == sockItem.size && color == sockItem.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, cottonPart);
    }
}
