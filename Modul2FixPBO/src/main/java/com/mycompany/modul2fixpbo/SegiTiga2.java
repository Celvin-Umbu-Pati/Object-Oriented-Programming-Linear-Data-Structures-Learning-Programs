/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class SegiTiga2 {
     private double x1, y1;  // Titik pertama (x1, y1)
    private double x2, y2;  // Titik kedua (x2, y2)
    private double x3, y3;  // Titik ketiga (x3, y3)

    // Constructor dengan parameter untuk inisialisasi langsung
    public SegiTiga2(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;  // Mengisi nilai x1 dari parameter ke atribut x1
        this.y1 = y1;  // Mengisi nilai y1 dari parameter ke atribut y1
        this.x2 = x2;  // Mengisi nilai x2 dari parameter ke atribut x2
        this.y2 = y2;  // Mengisi nilai y2 dari parameter ke atribut y2
        this.x3 = x3;  // Mengisi nilai x3 dari parameter ke atribut x3
        this.y3 = y3;  // Mengisi nilai y3 dari parameter ke atribut y3
    }
    // Getter untuk mendapatkan nilai x1
    public double getX1() {
        return x1;  // Mengembalikan nilai x1
    }

    // Setter untuk mengubah nilai x1
    public void setX1(double x1) {
        this.x1 = x1;  // Mengupdate nilai atribut x1 dengan nilai parameter
    }

    // Getter untuk mendapatkan nilai y1
    public double getY1() {
        return y1;  // Mengembalikan nilai y1
    }

    // Setter untuk mengubah nilai y1
    public void setY1(double y1) {
        this.y1 = y1;  // Mengupdate nilai atribut y1 dengan nilai parameter
          }

    // [Getter dan Setter untuk x2,y2,x3,y3 dibuat dengan pola yang sama...]

    // Method untuk menghitung panjang sisi antara dua titik
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        // Menghitung jarak Euclidean antara dua titik
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        // Menjumlahkan ketiga sisi segitiga
        return hitungSisi(x1, y1, x2, y2) + 
               hitungSisi(x2, y2, x3, y3) + 
               hitungSisi(x3, y3, x1, y1);
    }
     // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        double s = hitungKeliling() / 2;  // Menghitung semi-perimeter
        // Menghitung luas dengan rumus Heron
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * 
                      (s - hitungSisi(x2, y2, x3, y3)) * 
                      (s - hitungSisi(x3, y3, x1, y1)));
    }
}

