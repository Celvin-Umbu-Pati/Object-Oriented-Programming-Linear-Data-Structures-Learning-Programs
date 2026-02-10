/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer3 {

    public static void main(String[] args) {
        // Inisialisasi array
        double[] A = {1.5, 4.5, 6.0, 6.7, 8.9, 9.1};

        // Menampilkan array awal
        System.out.println("Array sebelum diubah:");
        tampilkanArray(A);

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan index yang ingin diubah (0-5): ");
        int index = scanner.nextInt();

        System.out.print("Masukkan nilai baru: ");
        double nilaiBaru = scanner.nextDouble();

        // Mengganti nilai pada index tertentu
        if (index >= 0 && index < A.length) {
            A[index] = nilaiBaru;
            System.out.println("Array setelah diubah:");
            tampilkanArray(A);
        } else {
            System.out.println("Index tidak valid!");
        }

    }

    // Method untuk menampilkan array
    public static void tampilkanArray(double[] array) {
        for (double nilai : array) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
