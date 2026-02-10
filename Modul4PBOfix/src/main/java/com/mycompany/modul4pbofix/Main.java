/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4pbofix;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) { // Method main, titik awal eksekusi program
        Scanner input = new Scanner(System.in); // untuk buat objek Scanner untuk membaca input dari pengguna

        // Meminta jumlah mahasiswa yang akan dimasukkan
        System.out.print("Masukkan jumlah mahasiswa: "); // Menampilkan prompt ke pengguna
        int N = input.nextInt(); // Membaca jumlah mahasiswa yang dimasukkan oleh pengguna
        input.nextLine(); // Membersihkan newline buffer agar input berikutnya tidak terlewati

        // Membuat array untuk menyimpan objek Mahasiswa sebanyak N
        Mahasiswa[] mahasiswaList = new Mahasiswa[N];

        // Perulangan untuk input data setiap mahasiswa
        for (int i = 0; i < N; i++) { // Looping dari 0 hingga N-1
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1)); // Menampilkan nomor mahasiswa yang sedang diinput

            System.out.print("NIM: "); // untuk NIM
            String nim = input.nextLine(); // Membaca NIM mahasiswa

            System.out.print("Nama: "); //  untuk nama
            String nama = input.nextLine(); // Membaca nama mahasiswa

            System.out.print("Tanggal Lahir (dd/mm/yyyy): "); //  untuk tanggal lahir
            String tglLahir = input.nextLine(); // Membaca tanggal lahir mahasiswa

            System.out.print("UTS 1: "); //  untuk nilai UTS 1
            double uts1 = input.nextDouble(); // Membaca nilai UTS 1

            System.out.print("UTS 2: "); // untuk nilai UTS 2
            double uts2 = input.nextDouble(); // Membaca nilai UTS 2

            System.out.print("UAS: "); // untuk nilai UAS
            double uas = input.nextDouble(); // Membaca nilai UAS
            input.nextLine(); // Membersihkan newline buffer setelah pembacaan angka

            // buat objek untuki Mahasiswa baru dengan data yang diinput dan menyimpannya ke dalam array
            mahasiswaList[i] = new Mahasiswa(nim, nama, tglLahir, uts1, uts2, uas);
        }

        // Menampilkan header daftar mahasiswa dalam bentuk tabel
        System.out.println("\nDaftar Mahasiswa Informatika Peserta PBO"); // Menampilkan judul tabel
        System.out.println("-------------------------------------------------------------------------------------------------"); // Menampilkan garis pemisah
        // Menampilkan header kolom tabel dengan format yang rapi
        System.out.printf("%-4s %-10s %-15s %-12s %-7s %-7s %-7s %-7s %-5s\n",
                "No.", "NIM", "Nama", "Tgl Lahir", "UTS1", "UTS2", "UAS", "Final", "Nilai");
        System.out.println("-------------------------------------------------------------------------------------------------"); // Menampilkan garis pemisah

        // Inisialisasi variabel untuk menghitung total nilai untuk perhitungan rata-rata
        double totalUTS1 = 0, totalUTS2 = 0, totalUAS = 0, totalFinal = 0;
        // Inisialisasi mahasiswaTerbaik dengan mahasiswa pertama sebagai pembanding awal
        Mahasiswa mahasiswaTerbaik = mahasiswaList[0];

        // Perulangan untuk menampilkan data setiap mahasiswa dan menghitung total nilai
        for (int i = 0; i < N; i++) { // Looping untuk setiap mahasiswa dalam array
            Mahasiswa mhs = mahasiswaList[i]; // Mengambil objek Mahasiswa dari array pada indeks i

            // Menampilkan data mahasiswa dengan format tabel
            System.out.printf("%-4d %-10s %-15s %-12s %-7.2f %-7.2f %-7.2f %-7.2f %-5s\n",
                    (i + 1), mhs.Nim, mhs.Nama, mhs.TanggalLahir, mhs.Uts1, mhs.Uts2, mhs.Uas, mhs.Final, mhs.NilaiKonversi);

            // Menambahkan nilai masing-masing ke total untuk perhitungan rata-rata
            totalUTS1 += mhs.Uts1;
            totalUTS2 += mhs.Uts2;
            totalUAS += mhs.Uas;
            totalFinal += mhs.Final;

            // Memeriksa apakah mahasiswa saat ini memiliki nilai final yang lebih tinggi dibanding mahasiswaTerbaik
            if (mhs.Final > mahasiswaTerbaik.Final) {
                mahasiswaTerbaik = mhs; // Mengupdate mahasiswaTerbaik jika nilai final lebih tinggi
            }
        }

        // Menampilkan garis pemisah untuk bagian rata-rata
        System.out.println("-------------------------------------------------------------------------------------------------");
        // Menampilkan rata-rata nilai UTS1, UTS2, UAS, dan Final dengan format tabel
        System.out.printf("%-37s %-7.2f %-7.2f %-7.2f %-7.2f\n",
                "Rata-rata", (totalUTS1 / N), (totalUTS2 / N), (totalUAS / N), (totalFinal / N));
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Menampilkan informasi mahasiswa dengan nilai tertinggi
        System.out.println("\nMahasiswa dengan nilai tertinggi:"); // Teks judul untuk mahasiswa terbaik
        System.out.println("NIM      : " + mahasiswaTerbaik.Nim); // Menampilkan NIM mahasiswa terbaik
        System.out.println("Nama     : " + mahasiswaTerbaik.Nama); // Menampilkan nama mahasiswa terbaik
        System.out.println("Tgl Lhr  : " + mahasiswaTerbaik.TanggalLahir); // Menampilkan tanggal lahir mahasiswa terbaik
        System.out.println("Final    : " + mahasiswaTerbaik.Final); // Menampilkan nilai final mahasiswa terbaik
        System.out.println("Nilai    : " + mahasiswaTerbaik.NilaiKonversi); // Menampilkan nilai huruf mahasiswa terbaik

        // Program selesai, tutup objek Scanner untuk menghindari kebocoran resource
        input.close();
    }
}
