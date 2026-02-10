/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Product> productDatabase;
    private Map<String, Customer> customerDatabase;

    public Database() {
        productDatabase = new HashMap<>();
        customerDatabase = new HashMap<>();
        initializeDatabase();
    }

    private void initializeDatabase() {
        // Initialize product database
        productDatabase.put("P001", new Product("P001", "Beras Premium 5kg", 85000, 0, "Sembako"));
        productDatabase.put("P002", new Product("P002", "Minyak Goreng 2L", 32000, 5, "Sembako"));
        productDatabase.put("P003", new Product("P003", "Gula Pasir 1kg", 15000, 0, "Sembako"));
        productDatabase.put("P004", new Product("P004", "Telur Ayam 1kg", 28000, 0, "Fresh Food"));
        productDatabase.put("P005", new Product("P005", "Daging Sapi 1kg", 120000, 10, "Fresh Food"));
        productDatabase.put("P006", new Product("P006", "Ayam Potong 1kg", 35000, 0, "Fresh Food"));
        productDatabase.put("P007", new Product("P007", "Susu UHT 1L", 25000, 0, "Dairy"));
        productDatabase.put("P008", new Product("P008", "Keju Cheddar 200g", 45000, 0, "Dairy"));
        productDatabase.put("P009", new Product("P009", "Yogurt 150ml", 8000, 15, "Dairy"));
        productDatabase.put("P010", new Product("P010", "Shampoo 400ml", 28000, 0, "Toiletries"));
        productDatabase.put("P011", new Product("P011", "Sabun Mandi 90g", 5000, 0, "Toiletries"));
        productDatabase.put("P012", new Product("P012", "Pasta Gigi 150g", 12000, 0, "Toiletries"));
        productDatabase.put("P013", new Product("P013", "Air Mineral 600ml", 4000, 0, "Beverages"));
        productDatabase.put("P014", new Product("P014", "Jus Jeruk 1L", 22000, 0, "Beverages"));
        productDatabase.put("P015", new Product("P015", "Kopi Sachet 10x", 15000, 20, "Beverages"));
        productDatabase.put("P016", new Product("P016", "Biskuit Coklat 200g", 12000, 0, "Snack"));
        productDatabase.put("P017", new Product("P017", "Keripik Kentang 150g", 10000, 0, "Snack"));
        productDatabase.put("P018", new Product("P018", "Coklat Batang 100g", 15000, 5, "Snack"));
        productDatabase.put("P019", new Product("P019", "Detergent 1kg", 25000, 0, "Household"));
        productDatabase.put("P020", new Product("P020", "Pewangi Pakaian 800ml", 35000, 10, "Household"));
        
        // Initialize customer database
        customerDatabase.put("M001", new Customer("M001", "Budi Santoso", "081234567890", "Gold"));
        customerDatabase.put("M002", new Customer("M002", "Siti Rahayu", "081298765432", "Silver"));
        customerDatabase.put("M003", new Customer("M003", "Agus Supriyadi", "081312345678", "Regular"));
    }

    public Product getProduct(String code) {
        return productDatabase.get(code);
    }

    public Customer getCustomer(String id) {
        return customerDatabase.get(id);
    }

    public void displayAllProducts() {
        System.out.println("===================================================================");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s\n", "Kode", "Nama Produk", "Kategori", "Harga", "Diskon");
        System.out.println("===================================================================");
        
        for (Product product : productDatabase.values()) {
            System.out.printf("%-5s %-25s %-15s Rp %-7.0f %-5.0f%%\n", 
                             product.getCode(), product.getName(), product.getCategory(), 
                             product.getPrice(), product.getDiscount());
        }
    }
}