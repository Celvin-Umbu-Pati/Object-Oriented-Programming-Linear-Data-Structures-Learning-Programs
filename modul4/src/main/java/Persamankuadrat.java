
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Persamankuadrat {
    public static void main(String[] args) { // awal metode utama
        double a, b, c, D, x1, x2; // deklarasi variabel untuk koefisien dan akar
        Scanner keyboard = new Scanner(System.in); // buat objek scanner untuk membaca input dari pengguna

        // Memastikan nilai a tidak sama dengan 0
        do {
            System.out.println(" Masukkan Koefisien x2 (a): "); // untuk input koefisien a
            a = keyboard.nextDouble(); // baca input koefisien a
            if (a == 0) {
                System.out.println("Koefisien x2 (a) tidak boleh sama dengan 0. Silakan masukkan nilai yang valid.");
            }
        } while ( a == 0); // ulang sampai a tidak sama dengan 0

        // Baca data koefisien persamaan dari keyboard
        System.out.println("Koefisien x (b): "); // untuk input koefisien b
        b = keyboard.nextDouble(); // baca input koefisien b
        System.out.println("Konstanta (c): "); // untuk input konstanta c
        c = keyboard.nextDouble(); // baca input konstanta c

        // Hitung nilai D
        D = b * b - (4 * a * c); // menghitung nilai D dengan rumus (Diskriminan)
        
        if (D < 0) { // memeriksa apakah D negatif
            System.out.println("Tidak mempunyai akar nyata/real"); // pesan jika tidak ada akar nyata
        } else if (D == 0) { // memeriksa apakah D sama dengan 0
            x1 = -b / (2 * a); // untuk mengitung nilai x1 jika akarnya tunggal
            System.out.println("Akarnya tunggal yakni: " + x1); // cetak nilai x1
        } else { // akarnya dua berbeda
            x1 = (-b + Math.sqrt(D)) / (2 * a); // menghitung nilai X1
            x2 = (-b - Math.sqrt(D)) / (2 * a); // menghitung nilai X2
            System.out.println("Akar pertama: " + x1); // mencetak akar pertama
            System.out.println("Akar kedua: " + x2); // mencetak akar kedua
        }
    } // akhir dari metode utama
} // akhir dari kelas PersamaanKuadrat

