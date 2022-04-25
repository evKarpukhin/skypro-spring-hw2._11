package ru.skyeng.skyprospringhw2_11.sevices;

import ru.skyeng.skyprospringhw2_11.data.Order;

import java.util.List;

public interface OrderService {
    List<Order> addOrder(String ids);
    List<Order> getOrders();
}
