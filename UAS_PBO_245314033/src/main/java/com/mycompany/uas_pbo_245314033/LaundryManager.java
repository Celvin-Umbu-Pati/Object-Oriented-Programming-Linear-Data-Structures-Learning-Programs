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

public class LaundryManager {
    private List<LayananLaundry> transaksi;

    public LaundryManager() {
        transaksi = new ArrayList<>();
    }

    public void tambahTransaksi(LayananLaundry l) {
        transaksi.add(l);
    }

    public void tampilSemuaTransaksi() {
        for (LayananLaundry l : transaksi) {
            l.tampilkanDetail();
        }
    }

    public double hitungTotalPendapatan() {
        double total = 0;
        for (LayananLaundry l : transaksi) {
            total += l.hitungBiaya();
        }
        return total;
    }

    public double hitungPendapatanKiloan() {
        double total = 0;
        for (LayananLaundry l : transaksi) {
            if (l instanceof LaundryKiloan) {
                total += l.hitungBiaya();
            }
        }
        return total;
    }

    public double hitungPendapatanSatuan() {
        double total = 0;
        for (LayananLaundry l : transaksi) {
            if (l instanceof LaundrySatuan) {
                total += l.hitungBiaya();
            }
        }
        return total;
    }
}

