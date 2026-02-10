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
public class Main {
    public static void main(String[] args) {
        Pegawai[] karyawan = new Pegawai[10]; // Array untuk menyimpan objek  pegawai
        int jumPeg = 0; // Variabel untuk jumlah pegawai
        
        Scanner input = new Scanner(System.in); // Objek Scanner untuk input
        
        // Input jumlah pegawai
        System.out.print("Masukkan jumlah pegawai: ");
        jumPeg = input.nextInt();
        input.nextLine(); // Membersihkan newline dari buffer
        
        // Loop untuk input data pegawai
        for(int i = 0; i < jumPeg; i++) {
            System.out.println("\nPilih jenis pegawai:");
            System.out.println("1. Manajer\n2. Pemasaran\n3. Honorer");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            
            // Switch case untuk memilih jenis pegawai
            switch(pilihan) {
                case 1: // Case untuk Manajer
                    Manajer m = new Manajer();
                    System.out.print("NPP     : "); 
                    m.setNpp(input.nextInt());
                    input.nextLine(); // Membersihkan buffer
                    System.out.print("Nama    : "); 
                    m.setName(input.nextLine());
                    System.out.print("Gapok   : "); 
                    m.setGapok(input.nextDouble());
                    System.out.print("Tunj. Jabatan: "); 
                    m.setTunJab(input.nextDouble());
                    System.out.print("Lembur  : "); 
                    m.setLembur(input.nextDouble());
                    karyawan[i] = m; // Simpan objek ke array
                    break;
                    
                case 2: // Case untuk Pemasaran
                    Pemasaran p = new Pemasaran();
                    System.out.print("NPP     : "); 
                    p.setNpp(input.nextInt());
                    input.nextLine();
                    System.out.print("Nama    : "); 
                    p.setName(input.nextLine());
                    System.out.print("Gapok   : "); 
                    p.setGapok(input.nextDouble());
                    System.out.print("Bonus   : "); 
                    p.setBonus(input.nextDouble());
                    karyawan[i] = p;
                    break;
                    
                case 3: // Case untuk Honorer
                    Honorer h = new Honorer();
                    System.out.print("NPP     : "); 
                    h.setNpp(input.nextInt());
                    input.nextLine();
                    System.out.print("Nama    : "); 
                    h.setName(input.nextLine());
                    System.out.print("Gapok   : "); 
                    h.setGapok(input.nextDouble());
                    System.out.print("Lembur  : "); 
                    h.setLembur(input.nextDouble());
                    karyawan[i] = h;
                    break;
                    
                default: // Jika input tidak valid
                    System.out.println("Pilihan salah!");
                    i--; // Mengurangi counter untuk mengulang iterasi
            }
        }
        
        // Header tabel output
        System.out.println("\nNO \tNPP \tNAMA \tSTATUS \tGAJI POKOK \tTUNJANGAN \tGAJI TOTAL");
        
        // Loop untuk menampilkan data pegawai
        for(int i = 0; i < jumPeg; i++) {
            Pegawai p = karyawan[i]; // Ambil objek pegawai dari array
            
            // Format output menggunakan printf untuk penyajian rapi
            System.out.printf("%d. \t%d \t%s \t%s \t%.2f \t%.2f \t%.2f%n",
                    (i+1),          // Nomor urut
                    p.getNpp(),     // NPP pegawai
                    p.getName(),    // Nama pegawai
                    p.getStatus(), // Status jabatan
                    p.getGapok(),   // Gaji pokok
                    p.getTunjangan(), // Tunjangan
                    p.hitungGatot() // Gaji total
            );
        }
    }}