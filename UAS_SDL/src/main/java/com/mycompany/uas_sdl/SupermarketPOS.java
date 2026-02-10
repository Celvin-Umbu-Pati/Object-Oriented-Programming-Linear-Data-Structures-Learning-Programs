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
import java.util.Scanner;

public class SupermarketPOS {
    // Database kasir: username -> [password, fullname]
    private static Map<String, String[]> cashierDatabase = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        ReceiptPrinter printer = new ReceiptPrinter();
        
        // Inisialisasi kasir default
        cashierDatabase.put("admin", new String[]{"admin123", "Administrator"});
        
        // Menu utama
        while (true) {
            System.out.println("===== SISTEM SUPERMARKET HARAPAN BARU =====");
            System.out.println("1. Login Kasir");
            System.out.println("2. Registrasi Kasir Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();  // consume newline
            
            if (menuChoice == 1) {
                // Login kasir
                if (loginCashier(scanner, database, printer)) {
                    // Setelah transaksi selesai, kembali ke menu utama
                    continue;
                }
            } else if (menuChoice == 2) {
                // Registrasi kasir baru
                registerCashier(scanner);
            } else if (menuChoice == 3) {
                System.out.println("Terima kasih, sistem akan keluar.");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        
        scanner.close();
    }
    
    private static boolean loginCashier(Scanner scanner, Database database, ReceiptPrinter printer) {
        System.out.println("\n===== LOGIN KASIR =====");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        if (authenticateCashier(username, password)) {
            String cashierName = cashierDatabase.get(username)[1];
            System.out.println("\nLogin berhasil! Selamat datang, " + cashierName);
            
            // Lanjutkan ke transaksi
            processTransaction(scanner, database, printer, cashierName);
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }
    
    private static void registerCashier(Scanner scanner) {
        System.out.println("\n===== REGISTRASI KASIR BARU =====");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        
        if (cashierDatabase.containsKey(username)) {
            System.out.println("Username sudah terdaftar!");
            return;
        }
        
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Nama Lengkap: ");
        String fullname = scanner.nextLine();
        
        cashierDatabase.put(username, new String[]{password, fullname});
        System.out.println("Registrasi berhasil! Kasir " + fullname + " telah ditambahkan.");
    }
    
    private static boolean authenticateCashier(String username, String password) {
        if (cashierDatabase.containsKey(username)) {
            String[] credentials = cashierDatabase.get(username);
            return credentials[0].equals(password);
        }
        return false;
    }
    
    private static void processTransaction(Scanner scanner, Database database, 
                                         ReceiptPrinter printer, String cashierName) {
        // Identifikasi pelanggan
        System.out.println("\n===== IDENTIFIKASI PELANGGAN =====");
        System.out.print("Apakah pelanggan member? (Y/N): ");
        String isMember = scanner.nextLine();
        
        Customer customer = null;
        if (isMember.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan ID Member: ");
            String memberId = scanner.nextLine();
            customer = database.getCustomer(memberId);
            
            if (customer == null) {
                System.out.println("Member ID tidak ditemukan. Lanjut sebagai non-member.");
            } else {
                System.out.println("Member ditemukan: " + customer.getName() + " (" + customer.getMemberType() + ")");
            }
        }
        
        if (customer == null) {
            customer = new Customer("NM" + System.currentTimeMillis(), "Non-Member", "-", "Non-Member");
        }
        
        // Buat transaksi baru
        Transaction transaction = new Transaction(cashierName, customer);
        
        // Input pembelian
        System.out.println("\n===== INPUT PEMBELIAN =====");
        System.out.println("Daftar Produk Tersedia:");
        database.displayAllProducts();
        
        while (true) {
            System.out.print("\nMasukkan kode produk (atau SELESAI untuk selesai): ");
            String productCode = scanner.nextLine();
            
            if (productCode.equalsIgnoreCase("SELESAI")) {
                break;
            }
            
            Product product = database.getProduct(productCode);
            if (product == null) {
                System.out.println("Kode produk tidak valid!");
                continue;
            }
            
            System.out.print("Masukkan jumlah: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            if (quantity <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
                continue;
            }
            
            CartItem item = new CartItem(product, quantity);
            transaction.addItem(item);
            System.out.printf("Ditambahkan: %s x%d = Rp %,.0f\n", 
                             product.getName(), quantity, product.getPrice() * quantity);
        }
        
        // Hitung total transaksi
        transaction.calculateTotals();
        
        // Proses pembayaran
        System.out.println("\n===== PEMBAYARAN =====");
        System.out.printf("TOTAL PEMBAYARAN: Rp %,.0f\n", transaction.getTotal());
        
        double payment = 0;
        while (payment < transaction.getTotal()) {
            System.out.print("Masukkan jumlah pembayaran: Rp ");
            payment = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            
            if (payment < transaction.getTotal()) {
                System.out.println("Pembayaran kurang! Silakan masukkan lagi.");
            }
        }
        
        transaction.processPayment(payment);
        
        // Cetak struk
        printer.printReceipt(transaction);
    }
}