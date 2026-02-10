/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Soal2_033 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Harga serabi
        final int HARGA_MESES = 2000;
        final int HARGA_KEJU = 3000;
        final int HARGA_PISANG = 2500;
        final int HARGA_NANGKA = 2500;

        // Input nama pembeli
        System.out.print("Nama: ");
        String namaPembeli = keyboard.nextLine();

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah serabi meses: ");
        int jumlahMeses = keyboard.nextInt();
        System.out.print("Masukkan jumlah serabi keju: ");
        int jumlahKeju = keyboard.nextInt();
        System.out.print("Masukkan jumlah serabi pisang: ");
        int jumlahPisang = keyboard.nextInt();
        System.out.print("Masukkan jumlah serabi nangka: ");
        int jumlahNangka = keyboard.nextInt();

        // Hitung total harga
        int total = (jumlahMeses * HARGA_MESES) +
                    (jumlahKeju * HARGA_KEJU) +
                    (jumlahPisang * HARGA_PISANG) +
                    (jumlahNangka * HARGA_NANGKA);

        // Hitung diskon jika total >= 40.000
        double diskon = 0;
        if (total >= 40000) {
            diskon = total * 0.05; // Diskon 5%
        }

        // Hitung total akhir
        double totalAkhir = total - diskon;

        // Cetak nota transaksi
      System.out.println("--- Nota Kios Serabi \"Selera-Ku\" ---");
      System.out.println("Nama: " + namaPembeli);
      System.out.println("Jml Jenis   @     Harga");
      System.out.println("=============================");
      System.out.println(+ jumlahMeses +  "  Meses " + HARGA_MESES +  " " + (jumlahMeses * HARGA_MESES));
      System.out.println(+ jumlahKeju +   "  Keju  " + HARGA_KEJU +  " "  + (jumlahKeju * HARGA_KEJU));
      System.out.println(+ jumlahPisang + "  Pisang " + HARGA_PISANG +  " " + (jumlahPisang * HARGA_PISANG));
      System.out.println(+ jumlahNangka + "  Nangka " + HARGA_NANGKA +  " " + (jumlahNangka * HARGA_NANGKA));
      System.out.println("=============================");
      System.out.println("TOTAL: " + total);
       if (diskon > 0) {
            System.out.println("DISCOUNT 5%: - " + diskon);
        }
        System.out.println("DIBAYARKAN: " + totalAkhir);
        System.out.println("Terima kasih Telah Berbelanja Di Kios Tradisional Celvin");
          }
         }

