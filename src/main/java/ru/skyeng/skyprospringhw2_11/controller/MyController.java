package ru.skyeng.skyprospringhw2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skyeng.skyprospringhw2_11.data.Order;
import ru.skyeng.skyprospringhw2_11.sevices.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class MyController {
    private final OrderService orderService;

    public MyController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Добавляет список Заказов
    @GetMapping("/add")
    public List<Order> add(@RequestParam(value = "id") String ids) {
        List<Order> result;
        result = orderService.addOrder(ids);
        return result;
    }

    // Возвращать List заказов.
    @GetMapping("/get")
    public List<Order> getAllOrders() {
        List<Order> result;
        result = orderService.getOrders();
        return result;
    }


}
