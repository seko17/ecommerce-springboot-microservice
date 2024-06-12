package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.PaymentRequest;
import com.siseko.ecommerce.mapper.PaymentMapper;
import com.siseko.ecommerce.notification.NotificationProducer;
import com.siseko.ecommerce.notification.PaymentNotificationRequest;
import com.siseko.ecommerce.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {


    private final PaymentRepository repository;
    private final PaymentMapper mapper;
    private final NotificationProducer notificationProducer;


    @Override
    public Integer createPayment(PaymentRequest request) {
        var payment = this.repository.save(this.mapper.toPayment(request));

        this.notificationProducer.sendNotification(
                new PaymentNotificationRequest(
                        request.orderReference(),
                        request.amount(),
                        request.paymentMethod(),
                        request.customer().firstname(),
                        request.customer().lastname(),
                        request.customer().email()
                )
        );
        return payment.getId();
    }
}
