
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class nilaiMahasiswa {
    public static void main(String[] args) { //awal metode utama
        Scanner keyboard = new Scanner(System.in);//membuat objek scanner untuk meminta input dari user lewat keyboard
        
        System.out.print("Masukkan Nama Mahasiswa: "); // Meminta input nama mahasiswa dari user lewat keyboard
        String nama = keyboard.next();
        
        double uts1;                                                                                                                                                                                                                                                            
        do {
            System.out.print("Masukkan nilai UTS1: "); // meminta input nilai uts1
            uts1 = keyboard.nextDouble();
            if (uts1 < 0) {
                System.out.println("Nilai yang diinput tidak boleh negatif. Silakan masukkan lagi.");
            }
        } while (uts1 < 0); // ulang sampai nilai UTS1 valid

        double uts2;
        do {
            System.out.print("Masukkan nilai UTS2: "); // meminta input nilai uts2
            uts2 = keyboard.nextDouble();
            if (uts2 < 0) {
                System.out.println("Nilai yang diinput tidak boleh negatif. Silakan masukkan lagi.");
            }
        } while (uts2 < 0); // ulang sampai nilai UTS2 valid

        double uas;
        do {
            System.out.print("Masukkan nilai UAS: "); // meminta input nilai uas
            uas = keyboard.nextDouble();
            if (uas < 0) {
                System.out.println("Nilai yang diinput tidak boleh negatif. Silakan masukkan lagi.");
            }
        } while (uas < 0); // ulang sampai nilai UAS valid

        double nilaiTotal = (0.30 * uts1) + (0.30 * uts2) + (0.40 * uas); // Menghitung nilai total
        char nilaiFinal; // Menentukan nilai final
        
        if (nilaiTotal >= 80) {   
            nilaiFinal = 'A';
        } else if (nilaiTotal >= 65) {
            nilaiFinal = 'B';
        } else if (nilaiTotal >= 55) {
            nilaiFinal = 'C';
        } else if (nilaiTotal >= 50) {
            nilaiFinal = 'D';
        } else {
            nilaiFinal = 'E';
        }
        
        System.out.println("Nilai Total Mahasiswa Atas Nama " + nama + " Adalah: " + nilaiTotal); // Menampilkan hasil
        System.out.println("Nilai Final Mahasiswa Atas Nama " + nama + " Adalah: " + nilaiFinal); // Menampilkan hasil
    }//akhir dari metode utama
} // akhir program

