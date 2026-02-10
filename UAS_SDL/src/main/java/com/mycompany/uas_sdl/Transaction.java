/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
    private String receiptNumber;
    private Date date;
    private String cashier;
    private Customer customer;
    private List<CartItem> items;
    private double subtotal;
    private double totalDiscount;
    private double tax;
    private double total;
    private double payment;
    private double change;

    public Transaction(String cashier, Customer customer) {
        this.cashier = cashier;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.date = new Date();
        this.tax = 0.1; // PPN 10%
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void calculateTotals() {
        subtotal = 0;
        totalDiscount = 0;
        
        for (CartItem item : items) {
            subtotal += item.getProduct().getPrice() * item.getQuantity();
            totalDiscount += item.getDiscountAmount();
        }
        
        double memberDiscount = 0;
        if (customer.getMemberType().equals("Gold")) {
            memberDiscount = subtotal * 0.15;
        } else if (customer.getMemberType().equals("Silver")) {
            memberDiscount = subtotal * 0.10;
        } else if (customer.getMemberType().equals("Regular")) {
            memberDiscount = subtotal * 0.05;
        }
        
        totalDiscount += memberDiscount;
        
        double taxableAmount = subtotal - totalDiscount;
        double taxAmount = taxableAmount * tax;
        
        total = taxableAmount + taxAmount;
        
        double pointsEarned = total / 10000;
        customer.addPoints(pointsEarned);
    }

    public void processPayment(double paymentAmount) {
        this.payment = paymentAmount;
        this.change = paymentAmount - total;
    }

    // Getters
    public String getReceiptNumber() { return receiptNumber; }
    public Date getDate() { return date; }
    public String getCashier() { return cashier; }
    public Customer getCustomer() { return customer; }
    public List<CartItem> getItems() { return items; }
    public double getSubtotal() { return subtotal; }
    public double getTotalDiscount() { return totalDiscount; }
    public double getTax() { return tax; }
    public double getTotal() { return total; }
    public double getPayment() { return payment; }
    public double getChange() { return change; }
    
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
}