/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
public class Product {
    private String code;
    private String name;
    private double price;
    private double discount;
    private String category;

    public Product(String code, String name, double price, double discount, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    // Getters
    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }
    public String getCategory() { return category; }
}