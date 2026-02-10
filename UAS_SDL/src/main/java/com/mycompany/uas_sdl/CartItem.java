/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
public class CartItem {
    private Product product;
    private int quantity;
    private double subtotal;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        calculateSubtotal();
    }

    private void calculateSubtotal() {
        double discountAmount = product.getPrice() * (product.getDiscount() / 100);
        this.subtotal = (product.getPrice() - discountAmount) * quantity;
    }

    // Getters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getSubtotal() { return subtotal; }
    public double getDiscountAmount() {
        return product.getPrice() * quantity * (product.getDiscount() / 100);
    }
}