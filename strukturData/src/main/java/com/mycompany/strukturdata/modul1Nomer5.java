/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer5 {
     public static void main(String[] args) {//awal metode utama
        // Mendeklarasikan dan menginisialisasi array dengan nilai-nilai yang diberikan
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        // Menghitung jumlah angka genap 
        int countGenap = 0; // Variabel untuk menghitung jumlah angka genap
        

        // Menghitung jumlah angka genap  dalam array x
        for (int i = 0; i < x.length; i++) { // Loop untuk setiap elemen dalam array x
            if (x[i] % 2 == 0) { // Memeriksa apakah angka genap
                countGenap++; // Jika genap, tambahkan ke countGenap
            } else { // Jika tidak genap
              
            }
        }

        // Membuat array untuk menyimpan angka genap 
        int[] genap = new int[countGenap]; // Array untuk menyimpan angka genap
       
        // Mengisi array genap 
        countGenap = 0; // Reset countGenap untuk digunakan sebagai indeks
       
        // Loop untuk memisahkan angka genap dan ganjil
        for (int i = 0; i < x.length; i++) { // Loop untuk setiap elemen dalam array x
            if (x[i] % 2 == 0) { // Memeriksa apakah angka genap
                genap[countGenap] = x[i]; // Menyimpan angka genap ke array genap
                countGenap++; // Pindah ke indeks berikutnya di array genap
            } else { // Jika tidak genap
               
            }
        }

        // Menampilkan hasil pemisahan
        System.out.println("Angka genap: "); // Menampilkan pesan untuk angka genap
        for (int nilai : genap) { // Mengiterasi setiap elemen di array genap
            System.out.print(nilai + " "); // Menampilkan elemen genap
        }
    }//akhir metode utama
}//akhir program



