/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer4 {//awal class
    public static void main(String[] args) {//metode utama
        // Inisialisasi array
        int[] nilai = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Menampilkan array dari index tertinggi ke terendah
        System.out.println("Array dari index tertinggi ke terendah:");
        for (int i = nilai.length - 1; i >= 0; i--) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        // Menampilkan array dari index terendah ke tertinggi
        System.out.println("Array dari index terendah ke tertinggi:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
    }//akhir metode utama
}//akhir kelas
