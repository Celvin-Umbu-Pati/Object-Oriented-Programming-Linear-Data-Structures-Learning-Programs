/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class Segitiga extends BangunDatar {
    // Atribut khusus Segitiga
    private double sisiA;
    private double sisiB;
    private double sisiC;

    // Konstruktor untuk inisialisasi ketiga sisi
    public Segitiga(double a, double b, double c) {
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }

    // Implementasi metode keliling untuk segitiga
    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC; // Jumlah semua sisi
    }

    // Implementasi metode luas menggunakan rumus Heron
    @Override
    public double luas() {
        double s = keliling() / 2; // Menghitung semi-perimeter
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC)); // Rumus Heron
    }

    // Override toString untuk menampilkan nama bangun
    @Override
    public String toString() {
        return "Segitiga";
    }
}
