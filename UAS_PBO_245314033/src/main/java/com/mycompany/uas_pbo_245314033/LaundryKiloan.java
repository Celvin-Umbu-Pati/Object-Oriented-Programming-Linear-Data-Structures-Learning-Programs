/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
public class LaundryKiloan extends LayananLaundry {
    private double beratKg;
    private double hargaPerKg;

    public LaundryKiloan(String kodeTransaksi, String namaPelanggan,
                         String tanggalMasuk, String tanggalSelesai,
                         double beratKg, double hargaPerKg) {
        super(kodeTransaksi, namaPelanggan, tanggalMasuk, tanggalSelesai);
        this.beratKg = beratKg;
        this.hargaPerKg = hargaPerKg;
    }

    @Override
    public double hitungBiaya() {
        return beratKg * hargaPerKg;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Laundry Kiloan ===");
        System.out.println("Kode       : " + kodeTransaksi);
        System.out.println("Pelanggan  : " + namaPelanggan);
        System.out.println("Masuk      : " + tanggalMasuk);
        System.out.println("Selesai    : " + tanggalSelesai);
        System.out.println("Berat (kg) : " + beratKg);
        System.out.println("Harga/kg   : " + hargaPerKg);
        System.out.println("Total      : " + hitungBiaya());
        System.out.println();
    }
}

