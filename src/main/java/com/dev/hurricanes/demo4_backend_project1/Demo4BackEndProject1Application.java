package com.dev.hurricanes.demo4_backend_project1;

import com.dev.hurricanes.demo4_backend_project1.controllers.ProductController;
import com.dev.hurricanes.demo4_backend_project1.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4BackEndProject1Application implements CommandLineRunner {

    private ProductController productController;
    private ProductService productService;

    public Demo4BackEndProject1Application(ProductController productController, ProductService productService) {
        this.productController = productController;
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        LoginService loginService = new LoginService();
        loginService.doSomething();
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo4BackEndProject1Application.class, args);
    }
}
