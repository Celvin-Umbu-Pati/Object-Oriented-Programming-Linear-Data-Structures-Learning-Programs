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
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input Data Mahasiswa S1
        System.out.println("=== INPUT DATA MAHASISWA S1 ===");
        System.out.print("Masukkan NIM            : ");
        String nim1 = input.nextLine();
        System.out.print("Masukkan Nama           : ");
        String nama1 = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir  : ");
        String tl1 = input.nextLine();
        System.out.print("Masukkan Nilai UTS1     : ");
        double uts1_1 = input.nextDouble();
        System.out.print("Masukkan Nilai UTS2     : ");
        double uts2_1 = input.nextDouble();
        System.out.print("Masukkan Nilai UAS      : ");
        double uas1 = input.nextDouble();
        input.nextLine(); // buang newline
        // objek MahasiswaS1
        MahasiswaS1 mhs1 = new MahasiswaS1(nim1, nama1, tl1, uts1_1, uts2_1, uas1);
        //Data Mahasiswa S2
        System.out.println("\n=== INPUT DATA MAHASISWA S2 ===");
        System.out.print("Masukkan NIM            : ");
        String nim2 = input.nextLine();
        System.out.print("Masukkan Nama           : ");
        String nama2 = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir  : ");
        String tl2 = input.nextLine();
        System.out.print("Masukkan Nilai UTS1     : ");
        double uts1_2 = input.nextDouble();
        System.out.print("Masukkan Nilai UTS2     : ");
        double uts2_2 = input.nextDouble();
        System.out.print("Masukkan Nilai UAS      : ");
        double uas2 = input.nextDouble();
        //bjek MahasiswaS2
        MahasiswaS2 mhs2 = new MahasiswaS2(nim2, nama2, tl2, uts1_2, uts2_2, uas2);
        //asil Perhitungan
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("MAHASISWA S1:");
        System.out.println("NIM\t\t: " + mhs1.getNim());
        System.out.println("Nama\t\t: " + mhs1.getNama());
        System.out.println("Tanggal Lahir\t: " + mhs1.getTanggalLahir());
        System.out.println("Nilai Final\t: " + mhs1.getFinal());
        System.out.println("Grade\t\t: " + mhs1.getCourseGrade());
        System.out.println("\nMAHASISWA S2:");
        System.out.println("NIM\t\t: " + mhs2.getNim());
        System.out.println("Nama\t\t: " + mhs2.getNama());
        System.out.println("Tanggal Lahir\t: " + mhs2.getTanggalLahir());
        System.out.println("Nilai Final\t: " + mhs2.getFinal());
        System.out.println("Grade\t\t: " + mhs2.getCourseGrade());
        input.close();
    }
}

