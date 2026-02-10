/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

/**
 *
 * @author Celvin Pati
 */
public class Segitiga {//awal kelas segitiga
    // Deklarasi variabel koordinat titik 1 (x1, y1)
    public double x1, y1;
    // Deklarasi variabel koordinat titik 2 (x2, y2)  
    public double x2, y2;
    // Deklarasi variabel koordinat titik 3 (x3, y3)
    public double x3, y3;

    // Method untuk menghitung panjang sisi antara dua titik
    // Parameter: koordinat titik A (xa, ya) dan titik B (xb, yb)
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        // Menghitung jarak Euclidean antara dua titik menggunakan rumus Pythagoras
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        // Menjumlahkan panjang ketiga sisi segitiga dengan memanggil method hitungSisi()
        return hitungSisi(x1, y1, x2, y2) + 
               hitungSisi(x2, y2, x3, y3) + 
               hitungSisi(x3, y3, x1, y1);
    }

    // Method untuk menghitung luas segitiga menggunakan rumus Heron
    public double hitungLuas() {
        // Menghitung semi-perimeter (setengah dari keliling)
        double s = hitungKeliling() / 2;
        // Mengaplikasikan rumus Heron untuk menghitung luas
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * 
                        (s - hitungSisi(x2, y2, x3, y3)) * 
                        (s - hitungSisi(x3, y3, x1, y1)));
    }
}

