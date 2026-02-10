/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class mobilModul_1 {
    // Mendeklarasikan variabel anggota untuk menyimpan warna mobil
    String warna;

    // Konstruktor untuk kelas mobilModul_1 yang menerima parameter warna
    mobilModul_1(String wrn) { //constructor
        // Menginisialisasi variabel anggota warna dengan nilai parameter
        warna = wrn;
    }

    // Metode untuk mencetak pesan bahwa mobil bergerak maju
    void jalan_maju() {
        // Mencetak warna mobil dan aksi maju ke konsol
        System.out.print("Mobil warna " + warna);
        System.out.println(" Maju !");
    }

    // Metode utama yang dijalankan saat program dieksekusi
    public static void main(String[] args) {
        // Membuat objek sedan dari kelas mobilModul_1 dengan warna "merah"
        mobilModul_1 sedan = new mobilModul_1("merah");
        // Memanggil metode jalan_maju() pada objek sedan
        sedan.jalan_maju();
    }
}
