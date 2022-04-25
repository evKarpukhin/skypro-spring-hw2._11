package ru.skyeng.skyprospringhw2_11.data;

import java.util.Objects;


public class Order {
    private final String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Заказ {" +
                "ID = " + id +
                '}';
    }
}
