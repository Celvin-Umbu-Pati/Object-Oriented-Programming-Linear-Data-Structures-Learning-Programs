/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fix;

/**
 *
 * @author Celvin Pati
 */
class KaryawanKontrak extends Karyawan {

    private int upahHarian;       // Upah per hari
    private int jumlahHariMasuk;  // Jumlah hari kerja

    // Constructor karyawan kontrak
    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);  // Panggil constructor parent class
        this.upahHarian = upahHarian;  // Set nilai upahHarian
        this.jumlahHariMasuk = jumlahHariMasuk;  // Set nilai jumlahHariMasuk
    }

    // Method hitung total upah (upah harian * hari kerja + tunjangan anak)
    public int hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + super.hitungTunjanganAnak();
    }

    // Getter methods
    public int getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }
}
