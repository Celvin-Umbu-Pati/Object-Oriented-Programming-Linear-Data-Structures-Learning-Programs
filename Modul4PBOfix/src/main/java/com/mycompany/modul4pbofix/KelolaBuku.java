/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4pbofix;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class KelolaBuku {// Kelas awal utama untuk kelola daftar buku
  public static void main(String[] args) {
    // Membuat objek Scanner untuk menerima input dari pengguna
    Scanner input = new Scanner(System.in);

    // untuk meminta jumlah buku yang mau dimasukkan
    System.out.print("Masukkan jumlah buku: ");
    int jumlahBuku = input.nextInt();  // untuk baca jumlah buku dari input pengguna
    input.nextLine(); // Membersihkan newline buffer agar tidak terlewat saat membaca input berikutnya

    // Array untuk simpan daftar buku yang dimasukkan oleh pengguna
    Buku[] daftarBuku = new Buku[jumlahBuku];

    // Proses input data buku dari pengguna
    for (int i = 0; i < jumlahBuku; i++) {
        System.out.println("\nMasukkan data buku ke-" + (i + 1));

        // untuk memasukkan informasi buku
        System.out.print("Kode Buku: ");
        String kode = input.nextLine();  // untuk baca kode buku dari input pengguna

        System.out.print("Judul: ");
        String judul = input.nextLine();  // untuk baca judul buku

        System.out.print("Nama Pengarang: ");
        String pengarang = input.nextLine();  // untuk baca nama pengarang buku

        System.out.print("Tahun Terbit: ");
        int tahun = input.nextInt();  // untuk baca tahun terbit buku
        input.nextLine(); // untuk membersihkan newline buffer agar tidak mengganggu input berikutnya

        // untuk simpan objek buku ke dalam array daftarBuku
        daftarBuku[i] = new Buku(kode, judul, pengarang, tahun);
    }

    // Menampilkan daftar buku yang telah dimasukkan dalam bentuk tabel
    System.out.println("\nDaftar Buku:");
    System.out.println("----------------------------------------------------------");
    System.out.printf("%-10s %-20s %-15s %-10s\n", "Kode", "Judul", "Pengarang", "Tahun Terbit");
    System.out.println("----------------------------------------------------------");

    // Loop untuk menampilkan setiap buku yang sudah dimasukkan
    for (Buku buku : daftarBuku) {
        buku.tampilkanBuku();
    }

    System.out.println("----------------------------------------------------------");

    // untuk menampilkan jumlah buku yang terbit pada tahun tertentu
    System.out.print("\nMasukkan tahun terbit yang ingin dicari: ");
    int tahunCari = input.nextInt();  // unhtuk baca tahun yang ingin dicari
    int jumlahTahun = 0;  // Variabel untuk hitung jumlah buku yang terbit pada tahun tertentu

    System.out.println("\nBuku yang terbit pada tahun " + tahunCari + ":");
    
    // Loop untuk cari buku yang terbit pada tahun tertentu
    for (Buku buku : daftarBuku) {
        if (buku.getTahunTerbit() == tahunCari) {
            buku.tampilkanBuku();  // Menampilkan buku yang ditemukan
            jumlahTahun++;
        }
    }

    // Jika tidak ada buku yang terbit pada tahun tersebut
    if (jumlahTahun == 0) {
        System.out.println("Tidak ada buku yang terbit pada tahun tersebut.");
    }

    // untuk menampilkan data buku berdasarkan pengarang tertentu
    input.nextLine(); // Membersihkan newline buffer sebelum membaca input berikutnya
    System.out.print("\nMasukkan nama pengarang yang ingin dicari: ");
    String pengarangCari = input.nextLine();  // untuk baca nama pengarang yang ingin dicari
    int jumlahPengarang = 0;  // Variabel untuk hitung jumlah buku sesuai dengan pengarang

    System.out.println("\nBuku yang ditulis oleh " + pengarangCari + ":");

    // Loop untuk cari buku sesuai dengan pengarang tertentu
    for (Buku buku : daftarBuku) {
        if (buku.getNamaPengarang().equalsIgnoreCase(pengarangCari)) {  // untuk cek kesamaan nama pengarang (case-insensitive)
            buku.tampilkanBuku();  // Menampilkan buku yang ditulis oleh pengarang tersebut
            jumlahPengarang++;
        }
    }

    // Jika tidak ada buku yang ditulis oleh pengarang tersebut
    if (jumlahPengarang == 0) {
        System.out.println("Tidak ada buku yang ditulis oleh pengarang tersebut.");
    }

    // untuk tutup scanner untuk menghindari kebocoran resource
    input.close();
}
}