package com.example.kyrsovaya.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class  Sock{
    private final Size size;
    private final Color color;
    private final int cottonPart;


    public Sock(Size size, Color color, int cottonPart) {
        this.size = size;
        this.color = color;
        this.cottonPart = cottonPart;
    }


}
