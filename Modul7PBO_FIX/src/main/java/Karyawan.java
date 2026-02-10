/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */

import java.util.Scanner;

// Kelas dasar untuk semua karyawan
class Karyawan {
    // Atribut private untuk nomor pegawai
    private int npp;
    // Atribut private untuk nama karyawan
    private String nama;
    // Atribut private untuk jumlah anak
    private int jumlahAnak;
    // Atribut static public untuk subsidi per anak (nilai tetap)
    public static int subsidiPerAnak = 100000;

    // Konstruktor untuk inisialisasi objek Karyawan
    public Karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;       // Mengisi atribut npp
        this.nama = nama;     // Mengisi atribut nama
        this.jumlahAnak = jumlahAnak; // Mengisi atribut jumlahAnak
    }

    // Method untuk menghitung tunjangan anak
    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak; // Jumlah anak dikali subsidi per anak
    }

    // Getter method untuk npp
    public int getNpp() { return npp; }
    // Getter method untuk nama
    public String getNama() { return nama; }
    // Getter method untuk jumlahAnak
    public int getJumlahAnak() { return jumlahAnak; }
}

// Kelas turunan untuk karyawan tetap
class KaryawanTetap extends Karyawan {
    // Atribut private untuk gaji pokok
    private int gajiPokok;

    // Konstruktor untuk karyawan tetap
    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        // Memanggil konstruktor parent class
        super(npp, nama, jumlahAnak);
        this.gajiPokok = gajiPokok; // Mengisi atribut gajiPokok
    }

    // Method untuk menghitung total gaji
    public int hitungTotalGaji() {
        // Gaji pokok ditambah tunjangan anak dari parent class
        return gajiPokok + super.hitungTunjanganAnak();
    }

    // Getter method untuk gajiPokok
    public int getGajiPokok() { return gajiPokok; }
}

// Kelas turunan untuk karyawan kontrak
class KaryawanKontrak extends Karyawan {
    // Atribut private untuk upah harian
    private int upahHarian;

    // Konstruktor untuk karyawan kontrak
    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian) {
        // Memanggil konstruktor parent class
        super(npp, nama, jumlahAnak);
        this.upahHarian = upahHarian; // Mengisi atribut upahHarian
    }

    // Method untuk menghitung upah total
    public int hitungUpahTotal(int jumlahHariMasuk) {
        // (Upah harian kali jumlah hari) plus tunjangan anak dari parent class
        return (upahHarian * jumlahHariMasuk) + super.hitungTunjanganAnak();
    }

    // Getter method untuk upahHarian
    public int getUpahHarian() { return upahHarian; }
}
