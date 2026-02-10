/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class BujurSangkar {
    // Mendeklarasikan variabel anggota untuk menyimpan luas bujur sangkar
    double luas;
    
    // Mendeklarasikan variabel anggota untuk menyimpan panjang sisi bujur sangkar
    int sisi;

    // Konstruktor default untuk kelas BujurSangkar
    BujurSangkar() {
    }

    // Metode untuk menghitung luas bujur sangkar
    public double luas() {
        // Menghitung luas dengan rumus sisi * sisi
        luas = sisi * sisi;
        
        // Mengembalikan nilai luas
        return luas;
    }
}
