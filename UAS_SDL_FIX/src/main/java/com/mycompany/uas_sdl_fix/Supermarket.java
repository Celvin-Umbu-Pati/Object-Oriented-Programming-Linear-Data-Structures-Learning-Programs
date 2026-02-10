/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl_fix;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Supermarket {
   
    // Tempat nyimpen data kasir (username, password, nama lengkap)
    private static class Cashier {
        String username; // Nama login kasir
        String password; // Password buat masuk
        String fullname; // Nama asli kasir
        
        // Buat akun kasir baru
        Cashier(String username, String password, String fullname) {
            this.username = username;
            this.password = password;
            this.fullname = fullname;
        }
    }
    
    // Daftar semua kasir yang terdaftar
    private static final List<Cashier> cashiers = new ArrayList<>();
 
    // Program utama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database db = new Database();         // Tempat nyimpen data produk
        ReceiptPrinter printer = new ReceiptPrinter();  // Mesin cetak struk
        
        // Kasir default biar bisa langsung login
        cashiers.add(new Cashier("admin", "admin123", "Administrator"));
        
        // Program jalan terus sampe dipilih keluar
        while (true) {
            // Menu utama
            System.out.println("\n===== SISTEM SUPERMARKET HARAPAN BARU =====");
            System.out.println("1. Login Kasir\n2. Daftar Kasir Baru\n3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Bersihkan sisa input
            
            if (choice == 1) {
                login(sc, db, printer);     // Masuk ke akun kasir
            } else if (choice == 2) {
                registerCashier(sc);        // Bikin akun kasir baru
            } else if (choice == 3) {
                break;                      // Tutup program
            } else {
                System.out.println("Pilihan ga valid!");
            }
        }
        sc.close();  // Tutup scanner biar hemat memory
    }
 
    // Proses login kasir
    private static void login(Scanner sc, Database db, ReceiptPrinter printer) {
        System.out.print("\nUsername: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        
        // Cari kasir yang cocok
        Cashier loggedIn = null;
        for (Cashier c : cashiers) {
            if (c.username.equals(user) && c.password.equals(pass)) {
                loggedIn = c;
                break;
            }
        }
        
        // Kalau ga ketemu
        if (loggedIn == null) {
            System.out.println("Login gagal! Coba lagi");
            return;
        }
        
        // Kalau berhasil, mulai transaksi
        System.out.println("\nLogin berhasil! Hai, " + loggedIn.fullname);
        processTransaction(sc, db, printer, loggedIn.fullname);
    }
    
    // Bikin akun kasir baru
    private static void registerCashier(Scanner sc) {
        System.out.print("\nUsername baru: ");
        String user = sc.nextLine();
        
        // Cek dulu username udah dipake belum
        for (Cashier c : cashiers) {
            if (c.username.equals(user)) {
                System.out.println("Username udah dipake orang!");
                return;
            }
        }
        
        // Kalau belum, minta data lengkap
        System.out.print("Password baru: ");
        String pass = sc.nextLine();
        System.out.print("Nama lengkap: ");
        String name = sc.nextLine();
        
        // Tambahkan ke sistem
        cashiers.add(new Cashier(user, pass, name));
        System.out.println("Daftar berhasil! Kasir baru ditambahkan");
    }

    // Proses belanja pelanggan
    private static void processTransaction(
        Scanner sc, Database db, ReceiptPrinter printer, String cashier) 
    {
        // Tanya data pelanggan
        System.out.print("\nNama Pelanggan: ");
        String customerName = sc.nextLine();
        System.out.print("Tipe Member (Gold/Silver/Regular/Biasa): ");
        String memberType = sc.nextLine();
        
        // Siapin transaksi baru
        Customer customer = new Customer(customerName, memberType);
        Transaction t = new Transaction(cashier, customer);
        
        // Menu ngelola keranjang belanja
        while (true) {
            System.out.println("\n===== KERANJANG BELANJA =====");
            db.displayProducts();  // Tampilin semua produk
            
            // Pilihan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Ubah Jumlah Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Selesai Belanja");
            System.out.print("Pilih: ");
            int menuChoice = sc.nextInt();
            sc.nextLine();  // Bersihkan sisa input
            
            if (menuChoice == 1) {
                // Tambah barang baru
                System.out.print("\nKode produk: ");
                String code = sc.nextLine();
                Product p = db.getProduct(code);
                if (p == null) {
                    System.out.println("Kode ga ketemu!");
                    continue;
                }
                System.out.print("Jumlah: ");
                int qty = sc.nextInt();
                sc.nextLine();
                if (qty < 1) {
                    System.out.println("Jumlah minimal 1 lah!");
                    continue;
                }
                t.addItem(p, qty);  // Masukin ke keranjang
                System.out.printf("Ditambahin: %s x%d\n", p.getName(), qty);
                
            } else if (menuChoice == 2) {
                // Ubah jumlah barang
                System.out.print("\nKode produk: ");
                String code = sc.nextLine();
                System.out.print("Jumlah baru: ");
                int newQty = sc.nextInt();
                sc.nextLine();
                if (newQty < 1) {
                    System.out.println("Jumlah minimal 1 dong!");
                    continue;
                }
                // Coba update jumlah
                if (t.updateItemQuantity(code, newQty)) {
                    System.out.println("Jumlah berhasil diubah.");
                } else {
                    System.out.println("Produk ga ada di keranjang.");
                }
                
            } else if (menuChoice == 3) {
                // Hapus barang
                System.out.print("\nKode produk: ");
                String code = sc.nextLine();
                
                // Cari dulu barangnya
                Transaction.CartItem itemToRemove = null;
                for (Transaction.CartItem item : t.getItems()) {
                    if (item.getProduct().getCode().equals(code)) {
                        itemToRemove = item;
                        break;
                    }
                }
                
                if (itemToRemove != null) {
                    // Kasih info barang yang mau dihapus
                    System.out.println("Barang: " + itemToRemove.getProduct().getName());
                    System.out.println("Jumlah sekarang: " + itemToRemove.getQuantity());
                    
                    // Tanya mau hapus seluruhnya atau sebagian
                    System.out.println("\nPilihan:");
                    System.out.println("1. Hapus semua");
                    System.out.println("2. Hapus sebagian");
                    System.out.print("Pilih: ");
                    int removeOption = sc.nextInt();
                    sc.nextLine();
                    
                    if (removeOption == 1) {
                        // Hapus semua
                        if (t.removeItem(code)) {
                            System.out.println("Barang dihapus semua.");
                        }
                    } else if (removeOption == 2) {
                        // Hapus sebagian
                        System.out.print("Mau hapus berapa: ");
                        int removeQty = sc.nextInt();
                        sc.nextLine();
                        
                        if (removeQty <= 0) {
                            System.out.println("Minimal 1 lah!");
                        } else if (removeQty >= itemToRemove.getQuantity()) {
                            // Kalau minta hapus lebih banyak, hapus semua
                            if (t.removeItem(code)) {
                                System.out.println("Barang dihapus semua.");
                            }
                        } else {
                            // Kurangi jumlah
                            int newQty = itemToRemove.getQuantity() - removeQty;
                            t.updateItemQuantity(code, newQty);
                            System.out.printf("Berhasil hapus %d. Sisa: %d\n",
                                              removeQty, newQty);
                        }
                    } else {
                        System.out.println("Pilihan ga jelas!");
                    }
                } else {
                    System.out.println("Barang ga ketemu di keranjang.");
                }
            } else if (menuChoice == 4) {
                // Udahan belanja
                break;
            } else {
                System.out.println("Pilihan ga ngerti!");
            }
        }
        
        // Hitung total belanja
        t.calculateTotals();
        System.out.printf("\nTOTAL BAYAR: Rp %,.0f\n", t.getTotal());
        
        // Minta uang pembayaran
        double payment;
        do {
            System.out.print("Uang bayar: Rp ");
            payment = sc.nextDouble();
            sc.nextLine();
            if (payment < t.getTotal()) {
                System.out.println("Kurang nih! Coba lagi.");
            }
        } while (payment < t.getTotal());
        
        // Proses pembayaran
        t.processPayment(payment);
        // Cetak struk
        printer.printReceipt(t);
    }
}