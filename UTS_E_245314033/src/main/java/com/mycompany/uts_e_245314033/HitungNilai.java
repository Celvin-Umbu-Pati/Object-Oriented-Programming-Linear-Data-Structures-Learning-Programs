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
public class HitungNilai {
   
    public static void main(String[] args) { // Metode utama yang dieksekusi saat program dijalankan
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input

        // Meminta pengguna untuk memasukkan jumlah data yang akan dihitung
        System.out.print("Masukkan jumlah data: ");
        int N = scanner.nextInt(); // Membaca jumlah data dari input pengguna

        // Inisialisasi variabel untuk menyimpan hasil perhitungan
        double jumlahKuadrat = 0; // Variabel untuk menyimpan total kuadrat data
        double jumlahAkar = 0; // Variabel untuk menyimpan total akar data
        double jumlahInvers = 0; // Variabel untuk menyimpan total 1/data

        // Mengambil input data dari pengguna
        for (int i = 0; i < N; i++) { // Loop sebanyak N kali untuk setiap data
            System.out.print("Masukkan data ke-" + (i + 1) + ": "); // Meminta pengguna memasukkan data ke-i
            double data = scanner.nextDouble(); // Membaca data yang dimasukkan oleh pengguna

            // Menghitung jumlah kuadrat
            jumlahKuadrat += Math.pow(data, 2); // Menambahkan kuadrat dari data ke total kuadrat

            // Menghitung jumlah akar
            jumlahAkar += Math.sqrt(data); // Menambahkan akar dari data ke total akar

            // Menghitung jumlah invers, jika data tidak sama dengan nol
            if (data != 0) { // Mengecek apakah data tidak nol
                jumlahInvers += 1 / data; // Menambahkan invers dari data ke total invers
            }
        }

        // Menampilkan hasil perhitungan kepada pengguna
        System.out.println("Jumlah kuadrat data: " + jumlahKuadrat); // Menampilkan total kuadrat data
        System.out.println("Jumlah akar data: " + jumlahAkar); // Menampilkan total akar data
        System.out.println("Jumlah 1/data (data != 0): " + jumlahInvers); // Menampilkan total invers dari data
    }
}

