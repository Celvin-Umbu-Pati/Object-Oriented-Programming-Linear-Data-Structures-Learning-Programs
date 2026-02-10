/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;
 import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna
/**
 *
 * @author Celvin Pati
 */
public class KalkulatorMain {  // Mendefinisikan kelas KalkulatorMain
    public static void main(String[] args) { // Titik masuk program
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Masukkan bilangan pertama: "); // Meminta pengguna memasukkan bilangan pertama
        int a = scanner.nextInt(); // Membaca bilangan pertama yang dimasukkan oleh pengguna

        System.out.print("Masukkan bilangan kedua: "); // Meminta pengguna memasukkan bilangan kedua
        int b = scanner.nextInt(); // Membaca bilangan kedua yang dimasukkan oleh pengguna

        Kalkulator kalkulator = new Kalkulator(a, b); // Membuat objek Kalkulator dengan bilangan yang dimasukkan

        System.out.println("Hasil Penjumlahan: " + kalkulator.penjumlahan()); // Menampilkan hasil penjumlahan

        System.out.println("Hasil Pengurangan: " + kalkulator.pengurangan()); // Menampilkan hasil pengurangan

        System.out.println("Hasil Perkalian: " + kalkulator.perkalian()); // Menampilkan hasil perkalian

        try { // Memulai blok try untuk menangani kemungkinan pengecualian
            System.out.println("Hasil Pembagian: " + kalkulator.pembagian()); // Menampilkan hasil pembagian
        } catch (ArithmeticException e) { // Menangkap pengecualian jika terjadi
            System.out.println(e.getMessage()); // Menampilkan pesan kesalahan jika pembagian dengan nol
        }

        scanner.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    } // Akhir metode main
} // Akhir kelas KalkulatorMain

