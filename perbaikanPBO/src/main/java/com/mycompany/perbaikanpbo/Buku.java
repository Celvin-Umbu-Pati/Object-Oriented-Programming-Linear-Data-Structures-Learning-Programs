/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perbaikanpbo;

/**
 *
 * @author Celvin Pati
 */
public class Buku {
    // Atribut private untuk menyimpan informasi buku
    private String judul, pengarang, ISBN, penerbit, kategori;

    // Konstruktor dengan parameter judul dan ISBN
    public Buku(String jdl, String isbn) {
        this.judul = jdl; // Menginisialisasi atribut judul
        this.ISBN = isbn; // Menginisialisasi atribut ISBN
    }

    // Method untuk menandai buku sebagai dipinjam
    public void pinjam() {
        System.out.println(judul + " " + ISBN + " Sedang dipinjam"); // Menampilkan pesan peminjaman
    }

    // Method untuk menandai buku sebagai dikembalikan
    public void kembali() {
        System.out.println(judul + " " + ISBN + " Sudah dikembalikan"); // Menampilkan pesan pengembalian
    }
}

