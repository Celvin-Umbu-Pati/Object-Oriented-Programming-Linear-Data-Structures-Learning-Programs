
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner; // Mengimpor Scanner untuk input pengguna

public class StokMaster {
    static String[] items = new String[50]; // Array untuk menyimpan nama item
    static int[] stock = new int[50]; // Array untuk menyimpan jumlah stok item
    static double[] price = new double[50]; // Array untuk menyimpan harga item
    static int[] quantitySold = new int[50]; // Array untuk melacak jumlah item yang terjual
    static int itemCount = 0; // Menghitung jumlah item dalam inventaris
    static double totalSales = 0; // Menyimpan total penjualan

    // Menambahkan item baru ke dalam inventaris
    public static void addItem(String itemName, int itemStock, double itemPrice) {
        if (itemCount < items.length) { // Memastikan masih ada ruang untuk item baru
            items[itemCount] = itemName; // Menyimpan nama item
            stock[itemCount] = itemStock; // Menyimpan jumlah stok
            price[itemCount] = itemPrice; // Menyimpan harga
            quantitySold[itemCount] = 0; // Menginisialisasi jumlah terjual menjadi 0
            itemCount++; // Menambah jumlah item
            System.out.println("Item berhasil ditambahkan!");
        } else {
            System.out.println("Inventaris penuh. Tidak dapat menambahkan item lagi.");
        }
    }

    // Menampilkan semua item dalam inventaris
    public static void displayItems() {
        if (itemCount == 0) { // Memeriksa apakah inventaris kosong
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("\nInventaris:");
            System.out.println("---------------------------------------------------");
            System.out.println("No.\tNama Item\tStok\tHarga (per unit)\tJumlah Terjual");
            for (int i = 0; i < itemCount; i++) { // Menampilkan semua item
                System.out.printf("%d\t%s\t\t%d\t%.2f\t\t\t%d\n", i + 1, items[i], stock[i], price[i], quantitySold[i]);
            }
            System.out.println("---------------------------------------------------");
        } 
    }

    // Mencari item berdasarkan nama
    public static void searchItem(String itemName) {
        boolean found = false; // Variabel untuk menandai apakah item ditemukan
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equalsIgnoreCase(itemName)) { // Mencari item yang sesuai
                System.out.printf("Item ditemukan: %s | Stok: %d | Harga: %.2f | Jumlah Terjual: %d\n",
                        items[i], stock[i], price[i], quantitySold[i]);
                found = true; // Menandai bahwa item ditemukan
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan dalam inventaris.");
        }
    }

    // Memperbarui stok item
    public static void updateStock(String itemName, int newStock) {
        boolean found = false; // Variabel untuk menandai apakah item ditemukan
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equalsIgnoreCase(itemName)) { // Mencari item yang sesuai
                stock[i] = newStock; // Memperbarui stok
                System.out.println("Stok berhasil diperbarui.");
                found = true; // Menandai bahwa item ditemukan
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan. Tidak dapat memperbarui stok.");
        }
    }

    // Menghapus item dari inventaris
    public static void deleteItem(String itemName) {
        boolean found = false; // Variabel untuk menandai apakah item ditemukan
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equalsIgnoreCase(itemName)) { // Mencari item yang sesuai
                // Menggeser item untuk mengisi celah
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                    stock[j] = stock[j + 1];
                    price[j] = price[j + 1];
                    quantitySold[j] = quantitySold[j + 1];
                }
                itemCount--; // Mengurangi jumlah item
                System.out.println("Item berhasil dihapus.");
                found = true; // Menandai bahwa item ditemukan
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan. Tidak dapat menghapus.");
        }
    }

    // Mencatat penjualan dan memperbarui stok
    public static void sellItem(String itemName, int quantity) {
        boolean found = false; // Variabel untuk menandai apakah item ditemukan
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equalsIgnoreCase(itemName)) { // Mencari item yang sesuai
                if (stock[i] >= quantity) { // Memeriksa apakah stok mencukupi
                    double saleAmount = quantity * price[i]; // Menghitung total penjualan
                    totalSales += saleAmount; // Menambahkan ke total penjualan
                    stock[i] -= quantity; // Mengurangi stok
                    quantitySold[i] += quantity; // Melacak jumlah yang terjual
                    System.out.printf("Terjual %d unit %s seharga %.2f\n", quantity, itemName, saleAmount);
                } else {
                    System.out.println("Stok tidak cukup untuk menyelesaikan penjualan.");
                }
                found = true; // Menandai bahwa item ditemukan
                break;
            }
        }
        if (!found) {
            System.out.println("Item tidak ditemukan. Tidak dapat menyelesaikan penjualan.");
        }
    }

    // Menampilkan total penjualan dan penjualan setiap item
    public static void displaySales() {
        System.out.println("\nRingkasan Penjualan:");
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Item\tJumlah Terjual\tTotal Penjualan");
        for (int i = 0; i < itemCount; i++) {
            double itemSales = quantitySold[i] * price[i]; // Menghitung total penjualan per item
            System.out.printf("%s\t\t%d\t\t%.2f\n", items[i], quantitySold[i], itemSales);
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("Total penjualan bulan ini: %.2f\n", totalSales); // Menampilkan total penjualan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat scanner untuk input
        int choice; // Variabel untuk menyimpan pilihan pengguna

        do {
            // Menampilkan menu
            System.out.println("\nAlgoPro Supermarket\n Manajemen Inventaris");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Item");
            System.out.println("3. Cari Item");
            System.out.println("4. Perbarui Stok");
            System.out.println("5. Hapus Item");
            System.out.println("6. Jual Item");
            System.out.println("7. Tampilkan Penjualan Bulanan");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt(); // Mengambil pilihan dari pengguna
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1: // Menambah item
                    System.out.print("Masukkan nama item: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok: ");
                    int itemStock = scanner.nextInt();
                    System.out.print("Masukkan harga item: ");
                    double itemPrice = scanner.nextDouble();
                    addItem(itemName, itemStock, itemPrice); // Menambahkan item
                    break;
                case 2: // Menampilkan semua item
                    displayItems();
                    break;
                case 3: // Mencari item
                    System.out.print("Masukkan nama item yang ingin dicari: ");
                    String searchName = scanner.nextLine();
                    searchItem(searchName); // Mencari item
                    break;
                case 4: // Memperbarui stok
                    System.out.print("Masukkan nama item untuk memperbarui stok: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Masukkan jumlah stok baru: ");
                    int newStock = scanner.nextInt();
                    updateStock(updateName, newStock); // Memperbarui stok
                    break;
                case 5: // Menghapus item
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String deleteName = scanner.nextLine();
                    deleteItem(deleteName); // Menghapus item
                    break;
                case 6: // Menjual item
                    System.out.print("Masukkan nama item yang ingin dijual: ");
                    String sellName = scanner.nextLine();
                    System.out.print("Masukkan jumlah yang ingin dijual: ");
                    int sellQuantity = scanner.nextInt();
                    sellItem(sellName, sellQuantity); // Menjual item
                    break;
                case 7: // Menampilkan penjualan
                    displaySales();
                    break;
                case 8: // Keluar dari program
                    System.out.println("Keluar dari program. Selamat tinggal!");
                    break;
                default: // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 8); // Mengulang sampai pengguna memilih untuk keluar

        scanner.close(); // Menutup scanner
    }
}

