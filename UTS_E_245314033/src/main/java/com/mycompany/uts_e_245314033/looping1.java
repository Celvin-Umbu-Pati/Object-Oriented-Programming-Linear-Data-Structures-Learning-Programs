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
public class looping1 {
 public static void main(String[] args) {
 
        Scanner tombol = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int N = tombol.nextInt(); // Membaca jumlah data
        
        double rerata = 0, jumlah = 0;
        int pembagi = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            double nilai = tombol.nextDouble(); // Membaca nilai
            jumlah = jumlah + nilai;
            pembagi++;
        }
        
        if (pembagi > 0) {
            rerata = jumlah / pembagi; // Menghitung rerata
            System.out.println("Rata-rata: " + rerata); // Menampilkan hasil
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }

        tombol.close(); // Menutup scanner
    }
}
