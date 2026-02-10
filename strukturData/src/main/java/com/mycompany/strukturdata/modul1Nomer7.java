/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer7 {
    public static void main(String[] args) { // Awal metode utama
        // Mendeklarasikan dan menginisialisasi array dengan nilai-nilai yang diberikan
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Menghitung jumlah angka yang habis dibagi 5 
        int countHabis5 = 0; // Variabel untuk menghitung jumlah angka yang habis dibagi 5

        // Menghitung jumlah angka yang habis dibagi 5 dalam array x
        for (int i = 0; i < x.length; i++) { // Loop untuk setiap elemen dalam array x
            if (x[i] % 5 == 0) { // Memeriksa apakah angka habis dibagi 5
                countHabis5++; // Jika habis dibagi 5, tambahkan ke countHabis5
            }
        }

        // Membuat array untuk menyimpan angka yang habis dibagi 5
        int[] habis5 = new int[countHabis5]; // Array untuk menyimpan angka yang habis dibagi 5

        // Mengisi array habis5 
        countHabis5 = 0; // Reset countHabis5 untuk digunakan sebagai indeks

        // Loop untuk memisahkan angka yang habis dibagi 5
        for (int i = 0; i < x.length; i++) { // Loop untuk setiap elemen dalam array x
            if (x[i] % 5 == 0) { // Memeriksa apakah angka habis dibagi 5
                habis5[countHabis5] = x[i]; // Menyimpan angka habis dibagi 5 ke array habis5
                countHabis5++; // Pindah ke indeks berikutnya di array habis5
            }
        }

        // Menampilkan hasil pemisahan
        System.out.println("Angka yang habis dibagi 5: "); // Menampilkan pesan untuk angka yang habis dibagi 5
        for (int nilai : habis5) { // Mengiterasi setiap elemen di array habis5
            System.out.print(nilai + " "); // Menampilkan elemen yang habis dibagi 5
        }
    } // Akhir metode utama
} // Akhir program

