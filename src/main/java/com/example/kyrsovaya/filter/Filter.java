package com.example.kyrsovaya.filter;

import com.example.kyrsovaya.model.Color;
import com.example.kyrsovaya.model.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Filter {

    private Color color;
    private Size size;
    private int cottonMin;
    private int cottonMax;
}
