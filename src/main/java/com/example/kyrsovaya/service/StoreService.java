package com.example.kyrsovaya.service;

import com.example.kyrsovaya.exeption.IncorrectParameter;
import com.example.kyrsovaya.filter.Filter;
import com.example.kyrsovaya.model.Sock;
import com.example.kyrsovaya.model.SockWarehouse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoreService {
    private final Map<Sock, Integer> socks = new HashMap<>();

    public void add(SockWarehouse sockWarehouse) {
        if (isNotValid(sockWarehouse)) {
            throw new IncorrectParameter();
        }
        Sock sock = sockWarehouse.getSock();
        if (socks.containsKey(sock)) {
            socks.replace(sock, socks.get(sock) + sockWarehouse.getQuantity());
        } else {
            socks.put(sock, sockWarehouse.getQuantity());
        }
    }

    public void expenditure(SockWarehouse sockWarehouse) {
        Sock sock = sockWarehouse.getSock();
        if (!socks.containsKey(sock) || isNotValid(sockWarehouse)) {
            throw new IncorrectParameter();
        }
        int available = socks.get(sock);
        int result = available - sockWarehouse.getQuantity();
        if (result <= 0) {
            throw new IncorrectParameter();
        }
        socks.replace(sock, result);
    }

    private boolean isNotValid(SockWarehouse sockWarehouse) {
        Sock sock = sockWarehouse.getSock();
        return sock.getCottonPart() <= 0 || sock.getCottonPart() > 100 ||
                sockWarehouse.getQuantity() <= 0;
    }

    public void count(Filter filter){


    }


}
