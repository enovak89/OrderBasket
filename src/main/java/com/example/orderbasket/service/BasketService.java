package com.example.orderbasket.service;

import com.example.orderbasket.item.Item;

import java.util.List;
import java.util.Set;

public interface BasketService {

    Set<Integer> addItem(Integer id1, Integer id2, Integer id3);

    Set<Integer> getItem();
}
