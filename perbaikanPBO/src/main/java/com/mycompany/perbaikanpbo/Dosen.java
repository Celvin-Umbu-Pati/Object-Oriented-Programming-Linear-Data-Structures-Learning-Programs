/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;

/**
 *
 * @author Celvin Pati
 */
public class Dosen {
    private String npp;   // Nomor Pokok Pegawai
    private String nama;  // Nama Dosen
    private String gelar; // Gelar Dosen

    // Constructor untuk menginisialisasi atribut Dosen
    public Dosen(String npp, String nama, String gelar) {
        this.npp = npp;       // Mengatur nilai npp
        this.nama = nama;     // Mengatur nilai nama
        this.gelar = gelar;   // Mengatur nilai gelar
    }

    // Getter untuk mendapatkan nilai npp
    public String getNpp() {
        return npp;           // Mengembalikan nilai npp
    }

    // Setter untuk mengatur nilai npp
    public void setNpp(String npp) {
        this.npp = npp;       // Mengatur nilai npp
    }

    // Getter untuk mendapatkan nilai nama
    public String getNama() {
        return nama;          // Mengembalikan nilai nama
    }

    // Setter untuk mengatur nilai nama
    public void setNama(String nama) {
        this.nama = nama;     // Mengatur nilai nama
    }

    // Getter untuk mendapatkan nilai gelar
    public String getGelar() {
        return gelar;         // Mengembalikan nilai gelar
    }

    // Setter untuk mengatur nilai gelar
    public void setGelar(String gelar) {
        this.gelar = gelar;   // Mengatur nilai gelar
    }
}

class ProgramStudi {
    private String kodeProdi;     // Kode Program Studi
    private String namaProdi;      // Nama Program Studi
    private Dosen ketuaProdi;      // Referensi ke objek Dosen sebagai ketua program studi

    // Constructor untuk menginisialisasi atribut ProgramStudi
    public ProgramStudi(String kodeProdi, String namaProdi, Dosen ketuaProdi) {
        this.kodeProdi = kodeProdi;     // Mengatur nilai kodeProdi
        this.namaProdi = namaProdi;      // Mengatur nilai namaProdi
        this.ketuaProdi = ketuaProdi;    // Mengatur referensi ketuaProdi ke objek Dosen
    }

    // Getter untuk mendapatkan nilai kodeProdi
    public String getKodeProdi() {
        return kodeProdi;      // Mengembalikan nilai kodeProdi
    }

    // Setter untuk mengatur nilai kodeProdi
    public void setKodeProdi(String kodeProdi) {
        this.kodeProdi = kodeProdi;   // Mengatur nilai kodeProdi
    }

    // Getter untuk mendapatkan nilai namaProdi
    public String getNamaProdi() {
        return namaProdi;       // Mengembalikan nilai namaProdi
    }

    // Setter untuk mengatur nilai namaProdi
    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;   // Mengatur nilai namaProdi
    }

    // Getter untuk mendapatkan objek Dosen sebagai ketuaProdi
    public Dosen getKetuaProdi() {
        return ketuaProdi;     // Mengembalikan referensi ketuaProdi
    }

    // Setter untuk mengatur referensi ketuaProdi
    public void setKetuaProdi(Dosen ketuaProdi) {
        this.ketuaProdi = ketuaProdi;   // Mengatur referensi ketuaProdi ke objek Dosen
    }
}