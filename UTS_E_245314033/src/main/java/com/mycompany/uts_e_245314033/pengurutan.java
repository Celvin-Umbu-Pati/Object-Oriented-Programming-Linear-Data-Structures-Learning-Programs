/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;
 import java.util.Scanner; // Mengimpor kelas Scanner untuk input
/**
 *
 * @author Celvin Pati
 */
public class pengurutan {//awal program pengurutan 
    public static void main(String[] args) {//awal metode utama
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Banyak elemen: "); // Meminta pengguna untuk memasukkan jumlah elemen
        int banyakElemen = keyboard.nextInt(); // Membaca jumlah elemen yang dimasukkan oleh pengguna

        // Mendeklarasikan array dengan ukuran yang ditentukan oleh pengguna
        int[] elemen = new int[banyakElemen];

        // Mengisi array dengan elemen yang dimasukkan oleh pengguna
        for (int i = 0; i < banyakElemen; i++) { // Loop untuk setiap elemen
            System.out.print("Elemen-" + (i + 1) + ": "); // Meminta pengguna untuk memasukkan elemen ke-i
            elemen[i] = keyboard.nextInt(); // Membaca nilai elemen dari pengguna
        }

        // Menggunakan algoritma Bubble Sort untuk mengurutkan array
        for (int i = 0; i < banyakElemen - 1; i++) { // Loop untuk setiap elemen (kecuali elemen terakhir)
            for (int j = 0; j < banyakElemen - 1 - i; j++) { // Loop untuk membandingkan elemen
                if (elemen[j] > elemen[j + 1]) { // Jika elemen saat ini lebih besar dari elemen berikutnya
                    // Tukar elemen jika urutannya salah
                    int temp = elemen[j]; // Simpan elemen saat ini dalam variabel sementara
                    elemen[j] = elemen[j + 1]; // Pindahkan elemen berikutnya ke posisi saat ini
                    elemen[j + 1] = temp; // Tempatkan elemen sementara ke posisi berikutnya
                }
            }
        }

        // Menampilkan hasil pengurutan
        System.out.print("Hasil Pengurutan: "); // Menampilkan pesan untuk hasil pengurutan
        for (int i = 0; i < banyakElemen; i++) { // Loop untuk setiap elemen dalam array
            System.out.print(elemen[i] + " "); // Menampilkan elemen yang telah diurutkan
        }
    }//akhir metode utama
}//akhir program pengurutan

