/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Soal_033 {
     public static void main(String[] args) {//awa; metode utama
        Scanner keyboard = new Scanner(System.in);//objek scanner untuk input dari pengguna 
        System.out.print("Masukkan Nama Anda: ");//meminta input nama pada pengguna
        String nama = keyboard.nextLine();//baca input dari pengguna
        System.out.print("Masukkan Nomor Kelompok Anda: ");//meminta input nomor kelompok pada pengguna
        int kelompok = keyboard.nextInt();//membaca input kelompok
        // Menentukan titik kumpul dan koordinator
        String titikKumpul = "";//deklarasi varibel menyimpan titik kumpul
        String koordinator = "";//deklarasi variabel untuk menyimpan nama koordinator
        if (kelompok == 1) {//jika kelompok adalah 1
            titikKumpul = "Lapangan Kampus 1";//titik kumpul kelompok 1
            koordinator = "Rendy pamungkas";//koordinator kelompok 1
        } else if (kelompok == 2){//jika kelompok adalah 2
            titikKumpul = "Hall Kampus II";//titik kumpul kelompok 2
            koordinator = "Adri Septian";//koordinator kelompok 2
        } else if (kelompok == 3) {//jika kelompok adalah 3
            titikKumpul = "Depan auditorium";//titik kumpul kelompok 3
            koordinator = "Windra Kurnia";//koordinator kelompok 3
        } else if (kelompok == 4) {//jika kelompok adalah 4
            titikKumpul = "Depan kapel";//titik kumpul kelompok 4
            koordinator = "Reni Listiana";//koordinator kelompok 4
            System.out.println("Nomer Kelompok Tidak Valid.");
            return;//menghentikan program jika nomer kelompok tidak tidak valid
        }
        // Output
        System.out.println(nama +  " silahkan Berkumpul Di: " + titikKumpul);
        System.out.println("Koordinator Kelompok Anda: " + koordinator);
    }//akhir metode utama
}//akhir class zodiac


