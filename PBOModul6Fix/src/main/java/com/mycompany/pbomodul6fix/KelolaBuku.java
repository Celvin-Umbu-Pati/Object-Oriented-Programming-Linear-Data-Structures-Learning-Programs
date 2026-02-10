/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class KelolaBuku {
    private Buku[] daftarBuku;            // Array untuk menyimpan daftar buku
    private int jumlahBukuSekarang = 0;    // Penghitung jumlah buku yang sudah ditambahkan
    public KelolaBuku(int kapasitas) {
        this.daftarBuku = new Buku[kapasitas];  // Inisialisasi array dengan kapasitas tertentu
    }
    public void tambahBuku(Buku buku) {
        // Cek apakah masih ada slot kosong
        if (jumlahBukuSekarang < daftarBuku.length) {
            daftarBuku[jumlahBukuSekarang] = buku;  // Tambahkan buku
            jumlahBukuSekarang++;                   // Increment counter
        }
    }
    public int hitungBukuPerTahun(int tahun) {
        int jumlah = 0;
        // Loop melalui semua buku
        for (int i = 0; i < jumlahBukuSekarang; i++) {
            // Jika tahun terbit sama, increment counter
            if (daftarBuku[i].getTahunTerbit() == tahun) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public Buku cariBukuTertua() {
        if (jumlahBukuSekarang == 0) return null;  // Jika tidak ada buku, return null
        
        Buku tertua = daftarBuku[0];  // Asumsikan buku pertama adalah yang tertua
        // Loop melalui sisa buku
        for (int i = 1; i < jumlahBukuSekarang; i++) {
            // Jika ditemukan buku dengan tahun lebih lama, update referensi
            if (daftarBuku[i].getTahunTerbit() < tertua.getTahunTerbit()) {
                tertua = daftarBuku[i];
            }
        }
        return tertua;
    }

    public Buku cariBukuTerbaru() {
        if (jumlahBukuSekarang == 0) return null;  // Jika tidak ada buku, return null
        
        Buku terbaru = daftarBuku[0];  // Asumsikan buku pertama adalah yang terbaru
        // Loop melalui sisa buku
        for (int i = 1; i < jumlahBukuSekarang; i++) {
            // Jika ditemukan buku dengan tahun lebih baru, update referensi
            if (daftarBuku[i].getTahunTerbit() > terbaru.getTahunTerbit()) {
                terbaru = daftarBuku[i];
            }
        }
        return terbaru;
    }
    public void tampilkanSemuaBuku() {
        // Loop melalui semua buku yang sudah ditambahkan
        for (int i = 0; i < jumlahBukuSekarang; i++) {
            System.out.println(daftarBuku[i]);  // Gunakan method toString()
        }
    }

    // Method main sebagai entry point program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk input

        System.out.print("Masukkan jumlah buku yang mau disimpan: ");
        int jumlahBuku = scanner.nextInt();  // Membaca jumlah buku
        scanner.nextLine();  // Membersihkan newline

        // Membuat objek KelolaBuku dengan kapasitas tertentu
        KelolaBuku kelolaBuku = new KelolaBuku(jumlahBuku);

        // Loop untuk input data buku
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Kode Buku: ");
            String kodeBuku = scanner.nextLine();  // Input kode buku
            System.out.print("Judul: ");
            String judul = scanner.nextLine();     // Input judul
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();   // Input tahun terbit
            System.out.print("Jumlah Pengarang: ");
            int jumlahPengarang = scanner.nextInt(); // Input jumlah pengarang
            scanner.nextLine();  // Membersihkan newline

            // Membuat objek Buku baru
            Buku buku = new Buku(kodeBuku, judul, tahunTerbit, jumlahPengarang);

            // Loop untuk input data pengarang
            for (int j = 0; j < jumlahPengarang; j++) {
                System.out.println("Masukkan data pengarang ke-" + (j + 1));
                System.out.print("NIK: ");
                String nik = scanner.nextLine();    // Input NIK
                System.out.print("Nama: ");
                String nama = scanner.nextLine();   // Input nama
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine(); // Input alamat
                
                // Menambahkan pengarang ke buku
                buku.tambahPengarang(new Pengarang(nik, nama, alamat));
            }
            
            // Menambahkan buku ke sistem
            kelolaBuku.tambahBuku(buku);
        }

        // Menampilkan semua buku
        System.out.println("\nDaftar Buku:");
        kelolaBuku.tampilkanSemuaBuku();

        // Mencari buku berdasarkan tahun terbit
        System.out.print("\nMasukkan tahun untuk mencari jumlah buku yang terbit: ");
        int tahunCari = scanner.nextInt();
        int jumlah = kelolaBuku.hitungBukuPerTahun(tahunCari);
        System.out.println("Jumlah buku yang terbit pada tahun " + tahunCari + ": " + jumlah);

        // Mencari buku tertua dan terbaru
        Buku bukuTertua = kelolaBuku.cariBukuTertua();
        Buku bukuTerbaru = kelolaBuku.cariBukuTerbaru();

        System.out.println("\nBuku terbitan paling lama:\n" + bukuTertua);
        System.out.println("Buku terbitan paling akhir:\n" + bukuTerbaru);

        scanner.close();  // Menutup scanner
    }
}

