package com.siseko.ecommerce.service;

import com.siseko.ecommerce.dto.ProductPurchaseRequest;
import com.siseko.ecommerce.dto.ProductPurchaseResponse;
import com.siseko.ecommerce.dto.ProductRequest;
import com.siseko.ecommerce.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public Integer createProduct(  ProductRequest request);
    public ProductResponse findById(Integer id);
    public List<ProductResponse> findAll();
    public List<ProductPurchaseResponse> purchaseProducts(List<ProductPurchaseRequest> request);
}
