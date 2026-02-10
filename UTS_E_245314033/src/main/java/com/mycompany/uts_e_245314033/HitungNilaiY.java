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
public class HitungNilaiY {

    public static void main(String[] args) { // Metode utama yang akan dijalankan ketika program diaktifkan
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk mendapatkan input dari pengguna

        // Meminta pengguna untuk memasukkan nilai koefisien a, b, dan c
        System.out.print("Masukkan koefisien a: ");
        double a = scanner.nextDouble(); // Membaca nilai koefisien a dari input
        System.out.print("Masukkan koefisien b: ");
        double b = scanner.nextDouble(); // Membaca nilai koefisien b dari input
        System.out.print("Masukkan koefisien c: ");
        double c = scanner.nextDouble(); // Membaca nilai koefisien c dari input

        // Menghitung nilai diskriminan
        double D = b * b - 4 * a * c; // Menggunakan rumus diskriminan untuk menentukan akar-akar
        // Memeriksa apakah diskriminan positif
        if (D > 0) { // Jika D lebih besar dari nol, berarti persamaan memiliki dua akar nyata
            // Menghitung akar-akar dari persamaan kuadrat
            double x1 = (-b + Math.sqrt(D)) / (2 * a); // Menghitung akar pertama
            double x2 = (-b - Math.sqrt(D)) / (2 * a); // Menghitung akar kedua
            // Menampilkan persamaan kuadrat dan nilai akarnya
            System.out.printf("Dari persamaan y = " +a+  "x^2 " + b + "x + " + c); // Menampilkan format persamaan
            System.out.printf("Akar-akarnya adalah "+x1+" dan" +x2); // Menampilkan nilai akar
            // Menampilkan hasil perhitungan y untuk nilai x di antara akar
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("x               y = " + a + "x^2 + " + b + "x + " + c); // Menampilkan format hasil
            System.out.println("--------------------------------------------------------------------------");
            // Menghitung dan menampilkan nilai y untuk x dari akar terkecil hingga terbesar dengan langkah 0.25
            for (double x = Math.min(x1, x2); x <= Math.max(x1, x2); x += 0.25) { // Loop untuk menghitung nilai y pada rentang x
                double y = a * x * x + b * x + c; // Menghitung nilai y berdasarkan rumus kuadrat
                System.out.println(x + "          " + y); // Menampilkan nilai x dan y
            }
            System.out.println("--------------------------------------------------------------------------");
        } else {
            // Menampilkan pesan jika diskriminan tidak positif
            System.out.println("Persamaan tidak memiliki dua akar nyata."); // Menyampaikan bahwa persamaan tidak memiliki akar
         }

          }
           }