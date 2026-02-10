/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;
   import java.util.Scanner;
/**
 *
 * @author Celvin Pati
 */
public class mahasiswa {

    public static void main(String[] args) { // Metode utama program
        int n; // Variabel untuk menyimpan jumlah mahasiswa
        String[] nim, nama; // Array untuk menyimpan NIM dan nama mahasiswa
        double[] us1, us2, uas, totalNil; // Array untuk menyimpan nilai US1, US2, UAS, dan total nilai
        char[] finalNil; // Array untuk menyimpan konversi nilai huruf
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: "); // Meminta pengguna memasukkan jumlah mahasiswa
        n = keyboard.nextInt(); // Membaca jumlah mahasiswa dari input
        keyboard.nextLine(); // Menangkap newline setelah nextInt

        // Inisialisasi array berdasarkan jumlah mahasiswa
        nim = new String[n]; // Menginisialisasi array NIM dengan ukuran n
        nama = new String[n]; // Menginisialisasi array nama dengan ukuran n
        us1 = new double[n]; // Menginisialisasi array nilai US1 dengan ukuran n
        us2 = new double[n]; // Menginisialisasi array nilai US2 dengan ukuran n
        uas = new double[n]; // Menginisialisasi array nilai UAS dengan ukuran n
        totalNil = new double[n]; // Menginisialisasi array total nilai dengan ukuran n
        finalNil = new char[n]; // Menginisialisasi array nilai huruf dengan ukuran n

        // Input data mahasiswa
        for (int i = 0; i < n; i++) { // Loop untuk setiap mahasiswa
            System.out.print("NIM: "); // Meminta pengguna memasukkan NIM
            nim[i] = keyboard.next(); // Membaca NIM dari input
            System.out.print("Nama: "); // Meminta pengguna memasukkan nama
            nama[i] = keyboard.nextLine(); // Membaca nama dari input (menggunakan nextLine untuk nama lengkap)
            System.out.print("Nilai US1: "); // Meminta pengguna memasukkan nilai US1
            us1[i] = keyboard.nextDouble(); // Membaca nilai US1 dari input
            System.out.print("Nilai US2: "); // Meminta pengguna memasukkan nilai US2
            us2[i] = keyboard.nextDouble(); // Membaca nilai US2 dari input
            System.out.print("Nilai UAS: "); // Meminta pengguna memasukkan nilai UAS
            uas[i] = keyboard.nextDouble(); // Membaca nilai UAS dari input
            keyboard.nextLine(); // Menangkap newline setelah nextDouble
            System.out.println(); // Menambahkan baris baru untuk pemisahan

            // Hitung total nilai
            totalNil[i] = 0.3 * us1[i] + 0.3 * us2[i] + 0.4 * uas[i]; // Menghitung total nilai berdasarkan bobot

            // Konversi total nilai ke nilai huruf
            if (totalNil[i] >= 80) finalNil[i] = 'A'; // Jika total nilai >= 80, nilai huruf A
            else if (totalNil[i] >= 65) finalNil[i] = 'B'; // Jika total nilai >= 65, nilai huruf B
            else if (totalNil[i] >= 55) finalNil[i] = 'C'; // Jika total nilai >= 55, nilai huruf C
            else if (totalNil[i] >= 45) finalNil[i] = 'D'; // Jika total nilai >= 45, nilai huruf D
            else finalNil[i] = 'E'; // Jika total nilai < 45, nilai huruf E
        }

        // Output daftar nilai mahasiswa
        System.out.println("Daftar Nilai Mahasiswa:"); // Menampilkan judul daftar nilai mahasiswa
        System.out.println("No.  NIM         Nama    US1  US2  UAS  Total  Final"); // Menampilkan header tabel
        for (int i = 0; i < n; i++) { // Loop untuk setiap mahasiswa
            // Menampilkan informasi mahasiswa dalam format tabel
            System.out.println((i + 1) + ".   " + nim[i] + "   " + nama[i] + "   " +
                us1[i] + "   " + us2[i] + "   " + uas[i] + "   " + totalNil[i] + "   " + finalNil[i]);
        }

        // Pengurutan berdasarkan totalNil
        for (int i = 0; i < n - 1; i++) { // Loop untuk iterasi pengurutan (n-1 kali)
            for (int j = 0; j < n - 1 - i; j++) { // Loop untuk membandingkan elemen yang berdekatan
                if (totalNil[j] < totalNil[j + 1]) { // Jika total nilai elemen saat ini lebih kecil dari elemen berikutnya
                    // Tukar semua elemen yang terkait untuk menjaga konsistensi data
                    double tempD = totalNil[j]; // Simpan total nilai saat ini dalam variabel sementara
                    totalNil[j] = totalNil[j + 1]; // Pindahkan total nilai berikutnya ke posisi saat ini
                    totalNil[j + 1] = tempD; // Tempatkan total nilai sementara ke posisi berikutnya

                    char tempC = finalNil[j]; // Simpan nilai huruf saat ini dalam variabel sementara
                    finalNil[j] = finalNil[j + 1]; // Pindahkan nilai huruf berikutnya ke posisi saat ini
                    finalNil[j + 1] = tempC; // Tempatkan nilai huruf sementara ke posisi berikutnya

                    String tempS = nim[j]; // Simpan NIM saat ini dalam variabel sementara
                    nim[j] = nim[j + 1]; // Pindahkan NIM berikutnya ke posisi saat ini
                    nim[j + 1] = tempS; // Tempatkan NIM sementara ke posisi berikutnya

                    tempS = nama[j]; // Simpan nama saat ini dalam variabel sementara
                    nama[j] = nama[j + 1]; // Pindahkan nama berikutnya ke posisi saat ini
                    nama[j + 1] = tempS; // Tempatkan nama sementara ke posisi berikutnya

                    tempD = us1[j]; // Simpan nilai US1 saat ini dalam variabel sementara
                    us1[j] = us1[j + 1]; // Pindahkan nilai US1 berikutnya ke posisi saat ini
                    us1[j + 1] = tempD; // Tempatkan nilai US1 sementara ke posisi berikutnya

                    tempD = us2[j]; // Simpan nilai US2 saat ini dalam variabel sementara
                    us2[j] = us2[j + 1]; // Pindahkan nilai US2 berikutnya ke posisi saat ini
                    us2[j + 1] = tempD; // Tempatkan nilai US2 sementara ke posisi berikutnya

                    tempD = uas[j]; // Simpan nilai UAS saat ini dalam variabel sementara
                    uas[j] = uas[j + 1]; // Pindahkan nilai UAS berikutnya ke posisi saat ini
                    uas[j + 1] = tempD; // Tempatkan nilai UAS sementara ke posisi berikutnya
                }
            }
        }

        System.out.println(); // Menambahkan baris baru untuk pemisahan output

        // Output daftar mahasiswa urut berdasarkan total
        System.out.println("Daftar Nilai Mahasiswa Urut Terbaik:"); // Menampilkan judul daftar mahasiswa yang diurutkan
        System.out.println("No.  NIM         Nama    US1  US2  UAS  Total  Final"); // Menampilkan header tabel
        for (int i = 0; i < n; i++) { // Loop untuk setiap mahasiswa
            // Menampilkan informasi mahasiswa dalam format tabel
            System.out.println((i + 1) + ".   " + nim[i] + "   " + nama[i] + "   " +
                us1[i] + "   " + us2[i] + "   " + uas[i] + "   " + totalNil[i] + "   " + finalNil[i]);
        }
    }
}
   