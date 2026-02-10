/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class Pemasaran extends Pegawai {
    protected double bonus; // Variabel untuk menyimpan bonus

    // Method untuk mendapatkan bonus
    double getBonus() {
        return bonus;
    }
    
    // Method untuk mengatur bonus
    void setBonus(double myBonus) {
        bonus = myBonus;
    }

    // Implementasi method hitung gaji total
    @Override
    double hitungGatot() {
        return getGapok() + bonus; // Total = gapok + bonus
    }

    // Implementasi method hitung tunjangan
    @Override
    double getTunjangan() {
        return bonus; // Tunjangan dianggap sama dengan bonus
    }

    // Implementasi method get status
    @Override
    String getStatus() { 
        return "Pemasaran"; // Mengembalikan status sebagai Pemasaran
    }
}

