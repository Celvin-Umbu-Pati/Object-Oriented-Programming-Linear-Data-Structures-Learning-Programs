/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl_fix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Celvin Pati
 */
public class Database {
    private final List<Product> products = new ArrayList<>(); //Daftar produk
 
    public Database() { //Konstruktor inisialisasi database
        initialize();
    }

    private void initialize() {
        //Daftar produk yang di jual di supermarket cahaya baru
        addProduct(new Product("P001", "Beras Premium 5kg", 85000, 0, "Sembako"));
        addProduct(new Product("P002", "Minyak Goreng 2L", 32000, 5, "Sembako"));
        addProduct(new Product("P003", "Gula Pasir 1kg", 15000, 0, "Sembako"));
        addProduct(new Product("P004", "Telur Ayam 1kg", 28000, 0, "Fresh Food"));
        addProduct(new Product("P005", "Daging Sapi 1kg", 120000, 10, "Fresh Food"));
        addProduct(new Product("P006", "Ayam Potong 1kg", 35000, 0, "Fresh Food"));
        addProduct(new Product("P007", "Susu UHT 1L", 25000, 0, "Dairy"));
        addProduct(new Product("P008", "Keju Cheddar 200g", 45000, 0, "Dairy"));
        addProduct(new Product("P009", "Yogurt 150ml", 8000, 15, "Dairy"));
        addProduct(new Product("P010", "Shampoo 400ml", 28000, 0, "Toiletries"));
        addProduct(new Product("P011", "Sabun Mandi 90g", 5000, 0, "Toiletries"));
        addProduct(new Product("P012", "Pasta Gigi 150g", 12000, 0, "Toiletries"));
        addProduct(new Product("P013", "Air Mineral 600ml", 4000, 0, "Beverages"));
        addProduct(new Product("P014", "Jus Jeruk 1L", 22000, 0, "Beverages"));
        addProduct(new Product("P015", "Kopi Sachet 10x", 15000, 20, "Beverages"));
    }
  
    public void addProduct(Product product) { //Untuk menambahkan  jumlah produk
        products.add(product);
    }

    public Product getProduct(String code) { //Mencari produk dari kode yang dimasukkan
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        return null;
    }

    public void displayProducts() { //Menampilkan semua produk ke dalam kataalog
        System.out.println("===================================================================");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s\n", "Kode", "Nama Produk", "Kategori", "Harga", "Diskon");
        System.out.println("===================================================================");
        
        for (Product p : products) {  //Untuk data produk
            System.out.printf("%-5s %-25s %-15s Rp %-7.0f %-5.0f%%\n", 
                p.getCode(), p.getName(), p.getCategory(), p.getPrice(), p.getDiscount());
        }
    }
}