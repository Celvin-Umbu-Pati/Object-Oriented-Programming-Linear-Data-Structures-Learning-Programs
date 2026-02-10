/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

/**
 *
 * @author Celvin Pati
 */
public class SegitigaMain {
    // Method utama sebagai entry point program
    public static void main(String[] args) {
        // Membuat objek segitiga pertama (seg1)
        Segitiga seg1 = new Segitiga();
        // Mengisi koordinat titik-titik segitiga pertama
        seg1.x1 = 1; seg1.y1 = 2;
        seg1.x2 = 7; seg1.y2 = 2;
        seg1.x3 = 7; seg1.y3 = 9;

        // Membuat objek segitiga kedua (seg2)
        Segitiga seg2 = new Segitiga();
        // Mengisi koordinat titik-titik segitiga kedua
        seg2.x1 = 0; seg2.y1 = 0;
        seg2.x2 = 5; seg2.y2 = 4;
        seg2.x3 = 8; seg2.y3 = 2;

        // Membuat objek segitiga ketiga (seg3)
        Segitiga seg3 = new Segitiga();
        // Mengisi koordinat titik-titik segitiga ketiga
        seg3.x1 = 3; seg3.y1 = 1;
        seg3.x2 = 6; seg3.y2 = 1;
        seg3.x3 = 3; seg3.y3 = 4;

        // Membuat objek KumpulanSegitiga
        KumpulanSegitiga kumpulan = new KumpulanSegitiga();
        // Menambahkan segitiga-segitiga ke dalam kumpulan
        kumpulan.tambahSegitiga(seg1);
        kumpulan.tambahSegitiga(seg2);
        kumpulan.tambahSegitiga(seg3);

        // Menampilkan informasi tentang kumpulan segitiga
        System.out.println("Jumlah segitiga dalam kumpulan: " + kumpulan.getJumlahSegitiga());
        System.out.println("Rata-rata luas segitiga: " + kumpulan.hitungRataRataLuas());
        
        // Mencari dan menampilkan segitiga terluas
        Segitiga terluas = kumpulan.cariSegitigaTerluas();
        System.out.println("Segitiga terluas memiliki luas: " + terluas.hitungLuas());
        
        // Mencari dan menampilkan segitiga terkecil
        Segitiga terkecil = kumpulan.cariSegitigaTerkecil();
        System.out.println("Segitiga terkecil memiliki keliling: " + terkecil.hitungKeliling());
    }
}

