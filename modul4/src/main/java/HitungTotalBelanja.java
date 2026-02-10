/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner;

public class HitungTotalBelanja {
   public static void main(String[] args) {
    // Membuat objek Scanner untuk menerima input dari pengguna
    Scanner keyboard = new Scanner(System.in);

    // Meminta pengguna memasukkan total belanja
    System.out.print("Masukkan total belanja Anda (dalam Rp): ");
    double belanja = keyboard.nextDouble();
    // Memanggil metode hitungTotal() untuk menghitung total yang harus dibayar
    double totalBayar = hitungTotal(belanja);
    // Menampilkan hasil total yang harus dibayarkan
    System.out.printf("Uang yang harus dibayarkan: Rp " + totalBayar);
}

public static double hitungTotal(double belanja) {
    double total;
    // Memeriksa apakah total belanja lebih dari Rp 100.000
    if (belanja > 100000) {
        // Menghitung diskon 10% dari total belanja
        double diskon = 0.10 * belanja;
        // Menghitung total setelah diskon
        total = belanja - diskon;
    } else {
        // Jika total belanja tidak lebih dari Rp 100.000, tidak ada diskon
        total = belanja;
    }
    // Mengembalikan total yang harus dibayarkan
    return total;
}//akhir metode utama
}//akhir class  
    