/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner untuk baca input dari pengguna
        //untuk minta jumlah pegawai
        System.out.print("Masukkan jumlah pegawai: ");
        int jumPeg = input.nextInt(); 
        input.nextLine(); // Buang sisa newline
        // array untuk menampung objek Pegawai
        Pegawai[] karyawan = new Pegawai[jumPeg];

        // Loop untuk mengisi data setiap pegawai
        for (int i = 0; i < jumPeg; i++) {
            System.out.println("\nPilih jenis pegawai:");
            System.out.println("1. Manajer");
            System.out.println("2. Pemasaran");
            System.out.println("3. Honorer");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Buang newline
            switch (pilihan) {
                case 1: {
                    // Input data Manajer
                    Manajer m = new Manajer();
                    System.out.print("NPP           : "); m.setNpp(input.nextInt()); input.nextLine();
                    System.out.print("Nama          : "); m.setName(input.nextLine());
                    System.out.print("Gaji Pokok    : "); m.setGapok(input.nextDouble());
                    System.out.print("Tunj. Jabatan : "); m.setTunJab(input.nextDouble());
                    System.out.print("Lembur        : "); m.setLembur(input.nextDouble());
                    karyawan[i] = m; // Simpan ke array
                    break;
                }
                case 2: {
                    // Input data Pemasaran
                    Pemasaran p = new Pemasaran();
                    System.out.print("NPP        : "); p.setNpp(input.nextInt()); input.nextLine();
                    System.out.print("Nama       : "); p.setName(input.nextLine());
                    System.out.print("Gaji Pokok : "); p.setGapok(input.nextDouble());
                    System.out.print("Bonus      : "); p.setBonus(input.nextDouble());
                    karyawan[i] = p; // Simpan ke array
                    break;
                }
                case 3: {
                    // Input data Honorer
                    Honorer h = new Honorer();
                    System.out.print("NPP        : "); h.setNpp(input.nextInt()); input.nextLine();
                    System.out.print("Nama       : "); h.setName(input.nextLine());
                    System.out.print("Gaji Pokok : "); h.setGapok(input.nextDouble());
                    System.out.print("Lembur     : "); h.setLembur(input.nextDouble());
                    karyawan[i] = h; // Simpan ke array
                    break;
                }
                default:
                    // Jika pilihan tidak valid, ulangi
                    System.out.println("Pilihan tidak valid, silakan ulang.");
                    i--; // Kembali ke i yang sama
            }
        }
        //untuk cetak header tabel hasil
        System.out.println("\nNO\tNPP\tNAMA\tSTATUS\t\tGAPOK\tTUNJANGAN\tGAJI TOTAL\tEMAIL");
        // Loop untuk menampilkan data tiap pegawai
        for (int i = 0; i < jumPeg; i++) {
            Pegawai p = karyawan[i];
            System.out.printf(
                "%d.\t%d\t%s\t%s\t%.2f\t%.2f\t\t%.2f\t%s%n",
                i+1,                // Nomor urut
                p.getNpp(),         // NPP
                p.getName(),        // Nama
                p.getStatus(),      // Status jabatan
                p.getGapok(),       // Gaji pokok
                p.getTunjangan(),   // Tunjangan
                p.hitungGatot(),    // Gaji total
                p.getEmail()        // Email
            );
        }
        input.close(); // Tutup scanner
    }
}
