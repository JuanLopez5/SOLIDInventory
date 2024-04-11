package com.mycompany.inventoryproject;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> product;

    public Inventory() {
        product = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }

    public void updateProduct(String name, double price, int Stock) {
        for (Product product : product) {
            if (product.getProductName().equals(name)) {
                product.setPrice(price);
                product.setStock(Stock);
                return;
            }
        }
        
    }

    public void deleteProduct(String name) {
        for (Product product : product) {
            if (product.getProductName().equals(name)) {
                this.product.remove(product);
                return;
            }
        }
        
    }

    public Product searchProduct(String name) {
        for (Product product  : product) {
            if (product.getProductName().equals(name)) {
                return product;
            }
        }
        return null; 
    }

    public List<Product> getAllProducts() {
        return product;
    }
}
