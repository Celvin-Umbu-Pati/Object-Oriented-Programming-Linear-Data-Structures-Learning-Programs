/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class BujurSangkarMain {
    // Metode utama yang dijalankan saat program dieksekusi
    public static void main(String[] args) {

        // Membuat objek bujur1 dari kelas BujurSangkar
        BujurSangkar bujur1 = new BujurSangkar();
        
        // Membuat objek bujur2 dari kelas BujurSangkar
        BujurSangkar bujur2 = new BujurSangkar();
        
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner tombol = new Scanner(System.in);
        
        // Meminta pengguna memasukkan panjang sisi bujur sangkar pertama
        System.out.print("Masukkan sisi bujur sangkar I: ");
        bujur1.sisi = tombol.nextInt();  // Menyimpan input ke atribut sisi bujur1
        
        // Meminta pengguna memasukkan panjang sisi bujur sangkar kedua
        System.out.print("Masukkan sisi bujur sangkar II: ");
        bujur2.sisi = tombol.nextInt();  // Menyimpan input ke atribut sisi bujur2
        
        // Menghitung dan mencetak luas bujur sangkar pertama
        System.out.println("Luas Bujur Sangkar dengan sisi = " + bujur1.sisi + " adalah " + bujur1.luas());
        
        // Menghitung dan mencetak luas bujur sangkar kedua
        System.out.println("Luas Bujur Sangkar dengan sisi = " + bujur2.sisi + " adalah " + bujur2.luas());
    }
}
