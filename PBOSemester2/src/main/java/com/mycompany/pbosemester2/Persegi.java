/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class Persegi {

    // Mendeklarasikan variabel anggota untuk menyimpan panjang persegi
    int panj;
    
    // Mendeklarasikan variabel anggota untuk menyimpan lebar persegi
    int lebar;
    
    // Mendeklarasikan variabel anggota untuk menyimpan luas persegi
    double luas;

    // Konstruktor default untuk kelas Persegi
    Persegi() {
    }

    // Metode untuk menghitung luas persegi
    public double luas() {
        // Menghitung luas dengan rumus panjang * lebar
        luas = panj * lebar;
        
        // Mengembalikan nilai luas
        return luas;
    }
}
