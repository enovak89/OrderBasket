package com.example.orderbasket.service;

import com.example.orderbasket.item.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Set<Integer> basket = new HashSet<>();

    @Override
    public Set<Integer> addItem(Integer id1, Integer id2, Integer id3) {
        basket.add(new Item(id1).getId());
        if (id2 != null) {
            basket.add(new Item(id2).getId());
        }
        if (id3 != null) {
            basket.add(new Item(id3).getId());
        }
        return basket;
    }

    @Override
    public Set<Integer> getItem() {
        return basket;
    }
}
