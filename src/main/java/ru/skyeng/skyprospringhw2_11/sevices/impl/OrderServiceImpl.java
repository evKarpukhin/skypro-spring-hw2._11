package ru.skyeng.skyprospringhw2_11.sevices.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import ru.skyeng.skyprospringhw2_11.data.Order;
import ru.skyeng.skyprospringhw2_11.exceptions.BadEmployeeException;
import ru.skyeng.skyprospringhw2_11.sevices.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {
    private final List<Order> alOrders = new ArrayList<>();

    @Override
    public List<Order> addOrder(String ids) {
        List<Order> al = new ArrayList<>();
        String[] strArray = ids.split(",");
        for (String str : strArray) {
            if (StringUtils.isEmpty(str)) throw new BadEmployeeException();
             else if (!StringUtils.isNumeric(str)) throw new IllegalArgumentException("Id " + str + " не число");

            al.add(new Order(str));
        }
        alOrders.addAll(al);
        return al;
    }

    @Override
    public List<Order> getOrders() {
        return alOrders;
    }
}
