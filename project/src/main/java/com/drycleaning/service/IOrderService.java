package com.drycleaning.service;
import java.util.List;

import com.drycleaning.bean.Order;

public interface IOrderService {

	Order addOrder(Order order);

	Order removeOrder(long id);

	Order updateOrder(Order order);

	Order getOrderDetails(long id);

	List<Order> getAllOrders();

}
