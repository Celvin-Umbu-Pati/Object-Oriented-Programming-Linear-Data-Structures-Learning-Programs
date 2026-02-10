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
public class KelkulatorMain {
    // Method utama sebagai entry point program
public static void main(String[] args) {
    // Membuat objek Scanner untuk membaca input dari keyboard
    Scanner keyboard = new Scanner(System.in);

    // Meminta input bilangan pertama dari user
    System.out.print("Masukkan Bilangan a: ");
    // Membaca input integer dan menyimpannya ke variabel a
    int a = keyboard.nextInt();

    // Meminta input bilangan kedua dari user
    System.out.print("Masukkan Bilangan b: ");
    // Membaca input integer dan menyimpannya ke variabel b
    int b = keyboard.nextInt();

    // Membuat objek kalkulator dengan input a dan b
    Kalkulator kalkulator = new Kalkulator(a, b);

    // Menampilkan hasil penjumlahan
    System.out.println("Hasil penjumlahan: " + kalkulator.penjumlahan());

    // Menampilkan hasil pengurangan
    System.out.println("Hasil pengurangan: " + kalkulator.pengurangan());

    // Menampilkan hasil perkalian
    System.out.println("Hasil perkalian  : " + kalkulator.perkalian());

    // Menampilkan hasil pembagian
    System.out.println("Hasil pembagian  : " + kalkulator.pembagian());
}
}
