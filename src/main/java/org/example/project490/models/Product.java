package org.example.project490.models;

public class Product {
    private String productName;
    private int quantity;
    private String description;


    public Product() {
        this.productName = "Empty";
        this.quantity = 0;
        this.description = "Empty";
    }

    public Product(String productName, int quantity, String description) {
        this.productName = productName;
        this.quantity = quantity;
        this.description = description;
    }
}
