/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class DeretFibonacci {
  
    public static void main(String[] args) { // Metode utama yang dijalankan saat program dieksekusi
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input

        // Meminta pengguna untuk memasukkan jumlah suku deret Fibonacci
        System.out.print("Masukkan jumlah suku Fibonacci yang ingin ditampilkan: ");
        int N = scanner.nextInt(); // Membaca jumlah suku dari input pengguna

        // Inisialisasi variabel untuk menyimpan dua suku pertama deret Fibonacci
        int a = 1; // Suku pertama
        int b = 1; // Suku kedua

        // Memastikan jumlah suku yang diminta tidak kurang dari 1
        if (N <= 0) { // Mengecek jika N kurang dari atau sama dengan nol
            System.out.println("Jumlah suku harus lebih besar dari nol."); // Menampilkan pesan kesalahan
        } else {
            // Menampilkan suku pertama dan kedua jika N lebih dari atau sama dengan 1
            System.out.print("Deret Fibonacci: "); // Menampilkan judul deret Fibonacci
            for (int i = 1; i <= N; i++) { // Loop untuk menampilkan N suku
                System.out.print(a); // Menampilkan suku saat ini
                if (i < N) { // Mengecek jika ini bukan suku terakhir
                    System.out.print(", "); // Menambahkan koma setelah suku
                }
                
                // Menghitung suku Fibonacci berikutnya
                int next = a + b; // Menghitung suku berikutnya sebagai penjumlahan dari dua suku sebelumnya
                a = b; // Memperbarui suku pertama ke suku kedua
                b = next; // Memperbarui suku kedua ke suku berikutnya
            }
            System.out.println(); // Menambahkan baris baru setelah menampilkan semua suku
        }
    }
}

