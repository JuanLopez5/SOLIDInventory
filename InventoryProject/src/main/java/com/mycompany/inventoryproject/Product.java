/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproject;

/**
 *
 * @author lopez
 */
public class Product {
    private String productName;
    private double price;
    private int stock;
    private int prueba;

    public Product() {
    }

    public Product(String productName, double price, int stock, int prueba) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.prueba = prueba;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
