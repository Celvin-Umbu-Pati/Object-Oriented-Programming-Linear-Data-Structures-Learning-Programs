/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author Celvin Pati
 */
public class InsertionSort {// Deklarasi atau awal kelas algoritma Insertion Sort
    //ini adalah method untuk tukar dua elemen dalam array

    private static void swap(int[] array, int index1, int index2) {
        //untuk simpan nilai sementara dari elemen pertama
        int temp = array[index1];
        // untuk ganti nilai elemen pertama dengan elemen kedua
        array[index1] = array[index2];
        // untuk ganti nilai elemen kedua dengan nilai sementara
        array[index2] = temp;
    }
    //ini adalah method untuk mengurutkan array secara menaik (ascending) dengan  Insertion Sort 

    public static int[] insertionSortAscending(int[] array) {
        // utuk panjang array
        int n = array.length;
        // Loop ini melalui setiap elemen array mulai dari indeks 1
        for (int i = 1; i < n; i++) {
            // Loop ini untuk membandingkan elemen saat ini dengan elemen sebelumnya
            for (int j = i; j > 0; j--) {
                // Jika elemen saat ini lebih kecil dari elemen sebelumnya
                if (array[j] < array[j - 1]) {
                    // unntuk panggil method swap untuk tukar elemen
                    swap(array, j, j - 1);
                } else {
                    // untuk keluar dari loop kalau elemen sudah pada posisi yang benar
                    break;
                }
            }
        }
        // untuk mengembalikan array yang sudah terurut
        return array;
    }
    //ini method  untuk mengurutkan array secara menurun (descending) dengan Insertion Sort

    public static int[] insertionSortDescending(int[] array) {
        // Mendapatkan panjang array
        int n = array.length;
        // Loop ini melalui setiap elemen array mulai dari indeks 1
        for (int i = 1; i < n; i++) {
            // Loop ini untuk membandingkan elemen saat ini dengan elemen sebelumnya
            for (int j = i; j > 0; j--) {
                // Jika elemen saat ini lebih besar dari elemen sebelumnya
                if (array[j] > array[j - 1]) {
                    // untuk panggil method swap untuk menukar elemen
                    swap(array, j, j - 1);
                } else {
                    // Keluar dari loop kalau elemen sudah pada posisi yang benar
                    break;
                }
            }
        }
        // untuk mengembalikan array yang sudah terurut
        return array;
    }

    // ini method untuk cetak elemen-elemen array ke konsol 
    public static void printArray(int[] array) {
        // Loop untuk setiap elemen dalam array
        for (int num : array) {
            // unutk cetak elemen diikuti spasi
            System.out.print(num + " ");
        }
        // untuk cetak baris baru kalau sudah selesai selesai
        System.out.println();
    }
    // ini adalah ethod main untuk  titik masuk program

    public static void main(String[] args) {
        // Data pertama untuk pengurutan
        int[] data1 = {4, 2, 9, 4, 8, 5, 6};
        System.out.println("Data Asli 1:");
        printArray(data1);

        // untuk mengurutkan data pertama secara ascending
        int[] ascending1 = insertionSortAscending(data1.clone());
        System.out.println("Urutan Menaik:");
        printArray(ascending1);

        // untuk mengurutkan data pertama secara descending
        int[] descending1 = insertionSortDescending(data1.clone());
        System.out.println("Urutan Menurun:");
        printArray(descending1);

        // untuk cetak baris kosong sebagai pemisah
        System.out.println();

        // Data kedua untuk pengurutan
        int[] data2 = {67, 23, 98, 24, 65, 12, 77, 55, 60, 10};
        System.out.println("Data Asli 2:");
        printArray(data2);

        // untuk mengurutkan data kedua secara ascending
        int[] ascending2 = insertionSortAscending(data2.clone());
        System.out.println("Urutan Menaik:");
        printArray(ascending2);

        // untuk mengurutkan data kedua secara descending
        int[] descending2 = insertionSortDescending(data2.clone());
        System.out.println("Urutan Menurun:");
        printArray(descending2);
    }//akhir metode utama
}//akhir class InsertionSort
