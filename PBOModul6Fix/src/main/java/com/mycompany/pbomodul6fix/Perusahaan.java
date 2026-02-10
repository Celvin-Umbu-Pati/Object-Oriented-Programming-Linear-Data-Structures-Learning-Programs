/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versiarraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Celvin Pati
 */
public class Perusahaan {//awal kelas Perusahaan
     private String namaPerusahaan; // Menyimpan nama perusahaan
    private String alamat;        // Menyimpan alamat perusahaan
    private String pemilik;       // Menyimpan nama pemilik
    private String npwp;          // Menyimpan nomor NPWP
    
    // Menggunakan ArrayList untuk menyimpan koleksi pegawai
    private List<Pegawai> daftarPegawai;

    // Constructor untuk membuat objek Perusahaan baru
    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String npwp) {
        this.namaPerusahaan = namaPerusahaan; // Set nama perusahaan
        this.alamat = alamat;                // Set alamat
        this.pemilik = pemilik;               // Set pemilik
        this.npwp = npwp;                     // Set NPWP
        this.daftarPegawai = new ArrayList<>(); // Inisialisasi ArrayList
    }

    // Method untuk menambahkan pegawai baru
    public void tambahPegawai(Pegawai pegawaiBaru) {
        // Cek apakah pegawai dengan NIP yang sama sudah ada
        if (daftarPegawai.contains(pegawaiBaru)) {
            System.out.println("Pegawai dengan NIP " + pegawaiBaru.getNIP() + " sudah ada!");
            return;
        }
        daftarPegawai.add(pegawaiBaru); // Tambahkan pegawai ke ArrayList
        System.out.println("Pegawai " + pegawaiBaru.getNama() + " berhasil ditambahkan.");
    }

    // Method untuk menampilkan daftar semua pegawai
    public void tampilkanDaftarPegawai() {
        if (daftarPegawai.isEmpty()) { // Cek jika tidak ada pegawai
            System.out.println("Belum ada pegawai di perusahaan ini.");
            return;
        }
        System.out.println("===== Daftar Pegawai " + namaPerusahaan + " =====");
        // Loop melalui semua pegawai menggunakan for-each
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.tampilkanInfo(); // Tampilkan info pegawai
        }
    }

    // Method untuk mencari pegawai dengan gaji tertinggi
    public Pegawai getPegawaiGajiTertinggi() {
        if (daftarPegawai.isEmpty()) return null; // Return null jika tidak ada pegawai
        
        Pegawai tertinggi = daftarPegawai.get(0); // Asumsikan pegawai pertama tertinggi
        // Cari pegawai dengan gaji lebih tinggi
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai.getGajiPokok() > tertinggi.getGajiPokok()) {
                tertinggi = pegawai;
            }
        }
        return tertinggi;
    }

    // Method untuk mencari pegawai dengan gaji terendah
    public Pegawai getPegawaiGajiTerendah() {
        if (daftarPegawai.isEmpty()) return null; // Return null jika tidak ada pegawai
        
        Pegawai terendah = daftarPegawai.get(0); // Asumsikan pegawai pertama terendah
        // Cari pegawai dengan gaji lebih rendah
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai.getGajiPokok() < terendah.getGajiPokok()) {
                terendah = pegawai;
            }
        }
        return terendah;
    }

    // Method untuk menghitung rata-rata gaji semua pegawai
    public double getRataRataGaji() {
        if (daftarPegawai.isEmpty()) return 0; // Return 0 jika tidak ada pegawai
        
        double total = 0;
        // Hitung total gaji semua pegawai
        for (Pegawai pegawai : daftarPegawai) {
            total += pegawai.getGajiPokok();
        }
        return total / daftarPegawai.size(); // Hitung rata-rata
    }

    // Method untuk menghapus pegawai berdasarkan NIP
    public boolean hapusPegawai(String NIP) {
        // Buat objek dummy untuk pencarian
        Pegawai pegawai = new Pegawai(NIP, "", 0);
        return daftarPegawai.remove(pegawai); // Hapus pegawai jika ditemukan
    }

    // Method getter untuk mendapatkan jumlah pegawai
    public int getJumlahPegawai() {
        return daftarPegawai.size(); // Kembalikan ukuran ArrayList
    }

    // Method getter untuk nama perusahaan
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    // Method getter untuk alamat perusahaan
    public String getAlamat() {
        return alamat;
    }

    // Method getter untuk nama pemilik
    public String getPemilik() {
        return pemilik;
    }

    // Method getter untuk NPWP
    public String getNpwp() {
        return npwp;
    }
}
