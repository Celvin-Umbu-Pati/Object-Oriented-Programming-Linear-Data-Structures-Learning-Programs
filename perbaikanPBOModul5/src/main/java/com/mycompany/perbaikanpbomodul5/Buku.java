/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class Buku {//awal kelas Buku
    String kodeBuku, judul; // Variabel untuk simpan kode buku dan judul
    int tahunTerbit; // Variabel untuk simpan tahun terbit buku
    Pengarang[] daftarPengarang; // Array untuk simpan daftar pengarang buku

    public Buku(String kodeBuku, String judul, int tahunTerbit, int jumlahPengarang) { // Konstruktor untuk inisialisasi buku
        this.kodeBuku = kodeBuku;//untuk set kode buku
        this.judul = judul;//untuk set judul
        this.tahunTerbit = tahunTerbit;//untuk set tahunTerbit
        this.daftarPengarang = new Pengarang[jumlahPengarang]; // untuk buat array pengarang sesuai dengan jumlah yang diberikan
    }

    public void tambahPengarang(Pengarang pengarang, int index) { // Method untuk menambah pengarang ke dalam buku
        daftarPengarang[index] = pengarang;
    }

    public String toString() { // Method untuk menampilkan data buku ke bentuk string
        StringBuilder sb = new StringBuilder("Kode Buku: " + kodeBuku + ", Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + "\nPengarang:\n");
        for (Pengarang p : daftarPengarang) { // Loop untuk menampilkan setiap pengarang di daftar
            sb.append("  - " + p + "\n");
        }
        return sb.toString();
    }
}//akhir kelas Buku

