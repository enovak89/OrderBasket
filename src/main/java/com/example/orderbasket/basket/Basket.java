package com.example.orderbasket.basket;

import java.util.Objects;

public class Basket {
    private int id;

    public Basket(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return id == basket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
