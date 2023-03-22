package com.example.orderbasket.controller;

import com.example.orderbasket.service.BasketService;
import com.example.orderbasket.item.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Set<Integer> addItemInBasket(@RequestParam Integer id1,
                                     @RequestParam(required = false) Integer id2,
                                     @RequestParam(required = false) Integer id3) {
        return basketService.addItem(id1, id2, id3);
    }

    @GetMapping("/get")
    public Set<Integer> getItemInBasket() {
        return basketService.getItem();
    }
}
