/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class SegiTiga2Main {
     // Method utama sebagai entry point program
    public static void main(String[] args) {
        // Membuat objek segitiga pertama dengan constructor
        SegiTiga2 seg1 = new SegiTiga2(1, 2, 7, 2, 7, 9);
        // Menampilkan luas segitiga pertama
        System.out.println("Luas segitiga 1: " + seg1.hitungLuas());

        // Membuat objek segitiga kedua dengan constructor
        SegiTiga2 seg2 = new SegiTiga2(0, 0, 5, 4, 8, 2);
        // Menampilkan luas segitiga kedua
        System.out.println("Luas segitiga 2: " + seg2.hitungLuas());

        // Mengubah titik x1 segitiga pertama menggunakan setter
        seg1.setX1(3); 
        // Menampilkan luas segitiga pertama setelah diubah
        System.out.println("Luas segitiga 1 setelah diubah: " + seg1.hitungLuas());
    }
}
