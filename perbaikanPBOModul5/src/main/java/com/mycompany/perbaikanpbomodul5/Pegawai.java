/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perbaikanpbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class Pegawai {//awal kelas pegawai
    // Atribut ini untuk simpan nama pegawai
    private String nama;
    // Atribut ini untuk simpan jabatan pegawai
    private String jabatan;
    // Atribut ini untuk simpan gaji pokok pegawai
    private double gajiPokok;
    
    // ini adalah constructor untuk inisialisasi objek Pegawai
    public Pegawai(String nama, String jabatan, double gajiPokok) {
        this.nama = nama; // untuk isi atribut nama
        this.jabatan = jabatan; // untuk isi atribut jabatan
        this.gajiPokok = gajiPokok; // untuk isi atribut gajiPokok
    }

    // Getter untuk untuk baca nama pegawai
    public String getNama() {
        return nama;
    }

    // Getter untuk baca jabatan pegawai
    public String getJabatan() {
        return jabatan;
    }

    // Getter untuk baca gaji pokok pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }
    //method ini untuk menampilkan informasi pegawai
    public String toString() {
        // Menggunakan String.format untuk memformat gaji pokok
        return String.format(
            "Nama: %s, Jabatan: %s, Gaji Pokok: %,.0f",
            nama, jabatan, gajiPokok
        );
    }//akhir metde utama
}//akhir kelas Pegawai
    

