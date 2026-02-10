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
public class TimbulanSampah {//awal class TimbulanSampah
 
     public static void main(String[] args) { // Metode utama yang dijalankan saat program dieksekusi
     Scanner Scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
      String[] Jambi, Jateng, DKI, Bali, NTB, NTT, Kaltim, Sulut,Maluku, Papua,nama;
      double[] sampahJambi, sampahJateng, sampahDKI, sampahBali, sampahNTB, sampahNTT, sampahKaltim, sampahSulut, sampahMaluku, sampahPapua, sampah; 

// Input jumlah sampah jumlah provinsi
       // Input jumlah provinsi
        System.out.print("Masukkan jumlah provinsi: "); // Meminta pengguna memasukkan jumlah provinsi
         int n = Scanner.nextInt(); // Membaca jumlah provinsi dari input
        Scanner.nextLine(); // Menangkap newline setelah nextInt
        
       //inisiali sasi array untuk jumllah sampah setiap provinsi
       nama = new String [n];
       sampah = new double [n];
      sampahJambi = new double [n];
      sampahJateng = new double [n];
      sampahDKI = new double [n];
      sampahBali = new double [n];
      sampahNTB = new double [n];
      sampahNTT = new double [n];
      sampahKaltim = new double [n];
      sampahSulut = new double [n];
      sampahMaluku = new double [n];
      sampahPapua = new double [n];
      
        // Input data provinsi
        for (int i = 0; i < n; i++) { // Loop untuk setiap provinsi
        System.out.print("Nama provinsi: "); // Meminta pengguna memasukkan nama
            nama[i] = Scanner.nextLine(); // Membaca nama dari input (menggunakan nextLine untuk nama)
            System.out.print("jumlah sampah harian "); // Meminta pengguna memasukkan jumlah sampa
// Meminta pengguna memasukkan jumlah sampa
            sampah[i] = Scanner.nextDouble();
         // Hitung rata-rata timbulan sampah harian dari 10 provinsi
         // Membaca jumlah sampah  dari input
     }}}




















