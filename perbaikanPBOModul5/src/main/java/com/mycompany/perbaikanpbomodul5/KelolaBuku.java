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
public class KelolaBuku {//awal kelas kelolaBuku
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // unutk buat objek Scanner untuk input pengguna

        System.out.print("Masukkan jumlah buku yang mau disimpan: ");
        int jumlahBuku = scanner.nextInt(); // baca jumlah buku dari input pengguna
        scanner.nextLine(); //  newline supaya input berikutnya tidak terlewat

        Buku[] daftarBuku = new Buku[jumlahBuku]; //untuk buat array untuk simpan daftar buku

        for (int i = 0; i < jumlahBuku; i++) { // Loop untuk memasukkan data setiap buku
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Kode Buku: ");
            String kodeBuku = scanner.nextLine(); // untuk baca kode buku
            System.out.print("Judul: ");
            String judul = scanner.nextLine(); // untuk baca judul buku
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt(); // untuk baca tahun terbit buku
            System.out.print("Jumlah Pengarang: ");
            int jumlahPengarang = scanner.nextInt(); // untuk baca jumlah pengarang buku
            scanner.nextLine(); // newline supaya input berikutnya tidak terlewat

            Buku buku = new Buku(kodeBuku, judul, tahunTerbit, jumlahPengarang); // untuk buat objek buku baru

            for (int j = 0; j < jumlahPengarang; j++) { // Loop untuk memasukkan data pengarang
                System.out.println("Masukkan data pengarang ke-" + (j + 1));
                System.out.print("NIK: ");
                String nik = scanner.nextLine(); // untuk baca NIK pengarang
                System.out.print("Nama: ");
                String nama = scanner.nextLine(); // untuk baca nama pengarang
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine(); // unutk baca alamat pengarang
                buku.tambahPengarang(new Pengarang(nik, nama, alamat), j); // untuk menambah pengarang ke dalam buku
            }
            daftarBuku[i] = buku; // untuk simpan buku ke dalam daftar buku
        }

        System.out.println("\nDaftar Buku:");
        for (Buku b : daftarBuku) { // Loop untuk menampilkan semua data buku
            System.out.println(b);
        }

        System.out.print("\nMasukkan tahun untuk mencari jumlah buku yang terbit: ");
        int tahunCari = scanner.nextInt(); // untuk baca tahun yang dicari dari input pengguna
        int jumlah = 0; // Variabel untuk hitung jumlah buku yang terbit di tahun tertentu
        for (Buku b : daftarBuku) { // Loop untuk cek setiap buku
            if (b.tahunTerbit == tahunCari) jumlah++; // Jika tahun terbit sesuai, maka tambahkan jumlah
        }
        System.out.println("Jumlah buku yang terbit pada tahun " + tahunCari + ": " + jumlah);

        Buku bukuTertua = daftarBuku[0], bukuTerbaru = daftarBuku[0]; // untuk inisialisasi buku tertua dan terbaru
        for (Buku b : daftarBuku) { // Loop untuk cari buku tertua dan terbaru
            if (b.tahunTerbit < bukuTertua.tahunTerbit) bukuTertua = b; // Jika lebih tua, maka perbarui buku tertua
            if (b.tahunTerbit > bukuTerbaru.tahunTerbit) bukuTerbaru = b; // Jika lebih baru, maka perbarui buku terbaru
        }

        System.out.println("\nBuku terbitan paling lama:\n" + bukuTertua); // untuk cetak buku tertua
        System.out.println("Buku terbitan paling akhir:\n" + bukuTerbaru); // untuk cetak buku terbaru

        scanner.close(); //tutup scanner
    }
}//akhir kelas KelolaBuku
