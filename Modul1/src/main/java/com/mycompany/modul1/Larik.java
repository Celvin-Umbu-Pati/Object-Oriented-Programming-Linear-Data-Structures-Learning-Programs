/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul1;

/**
 *
 * @author Celvin Pati
 */
public class Larik {
    private int[] data; // Atribut array untuk menyimpan data

    // Konstruktor untuk inisialisasi larik
    public Larik(int[] data) {
        this.data = data;
    }

    // Metode untuk menampilkan isi larik
    public void tampil() {
        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    // Metode untuk mengurutkan larik dengan Selection Sort (Ascending)
    // Mengembalikan array yang sudah diurutkan
    public int[] selectionSortAscending() {
        int[] sortedData = data.clone(); // Buat salinan array agar array asli tidak terubah
        int n = sortedData.length;

        for (int iterasi = 0; iterasi < n - 1; iterasi++) {
            int minIndex = iterasi;

            // Langkah 3: Cari elemen terkecil dalam sisa larik
            for (int elemen = iterasi + 1; elemen < n; elemen++) {
                if (sortedData[elemen] < sortedData[minIndex]) {
                    minIndex = elemen;
                }
            }

            // Langkah 5: Tukar elemen terkecil dengan elemen di posisi iterasi
            int temp = sortedData[minIndex];
            sortedData[minIndex] = sortedData[iterasi];
            sortedData[iterasi] = temp;
        }

        return sortedData; // Kembalikan array yang sudah diurutkan
    }

    // Metode untuk mengurutkan larik dengan Selection Sort (Descending)
    // Mengembalikan array yang sudah diurutkan
    public int[] selectionSortDescending() {
        int[] sortedData = data.clone(); // unutuk Buat salinan array jadi array asli tidak terubah
        int n = sortedData.length;

        for (int iterasi = 0; iterasi < n - 1; iterasi++) {
            int maxIndex = iterasi;

            // Langkah 3: Cari elemen terbesar dalam sisa larik
            for (int elemen = iterasi + 1; elemen < n; elemen++) {
                if (sortedData[elemen] > sortedData[maxIndex]) {
                    maxIndex = elemen;
                }
            }

            // Langkah 5: Tukar elemen terbesar dengan elemen di posisi iterasi
            int temp = sortedData[maxIndex];
            sortedData[maxIndex] = sortedData[iterasi];
            sortedData[iterasi] = temp;
        }

        return sortedData; // Kembalikan array yang sudah diurutkan
    }
    public class Main {
        public static void main(String[] args) {
            // Langkah 0: Baca data ke dalam larik
            int[] data = {67, 23, 98, 24, 65, 12, 77, 55, 60, 10};

            // Buat objek Larik
            Larik larik = new Larik(data);

            // Cetak larik sebelum diurutkan
            System.out.println("Larik sebelum diurutkan:");
            larik.tampil();

            // Langkah 1-5: Urutkan larik dengan Selection Sort (Ascending)
            int[] sortedAscending = larik.selectionSortAscending();
            System.out.println("Larik setelah diurutkan (Ascending):");
            for (int nilai : sortedAscending) {
                System.out.print(nilai + " ");
            }
            System.out.println();

            // Langkah 1-5: Urutkan larik dengan Selection Sort (Descending)
            int[] sortedDescending = larik.selectionSortDescending();
            System.out.println("Larik setelah diurutkan (Descending):");
            for (int nilai : sortedDescending) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
}//akhir kelas larik main 

} 

