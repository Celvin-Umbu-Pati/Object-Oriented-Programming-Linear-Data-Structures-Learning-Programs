/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

/**
 *
 * @author Celvin Pati
 */
public class Buku {
    private String kodeBuku;      // Menyimpan kode unik buku
    private String judul;         // Menyimpan judul buku
    private int tahunTerbit;      // Menyimpan tahun terbit buku
    private Pengarang[] daftarPengarang;  // Array untuk menyimpan daftar pengarang
    private int jumlahPengarangSekarang = 0;  // Penghitung jumlah pengarang yang sudah ditambahkan

    // Konstruktor untuk inisialisasi objek Buku
    public Buku(String kodeBuku, String judul, int tahunTerbit, int jumlahPengarang) {
        this.kodeBuku = kodeBuku;          // Set kode buku
        this.judul = judul;                // Set judul buku
        this.tahunTerbit = tahunTerbit;    // Set tahun terbit
        // Inisialisasi array daftarPengarang dengan kapasitas tertentu
        this.daftarPengarang = new Pengarang[jumlahPengarang]; 
    }

    public boolean tambahPengarang(Pengarang pengarang) {
        // Cek apakah masih ada slot kosong
        if (jumlahPengarangSekarang < daftarPengarang.length) {
            daftarPengarang[jumlahPengarangSekarang] = pengarang;  // Tambahkan pengarang
            jumlahPengarangSekarang++;  // Increment counter
            return true;
        }
        return false;  // Return false jika array sudah penuh
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    @Override
    public String toString() {
        // Menggunakan StringBuilder untuk efisiensi
        StringBuilder sb = new StringBuilder("Kode Buku: " + kodeBuku + 
                                         ", Judul: " + judul + 
                                         ", Tahun Terbit: " + tahunTerbit + 
                                         "\nPengarang:\n");
        // Loop melalui semua pengarang yang sudah ditambahkan
        for (int i = 0; i < jumlahPengarangSekarang; i++) {
            sb.append("  - " + daftarPengarang[i] + "\n");
        }
        return sb.toString();
    }
}

