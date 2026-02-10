/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer10 {
     public static void main(String[] args) { // Awal metode utama
        // Mendeklarasikan dan menginisialisasi array Plat Nomor dan Mobil
        String[] platNomor = {"B 102 AE", "AB 233 CB", "AA 456 VC", "B 665 FG"};
        String[] mobil = {"Kijang", "Innova", "Avanza", "Rush"};

        // Menampilkan mobil dengan plat nomor yang berasal dari Jakarta (yang dimulai dengan 'B')
        System.out.println("Mobil dengan plat nomor daerah Jakarta:");
        for (int i = 0; i < platNomor.length; i++) { // Loop untuk setiap elemen dalam array platNomor
            if (platNomor[i].startsWith("B ")) { // Memeriksa apakah plat nomor dimulai dengan 'B'
                System.out.println(platNomor[i] + " - " + mobil[i]); // Menampilkan plat nomor dan nama mobil
            }
        }
    } // Akhir metode utama
} // Akhir program

