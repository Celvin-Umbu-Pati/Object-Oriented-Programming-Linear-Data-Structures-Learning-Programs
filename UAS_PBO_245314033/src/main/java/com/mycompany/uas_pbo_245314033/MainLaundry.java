/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
public class MainLaundry {
    public static void main(String[] args) {
        LaundryManager m1 = new LaundryManager();

        LaundryKiloan lk1 = new LaundryKiloan(
            "TRX001", "Dina", "2025-06-15", "2025-06-17",
            5.0, 7000
        );

        LaundrySatuan ls1 = new LaundrySatuan(
            "TRX002", "Sari", "2025-06-15", "2025-06-17"
        );
        ls1.tambahItem(new DaftarItem("Jas", 2, 15000));
        ls1.tambahItem(new DaftarItem("Seprai", 1, 10000));

        m1.tambahTransaksi(lk1);
        m1.tambahTransaksi(ls1);

        m1.tampilSemuaTransaksi();

        System.out.println("=== Total Pendapatan Keseluruhan ===");
        System.out.println("Rp " + m1.hitungTotalPendapatan());

        System.out.println("=== Total Pendapatan Kiloan ===");
        System.out.println("Rp " + m1.hitungPendapatanKiloan());

        System.out.println("=== Total Pendapatan Satuan ===");
        System.out.println("Rp " + m1.hitungPendapatanSatuan());
    }
}
