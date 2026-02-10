/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class Segitiga {
    // Deklarasi variabel koordinat titik 1 (x1, y1)
    public double x1, y1;
    // Deklarasi variabel koordinat titik 2 (x2, y2)  
    public double x2, y2;
    // Deklarasi variabel koordinat titik 3 (x3, y3)
    public double x3, y3;

    // Method untuk menghitung panjang sisi antara dua titik
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        // Menghitung jarak Euclidean antara titik (xa,ya) dan (xb,yb)
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        // Menjumlahkan panjang ketiga sisi segitiga
        return hitungSisi(x1, y1, x2, y2) + 
               hitungSisi(x2, y2, x3, y3) + 
               hitungSisi(x3, y3, x1, y1);
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        // Menghitung semi-perimeter (setengah keliling)
        double s = hitungKeliling() / 2;
        // Menghitung luas dengan rumus Heron
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * 
                        (s - hitungSisi(x2, y2, x3, y3)) * 
                        (s - hitungSisi(x3, y3, x1, y1)));
    }
}

