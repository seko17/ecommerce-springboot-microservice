package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.OrderLineRequest;
import com.siseko.ecommerce.dto.OrderLineResponse;

import java.util.List;

public interface OrderLineService {
    public Integer saveOrderLine(OrderLineRequest request);
    public List<OrderLineResponse> findAllByOrderId(Integer orderId);
}
