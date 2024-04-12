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

    public Product() {
    }

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
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
        try {
      this.stock = Integer.parseInt(String.valueOf(stock));
    } catch (NumberFormatException e) {
      System.err.println("Error: Stock invalido: " + stock);
    }
    }

    
}
