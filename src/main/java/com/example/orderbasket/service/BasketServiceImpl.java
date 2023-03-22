package com.example.orderbasket.service;

import com.example.orderbasket.item.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Map<Integer, Integer> basket = new HashMap();

    @Override
    public Map<Integer, Integer> addItem(Set<Integer> id) {
        Map<Integer, Integer> newItems = id.stream()
                .map(Item::new)
                .peek(i -> {
                    if (basket.containsKey(i.getId())) {
                        i.setCount(basket.get(i.getId()) + 1);
                    } else {
                        i.setCount(1);
                    }
                })
                .collect(Collectors.toMap(Item::getId, Item::getCount));


        basket.putAll(newItems);

        return newItems;
    }

    @Override
    public Map<Integer, Integer> getItem() {
        return basket;
    }
}
