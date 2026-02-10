/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uas_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
public class DaftarItem {
    private String namaItem;
    private int jumlah;
    private double hargaPerItem;

    public DaftarItem(String namaItem, int jumlah, double hargaPerItem) {
        this.namaItem = namaItem;
        this.jumlah = jumlah;
        this.hargaPerItem = hargaPerItem;
    }

    public double getSubTotal() {
        return jumlah * hargaPerItem;
    }

    @Override
    public String toString() {
        return namaItem + " (x" + jumlah + ") = " + getSubTotal();
    }
}
