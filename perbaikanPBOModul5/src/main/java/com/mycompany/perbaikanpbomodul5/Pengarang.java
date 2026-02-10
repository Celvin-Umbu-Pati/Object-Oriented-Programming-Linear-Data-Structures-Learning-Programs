/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class Pengarang {//awal kelas pengarang
    String nik, nama, alamat; // Variabel untuk simpan data pengarang
    
    public Pengarang(String nik, String nama, String alamat) { // Konstruktor untuk inisialisasi pengarang
        this.nik = nik; //untuk set nik
        this.nama = nama;//untuk set nama
        this.alamat = alamat;//untuk set alamat
    }
    
    public String toString() { // Method ini untuk menampilkan data pengarang dalam bentuk string
        return "NIK: " + nik + ", Nama: " + nama + ", Alamat: " + alamat;
    }
}//akhir kelas pengarang


