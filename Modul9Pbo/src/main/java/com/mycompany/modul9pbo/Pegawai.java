/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
abstract class Pegawai {
    protected int npp;         // Nomor Pegawai
    protected String nama;     // Nama pegawai
    protected double gajiPokok; // Gaji pokok

    // Method untuk mendapatkan NPP
    int getNpp() {
        return npp;
    }
    
    // Method untuk mengatur NPP
    void setNpp(int nopeg) {
        npp = nopeg;
    }

    // Method untuk mendapatkan nama
    String getName() {
        return nama;
    }
    
    // Method untuk mengatur nama
    void setName(String nampeg) {
        nama = nampeg;
    }

    // Method untuk mendapatkan gaji pokok
    double getGapok() {
        return gajiPokok;
    }
    
    // Method untuk mengatur gaji pokok
    void setGapok(double upah) {
        gajiPokok = upah;
    }

    // Deklarasi method abstrak yang harus diimplementasikan subclass
    abstract String getStatus();       // Untuk mendapatkan status jabatan
    abstract double getTunjangan();   // Untuk menghitung tunjangan
    abstract double hitungGatot();     // Untuk menghitung gaji total
}