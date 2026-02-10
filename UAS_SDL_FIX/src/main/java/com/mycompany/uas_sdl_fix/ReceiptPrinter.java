/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl_fix;

import java.text.SimpleDateFormat;

/**
 *
 * @author Celvin Pati
 */
public class ReceiptPrinter {
    
    //Informasi toko
    private static final String SUPERMARKET_NAME = "SUPERMARKET CAHAYA BARU";
    private static final String SUPERMARKET_ADDRESS = "Jl. Paingan 2, Maguwoharjo, Sleman";
    
    private static final String TAX_ID = "01.234.567.8-901.000";
    private static int transactionCount = 1; //Penghitung transaksi untuk nomor struk

    public void printReceipt(Transaction transaction) {
        //Untuk format tanggal dan waktu
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        
        //Generate nomor struk
        String receiptNum = "TRX" + new SimpleDateFormat("yyyyMMdd").format(transaction.getDate()) 
                          + String.format("%04d", transactionCount++);
        transaction.setReceiptNumber(receiptNum);
        
        //Header struk
        System.out.println("\n\n          " + SUPERMARKET_NAME + "          ");
        System.out.println("        " + SUPERMARKET_ADDRESS + "        ");
        System.out.println("================================================");
        //Informasih transaksi dasar
        System.out.println("No. Transaksi: " + receiptNum);
        System.out.println("Tanggal: " + date.format(transaction.getDate()) 
                          + "  Waktu: " + time.format(transaction.getDate()));
        System.out.println("Kasir: " + transaction.getCashier());
        System.out.println("------------------------------------------------");
        //Header detail pembelian
        System.out.println("              DETAIL PEMBELIAN                 ");
        System.out.println("------------------------------------------------");
        System.out.printf("%-25s %-3s %-10s %-10s\n", "Item", "Qty", "Harga", "Subtotal");
        System.out.println("------------------------------------------------");
        
        //Loop item belanja
        for (Transaction.CartItem item : transaction.getItems()) {
            String name = item.getProduct().getName();
            //Potong nama jika terlalu panjang
            name = name.length() > 24 ? name.substring(0, 21) + "..." : name;
            
            //Cetak detail item
            System.out.printf("%-25s %-3d %-10s %-10s\n", 
                name,
                item.getQuantity(),
                String.format("%,.0f", item.getProduct().getPrice()),
                String.format("%,.0f", item.getSubtotal()));
            
            //Mencetak diskon jika ada
            if (item.getProduct().getDiscount() > 0) {
                System.out.printf("  Diskon %2.0f%%: -Rp %,.0f\n", 
                                 item.getProduct().getDiscount(),
                                 item.getDiscountAmount());
            }
        }
        
        System.out.println("------------------------------------------------");
        //Info untuk member jika ada
        Customer c = transaction.getCustomer();
        //Menampilkan info member jika bukan non-member
        if (!c.getMemberType().equals("Non-Member")) {
            System.out.println("Member: " + c.getName() + " (" + c.getMemberType() + ")");
        }
        
        //Mencetak ringkasan pembayaran
        System.out.printf("Subtotal: Rp %,.0f\n", transaction.getSubtotal());
        System.out.printf("Diskon: -Rp %,.0f\n", transaction.getTotalDiscount());
        System.out.printf("PPN (10%%): Rp %,.0f\n", transaction.getTotal() - (transaction.getSubtotal() - transaction.getTotalDiscount()));
        System.out.println("------------------------------------------------");
        System.out.printf("TOTAL: Rp %,.0f\n", transaction.getTotal());
        System.out.printf("TUNAI: Rp %,.0f\n", transaction.getPayment());
        System.out.printf("KEMBALI: Rp %,.0f\n", transaction.getChange());
        System.out.println("================================================");
        System.out.println("Poin Member: " + String.format("%,.0f", c.getPoints()));
        System.out.println("================================================");
        System.out.println("NPWP: " + TAX_ID);
        System.out.println("\n\n");
    }
}
