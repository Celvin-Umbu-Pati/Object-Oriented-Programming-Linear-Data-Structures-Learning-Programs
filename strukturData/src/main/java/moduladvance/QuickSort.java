/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduladvance;

import java.util.Arrays;

/**
 *
 * @author Celvin Pati
 */
public class QuickSort {
    // Method untuk menukar dua elemen dalam array
    // Digunakan selama proses partisi untuk mempertukarkan elemen
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    public static int[] quicksort(int[] data, int awal, int akhir) {
        // Basis rekursi: proses hanya dilakukan jika subarray memiliki lebih dari satu elemen
        if (awal < akhir) {
            // Langkah 1: Inisialisasi pointer i (dari kiri) dan j (dari kanan)
            int i = awal + 1;  // Mulai dari elemen setelah pivot
            int j = akhir;     // Mulai dari elemen terakhir
            
            // Langkah 2: Cari elemen dari kiri yang LEBIH BESAR dari pivot (data[awal])
            while (i <= akhir && data[i] <= data[awal]) {
                i++;
            }
            
            // Langkah 3: Cari elemen dari kanan yang LEBIH KECIL atau SAMA DENGAN pivot
            while (j > awal && data[j] > data[awal]) {
                j--;
            }
            
            // Langkah 4-7: Proses partisi hingga pointer i dan j bersilangan
            while (i < j) {
                // Langkah 5: Tukar elemen yang tidak sesuai posisi (kiri > pivot dan kanan <= pivot)
                swap(data, i, j);
                
                // Langkah 6: Lanjutkan pencarian elemen dari kiri yang lebih besar dari pivot
                while (i <= akhir && data[i] <= data[awal]) {
                    i++;
                }
                
                // Langkah 7: Lanjutkan pencarian elemen dari kanan yang lebih kecil atau sama dengan pivot
                while (j > awal && data[j] > data[awal]) {
                    j--;
                }
            }
            
            // Langkah 8: Letakkan pivot di posisi yang benar (tukar dengan data[j])
            swap(data, awal, j);
            
            // Langkah 9-10: Rekursi pada subarray kiri dan kanan pivot
            quicksort(data, awal, j - 1);  // Urutkan subarray sebelum pivot
            quicksort(data, j + 1, akhir);  // Urutkan subarray setelah pivot
        }
        return data; // Kembalikan array yang sudah terurut
    }

    public static void main(String[] args) {
        // Data array yang akan diurutkan (diisi manual)
        int[] data = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 33, 63, 5, 8, 15, 20};
        
        // Tampilkan data sebelum diurutkan
        System.out.println("Data sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        
        // Panggil metode quicksort untuk mengurutkan data
        // Parameter awal: 0 (indeks pertama), akhir: panjang array - 1
        int[] sortedData = quicksort(data, 0, data.length - 1);
        
        // Tampilkan hasil array yang sudah diurutkan
        System.out.println("Data setelah diurutkan:");
        System.out.println(Arrays.toString(sortedData));
    }
}