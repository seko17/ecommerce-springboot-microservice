package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.CustomerRequest;
import com.siseko.ecommerce.dto.CustomerResponse;

import java.util.List;

public interface ICustomerService {

    String createCustomer(CustomerRequest request);
    void updateCustomer(CustomerRequest request);
    public List<CustomerResponse> findAllCustomers();
    public CustomerResponse findById(String id);
    public boolean existsById(String id);
    public void deleteCustomer(String id);
}
