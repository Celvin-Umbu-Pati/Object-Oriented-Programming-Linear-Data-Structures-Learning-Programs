/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

/**
 *
 * @author Celvin Pati
 */
public class Pengarang {
    private String nik;     // Nomor Induk Kependudukan pengarang
    private String nama;    // Nama lengkap pengarang
    private String alamat;  // Alamat pengarang
   
    public Pengarang(String nik, String nama, String alamat) {
        this.nik = nik;      // Set NIK
        this.nama = nama;    // Set nama
        this.alamat = alamat;// Set alamat
    }
    
    @Override
    public String toString() {
        return "NIK: " + nik + ", Nama: " + nama + ", Alamat: " + alamat;
    }
}

