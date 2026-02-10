/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl_fix;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Celvin Pati
 */
public class Transaction {
  
    // Item dalam keranjang belanja
    public static class CartItem {
        private final Product product;  // Produk yang dibeli
        private int quantity;            // Jumlah produk
        private double subtotal;         // Subtotal harga (setelah diskon)

        // Membuat item baru dalam keranjang
        public CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
            calculateSubtotal();  // Hitung nilai subtotal
        }

        // Menghitung subtotal berdasarkan harga dan diskon
        private void calculateSubtotal() {
            double discountAmount = product.getPrice() * (product.getDiscount() / 100);
            this.subtotal = (product.getPrice() - discountAmount) * quantity;
        }

        // Produk terkait item ini
        public Product getProduct() { return product; }

        // Jumlah produk yang dibeli
        public int getQuantity() { return quantity; }

        // Mengubah jumlah produk dan hitung ulang subtotal
        public void setQuantity(int quantity) {
            this.quantity = quantity;
            calculateSubtotal();
        }

        // Nilai subtotal item setelah diskon
        public double getSubtotal() { return subtotal; }

        // Besaran diskon untuk item ini
        public double getDiscountAmount() {
            return product.getPrice() * quantity * (product.getDiscount() / 100);
        }
    }

    // Variabel transaksi
    private String receiptNumber;           // Nomor struk unik
    private final Date date = new Date();   // Tanggal/waktu transaksi
    private final String cashier;           // Nama kasir
    private final Customer customer;        // Data pelanggan
    private final List<CartItem> items = new ArrayList<>(); // Daftar belanjaan
    private double subtotal;                // Total sebelum diskon & pajak
    private double totalDiscount;           // Total potongan harga
    private double total;                   // Total akhir setelah pajak
    private double payment;                 // Jumlah uang pembayaran
    private double change;                  // Uang kembalian

    // Membuat transaksi baru
    public Transaction(String cashier, Customer customer) {
        this.cashier = cashier;
        this.customer = customer;
    }

    // Menambah produk ke keranjang
    public void addItem(Product product, int quantity) {
        // Cek duplikasi produk
        for (CartItem item : items) {
            if (item.getProduct().getCode().equals(product.getCode())) {
                // Tambah jumlah jika produk sudah ada
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        // Tambahkan produk baru
        items.add(new CartItem(product, quantity));
    }
    
    // Mengubah jumlah produk dalam keranjang
    public boolean updateItemQuantity(String productCode, int newQuantity) {
        for (CartItem item : items) {
            if (item.getProduct().getCode().equals(productCode)) {
                if (newQuantity <= 0) {
                    // Hapus item jika jumlah <= 0
                    items.remove(item);
                } else {
                    // Perbarui jumlah item
                    item.setQuantity(newQuantity);
                }
                return true;
            }
        }
        return false;  // Produk tidak ditemukan
    }

    // Menghapus produk dari keranjang
    public boolean removeItem(String productCode) {
        // Hapus berdasarkan kode produk
        return items.removeIf(item -> item.getProduct().getCode().equals(productCode));
    }

    // Menghitung total transaksi
    public void calculateTotals() {
        subtotal = 0;
        totalDiscount = 0;
        
        // Hitung nilai dasar dan diskon
        for (CartItem item : items) {
            subtotal += item.getProduct().getPrice() * item.getQuantity();
            totalDiscount += item.getDiscountAmount();
        }
        
        // Hitung diskon member
        double memberDiscount = switch (customer.getMemberType()) {
            case "Gold" -> subtotal * 0.15;     // Diskon 15%
            case "Silver" -> subtotal * 0.10;   // Diskon 10%
            case "Regular" -> subtotal * 0.05;  // Diskon 5%
            default -> 0;                       // Tanpa diskon
        };
        
        // Akumulasi total diskon
        totalDiscount += memberDiscount;
        
        // Hitung pajak 10%
        double taxableAmount = subtotal - totalDiscount;
        total = taxableAmount * 1.1;
        
        // Tambah poin reward pelanggan
        customer.addPoints(total / 10000);
    }

    // Memproses pembayaran pelanggan
    public void processPayment(double paymentAmount) {
        this.payment = paymentAmount;
        this.change = paymentAmount - total;  // Hitung kembalian
    }

    // === Metode Akses Data ===
    
    // Nomor struk transaksi
    public String getReceiptNumber() { return receiptNumber; }
    
    // Waktu transaksi
    public Date getDate() { return date; }
    
    // Nama kasir
    public String getCashier() { return cashier; }
    
    // Data pelanggan
    public Customer getCustomer() { return customer; }
    
    // Daftar item yang dibeli
    public List<CartItem> getItems() { return items; }
    
    // Total sebelum diskon dan pajak
    public double getSubtotal() { return subtotal; }
    
    // Total potongan harga
    public double getTotalDiscount() { return totalDiscount; }
    
    // Total akhir yang harus dibayar
    public double getTotal() { return total; }
    
    // Jumlah uang yang dibayarkan
    public double getPayment() { return payment; }
    
    // Uang kembalian
    public double getChange() { return change; }
    
    // Mengatur nomor struk
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
} 