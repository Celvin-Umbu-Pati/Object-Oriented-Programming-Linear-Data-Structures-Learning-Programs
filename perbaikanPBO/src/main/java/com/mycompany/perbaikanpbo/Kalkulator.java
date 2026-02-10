/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;

/**
 *
 * @author Celvin Pati
 */
public class Kalkulator {// Mendefinisikan kelas Kalkulator
    private int a, b; // Deklarasi variabel privat a dan b untuk menyimpan dua bilangan
    // Konstruktor untuk menginisialisasi a dan b
    public Kalkulator(int a, int b) { 
        this.a = a; // Mengatur nilai a
        this.b = b; // Mengatur nilai b
    }
    // Metode untuk menjumlahkan a dan b
    public int penjumlahan() { 
        return a + b; // Mengembalikan hasil penjumlahan
    }
    // Metode untuk mengurangi b dari a
    public int pengurangan() { 
        return a - b; // Mengembalikan hasil pengurangan
    }
    // Metode untuk mengalikan a dan b
    public int perkalian() { 
        return a * b; // Mengembalikan hasil perkalian
    }
    // Metode untuk membagi a dengan b
    public double pembagian() { 
        if (b != 0) { // Memeriksa apakah b tidak sama dengan nol
            return (double) a / b; // Mengembalikan hasil pembagian sebagai double
        } else { // Jika b sama dengan nol
            throw new ArithmeticException("Error: Pembagian dengan nol tidak diperbolehkan."); // Melempar pengecualian dengan pesan kesalahan
        }
    }
} // Akhir kelas Kalkulator