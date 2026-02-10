/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class BukuMain {

    public static void main(String[] args) {
        Buku book1 = new Buku("Struktur Data", "1304595");
        book1.pinjam();
        Buku book2 = new Buku("Java Fundamental", "1304300");
        book2.kembali();
    }
}
