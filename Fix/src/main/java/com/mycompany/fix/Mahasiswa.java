/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fix;

/**
 *
 * @author Celvin Pati
 */
class Mahasiswa {
    protected String Nim;           // Menyimpan NIM mahasiswa
    protected String Nama;          // Menyimpan nama mahasiswa
    protected String TanggalLahir;  // Menyimpan tanggal lahir
    protected double Uts1;          // Nilai UTS pertama
    protected double Uts2;          // Nilai UTS kedua
    protected double Uas;           // Nilai UAS
    protected double Final;         // Nilai akhir (final)
    protected String NilaiKonversi; // Nilai akhir dalam huruf (A, B, C)
    
    // Konstruktor untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String Nim, String Nama, String TanggalLahir, 
                   double Uts1, double Uts2, double Uas) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Uts1 = Uts1;
        this.Uts2 = Uts2;
        this.Uas = Uas;
        this.Final = hitungNilaiFinal();        // Hitung nilai akhir saat objek dibuat
        this.NilaiKonversi = konversiNilai();   // Konversi nilai akhir menjadi huruf
    }
        // Menghitung nilai akhir dari UTS1, UTS2, dan UAS
    public double hitungNilaiFinal() {
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }

    // Mengubah nilai akhir menjadi nilai huruf (konversi untuk S1)
    public String konversiNilai() {
        if (Final >= 80) return "A";
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
        // Getter untuk tanggal lahir
    public String getTanggalLahir() {
        return TanggalLahir;
    }

    // Getter lainnya
    public String getNim() { return Nim; }
    public String getNama() { return Nama; }
    public double getFinal() { return Final; }
    public String getNilaiKonversi() { return NilaiKonversi; }
}


    

