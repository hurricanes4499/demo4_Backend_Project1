package com.dev.hurricanes.demo4_backend_project1.services;

import com.dev.hurricanes.demo4_backend_project1.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
