/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
public abstract class LayananLaundry {
    protected String kodeTransaksi;
    protected String namaPelanggan;
    protected String tanggalMasuk;
    protected String tanggalSelesai;

    public LayananLaundry(String kodeTransaksi, String namaPelanggan,
                          String tanggalMasuk, String tanggalSelesai) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalSelesai = tanggalSelesai;
    }

    public abstract double hitungBiaya();
    public abstract void tampilkanDetail();
}

