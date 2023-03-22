package com.example.orderbasket.service;

import com.example.orderbasket.item.Item;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BasketService {

    Map<Integer, Integer> addItem(Set<Integer> id);

    Map<Integer, Integer> getItem();
}
