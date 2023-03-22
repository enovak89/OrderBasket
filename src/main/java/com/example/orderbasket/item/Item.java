package com.example.orderbasket.item;

import java.util.Objects;

public class Item {
    private Integer id;
    private Integer count;

    public Item(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(count, item.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count);
    }


}
