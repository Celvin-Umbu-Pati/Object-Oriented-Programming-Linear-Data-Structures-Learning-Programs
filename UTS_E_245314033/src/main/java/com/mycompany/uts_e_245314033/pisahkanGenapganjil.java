/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

/**
 *
 * @author Celvin Pati
 */
public class pisahkanGenapganjil {//awal program
    public static void main(String[] args) {//awal metode utama
        // Mendeklarasikan dan menginisialisasi array dengan nilai-nilai yang diberikan
        int[] Bil = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        
        // Menghitung jumlah angka genap dan ganjil
        int countGenap = 0; // Variabel untuk menghitung jumlah angka genap
        int countGanjil = 0; // Variabel untuk menghitung jumlah angka ganjil

        // Menghitung jumlah angka genap dan ganjil dalam array Bil
        for (int i = 0; i < Bil.length; i++) { // Loop untuk setiap elemen dalam array Bil
            if (Bil[i] % 2 == 0) { // Memeriksa apakah angka genap
                countGenap++; // Jika genap, tambahkan ke countGenap
            } else { // Jika tidak genap, berarti ganjil
                countGanjil++; // Tambahkan ke countGanjil
            }
        }

        // Membuat array untuk menyimpan angka genap dan ganjil
        int[] genap = new int[countGenap]; // Array untuk menyimpan angka genap
        int[] ganjil = new int[countGanjil]; // Array untuk menyimpan angka ganjil

        // Mengisi array genap dan ganjil
        countGenap = 0; // Reset countGenap untuk digunakan sebagai indeks
        countGanjil = 0; // Reset countGanjil untuk digSunakan sebagai indeks

        // Loop untuk memisahkan angka genap dan ganjil
        for (int i = 0; i < Bil.length; i++) { // Loop untuk setiap elemen dalam array Bil
            if (Bil[i] % 2 == 0) { // Memeriksa apakah angka genap
                genap[countGenap] = Bil[i]; // Menyimpan angka genap ke array genap
                countGenap++; // Pindah ke indeks berikutnya di array genap
            } else { // Jika tidak genap, berarti ganjil
                ganjil[countGanjil] = Bil[i]; // Menyimpan angka ganjil ke array ganjil
                countGanjil++; // Pindah ke indeks berikutnya di array ganjil
            }
        }

        // Menampilkan hasil pemisahan
        System.out.println("Angka genap: "); // Menampilkan pesan untuk angka genap
        for (int nilai : genap) { // Mengiterasi setiap elemen di array genap
            System.out.print(nilai + " "); // Menampilkan elemen genap
        }
        
        System.out.println("\nAngka ganjil: "); // Menampilkan pesan untuk angka ganjil
        for (int nilai : ganjil) { // Mengiterasi setiap elemen di array ganjil
            System.out.print(nilai + " "); // Menampilkan elemen ganjil
        }
    }//akhir metode utama
}//akhir program

