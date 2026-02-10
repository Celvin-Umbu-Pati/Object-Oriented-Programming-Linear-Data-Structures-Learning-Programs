/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class Lingkaran {
    // Mendeklarasikan variabel anggota untuk menyimpan jari-jari lingkaran
    double r;
    
    // Mendeklarasikan variabel anggota untuk menyimpan luas lingkaran
    double luas;
    
    // Mendeklarasikan konstanta PHI dengan nilai 3.14
    final double PHI = 3.14;
    
    // Konstruktor default untuk kelas Lingkaran
    Lingkaran (){};
    
    // Metode untuk menghitung luas lingkaran
    public void luas() {
        // Menginisialisasi jari-jari lingkaran dengan nilai 7
        r = 7;
        
        // Menghitung luas lingkaran menggunakan rumus PHI * r * r
        luas = PHI * r * r;
        
        // Mencetak hasil luas lingkaran ke konsol
        System.out.println("Luas lingkaran dengan jari=" + r + " adalah : " + luas);
    }
}

