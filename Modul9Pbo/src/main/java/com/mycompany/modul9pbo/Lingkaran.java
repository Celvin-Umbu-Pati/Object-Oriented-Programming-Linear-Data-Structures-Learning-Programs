/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class Lingkaran extends BangunDatar {
    // Atribut khusus Lingkaran
    private double jariJari;

    // Konstruktor untuk inisialisasi jari-jari
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Implementasi metode keliling lingkaran
    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari; // 2πr
    }

    // Implementasi metode luas lingkaran
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari; // πr²
    }

    // Override toString untuk menampilkan nama bangun
    @Override
    public String toString() {
        return "Lingkaran";
    }
}
