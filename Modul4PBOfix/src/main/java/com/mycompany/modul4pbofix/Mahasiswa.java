/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4pbofix;

/**
 *
 * @author Celvin Pati
 */
public class Mahasiswa {
   // bagian ini untuk deklarasi atribut mahasiswa
    public String Nim;             // NIM mahasiswa
    public String Nama;            // Nama mahasiswa
    public String TanggalLahir;    // Tanggal lahir mahasiswa
    public double Uts1;            // Nilai UTS pertama
    public double Uts2;            // Nilai UTS kedua
    public double Uas;             // Nilai UAS
    public double Final;           // Nilai akhir mahasiswa (setelah perhitungan)
    public String NilaiKonversi;   // Nilai huruf (A, B, C, D, atau E)

    // bagian ini adalah constructor: yang dipakai untuk menginisialisasi objek Mahasiswa
    public Mahasiswa(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        this.Nim = Nim;                      // isi atribut Nim dengan nilai dari parameter
        this.Nama = Nama;                    // isi atribut Nama dengan nilai dari parameter
        this.TanggalLahir = TanggalLahir;    // isi atribut TanggalLahir dengan nilai dari parameter
        this.Uts1 = Uts1;                    // isi atribut Uts1 dengan nilai dari parameter
        this.Uts2 = Uts2;                    // isi atribut Uts2 dengan nilai dari parameter
        this.Uas = Uas;                      // isi atribut Uas dengan nilai dari parameter
        this.Final = hitungNilaiFinal();     // hitung dan menyimpan nilai akhir ke atribut Final
    }

    // ini adalah method untuk hitung nilai akhir mahasiswa
    public double hitungNilaiFinal() {
        // Perhitungan nilai akhir dengan bobot:
        // 30% dari UTS1, 30% dari UTS2, dan 40% dari UAS
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }

}//akhir kelas mahasiswa

