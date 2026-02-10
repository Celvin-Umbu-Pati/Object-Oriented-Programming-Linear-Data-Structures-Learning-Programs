
import com.mycompany.strukturdata.Larik;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
\*
   import java.util.Arrays;
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class LarikMain {
    public static void main(String[] args) {
        int[] data = {5, 8, 26, 15, 11, 31}; // Data array
        int target = 15; // Angka yang dicari

        System.out.println("Mencetak array:");
        Larik.cetak(data); // Memanggil method cetak dari kelas Larik

        // Sequential Search
        int hasilSeq = Larik.sequentialSearch(data, target);
        if (hasilSeq != -1) {
            System.out.println("Sequential Search: " + target + " ditemukan di indeks " + hasilSeq);
        } else {
            System.out.println("Sequential Search: " + target + " tidak ditemukan.");
        }

        // Binary Search
        int hasilBin = Larik.binarySearch(data, target);
        if (hasilBin != -1) {
            System.out.println("Binary Search: " + target + " ditemukan di indeks " + hasilBin);
        } else {
            System.out.println("Binary Search: " + target + " tidak ditemukan.");
        }
    }}


