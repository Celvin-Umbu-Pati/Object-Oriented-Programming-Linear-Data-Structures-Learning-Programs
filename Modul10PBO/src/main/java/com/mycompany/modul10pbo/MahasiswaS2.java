/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
class MahasiswaS2 extends Mahasiswa {
    // Konstruktor untuk panggil konstruktor kelas induk
    public MahasiswaS2(String Nim, String Nama, String TanggalLahir, 
                     double Uts1, double Uts2, double Uas) {
        super(Nim, Nama, TanggalLahir, Uts1, Uts2, Uas);
    }

    // Override metode getCourseGrade() 
    @Override
    public String getCourseGrade() {
        if (Final >= 85) return "A"; 
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
}