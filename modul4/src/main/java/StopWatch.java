/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class StopWatch { // awal kelas StopWatch
    public static void main(String[] args) { // Metode utama untuk menjalankan program
        // Inisialisasi variabel jam, menit, dan detik
        int jam = 0; // Menetapkan jam awal ke 0
        int menit = 0; // Menetapkan menit awal ke 0
        int detik = 0; // Menetapkan detik awal ke 0

        // Loop untuk menghitung waktu hingga jam mencapai 12
        while (jam <12) { // Selama jam kurang dari atau sama dengan 12
            // Reset detik dan mulai menghitung detik dari 1 hingga 60
            for (detik = 1; detik <= 60; detik++) { // Loop untuk menghitung detik dari 1 sampai 60
                System.out.print("Detik : " + detik + " "); // Menampilkan detik yang sedang dihitung
            }
            System.out.println(); // Mencetak baris baru setelah menampilkan semua detik
            menit++; // Menambahkan satu menit setelah 60 detik

            // Cek apakah menit sudah mencapai 60
            if (menit == 60) { // Jika menit mencapai 60
                menit = 0; // Reset menit ke 0
                jam++; // Tambah jam satu
                System.out.println("Jam : " + jam); // Menampilkan jam yang baru
            }

            // Menampilkan menit
            System.out.println("Menit: " + menit); // Menampilkan menit yang sedang dihitung
        }//akhir metode utama
    }
}//akhir class stopWatch