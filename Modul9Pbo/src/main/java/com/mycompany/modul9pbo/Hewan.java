/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

/**
 *
 * @author Celvin Pati
 */
abstract class Hewan {
    // Deklarasi metode abstrak 'suara()' yang wajib diimplementasikan subclass
    abstract void suara(); 
} 
// Kelas Anjing mewarisi (extends) dari kelas abstrak Hewan
class Anjing extends Hewan {
    @Override // Menandakan override metode dari parent class
    void suara() {
        System.out.println("gug gug"); // Implementasi suara anjing
    }
}
// Kelas Kucing mewarisi dari Hewan
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("meong-meong"); // Implementasi suara kucing
    }
}
// Kelas Bebek mewarisi dari Hewan
class Bebek extends Hewan {
    @Override
    void suara() {
        System.out.println("kwek-kwek"); // Implementasi suara bebek
    }
}
// Kelas baru Harimau mewarisi dari Hewan (tambahan sesuai permintaan)
class Harimau extends Hewan {
    @Override
    void suara() {
        System.out.println("raaar"); // Implementasi suara harimau
    }}

