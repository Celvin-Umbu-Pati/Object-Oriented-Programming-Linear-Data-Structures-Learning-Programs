
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class jenisSegitiga {//awal calss jenisSegitiga
     public static void main(String[] args) {//awal metode utama 
        Scanner keyboard = new Scanner(System.in);//objek scanner untuk membaca input 
        
        // Input panjang sisi segitiga
        System.out.print("Masukkan panjang sisi a: ");//meminnta input sisi a
        double a = keyboard.nextDouble();//baca input sisi a
        System.out.print("Masukkan panjang sisi b: ");//minta input sisi b
        double b = keyboard.nextDouble();//baca input sis b
        System.out.print("Masukkan panjang sisi c: ");//minta onput sisi c
        double c = keyboard.nextDouble();//baca input sisi c
        
        // Memeriksa apakah dapat membentuk segitiga
        if (a + b > c && a + c > b && b + c > a) {//memeriksa kondisi segitiga
            // Menentukan jenis segitiga
            if (a == b && b == c) {//memerikasa apakah semua sisi sama
                System.out.println("Segitiga sama sisi");//tampil jenis segitiga sama sisi
            } else if (a == b || a == c || b == c) {//memeriksa apakah ada dua sisi yanfg sama
                System.out.println("Ini Adalah Jenis Segitiga Sama Kaki.");//tampil jenis segitiiga sama kaki
            } else if (a * a + b * b == c * c || //memeriksa apakah segitiga siku-siku
                       a * a + c * c == b * b || 
                       b * b + c * c == a * a) {
                System.out.println("Ini Adalah Jenis Segitiga Siku-siku.");//tampil jenis segitiga siku-siku
            } else {
                System.out.println("Ini Adalah Jenis Segitiga Sembarang.");//tampil jenis segitiga sembarang
            }
        } else {
            System.out.println("Tidak dapat membentuk segitiga.");//tampil pesan jika tidak dapat membentuk segitiga
        }  
    }//akhir metode utama
}//akhir class jenisSegitiga

