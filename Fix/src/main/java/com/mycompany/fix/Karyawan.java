/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fix;

/**
 *
 * @author Celvin Pati
 */
class Karyawan {

    // Deklarasi atribut private
    private int npp;          // Nomor Pegawai
    private String nama;      // Nama karyawan
    private int jumlahAnak;   // Jumlah anak karyawan

    // Variabel static untuk subsidi per anak (nilai sama untuk semua karyawan)
    public static int subsidiPerAnak = 100000;

    // Constructor untuk inisialisasi objek Karyawan
    public Karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;       // Set nilai npp
        this.nama = nama;     // Set nilai nama
        this.jumlahAnak = jumlahAnak; // Set nilai jumlahAnak
    }

    // Method menghitung tunjangan anak
    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;  // Hitung total subsidi anak
    }

    // Getter methods untuk mengakses atribut private
    public int getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }
}
