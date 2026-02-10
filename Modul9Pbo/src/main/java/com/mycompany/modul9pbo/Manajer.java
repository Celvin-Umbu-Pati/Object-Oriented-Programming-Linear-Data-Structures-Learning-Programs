/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class Manajer extends Pegawai {
    protected double tunjanganJabatan; // Variabel tunjangan jabatan
    protected double lemburan;         // Variabel lembur

    // Method untuk mendapatkan tunjangan jabatan
    double getTunJab() {
        return tunjanganJabatan;
    }
    
    // Method untuk mengatur tunjangan jabatan
    void setTunJab(double honJab) {
        tunjanganJabatan = honJab;
    }

    // Method untuk mendapatkan nilai lembur
    double getLembur() {
        return lemburan;
    }
    
    // Method untuk mengatur nilai lembur
    void setLembur(double overtime) {
        lemburan = overtime;
    }

    // Implementasi method hitung gaji total
    @Override
    double hitungGatot() {
        return getGapok() + tunjanganJabatan + lemburan; // Total = gapok + tunjangan + lembur
    }

    // Implementasi method hitung tunjangan
    @Override
    double getTunjangan() {
        return tunjanganJabatan + lemburan; // Tunjangan = tunjangan jabatan + lembur
    }

    // Implementasi method get status
    @Override
    String getStatus() { 
        return "Manajer"; // Mengembalikan status sebagai Manajer
    }
}