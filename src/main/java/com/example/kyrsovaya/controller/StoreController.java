package com.example.kyrsovaya.controller;

import com.example.kyrsovaya.model.SockWarehouse;
import com.example.kyrsovaya.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/socks")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping
    public ResponseEntity<?>add(@RequestBody SockWarehouse sockWarehouse){
        storeService.add(sockWarehouse);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?>expenditure(@RequestBody SockWarehouse sockWarehouse){
        storeService.expenditure (sockWarehouse);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Integer>count(@RequestParam String color,
                                        @RequestParam float size,
                                        @RequestParam int cottonMin,
                                        @RequestParam int cottonMax){
        storeService.count (color,size, cottonMin,cottonMax);
        return ResponseEntity.ok().build();
    }
}
