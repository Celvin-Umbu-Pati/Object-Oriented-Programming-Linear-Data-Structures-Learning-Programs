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
public class cobaArray2 {//awal program
    public static void main(String[] args) {//awal metode utama
        int[] hitung; // Deklarasi array 'hitung'
        hitung = new int[5]; // Inisialisasi array 'hitung' dengan ukuran 5
        int[] cadangan = new int[5]; // Deklarasi dan inisialisasi array 'cadangan' dengan ukuran 5
        Scanner Keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.println("Masukkan 5 data bulat"); // Menampilkan pesan untuk meminta input
        // Membaca 5 data bulat dari pengguna
        for (int i = 0; i < hitung.length; i++) { // Loop untuk 5 iterasi
            System.out.print("Data ke " + (i + 1) + " : "); // Menampilkan nomor data yang diminta
            hitung[i] = Keyboard.nextInt(); // Membaca input dari pengguna dan menyimpannya ke dalam array 'hitung'
        }

        // Menyalin isi array 'hitung' ke array 'cadangan'
        for (int i = 0; i < hitung.length; i++) { // Loop untuk setiap elemen array 'hitung'
            cadangan[i] = hitung[i]; // Menyalin elemen dari 'hitung' ke 'cadangan'
        }

        // Menampilkan data dari akhir ke awal dari array 'hitung'
        System.out.println("\nData dari array 'hitung' dari akhir ke awal:");
        for (int i = 0; i < hitung.length; i++) { // Loop untuk menampilkan data dari 'hitung'
            System.out.println("Data ke " + (i + 1) + " adalah " + hitung[4 - i]); // Menampilkan data dari akhir ke awal
        }

        // Menampilkan isi array 'cadangan'
        System.out.println("\nData dari array 'cadangan':");
        for (int i = 0; i < cadangan.length; i++) { // Loop untuk menampilkan data dari 'cadangan'
            System.out.println("Data ke " + (i + 1) + " adalah " + cadangan[i]); // Menampilkan data dari 'cadangan'
        }

        // Menghitung jumlah elemen, rata-rata, nilai maksimum, dan nilai minimum
        int jumlah = 0; // Variabel untuk menyimpan jumlah elemen
        int maksimum = hitung[0]; // Inisialisasi nilai maksimum dengan elemen pertama
        int minimum = hitung[0]; // Inisialisasi nilai minimum dengan elemen pertama

        for (int i = 0; i < hitung.length; i++) { // Loop untuk menghitung jumlah, maksimum, dan minimum
            jumlah += hitung[i]; // Menambahkan elemen saat ini ke jumlah
            if (hitung[i] > maksimum) { // Memeriksa apakah elemen saat ini lebih besar dari maksimum
                maksimum = hitung[i]; // Memperbarui nilai maksimum
            }
            if (hitung[i] < minimum) { // Memeriksa apakah elemen saat ini lebih kecil dari minimum
                minimum = hitung[i]; // Memperbarui nilai minimum
            }
        }

        double rataRata = (double) jumlah / hitung.length; // Menghitung rata-rata

        // Menampilkan hasil
        System.out.println("\nJumlah elemen array: " + jumlah); // Menampilkan jumlah elemen
        System.out.println("Rata-rata elemen array: " + rataRata); // Menampilkan rata-rata
        System.out.println("Nilai maksimum: " + maksimum); // Menampilkan nilai maksimum
        System.out.println("Nilai minimum: " + minimum); // Menampilkan nilai minimum
    }//akhir metode utama
}//akhir program
