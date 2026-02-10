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
public class TahananResistor {

    public static void main(String[] args) { // Metode utama yang dijalankan saat program dieksekusi
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari sistem

        // Menanyakan jumlah tahanan yang ingin dihitung
        System.out.print("Masukkan jumlah tahanan: "); 
        int N = scanner.nextInt(); // Membaca jumlah tahanan dari input pengguna

        // Menanyakan jenis susunan tahanan (seri atau paralel)
        System.out.print("Apakah tahanan disusun (1) Seri atau (2) Paralel? (masukkan 1 atau 2): ");
        int susunan = scanner.nextInt(); // Membaca pilihan susunan tahanan dari pengguna

        // Menginisialisasi array untuk menyimpan nilai tahanan
        double[] tahanan = new double[N]; 

        // Mengambil input nilai tahanan dari pengguna
        for (int i = 0; i < N; i++) { // Loop untuk mengulangi sebanyak jumlah tahanan
            System.out.print("Masukkan tahanan r" + (i + 1) + ": "); // Meminta pengguna memasukkan tahanan tertentu
            tahanan[i] = scanner.nextDouble(); // Menyimpan nilai tahanan yang dimasukkan ke dalam array
        }

        // Menghitung tahanan total berdasarkan jenis susunan
        if (susunan == 1) { // Jika pengguna memilih susunan seri
            double rt = 0; // Inisialisasi variabel untuk tahanan total
            for (double r : tahanan) { // Loop untuk menjumlahkan semua tahanan
                rt += r; // Menambahkan setiap tahanan ke variabel total
            }
            // Menampilkan hasil tahanan total untuk susunan seri
            System.out.println("Tahanan total (seri) adalah: " + rt + " Ohm");
        } else if (susunan == 2) { // Jika pengguna memilih susunan paralel
            double rtParalel = 0; // Inisialisasi variabel untuk menghitung total tahanan paralel
            for (double r : tahanan) { // Loop untuk menghitung 1/r untuk setiap tahanan
                rtParalel += 1 / r; // Menambahkan nilai invers dari setiap tahanan
            }
            double rt = 1 / rtParalel; // Menghitung tahanan total dari hasil invers
            // Menampilkan hasil tahanan total untuk susunan paralel
            System.out.println("Tahanan total (paralel) adalah: " + rt + " Ohm");
        } else { // Jika pilihan tidak valid
            System.out.println("Pilihan tidak valid. Silakan masukkan 1 atau 2."); // Menampilkan pesan kesalahan
        }
    }
}

