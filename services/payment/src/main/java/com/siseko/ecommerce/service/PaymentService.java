package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.PaymentRequest;

public interface PaymentService {

    public Integer createPayment(PaymentRequest request);
}
