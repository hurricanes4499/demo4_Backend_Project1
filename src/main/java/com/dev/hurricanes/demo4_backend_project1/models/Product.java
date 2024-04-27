package com.dev.hurricanes.demo4_backend_project1.models;

public class Product {
    private Long id;
    private String title;
    private String Description;
    private double price;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String newImageUrl) {
        imageUrl = newImageUrl;
    }
}
