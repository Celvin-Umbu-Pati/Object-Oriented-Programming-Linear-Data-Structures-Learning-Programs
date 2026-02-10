/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class Kalkulator {
    // Deklarasi variabel private untuk menyimpan 2 bilangan
    private int a;  // Menyimpan bilangan pertama
    private int b;  // Menyimpan bilangan kedua

    // Constructor untuk inisialisasi nilai awal
    public Kalkulator(int a, int b) {
        this.a = a;  // Mengisi nilai a dari parameter ke variabel a
        this.b = b;  // Mengisi nilai b dari parameter ke variabel b
    }

    // Method untuk operasi penjumlahan
    public int penjumlahan() {
        return a + b;  // Mengembalikan hasil penjumlahan a dan b
    }

    // Method untuk operasi pengurangan
    public int pengurangan() {
        return a - b;  // Mengembalikan hasil pengurangan a dan b
    }

    // Method untuk operasi perkalian
    public int perkalian() {
        return a * b;  // Mengembalikan hasil perkalian a dan b
    }

    // Method untuk operasi pembagian
    public int pembagian() {
        return a / b;  // Mengembalikan hasil pembagian a oleh b
    }
}

