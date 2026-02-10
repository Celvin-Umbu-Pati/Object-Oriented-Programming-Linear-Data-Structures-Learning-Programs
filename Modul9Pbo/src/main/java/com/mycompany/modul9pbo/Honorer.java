/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class Honorer extends Pegawai {
    protected double lemburan; // Variabel untuk menyimpan jumlah lembur

    // Method untuk mendapatkan nilai lembur
    double getLembur() {
        return lemburan;
    }
    
    // Method untuk mengatur nilai lembur
    void setLembur(double myLembur) {
        lemburan = myLembur;
    }

    // Implementasi method hitung gaji total
    @Override
    double hitungGatot() {
        return getGapok() + lemburan; // Gaji total = gaji pokok + lembur
    }

    // Implementasi method hitung tunjangan
    @Override
    double getTunjangan() {
        return lemburan; // Tunjangan dianggap sama dengan lembur
    }

    // Implementasi method get status
    @Override
    String getStatus() { 
        return "Honorer"; // Mengembalikan status sebagai Honorer
    }
}
