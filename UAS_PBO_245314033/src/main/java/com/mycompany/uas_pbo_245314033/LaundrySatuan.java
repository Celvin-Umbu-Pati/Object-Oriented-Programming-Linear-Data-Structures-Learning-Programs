/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
import java.util.ArrayList;
import java.util.List;

public class LaundrySatuan extends LayananLaundry {
    private List<DaftarItem> items;
    public LaundrySatuan(String kodeTransaksi, String namaPelanggan,
                         String tanggalMasuk, String tanggalSelesai) {
        super(kodeTransaksi, namaPelanggan, tanggalMasuk, tanggalSelesai);
        this.items = new ArrayList<>();
    }
    public void tambahItem(DaftarItem item) {
        items.add(item);
    }
    @Override
    public double hitungBiaya() {
        double total = 0;
        for (DaftarItem it : items) {
            total += it.getSubTotal();
        }
        return total;
    }
    @Override
    public void tampilkanDetail() {
        System.out.println("=== Laundry Satuan ===");
        System.out.println("Kode       : " + kodeTransaksi);
        System.out.println("Pelanggan  : " + namaPelanggan);
        System.out.println("Masuk      : " + tanggalMasuk);
        System.out.println("Selesai    : " + tanggalSelesai);
        System.out.println("Daftar Item:");
        for (DaftarItem it : items) {
            System.out.println("  - " + it);
        }
        System.out.println("Total      : " + hitungBiaya());
        System.out.println();
    }
}
