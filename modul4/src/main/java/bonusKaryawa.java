  
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class bonusKaryawa {//awal kelas bonusKaryawan
     public static void main(String[] args) {//awal metode utama
        Scanner keyboard = new Scanner(System.in);//objek scanner untuk membaca input
        //input nama karywan
        System.out.print("Masukkan Nama Karyawan:");//input nama karyawan oleh user
        String nama = keyboard.nextLine();//baca input nama karyawan

        // Input golongan
        System.out.print("Masukkan golongan pekerjaan karyawan (I, II, III, IV): ");//meminta input golongan 
        String golongan = keyboard.nextLine().toUpperCase();//baca input golongan dan mengubah kehuruf besar

        // Input masa kerja
        System.out.print("Masukkan masa kerja karyawan (tahun): ");//input masa kerja
        int masaKerja = keyboard.nextInt();//baca input masa kerja

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok karyawan: ");//minta input gaji pokok
        double gajiPokok = keyboard.nextDouble();//baca input gaji pokok

        // Inisialisasi persentase bonus
        double persentaseBonus = 0;//deklarasi variabel untuk persentase bonuus

        // Menentukan persentase bonus berdasarkan golongan dan masa kerja
        switch (golongan) {//mmeriksa golongan yang dimasukkan
            case "I"://jika glonganI
                if (masaKerja >= 0 && masaKerja <= 10) {//memeriksa masa kerja 
                    persentaseBonus = 0.50;//presentase bonus
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.60;//persentase masa kerja 11-20 tahun
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    persentaseBonus = 0.70;//persentase masa kerja 21-30 tahun
                }
                break;//keluar dari switch
            case "II":  //jika golongan II
                if (masaKerja >= 0 && masaKerja <= 10) {//memeriksa masa kerja
                    persentaseBonus = 0.60;//persentase bonus
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.70;//persentase masa kerja 11-20 tahun
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    persentaseBonus = 0.80;//persentase masa kerja 21-30 tahun
                }
                break;//keluar dari switch
            case "III"://jika golongan III
                if (masaKerja >= 0 && masaKerja <= 10) {//memeriksa masa kerja 
                    persentaseBonus = 0.70;//persentase bonus 
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.80;//persentase masa kerja 11-20 tahun
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    persentaseBonus = 0.90;//persentase masa kerja 21-30 tahun
                }
                break;//keluar dari switch 
            case "IV"://jika golongan IV
                if (masaKerja >= 0 && masaKerja <= 10) {//memeriksa masa kerja 
                    persentaseBonus = 0.80;//persentasa bonus 
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.90;//persentase masa kerja 11-20 tahun
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    persentaseBonus = 1.00;//persentase masa kerja 21-30 tahun
                }
                break;//keluar dari switch
            default://jika golongan tidak valid 
                System.out.println("Golongan tidak valid.");//mencetak pesan kesalahan
                return;//keluar dari program
        }

        // Menghitung bonus
        double bonus = gajiPokok * persentaseBonus;//hitunga total bonus 

        // Output
        System.out.printf("Besarnya bonus akhir tahun karyawan atas nama" + nama+" adalah: "+ bonus);//mencetak hasil bonus
    }//akhir metode utama 
}//akhir class bonusKaryawan

