/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SDL_modul3;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Larik {
    // Metode untuk mengurutkan larik menggunakan bubble sort
    public static void bubbleSort(int[] larik) {
        int n = larik.length;
        for (int iterasi = 1; iterasi < n; iterasi++) {
            for (int elemen = 0; elemen < n - iterasi; elemen++) {
                if (larik[elemen] > larik[elemen + 1]) {
                    // Tukar nilai jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }
            }
        }
    }

    public static void bacaData(int[] larik) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan " + larik.length + " elemen larik:");
        for (int i = 0; i < larik.length; i++) {
            larik[i] = scanner.nextInt();
        }
    }

    public static void tampilkanLarik(int[] larik) {
        for (int i : larik) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}