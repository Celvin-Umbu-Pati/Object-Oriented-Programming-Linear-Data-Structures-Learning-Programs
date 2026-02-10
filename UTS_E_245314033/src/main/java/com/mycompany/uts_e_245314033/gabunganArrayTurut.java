/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

/**
 *
 * @author Celvin Pati
 */
public class gabunganArrayTurut {//awal program
    public static void main(String[] args) {//awal metode utama
        // Mendeklarasikan dan menginisialisasi dua array yang sudah terurut
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90}; 
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};

        // Menghitung total ukuran array gabungan
        int totalUkuran = usia1.length + usia2.length; // Menghitung total elemen dari kedua array
        int[] usiaGabung = new int[totalUkuran]; // Membuat array baru untuk menyimpan hasil gabungan

        int i = 0; // Indeks untuk array usia1
        int j = 0; // Indeks untuk array usia2
        int k = 0; // Indeks untuk array usiaGabung

        // Menggabungkan kedua array ke dalam usiaGabung
        while (i < usia1.length && j < usia2.length) { // Selama masih ada elemen di kedua array
            if (usia1[i] < usia2[j]) { // Jika elemen di usia1 lebih kecil
                usiaGabung[k] = usia1[i]; // Simpan elemen dari usia1 ke usiaGabung
                i++; // Pindah ke elemen berikutnya di usia1
            } else {
                usiaGabung[k] = usia2[j]; // Simpan elemen dari usia2 ke usiaGabung
                j++; // Pindah ke elemen berikutnya di usia2
            }
            k++; // Pindah ke elemen berikutnya di usiaGabung
        }

        // Menyalin sisa elemen dari usia1 jika ada
        while (i < usia1.length) { // Jika masih ada elemen di usia1
            usiaGabung[k] = usia1[i]; // Salin elemen ke usiaGabung
            i++; // Pindah ke elemen berikutnya di usia1
            k++; // Pindah ke elemen berikutnya di usiaGabung
        }

        // Menyalin sisa elemen dari usia2 jika ada
        while (j < usia2.length) { // Jika masih ada elemen di usia2
            usiaGabung[k] = usia2[j]; // Salin elemen ke usiaGabung
            j++; // Pindah ke elemen berikutnya di usia2
            k++; // Pindah ke elemen berikutnya di usiaGabung
        }

        // Menampilkan hasil gabungan
        System.out.println("Array gabungan yang terurut: "); // Menampilkan pesan
        for (int nilai : usiaGabung) { // Mengiterasi setiap elemen di usiaGabung
            System.out.print(nilai + " "); // Menampilkan elemen
        }
    }//akhir metode utama
}//akhir program

