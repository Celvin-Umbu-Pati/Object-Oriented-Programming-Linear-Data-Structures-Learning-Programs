/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class BankMain {//awak kelas BnakMain

    public static void main(String args[]) {//metode utama
        RekeningBank rekeningBudi;
        rekeningBudi = new RekeningBank("12345");//membuat objek rekeningBundi
System.out.println("Rekening Budi = " + rekeningBudi.cekSaldo()); //untuk cetak informasi rekening
        System.out.println("Menabung Rp 50.000");//untuk cetak jumlah tabung
        rekeningBudi.tabung(50000);
        System.out.println("Rekening Budi sekarang=" + rekeningBudi.cekSaldo());//untuk cetak dan cek saldo
        System.out.println("Mengambil Rp 20.000");
        rekeningBudi.ambil(20000);
        System.out.println("Rekening Budi sekarang =" + rekeningBudi.cekSaldo());//untuk menampilkan saldo Budi sekarang
    }
}//akhir kelas BankMain
