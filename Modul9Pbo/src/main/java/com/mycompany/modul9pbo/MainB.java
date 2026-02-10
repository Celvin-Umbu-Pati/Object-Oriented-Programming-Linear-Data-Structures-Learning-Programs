/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul9pbo;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class MainB {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        // Array untuk menyimpan 3 bangun datar
        BangunDatar[] bangunDatar = new BangunDatar[3];

        // Loop untuk input 3 bangun datar
        for (int i = 0; i < 3; i++) {
            System.out.println("\nBangun datar ke-" + (i+1));
            System.out.println("1. Segi Empat");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.print("Pilih jenis bangun (1-3): ");
            
            // Membaca pilihan pengguna
            int pilihan = scanner.nextInt();
            
            // Switch case untuk memproses pilihan
            switch (pilihan) {
                case 1:  // Jika memilih segi empat
                    System.out.print("Masukkan panjang: ");
                    double p = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = scanner.nextDouble();
                    bangunDatar[i] = new SegiEmpat(p, l); // Membuat objek SegiEmpat
                    break;
                    
                case 2:  // Jika memilih segitiga
                    System.out.print("Masukkan sisi 1: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan sisi 2: ");
                    double b = scanner.nextDouble();
                    System.out.print("Masukkan sisi 3: ");
                    double c = scanner.nextDouble();
                    bangunDatar[i] = new Segitiga(a, b, c); // Membuat objek Segitiga
                    break;
                    
                case 3:  // Jika memilih lingkaran
                    System.out.print("Masukkan jari-jari: ");
                    double r = scanner.nextDouble();
                    bangunDatar[i] = new Lingkaran(r); // Membuat objek Lingkaran
                    break;
                    
                default:  // Jika input tidak valid
                    System.out.println("Input tidak valid!");
                    i--; // Mengulang iterasi yang sama
                    break;
            }
        }

        // Menampilkan header output
        System.out.println("\n=================================================");
        // Format header tabel
        System.out.printf("%-5s %-15s %-15s %-15s\n", "No.", "Bangun datar", "Keliling", "Luas");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        // Loop untuk menampilkan hasil perhitungan
        for (int i = 0; i < 3; i++) {
            BangunDatar b = bangunDatar[i]; // Mengakses elemen array
            // Mencetak data dengan format 2 angka desimal
            System.out.printf("%-5d %-15s %-15.2f %-15.2f\n", 
                           (i+1), b.toString(), b.keliling(), b.luas());
        }
        
        // Garis penutup tabel
        System.out.println("-----------------------------------------------------------------------------------------");
        scanner.close(); // Menutup scanner
    }
}
