/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;
 import java.util.Arrays;
/**
 *
 * @author Celvin Pati
 */
public class Larik {
    // Method untuk mencetak isi array
    public static void cetak(int[] data) {
        System.out.println("Isi array: " + Arrays.toString(data));
    }

    // Pencarian Beruntun (Sequential Search)
    public static int sequentialSearch(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i; // Mengembalikan indeks jika ditemukan
            }
        }
        return -1; // Jika tidak ditemukan
    }

    // Pencarian Biner (Binary Search) - Array harus dalam keadaan terurut
    public static int binarySearch(int[] data, int key) {
        Arrays.sort(data); // Mengurutkan array sebelum binary search
        int left = 0, right = data.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (data[mid] == key) {
                return mid; // Mengembalikan indeks jika ditemukan
            }

            if (data[mid] < key) {
                left = mid + 1; // Cari di bagian kanan
            } else {
                right = mid - 1; // Cari di bagian kiri
            }
        }
        return -1; // Jika tidak ditemukan
    }
}
