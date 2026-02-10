/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class Perusahaan {//awal kelas Perusahaan
    // Atribut untuk simpan nama perusahaan
    private String namaPerusahaan;
    // Atribut untuk simpan alamat perusahaan
    private String alamat;
    // Atribut untuk simpan nama pemilik perusahaan
    private String pemilik;
    // Atribut untuk simpan NPWP perusahaan
    private String NPWP;
    // Array untuk simpan daftar pegawai
    private Pegawai[] daftarPegawai;
    // Variabel untuk lacak jumlah pegawai yang ditambah
    private int jumlahPegawaiSaatIni;

    // Constructor ini untuk inisialisasi objek Perusahaan
    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP, int maxPegawai) {
        this.namaPerusahaan = namaPerusahaan; // ini untuk isi atribut namaPerusahaan
        this.alamat = alamat; // untuk isi atribut alamat
        this.pemilik = pemilik; // untuk isi atribut pemilik
        this.NPWP = NPWP; // untuk isi atribut NPWP
        this.daftarPegawai = new Pegawai[maxPegawai]; // ini adalah inisialisasi array dgnan ukuran terbesar
        this.jumlahPegawaiSaatIni = 0; // nilai awal belum ada pegawai jika defuld
    }

    // Method ini untuk tambahkan pegawai ke dalam array
    public void tambahPegawai(Pegawai pegawai) {
        if (jumlahPegawaiSaatIni < daftarPegawai.length) { // untuk cek jika masih ada ruang di array
            daftarPegawai[jumlahPegawaiSaatIni] = pegawai; // untuk tambah pegawai ke array
            jumlahPegawaiSaatIni++; // untuk tmabah jumlah pegawai yang sudah ditambahkan
        } else {
            System.out.println("Kapasitas pegawai penuh, tidak bisa menambah pegawai lagi.");
        }
    }

    // Method ini untuk menampilkan semua pegawai
    public void tampilkanSemuaPegawai() {
        if (jumlahPegawaiSaatIni == 0) { // untuk cek jika tidak ada pegawai
            System.out.println("Tidak ada pegawai.");
            return;
        }

        // Loop ini untuk menampilkan semua pegawai
        for (int i = 0; i < jumlahPegawaiSaatIni; i++) {
            System.out.println(daftarPegawai[i]); // untuk menampilkan informasi pegawai
        }
    }

    // Method ini untuk menampilkan informasi gaji pegawai
    public void tampilkanInformasiGaji() {
        if (jumlahPegawaiSaatIni == 0) { // untuk cek jika tidak ada pegawai
            System.out.println("Tidak ada pegawai.");
            return;
        }

        // Inisialisasi pegawai dengan gaji terbesar dan terkecil
        Pegawai pegawaiTerbesar = daftarPegawai[0];
        Pegawai pegawaiTerkecil = daftarPegawai[0];
        double totalGaji = 0; // Variabel untuk simpan total gaji

        // Loop ini untuk cari pegawai dengan gaji terbesar, terkecil, dan hitung total gaji
        for (int i = 0; i < jumlahPegawaiSaatIni; i++) {
            Pegawai pegawai = daftarPegawai[i];
            if (pegawai.getGajiPokok() > pegawaiTerbesar.getGajiPokok()) {
                pegawaiTerbesar = pegawai; // untuk perbaharui pegawai dengan gaji terbesar
            }
            if (pegawai.getGajiPokok() < pegawaiTerkecil.getGajiPokok()) {
                pegawaiTerkecil = pegawai; // untuk perbaharui pegawai dengan gaji terkecil
            }
            totalGaji += pegawai.getGajiPokok(); // untuk tambah gaji ke totalGaji
        }

        // untuk hitung rata-rata gaji
        double rataRataGaji = totalGaji / jumlahPegawaiSaatIni;

        // untuk menampilkan informasi gaji
        System.out.println("Pegawai dengan gaji terbesar: " + pegawaiTerbesar);
        System.out.println("Pegawai dengan gaji terkecil: " + pegawaiTerkecil);
        System.out.println("Rata-rata gaji pokok: " + rataRataGaji);
    }
}//akhir kelas Perusahaan

