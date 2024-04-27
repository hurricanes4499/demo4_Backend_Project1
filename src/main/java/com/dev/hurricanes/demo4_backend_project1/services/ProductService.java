package com.dev.hurricanes.demo4_backend_project1.services;

import com.dev.hurricanes.demo4_backend_project1.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getProducts();
}
