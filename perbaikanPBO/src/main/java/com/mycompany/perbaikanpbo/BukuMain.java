/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;

/**
 *
 * @author Celvin Pati
 */
public class BukuMain {
  
    // Metode utama yang dijalankan saat program dieksekusi
    public static void main(String[] args) {
        // Membuat objek book1 dengan parameter judul dan ISBN, lalu memanggil method pinjam()
        Buku book1 = new Buku("Struktur Data", "1304595");
        book1.pinjam(); // Menampilkan pesan bahwa buku sedang dipinjam
        
        // Membuat objek book2 dengan parameter judul dan ISBN, lalu memanggil method kembali()
        Buku book2 = new Buku("Java Fundamental", "1304300");
        book2.kembali(); // Menampilkan pesan bahwa buku sudah dikembalikan
    }
}

