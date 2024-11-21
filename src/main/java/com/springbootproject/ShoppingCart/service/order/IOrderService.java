package com.springbootproject.ShoppingCart.service.order;

import com.springbootproject.ShoppingCart.dto.OrderDto;
import com.springbootproject.ShoppingCart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}