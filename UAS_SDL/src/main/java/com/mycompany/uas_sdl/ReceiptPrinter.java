/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceiptPrinter {
    private static final String SUPERMARKET_NAME = "SUPERMARKET HARAPAN BARU";
    private static final String SUPERMARKET_ADDRESS = "Jl. Sudirman No. 123, Jakarta Pusat";
    private static final String SUPERMARKET_PHONE = "021-55667788";
    private static final String SUPERMARKET_EMAIL = "info@harapanbaru.co.id";
    private static final String TAX_ID = "01.234.567.8-901.000";
    
    private static int transactionCount = 1;
    
    public void printReceipt(Transaction transaction) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        String receiptNumber = "TRX" + new SimpleDateFormat("yyyyMMdd").format(new Date()) + 
                              String.format("%04d", transactionCount++);
        transaction.setReceiptNumber(receiptNumber);
        
        System.out.println("\n\n");
        System.out.println("          " + SUPERMARKET_NAME + "          ");
        System.out.println("        " + SUPERMARKET_ADDRESS + "        ");
        System.out.println("        Telp: " + SUPERMARKET_PHONE + "        ");
        System.out.println("        Email: " + SUPERMARKET_EMAIL + "        ");
        System.out.println("================================================");
        System.out.println("No. Transaksi: " + receiptNumber);
        System.out.println("Tanggal: " + dateFormat.format(transaction.getDate()) + 
                          "  Waktu: " + timeFormat.format(transaction.getDate()));
        System.out.println("Kasir: " + transaction.getCashier());
        System.out.println("------------------------------------------------");
        System.out.println("              DETAIL PEMBELIAN                 ");
        System.out.println("------------------------------------------------");
        System.out.printf("%-25s %-3s %-10s %-10s\n", "Item", "Qty", "Harga", "Subtotal");
        System.out.println("------------------------------------------------");
        
        for (CartItem item : transaction.getItems()) {
            String productName = item.getProduct().getName();
            if (productName.length() > 24) {
                productName = productName.substring(0, 21) + "...";
            }
            
            System.out.printf("%-25s %-3d %-10s %-10s\n", 
                productName,
                item.getQuantity(),
                String.format("%,.0f", item.getProduct().getPrice()),
                String.format("%,.0f", item.getSubtotal()));
            
            if (item.getProduct().getDiscount() > 0) {
                System.out.printf("  Diskon %2.0f%%: -Rp %,.0f\n", 
                                 item.getProduct().getDiscount(),
                                 item.getDiscountAmount());
            }
        }
        
        System.out.println("------------------------------------------------");
        
        Customer customer = transaction.getCustomer();
        if (!customer.getMemberType().equals("Non-Member")) {
            System.out.println("Member: " + customer.getName() + " (" + customer.getMemberType() + ")");
        }
        
        double memberDiscount = 0;
        if (customer.getMemberType().equals("Gold")) {
            memberDiscount = transaction.getSubtotal() * 0.15;
        } else if (customer.getMemberType().equals("Silver")) {
            memberDiscount = transaction.getSubtotal() * 0.10;
        } else if (customer.getMemberType().equals("Regular")) {
            memberDiscount = transaction.getSubtotal() * 0.05;
        }
        
        System.out.printf("Subtotal: Rp %,.0f\n", transaction.getSubtotal());
        
        double productDiscount = transaction.getTotalDiscount() - memberDiscount;
        if (productDiscount > 0) {
            System.out.printf("Diskon Produk: -Rp %,.0f\n", productDiscount);
        }
        
        if (memberDiscount > 0) {
            System.out.printf("Diskon Member: -Rp %,.0f\n", memberDiscount);
        }
        
        double taxAmount = transaction.getTotal() - (transaction.getSubtotal() - transaction.getTotalDiscount());
        System.out.printf("PPN (10%%): Rp %,.0f\n", taxAmount);
        System.out.println("------------------------------------------------");
        System.out.printf("TOTAL: Rp %,.0f\n", transaction.getTotal());
        System.out.printf("TUNAI: Rp %,.0f\n", transaction.getPayment());
        System.out.printf("KEMBALI: Rp %,.0f\n", transaction.getChange());
        System.out.println("================================================");
        System.out.println("Poin Member: " + String.format("%,.0f", customer.getPoints()) + 
                          " (+" + String.format("%,.0f", transaction.getTotal() / 10000) + " poin)");
        System.out.println("================================================");
        System.out.println("Terima kasih telah berbelanja di " + SUPERMARKET_NAME);
        System.out.println("Barang yang sudah dibeli tidak dapat ditukar/dikembalikan");
        System.out.println("================================================");
        System.out.println("NPWP: " + TAX_ID);
        System.out.println("Sistem: Supermarket POS v3.0");
        System.out.println("\n\n");
    }
}