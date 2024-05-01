package com.dev.hurricanes.demo4_backend_project1.controllers;

import com.dev.hurricanes.demo4_backend_project1.Dtos.CreateProductRequestDto;
import com.dev.hurricanes.demo4_backend_project1.models.Product;
import com.dev.hurricanes.demo4_backend_project1.services.FakeStoreProductService;
//import com.dev.hurricanes.demo4_backend_project1.services.OwnDatabaseProductService;
import com.dev.hurricanes.demo4_backend_project1.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    //private Map<Integer, Integer> map = new TreeMap<>();

    //private List<Integer> li = new ArrayList<>();

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //private ProductService productService1 = new FakeStoreProductService();

    //private ProductService productService2 = new OwnDatabaseProductService();
    // POST / products
    // RequestBody
    // {
    //      titile:
    //      description:
    //      price:
    // }
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto requestCreateProductDto) {
        return productService.createProduct(
                requestCreateProductDto.getTitle(),
                requestCreateProductDto.getDescription(),
                requestCreateProductDto.getCategory(),
                requestCreateProductDto.getPrice(),
                requestCreateProductDto.getImage()
        );
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public void getAllProduct() {

    }

    public void updateProduct() {

    }
}
