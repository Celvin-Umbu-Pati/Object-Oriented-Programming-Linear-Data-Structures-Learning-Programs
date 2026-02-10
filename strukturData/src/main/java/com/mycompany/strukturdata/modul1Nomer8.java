/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer8 {
    public static void main(String[] args) { // Awal metode utama
        // Mendeklarasikan dan menginisialisasi array kota
        String[] kota = {"Jakarta", "Bandung", "Surabaya", "Tangerang", "Magelang"};

        // Menampilkan array kota dengan format yang diinginkan
        System.out.println("Daftar Kota:");
        for (int i = 0; i < kota.length; i++) { // Loop untuk setiap elemen dalam array kota
            System.out.println((i + 1) + ". " + kota[i]); // Menampilkan nomor urut dan nama kota
        }
    } // Akhir metode utama
} // Akhir program

