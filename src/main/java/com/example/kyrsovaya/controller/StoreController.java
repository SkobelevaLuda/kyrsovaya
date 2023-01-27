package com.example.kyrsovaya.controller;

import com.example.kyrsovaya.filter.Filter;
import com.example.kyrsovaya.model.Sock;
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
    public ResponseEntity<Integer>count(Filter filter){
        storeService.count (filter);
        return ResponseEntity.ok().build();
    }
}
