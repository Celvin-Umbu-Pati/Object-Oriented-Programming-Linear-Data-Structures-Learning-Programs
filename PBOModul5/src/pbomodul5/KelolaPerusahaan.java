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
public class KelolaPerusahaan {//ini awal kelas KelolaPerusahaan
     public static void main(String[] args) {//awal metode utama
        Scanner keyboard = new Scanner(System.in);//ini untuk buat objek scanner yang di input dati keyboard

        Scanner input = new Scanner(System.in);//ini buat objek scanner lagi untuk input

        System.out.print("Masukkan Nama Perusahaan: ");//ini unuk input nama perusahaan
        String namaPerusahaan = input.nextLine();//untuk simpan inputan ke namaPerusahaan

        System.out.print("Masukkan jumlah pegawai: ");//ini untuk input jumlah pegawai
        int jumlahPegawai = input.nextInt();//ini untuk menyimpan inputan ke jumlahPegawai
        input.nextLine();

        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, jumlahPegawai);//ini buat objek perusahaan

        for (int i = 0; i < jumlahPegawai; i++) {//ini adalah loop untuk input data pegawai
            System.out.print("\nNPP: ");//untuk input Npp
            String NPP = input.nextLine();
            System.out.print("Nama: ");//untuk nama
            String nama = input.nextLine();
            System.out.print("Golongan (1-3): ");//untuk golongan
            int golongan = input.nextInt();
            input.nextLine(); 

            perusahaan.tambahPegawai(new GajiPegawai(NPP, nama, golongan));//ini untuk memanggil fungsi tambahPegawai
        }

        // Tampilkan daftar pegawai
        perusahaan.tampilkanPegawai();

        input.close();
    }
}

