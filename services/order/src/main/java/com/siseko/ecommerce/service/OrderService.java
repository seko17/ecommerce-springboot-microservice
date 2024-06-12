package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.OrderRequest;
import com.siseko.ecommerce.dto.OrderResponse;

import java.util.List;

public interface OrderService {

    public Integer createOrder(OrderRequest request);
    public List<OrderResponse> findAllOrders();
    public OrderResponse findById(Integer id);
}
