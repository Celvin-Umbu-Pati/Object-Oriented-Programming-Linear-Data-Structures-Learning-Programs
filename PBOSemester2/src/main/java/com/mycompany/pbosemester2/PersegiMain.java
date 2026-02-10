/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

import javax.swing.JOptionPane;

/**
 *
 * @author Celvin Pati
 */
public class PersegiMain {
    // Metode utama yang dijalankan saat program dieksekusi

    public static void main(String[] args) {

        // Membuat objek objPersegi dari kelas Persegi
        Persegi objPersegi = new Persegi();

        // Mengambil input panjang dari pengguna melalui dialog input dan menyimpannya ke atribut panj
        objPersegi.panj = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));

        // Mengambil input lebar dari pengguna melalui dialog input dan menyimpannya ke atribut lebar
        objPersegi.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));

        // Menampilkan dialog pesan yang menunjukkan luas persegi panjang berdasarkan panjang dan lebar yang dimasukkan
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang = " + objPersegi.panj
                + " dan lebar = " + objPersegi.lebar + " adalah " + objPersegi.luas());
    }
}
