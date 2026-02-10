/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class GajiPegawai {
     // Atribut untuk menyimpan NPP pegawai
    private String npp;
    // Atribut untuk menyimpan nama pegawai
    private String nama;
    // Atribut untuk menyimpan golongan pegawai
    private int golongan;
    // Atribut untuk menyimpan status menikah pegawai
    private boolean status; // true jika menikah, false jika tidak
    // Atribut untuk menyimpan jumlah anak pegawai
    private int jumlahAnak;

    // Konstruktor untuk menginisialisasi atribut
    public GajiPegawai(String npp, String nama, String status1, int golongan, int jumlahAnak) {
        this.npp = npp; // Mengatur NPP pegawai
        this.nama = nama; // Mengatur nama pegawai
        this.golongan = golongan; // Mengatur golongan pegawai
        this.status = status; // Mengatur status pegawai
        this.jumlahAnak = jumlahAnak; // Mengatur jumlah anak pegawai
    }

    // Metode untuk menghitung gaji pokok berdasarkan golongan
    public double hitungGajiPokok() {
        // Variabel untuk menyimpan gaji pokok
        double gajiPokok = 0;

        // Menentukan gaji pokok berdasarkan golongan
        switch (golongan) {
            case 1:
                gajiPokok = 1300000; // Gaji pokok untuk golongan 1
                break;
            case 2:
                gajiPokok = 1750000; // Gaji pokok untuk golongan 2
                break;
            case 3:
                gajiPokok = 2000000; // Gaji pokok untuk golongan 3
                break;
            default:
                // Jika golongan tidak valid, kembalikan 0
                gajiPokok = 0;
                break;
        }

        return gajiPokok; // Mengembalikan nilai gaji pokok
    }

    // Metode untuk menghitung tunjangan keluarga
    public double hitungTunjanganKeluarga() {
        // Jika pegawai menikah, hitung tunjangan
        if (status) {
            return 300000 + (jumlahAnak * 100000); // Tunjangan keluarga
        } else {
            return 0; // Tidak ada tunjangan jika tidak menikah
        }
    }

    // Metode untuk menghitung gaji total
    public double hitungGajiTotal() {
        // Menghitung gaji total dengan menjumlahkan gaji pokok dan tunjangan keluarga
        return hitungGajiPokok() + hitungTunjanganKeluarga();
    }
}


