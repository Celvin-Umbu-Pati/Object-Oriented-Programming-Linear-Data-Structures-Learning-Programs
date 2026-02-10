/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
class Mahasiswa implements Learner {
    // Atribut dengan tipe protected supaya bisa diakses oleh kelas turunan
    protected String Nim;            // Nomor Induk Mahasiswa
    protected String Nama;          // Nama lengkap mahasiswa
    protected String TanggalLahir; // Format: DD-MM-YYYY
    protected double Uts1;        // Nilai Ujian Tengah Semester 1 (0-100)
    protected double Uts2;        // Nilai Ujian Tengah Semester 2 (0-100)
    protected double Uas;        // Nilai Ujian Akhir Semester (0-100)
    protected double Final;        // Nilai akhir yang dihitung dari UTS1, UTS2, dan UAS
    // Konstruktor untuk inisialisasi data mahasiswa dan hitung nilai akhir
    public Mahasiswa(String Nim, String Nama, String TanggalLahir, 
                   double Uts1, double Uts2, double Uas) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Uts1 = Uts1;
        this.Uts2 = Uts2;
        this.Uas = Uas;
        this.Final = hitungNilaiFinal(); // untuk hitung nilai final secara otomatis
    }
    //untuk hitung nilai akhir dengan bobot 30% UTS1, 30% UTS2, dan 40% UAS
    public double hitungNilaiFinal() {
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }
    // Implementasi metode dari interface Learner 
    @Override
    public String getCourseGrade() {
        if (Final >= 80) return "A";
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
    // Getter untuk mengakses data privat
    public String getNim() { return Nim; }
    public String getNama() { return Nama; }
    public String getTanggalLahir() { return TanggalLahir; }
    public double getFinal() { return Final; }
}
