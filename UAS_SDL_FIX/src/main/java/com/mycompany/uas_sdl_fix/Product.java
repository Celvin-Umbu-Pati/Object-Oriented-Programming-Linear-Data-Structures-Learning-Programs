/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl_fix;
/**
 *
 * @author Celvin Pati
 */
public class Product {
    private String code;        //Kode produk
    private String name;        //Nama produk
    private double price;       //Harga produk
    private double discount;    //Diskon produk 
    private String category;    //Kategori produk
    
    public Product(String code, String name, double price, double discount, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    //Untuk mendapatkan kode produk
    public String getCode() { return code; }

    //Untuk mendapatkan nama produk
    public String getName() { return name; }

    //Untuk mendapatkan harga
    public double getPrice() { return price; }

    //Untuk mendapatkan diskon
    public double getDiscount() { return discount; }

    //Untuk mendapatkan kategori produk
    public String getCategory() { return category; }
}