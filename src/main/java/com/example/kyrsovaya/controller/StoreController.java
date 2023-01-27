package com.example.kyrsovaya.controller;

import com.example.kyrsovaya.model.SockItem;
import com.example.kyrsovaya.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/socks")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping
    public ResponseEntity<?>add(@RequestBody SockItem sockItem){
        storeService.add(sockItem);
    }
}
