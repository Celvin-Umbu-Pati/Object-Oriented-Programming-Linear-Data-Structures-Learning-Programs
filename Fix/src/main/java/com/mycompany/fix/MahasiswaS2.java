/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fix;

/**
 *
 * @author Celvin Pati
 */
class MahasiswaS2 extends Mahasiswa {
    // Konstruktor Mahasiswa S2 memanggil konstruktor induk
    public MahasiswaS2(String Nim, String Nama, String TanggalLahir,
                      double Uts1, double Uts2, double Uas) {
        super(Nim, Nama, TanggalLahir, Uts1, Uts2, Uas);
    }

    // Override konversi nilai dengan ketentuan yang berbeda dari S1
    @Override
    public String konversiNilai() {
        if (Final >= 85) return "A";
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
}
