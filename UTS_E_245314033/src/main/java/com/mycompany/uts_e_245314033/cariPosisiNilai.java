/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;
import java.util.Scanner; // Mengimpor kelas Scanner untuk input
/**
 *
 * @author Celvin Pati
 */
public class cariPosisiNilai {//awal program
    public static void main(String[] args) {//awal metode utama
        // Mendeklarasikan dan menginisialisasi array dengan nilai-nilai yang diberikan
        int[] A = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78}; 
        
        Scanner Keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Masukkan nilai yang dicari: "); // Meminta pengguna untuk memasukkan nilai yang ingin dicari
        int nilaiDicari = Keyboard.nextInt(); // Membaca nilai yang dimasukkan oleh pengguna

        // Variabel untuk menyimpan posisi nilai yang dicari
        int posisi = -1; // Inisialisasi posisi dengan -1 (menandakan bahwa nilai belum ditemukan)

        // Loop untuk mencari nilai dalam array
        for (int i = 0; i < A.length; i++) { // Mengiterasi setiap elemen dalam array A
            if (A[i] == nilaiDicari) { // Memeriksa apakah elemen saat ini sama dengan nilai yang dicari
                posisi = i; // Jika ditemukan, simpan indeks elemen tersebut ke dalam variabel posisi
                break; // Keluar dari loop setelah menemukan nilai
            }
        }

        // Menampilkan hasil pencarian
        if (posisi != -1) { // Memeriksa apakah posisi tidak sama dengan -1 (artinya nilai ditemukan)
            System.out.println("Nilai " + nilaiDicari + " berada di index: " + posisi); //tampilkan indeks nilai yang ditemukan
        } else { // Jika posisi masih -1
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan dalam array."); //tampilkan pesan bahwa nilai tidak ditemukan
        }

    }//akhir metode utama
}//akhir program

