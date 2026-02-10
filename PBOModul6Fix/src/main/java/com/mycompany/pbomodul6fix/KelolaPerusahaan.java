/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versiarraylist;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class KelolaPerusahaan {
   public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);
        
        // Input data perusahaan
        System.out.println("=== Pendirian Perusahaan ===");
        System.out.print("Masukkan Nama Perusahaan : ");
        String namaPerusahaan = scanner.nextLine(); // Membaca nama perusahaan
        
        System.out.print("Masukkan Alamat : ");
        String alamat = scanner.nextLine(); // Membaca alamat perusahaan
        
        System.out.print("Masukkan Nama Pemilik : ");
        String pemilik = scanner.nextLine(); // Membaca nama pemilik
        
        System.out.print("Masukkan NPWP : ");
        String npwp = scanner.nextLine(); // Membaca NPWP
        
        // Membuat objek perusahaan baru
        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, alamat, pemilik, npwp);
        
        // Input data pegawai awal
        System.out.println("\n=== Rekrutmen Pegawai Awal ===");
        System.out.print("Masukkan jumlah pegawai awal: ");
        int jumlahAwal = scanner.nextInt(); // Membaca jumlah pegawai
        scanner.nextLine(); // Membersihkan newline
        
        // Loop untuk input data setiap pegawai
        for (int i = 0; i < jumlahAwal; i++) {
            System.out.println("\nData pegawai ke-" + (i + 1));
            System.out.print("NIP Pegawai : ");
            String nip = scanner.nextLine(); // Membaca NIP
            
            System.out.print("Nama Pegawai : ");
            String namaPegawai = scanner.nextLine(); // Membaca nama
            
            System.out.print("Gaji Pokok : ");
            double gajiPokok = scanner.nextDouble(); // Membaca gaji
            scanner.nextLine(); // Membersihkan newline
            
            // Membuat dan menambahkan pegawai baru
            Pegawai pegawaiBaru = new Pegawai(nip, namaPegawai, gajiPokok);
            perusahaan.tambahPegawai(pegawaiBaru);
        }
        
        // Menu interaktif
        int pilihan;
        do {
            // Menampilkan menu pilihan
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tampilkan Daftar Pegawai");
            System.out.println("2. Tampilkan Pegawai dengan Gaji Tertinggi");
            System.out.println("3. Tampilkan Pegawai dengan Gaji Terendah");
            System.out.println("4. Tampilkan Rata-rata Gaji");
            System.out.println("5. Tambah Pegawai Baru");
            System.out.println("6. Hapus Pegawai");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            pilihan = scanner.nextInt(); // Membaca pilihan user
            scanner.nextLine(); // Membersihkan newline
            
            // Pemrosesan pilihan menu
            switch (pilihan) {
                case 1: // Tampilkan daftar pegawai
                    perusahaan.tampilkanDaftarPegawai();
                    break;
                    
                case 2: // Cari pegawai bergaji tertinggi
                    Pegawai tertinggi = perusahaan.getPegawaiGajiTertinggi();
                    System.out.println("\n=== Pegawai dengan Gaji Tertinggi ===");
                    if (tertinggi != null) {
                        tertinggi.tampilkanInfo();
                    } else {
                        System.out.println("Belum ada pegawai.");
                    }
                    break;
                    
                case 3: // Cari pegawai bergaji terendah
                    Pegawai terendah = perusahaan.getPegawaiGajiTerendah();
                    System.out.println("\n=== Pegawai dengan Gaji Terendah ===");
                    if (terendah != null) {
                        terendah.tampilkanInfo();
                    } else {
                        System.out.println("Belum ada pegawai.");
                    }
                    break;
                    
                case 4: // Hitung rata-rata gaji
                    double rataRata = perusahaan.getRataRataGaji();
                    System.out.printf("\nRata-rata Gaji Pegawai: Rp %,.2f\n", rataRata);
                    break;
                    
                case 5: // Tambah pegawai baru
                    System.out.println("\n=== Tambah Pegawai Baru ===");
                    System.out.print("NIP Pegawai : ");
                    String nip = scanner.nextLine();
                    
                    System.out.print("Nama Pegawai : ");
                    String namaPegawai = scanner.nextLine();
                    
                    System.out.print("Gaji Pokok : ");
                    double gajiPokok = scanner.nextDouble();
                    scanner.nextLine();
                    
                    // Membuat dan menambahkan pegawai baru
                    Pegawai pegawaiBaru = new Pegawai(nip, namaPegawai, gajiPokok);
                    perusahaan.tambahPegawai(pegawaiBaru);
                    break;
                    
                case 6: // Hapus pegawai
                    System.out.print("\nMasukkan NIP Pegawai yang akan dihapus: ");
                    String nipHapus = scanner.nextLine();
                    if (perusahaan.hapusPegawai(nipHapus)) {
                        System.out.println("Pegawai berhasil dihapus");
                    } else {
                        System.out.println("Pegawai dengan NIP tersebut tidak ditemukan");
                    }
                    break;
                    
                case 0: // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                    
                default: // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0); // Loop sampai user memilih keluar
        
        scanner.close(); // Menutup scanner
    } 
}
