package com.example.orderbasket.controller;

import com.example.orderbasket.service.BasketService;
import com.example.orderbasket.item.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Map<Integer, Integer> addItemInBasket(@RequestParam Set<Integer> id) {
        return basketService.addItem(id);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getItemInBasket() {
        return basketService.getItem();
    }
}
