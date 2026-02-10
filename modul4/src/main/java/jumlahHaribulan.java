
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class jumlahHaribulan{//awal class jumlahHaribulan

    enum Bulan {// Mendefinisikan enum Bulan yang berisi nama-nama bulan
        JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER
    }

    public static void main(String[] args) {//awal metode utama
        Scanner keyboard = new Scanner(System.in);// Membuat objek Scanner untuk membaca input dari pengguna
        // objek scanner untuk input nama bulan
        System.out.println("Masukkan Nama Bulan:");
        String namaBulan = keyboard.nextLine().toUpperCase();// Membaca input dan mengubahnya menjadi huruf kapital

        try {
             // Menggunakan switch untuk menentukan jumlah hari berdasarkan nama bulan
            switch (Bulan.valueOf(namaBulan)) {
                case JANUARI:
                    System.out.println("Terdapat 31 hari di bulan Januari tahun 2024");// Menampilkan jumlah hari di Januari
                    break;// Menghentikan eksekusi switch
                case FEBRUARI:
                    System.out.println("Terdapat 29 hari di bulan Februari tahun 2024 (tahun kabisat)");// Menampilkan jumlah hari di februari
                    break;// Menghentikan eksekusi switch
                case MARET:
                    System.out.println("Terdapat 31 hari di bulan Maret tahun 2024");// Menampilkan jumlah hari di maret
                    break;// Menghentikan eksekusi switch
                case APRIL:
                    System.out.println("Terdapat 30 hari di bulan April tahun 2024");// Menampilkan jumlah hari di april
                    break;// Menghentikan eksekusi switch
                case MEI:
                    System.out.println("Terdapat 31 hari di bulan Mei tahun 2024");// Menampilkan jumlah hari di mei
                    break;// Menghentikan eksekusi switch
                case JUNI:
                    System.out.println("Terdapat 30 hari di bulan Juni tahun 2024");// Menampilkan jumlah hari di Juni
                    break;// Menghentikan eksekusi switch
                case JULI:
                    System.out.println("Terdapat 31 hari di bulan Juli tahun 2024");// Menampilkan jumlah hari di Juli
                    break;// Menghentikan eksekusi switch
                case AGUSTUS:
                    System.out.println("Terdapat 31 hari di bulan Agustus tahun 2024");// Menampilkan jumlah hari di agustus
                    break;// Menghentikan eksekusi switch
                case SEPTEMBER:
                    System.out.println("Terdapat 30 hari di bulan September tahun 2024");// Menampilkan jumlah hari di september
                    break;// Menghentikan eksekusi switch
                case OKTOBER:
                    System.out.println("Terdapat 31 hari di bulan Oktober tahun 2024");// Menampilkan jumlah hari di oktober
                    break;// Menghentikan eksekusi switch
                case NOVEMBER:
                    System.out.println("Terdapat 30 hari di bulan November tahun 2024");// Menampilkan jumlah hari di november
                    break;// Menghentikan eksekusi switch
                case DESEMBER:
                    System.out.println("Terdapat 31 hari di bulan Desember tahun 2024");// Menampilkan jumlah hari di desember
                    break;// Menghentikan eksekusi switch
            }
           } catch (IllegalArgumentException e) {// Menangkap exception jika nama bulan tidak valid
            System.out.println("Nama bulan tidak valid.");// Menampilkan pesan kesalahan
          }
          }//akhir metode utama
          }//akhir class jumlahHaribulan
 