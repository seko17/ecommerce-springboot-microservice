package com.siseko.ecommerce.mapper;

import com.siseko.ecommerce.dto.OrderLineRequest;
import com.siseko.ecommerce.dto.OrderLineResponse;
import com.siseko.ecommerce.model.Order;
import com.siseko.ecommerce.model.OrderLine;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}