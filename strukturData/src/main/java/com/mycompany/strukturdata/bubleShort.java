/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class bubleShort {

    public static void main(String[] args) { // awal metode utama
        // Mendefinisikan array x
        int[] x = {50, 100, 70,80,1000,30,40,33,53,55};

        // Menggunakan algoritma Bubble Sort untuk mengurutkan array
        for (int i = 0; i < x.length - 1; i++) { // Loop untuk setiap elemen (kecuali elemen terakhir)
            for (int j = 0; j < x.length - 1 - i; j++) { // Loop untuk membandingkan elemen
                if (x[j] > x[j + 1]) { // Jika elemen saat ini lebih besar dari elemen berikutnya
                    // Tukar elemen jika urutannya salah
                    int temp = x[j]; // Simpan elemen saat ini dalam variabel sementara
                    x[j] = x[j + 1]; // Pindahkan elemen berikutnya ke posisi saat ini
                    x[j + 1] = temp; // Tempatkan elemen sementara ke posisi berikutnya
                }
            }
        }
        // Menampilkan hasil pengurutan
        System.out.print("Hasil Pengurutan: "); // Menampilkan pesan untuk hasil pengurutan
        for (int i = 0; i < x.length; i++) { // Loop untuk setiap elemen dalam array
            System.out.print(x[i] + " "); // Menampilkan elemen yang telah diurutkan
        }
    } // akhir metode utama
} // akhir program pengurutan

