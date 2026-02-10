/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul2fixpbo;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class GajiPegawaiMain {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan NPP anda:");
        String NPP = keyboard.nextLine();
        System.out.print("Masukkan nama anda:");
        String nama = keyboard.nextLine();
        System.out.print("Masukkan status anda:");
        String status = keyboard.nextLine();
        System.out.print("Masukkan golongan 1,2,3 anda:");
        int golongan = keyboard.nextInt();
        System.out.print("Masukkan Jumlah anak anda:");
        int jumlahanak = keyboard.nextInt();

        GajiPegawai gaji = new GajiPegawai(NPP, nama, status, golongan, jumlahanak);

        System.out.println("Gaji pokok         : " + gaji.hitungGajiPokok());
        System.out.println("Tunjangan Keluarga : " + gaji.hitungTunjanganKeluarga());
        System.out.println("Gaji Total        : " + gaji.hitungGajiTotal());

    }
}


