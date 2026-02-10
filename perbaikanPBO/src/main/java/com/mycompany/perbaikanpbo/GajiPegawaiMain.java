/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class GajiPegawaiMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari keyboard

        // Meminta pengguna untuk memasukkan NPP
        System.out.print("Masukkan NPP anda: ");
        String NPP = keyboard.nextLine(); // Membaca input NPP dari pengguna

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama anda: ");
        String nama = keyboard.nextLine(); // Membaca input nama dari pengguna

        // Meminta pengguna untuk memasukkan status (menikah atau tidak)
        System.out.print("Masukkan status anda (menikah/tidak): ");
        String statusInput = keyboard.nextLine(); // Membaca input status dari pengguna
        boolean status = statusInput.equalsIgnoreCase("menikah"); // Mengonversi input ke boolean

        // Meminta pengguna untuk memasukkan golongan pegawai
        System.out.print("Masukkan golongan 1, 2, 3 anda: ");
        int golongan = keyboard.nextInt(); // Membaca input golongan dari pengguna

        // Meminta pengguna untuk memasukkan jumlah anak
        System.out.print("Masukkan Jumlah anak anda: ");
        int jumlahanak = keyboard.nextInt(); // Membaca input jumlah anak dari pengguna

        // Membuat objek gajiPegawai dengan data yang dimasukkan oleh pengguna
        GajiPegawai gaji = new GajiPegawai(NPP, nama, golongan, status, jumlahanak);

        // Menampilkan gaji pokok pegawai
        System.out.println("Gaji pokok         : " + gaji.hitungGajiPokok());
        // Menampilkan tunjangan keluarga pegawai
        System.out.println("Tunjangan Keluarga : " + gaji.hitungTunjanganKeluarga());
        // Menampilkan total gaji pegawai
        System.out.println("Gaji Total         : " + gaji.hitungGajiTotal());

        keyboard.close(); // Menutup Scanner untuk mencegah memory leak
    }
}

