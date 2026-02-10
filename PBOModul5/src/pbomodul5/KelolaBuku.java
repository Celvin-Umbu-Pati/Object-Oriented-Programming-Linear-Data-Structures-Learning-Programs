/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul5;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class KelolaBuku {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        // Meminta jumlah buku yang akan dimasukkan
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        Buku[] daftarBuku = new Buku[jumlahBuku]; // Array untuk menyimpan daftar buku

        // Loop untuk menginput data buku dari pengguna
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Kode Buku: ");
            String kode = input.nextLine();

            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Nama Pengarang: ");
            String pengarang = input.nextLine();

            System.out.print("Tahun Terbit: ");
            int tahun = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            daftarBuku[i] = new Buku(kode, judul, pengarang, tahun); // Menyimpan objek buku dalam array
        }

        // Menampilkan daftar buku dalam format tabel
        System.out.println("\nDaftar Buku:");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-10s\n", "Kode", "Judul", "Pengarang", "Tahun Terbit");
        System.out.println("----------------------------------------------------------");

        for (Buku buku : daftarBuku) {
            buku.tampilkanBuku(); // Memanggil method untuk menampilkan informasi buku
        }
        System.out.println("----------------------------------------------------------");

        // Mencari jumlah buku berdasarkan tahun tertentu
        System.out.print("\nMasukkan tahun terbit yang ingin dicari: ");
        int tahunCari = input.nextInt();
        int jumlahTahun = 0; // Variabel untuk menghitung jumlah buku yang ditemukan

        System.out.println("\nBuku yang terbit pada tahun " + tahunCari + ":");
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() == tahunCari) {
                buku.tampilkanBuku(); // Menampilkan buku yang ditemukan
                jumlahTahun++;
            }
        }

        // Jika tidak ada buku yang ditemukan
        if (jumlahTahun == 0) {
            System.out.println("Tidak ada buku yang terbit pada tahun tersebut.");
        }

        // Menampilkan kategori buku berdasarkan tahun terbit
        int tahunSekarang = 2024; // Tahun saat ini
        System.out.println("\nKategori Buku:");
        for (Buku buku : daftarBuku) {
            System.out.printf("%-20s : %s\n", buku.getNamaPengarang(),
                    (tahunSekarang - buku.getTahunTerbit() > 5) ? "BUKU LAMA" : "BUKU BARU");
        }

        // Mencari buku berdasarkan pengarang
        input.nextLine(); // Membersihkan buffer sebelum input berikutnya
        System.out.print("\nMasukkan nama pengarang yang ingin dicari: ");
        String pengarangCari = input.nextLine(); // Input nama pengarang
        int jumlahPengarang = 0; // Variabel untuk menghitung jumlah buku berdasarkan pengarang

        System.out.println("\nBuku yang ditulis oleh " + pengarangCari + ":");
        for (Buku buku : daftarBuku) {
            if (buku.getNamaPengarang().equalsIgnoreCase(pengarangCari)) {
                buku.tampilkanBuku(); // Menampilkan buku yang ditulis oleh pengarang tersebut
                jumlahPengarang++;
            }
        }

        // Jika tidak ada buku yang ditemukan berdasarkan pengarang
        if (jumlahPengarang == 0) {
            System.out.println("Tidak ada buku yang ditulis oleh pengarang tersebut.");
        }

        input.close(); // Menutup scanner untuk menghindari kebocoran resource
    }}