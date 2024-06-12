package com.siseko.ecommerce.kafka;

import com.siseko.ecommerce.dto.CustomerResponse;
import com.siseko.ecommerce.dto.PurchaseResponse;
import com.siseko.ecommerce.model.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customerResponse,
        List<PurchaseResponse> products
) {
}
