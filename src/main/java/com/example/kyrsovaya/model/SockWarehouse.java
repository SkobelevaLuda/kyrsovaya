package com.example.kyrsovaya.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SockWarehouse {
    private Sock sock;
    private int quantity;
}
