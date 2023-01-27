package com.example.kyrsovaya.service;

import com.example.kyrsovaya.model.SockItem;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.HashSet;

@Service
public class StoreService {
    private final Collection<SockItem> sockItems = new HashSet<>();
    public void add(SockItem sockItem){
    }


}
