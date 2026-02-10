/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class SegiEmpat extends BangunDatar {
    // Atribut khusus SegiEmpat
    private double panjang;
    private double lebar;

    // Konstruktor untuk inisialisasi nilai panjang dan lebar
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi metode keliling untuk persegi panjang
    @Override
    public double keliling() {
        return 2 * (panjang + lebar); // Rumus keliling persegi panjang
    }

    // Implementasi metode luas untuk persegi panjang
    @Override
    public double luas() {
        return panjang * lebar; // Rumus luas persegi panjang
    }

    // Override toString untuk menampilkan nama bangun
    @Override
    public String toString() {
        return "Segi Empat";
    }
}
