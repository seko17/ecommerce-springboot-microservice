package com.siseko.ecommerce.repository;

import com.siseko.ecommerce.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {

    List<OrderLine> findAllByOrderId(Integer orderId);
}
