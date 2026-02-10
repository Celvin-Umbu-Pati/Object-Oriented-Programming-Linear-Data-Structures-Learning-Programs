/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
class MainHewan {
    public static void main(String[] args) {
        Hewan kewan; // Deklarasi variabel bertipe abstrak Hewan
        
        // Polimorfisme: objek Anjing diakses melalui referensi Hewan
        kewan = new Anjing();
        kewan.suara(); // Memanggil metode suara() dari Anjing
        
        // Polimorfisme: objek Kucing diakses melalui referensi Hewan
        kewan = new Kucing();
        kewan.suara(); // Memanggil metode suara() dari Kucing
        
        // Polimorfisme: objek Bebek diakses melalui referensi Hewan
        kewan = new Bebek();
        kewan.suara(); // Memanggil metode suara() dari Bebek
        
        // Polimorfisme: objek Harimau diakses melalui referensi Hewan
        kewan = new Harimau();
        kewan.suara(); // Memanggil metode suara() dari Harimau
    }
}
