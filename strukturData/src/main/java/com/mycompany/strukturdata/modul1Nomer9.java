/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer9 {
     public static void main(String[] args) { // Awal metode utama
        // Mendeklarasikan dan menginisialisasi array ID dan Nama
        int[] ID = {101, 102, 103, 104, 105};
        String[] Nama = {"Slamet", "Joko", "Wulan", "Aldo", "Ahmad"};

        // Menerima input ID dari pengguna
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan ID yang ingin dicari: ");
        int inputID = keyboard.nextInt();

        // Mencari nama berdasarkan ID
        boolean found = false; // Variabel untuk menandakan apakah ID ditemukan
        for (int i = 0; i < ID.length; i++) { // Loop untuk setiap elemen dalam array ID
            if (ID[i] == inputID) { // Memeriksa apakah ID cocok dengan input
                System.out.println("Nama pemilik ID " + inputID + " adalah: " + Nama[i]); // Menampilkan nama
                found = true; // Menandakan bahwa ID ditemukan
                break; // Keluar dari loop setelah menemukan ID
            }
        }

        // Jika ID tidak ditemukan
        if (!found) {
            System.out.println("ID tidak ditemukan!");
        }
    } // Akhir metode utama
} // Akhir program

