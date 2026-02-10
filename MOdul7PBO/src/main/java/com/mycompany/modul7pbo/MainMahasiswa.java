/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package com.mycompany.modul7pbo;

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // untuk input data mahasiswa S1
        System.out.println("Masukkan data Mahasiswa S1:");
        System.out.print("NIM: ");
        String nimS1 = input.nextLine();
        System.out.print("Nama: ");
        String namaS1 = input.nextLine();
        System.out.print("Tanggal Lahir (DD-MM-YYYY): ");
        String tglS1 = input.nextLine();
        System.out.print("Nilai UTS 1: ");
        double uts1S1 = input.nextDouble();
        System.out.print("Nilai UTS 2: ");
        double uts2S1 = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasS1 = input.nextDouble();
        input.nextLine(); //untuk pinda di baris baru

        // untuk input data mahasiswa S2
        System.out.println("\nMasukkan data Mahasiswa S2:");
        System.out.print("NIM: ");
        String nimS2 = input.nextLine();
        System.out.print("Nama: ");
        String namaS2 = input.nextLine();
        System.out.print("Tanggal Lahir (DD-MM-YYYY): ");
        String tglS2 = input.nextLine();
        System.out.print("Nilai UTS 1: ");
        double uts1S2 = input.nextDouble();
        System.out.print("Nilai UTS 2: ");
        double uts2S2 = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uasS2 = input.nextDouble();

        // obje untuk mahasiswa S1 dan S2
        MahasiswaS1 mhsS1 = new MahasiswaS1(nimS1, namaS1, tglS1, uts1S1, uts2S1, uasS1);
        MahasiswaS2 mhsS2 = new MahasiswaS2(nimS2, namaS2, tglS2, uts1S2, uts2S2, uasS2);

        // Untuk cetak hasil
        System.out.println("\nHasil hitung Nilai:");
        System.out.println("Mahasiswa S1:");
        System.out.println("NIM: " + mhsS1.getNim());
        System.out.println("Nama: " + mhsS1.getNama());
        System.out.println("Nilai Final: " + mhsS1.getFinal());
        System.out.println("Nilai Huruf: " + mhsS1.getNilaiKonversi());

        System.out.println("\nMahasiswa S2:");
        System.out.println("NIM: " + mhsS2.getNim());
        System.out.println("Nama: " + mhsS2.getNama());
        System.out.println("Nilai Final: " + mhsS2.getFinal());
        System.out.println("Nilai Huruf: " + mhsS2.getNilaiKonversi());
    }
}
