package com.siseko.ecommerce.repository;

import com.siseko.ecommerce.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository  extends MongoRepository<Customer,String> {
}
