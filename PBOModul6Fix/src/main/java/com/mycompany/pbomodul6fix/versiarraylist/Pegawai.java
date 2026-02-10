/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versiarraylist;

import java.util.Objects;

/**
 *
 * @author Celvin Pati
 */
public class Pegawai {//awal kelas Pegawai
    private String NIP;       // Menyimpan nomor induk pegawai (unik)
    private String nama;      // Menyimpan nama lengkap pegawai
    private double gajiPokok; // Menyimpan besaran gaji pokok

    // Constructor untuk membuat objek Pegawai baru
    public Pegawai(String NIP, String nama, double gajiPokok) {
        this.NIP = NIP;          // Mengisi NIP
        this.nama = nama;        // Mengisi nama
        this.gajiPokok = gajiPokok; // Mengisi gaji pokok
    }

    // Method getter untuk mendapatkan NIP
    public String getNIP() {
        return NIP;  // Mengembalikan nilai NIP
    }

    // Method getter untuk mendapatkan nama
    public String getNama() {
        return nama; // Mengembalikan nilai nama
    }

    // Method getter untuk mendapatkan gaji pokok
    public double getGajiPokok() {
        return gajiPokok; // Mengembalikan nilai gaji pokok
    }

    // Method setter untuk mengubah NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;  // Memperbarui nilai NIP
    }

    // Method setter untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama; // Memperbarui nilai nama
    }

    // Method setter untuk mengubah gaji pokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok; // Memperbarui nilai gaji pokok
    }

    // Method untuk menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        // Menampilkan gaji dengan format mata uang
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("--------------------------");
    }

    // Override method equals untuk membandingkan kesamaan objek Pegawai
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Jika objek sama
        if (o == null || getClass() != o.getClass()) return false; // Jika objek null atau kelas berbeda
        Pegawai pegawai = (Pegawai) o; // Casting objek
        return Objects.equals(NIP, pegawai.NIP); // Membandingkan berdasarkan NIP
    }

    // Override method hashCode untuk konsistensi dengan equals
    @Override
    public int hashCode() {
        return Objects.hash(NIP); // Generate hashCode berdasarkan NIP
    }
}

