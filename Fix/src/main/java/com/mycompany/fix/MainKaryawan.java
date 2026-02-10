/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class MainKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Buat objek Scanner
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();  // Buat koleksi heterogen

        // Input jumlah karyawan
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();  // Bersihkan newline di buffer

        // Loop untuk input data setiap karyawan
        for(int i=0; i<jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i+1));
            
            // Input jenis karyawan
            System.out.print("Jenis karyawan (1=Tetap, 2=Kontrak): ");
            int jenis = scanner.nextInt();
            scanner.nextLine();  // Bersihkan newline di buffer
            
            // Input data umum semua karyawan
            System.out.print("NPP: ");
            int npp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jumlah anak: ");
            int anak = scanner.nextInt();
            
            // Input data spesifik berdasarkan jenis karyawan
            if(jenis == 1) {
                // Input data karyawan tetap
                System.out.print("Gaji pokok: ");
                int gaji = scanner.nextInt();
                daftarKaryawan.add(new KaryawanTetap(npp, nama, anak, gaji));
            } else {
                // Input data karyawan kontrak
                System.out.print("Upah harian: ");
                int upah = scanner.nextInt();
                System.out.print("Jumlah hari masuk: ");
                int hari = scanner.nextInt();
                daftarKaryawan.add(new KaryawanKontrak(npp, nama, anak, upah, hari));
            }
        }
        
        // Tampilkan semua karyawan
        System.out.println("\nDaftar Seluruh Karyawan:");
        System.out.println("===========================================");
        for(Karyawan k : daftarKaryawan) {
            System.out.println("Nama: " + k.getNama());
            
            // Cek jenis karyawan menggunakan instanceof
            if(k instanceof KaryawanTetap) {
                KaryawanTetap tetap = (KaryawanTetap)k;  // Downcasting
                System.out.println("Jenis: Tetap");
                System.out.println("Total Gaji: Rp" + tetap.hitungTotalGaji());
            } else {
                KaryawanKontrak kontrak = (KaryawanKontrak)k;  // Downcasting
                System.out.println("Jenis: Kontrak");
                System.out.println("Total Upah: Rp" + kontrak.hitungUpahTotal());
            }
            System.out.println("-------------------------------------------");
        }
        
        // Tampilkan karyawan kontrak dengan upah < 1 juta
        System.out.println("\nKaryawan Kontrak dengan Upah < Rp1.000.000:");
        System.out.println("===========================================");
        for(Karyawan k : daftarKaryawan) {
            if(k instanceof KaryawanKontrak) {
                KaryawanKontrak kontrak = (KaryawanKontrak)k;
                int total = kontrak.hitungUpahTotal();
                if(total < 1000000) {
                    System.out.println("Nama: " + k.getNama());
                    System.out.println("Total Upah: Rp" + total);
                    System.out.println("-------------------------------------------");
                }
            }
        }
        
        scanner.close();  // Tutup Scanner
    }
}
