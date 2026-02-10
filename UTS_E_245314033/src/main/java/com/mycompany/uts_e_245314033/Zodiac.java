package com.mycompany.uts_e_245314033;


import java.util.Scanner;//mengimport java until scanner

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Zodiac {//awal kelas zodiac
    public static void main(String[] args) {//awa; metode utama
        Scanner keyboard = new Scanner(System.in);//objek scanner untuk input dari pengguna 
        System.out.print("Masukkan Nama Anda: ");//meminta input nama pada pengguna
        String nama = keyboard.nextLine();//baca input dari pengguna
        System.out.print("Masukkan Nomor Kelompok Anda: ");//meminta input nomor kelompok pada pengguna
        int kelompok = keyboard.nextInt();//membaca input kelompok
        // Menentukan titik kumpul dan koordinator
        String titikKumpul = "";//deklarasi varibel menyimpan titik kumpul
        String koordinator = "";//deklarasi variabel untuk menyimpan nama koordinator
        if ((kelompok > 0) || (kelompok < 2)){
            titikKumpul = "Lapangan Kampus 1";
            koordinator = "Rendy pamungkas";
        } else if ((kelompok > 1) || (kelompok < 3)) {
            titikKumpul = "Hall Kampus II";
            koordinator = "Adri Septian";
        } else if ((kelompok > 2 ) || (kelompok < 4)) {
            titikKumpul = "Depan auditorium";
            koordinator = "Windra Kurnia";
        } else if ((kelompok > 3) || (kelompok < 5)) {
            titikKumpul = "Depan kapel";
            koordinator = "Reni Listiana";
            System.out.println("Nomer Kelompok Tidak Valid.");
            return;//menghentikan program jika nomer kelompok tidak tidak valid
        }
        // Output
        System.out.println(nama + "silahkan berkumpul di: " + titikKumpul);
        System.out.println("Koordinator Kelompok Anda: " + koordinator);
    }//akhir metode utama
}//akhir class zodiac

