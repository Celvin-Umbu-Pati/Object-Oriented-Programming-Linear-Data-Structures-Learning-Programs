/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbomodul5;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class KelolaPerusahaan {//awal kelas Perusahaan
    public static void main(String[] args) {//awaql metode utama
        Scanner scanner = new Scanner(System.in); // untuk buat objek Scanner untuk input

        // Input data perusahaan
        System.out.print("Masukkan nama perusahaan: ");
        String namaPerusahaan = scanner.nextLine(); // baca nama perusahaan
        System.out.print("Masukkan alamat perusahaan: ");
        String alamat = scanner.nextLine(); // baca alamat perusahaan
        System.out.print("Masukkan nama pemilik: ");
        String pemilik = scanner.nextLine(); // baca nama pemilik
        System.out.print("Masukkan NPWP: ");
        String NPWP = scanner.nextLine(); // baca NPWP

        // untuk input jumlah maksimum pegawai
        System.out.print("Masukkan jumlah maksimum pegawai: ");
        int maxPegawai = scanner.nextInt(); // untuk baca jumlah maksimum pegawai
        scanner.nextLine(); //  untuk newline

        // untuk buat objek Perusahaan
        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, alamat, pemilik, NPWP, maxPegawai);

        // untuk input jumlah pegawai yang mau ditambah
        System.out.print("Masukkan jumlah pegawai yang akan ditambahkan: ");
        int jumlahPegawai = scanner.nextInt(); // untuk baca jumlah pegawai
        scanner.nextLine(); // untuk newline

        // untuk input data pegawai
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Masukkan data pegawai ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine(); // untuk baca nama pegawai
            System.out.print("Jabatan: ");
            String jabatan = scanner.nextLine(); // baca jabatan pegawai
            System.out.print("Gaji Pokok: ");
            double gajiPokok = scanner.nextDouble(); // baca gaji pokok pegawai
            scanner.nextLine(); // untuk newline

            // untuk buat objek Pegawai dan ditambah ke perusahaan
            Pegawai pegawai = new Pegawai(nama, jabatan, gajiPokok);
            perusahaan.tambahPegawai(pegawai);
        }

        // untuk menampilkan semua pegawai
        System.out.println("\nDaftar Pegawai:");
        perusahaan.tampilkanSemuaPegawai();

        // untuk menampilkan informasi gaji pegawai
        System.out.println("\nInformasi Gaji Pegawai:");
        perusahaan.tampilkanInformasiGaji();

        scanner.close(); // Menutup Scanner
    }//akhir metode utama
}//akhir kelas KelolaPerusahaan

