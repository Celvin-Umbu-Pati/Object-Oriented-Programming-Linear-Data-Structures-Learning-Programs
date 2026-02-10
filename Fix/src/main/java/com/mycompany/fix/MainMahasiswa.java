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
public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); // Menyimpan semua data mahasiswa
        
        // Meminta jumlah mahasiswa yang akan diinput
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Menghapus newline sisa dari nextInt
        
        // Perulangan untuk input data tiap mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Jenjang (1=S1, 2=S2): ");
            int jenjang = input.nextInt();
            input.nextLine(); // Membersihkan newline
            // Input data umum
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Tanggal Lahir (DD-MM-YYYY): ");
            String tglLahir = input.nextLine();
            // Input nilai
            System.out.print("Nilai UTS 1: ");
            double uts1 = input.nextDouble();
            System.out.print("Nilai UTS 2: ");
            double uts2 = input.nextDouble();
            System.out.print("Nilai UAS: ");
            double uas = input.nextDouble();
            input.nextLine(); // Membersihkan newline
            
            // Menambahkan objek Mahasiswa sesuai jenjang ke ArrayList
            if (jenjang == 1) {
                daftarMahasiswa.add(new MahasiswaS1(nim, nama, tglLahir, uts1, uts2, uas));
            } else {
                daftarMahasiswa.add(new MahasiswaS2(nim, nama, tglLahir, uts1, uts2, uas));
            }
        }
        // Menampilkan semua data mahasiswa
        System.out.println("\nDaftar Seluruh Mahasiswa:");
        System.out.println("===========================================");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String jenjang = (mhs instanceof MahasiswaS1) ? "S1" : "S2";
            System.out.println("Nama\t\t: " + mhs.getNama());
            System.out.println("Jenjang\t\t: " + jenjang);
            System.out.println("Nilai Huruf\t: " + mhs.getNilaiKonversi());
            System.out.println("-------------------------------------------");
        }
        // Menampilkan hanya mahasiswa S1 yang lulus (nilai ≠ E)
        System.out.println("\nDaftar Mahasiswa S1 yang Lulus:");
        System.out.println("===========================================");
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs instanceof MahasiswaS1 && !mhs.getNilaiKonversi().equals("E")) {
                System.out.println("Nama\t\t: " + mhs.getNama());
                System.out.println("Nilai Huruf\t: " + mhs.getNilaiKonversi());
                System.out.println("-------------------------------------------");
            }
        }

        input.close(); // Menutup scanner agar tidak terjadi kebocoran resource
    }
}
