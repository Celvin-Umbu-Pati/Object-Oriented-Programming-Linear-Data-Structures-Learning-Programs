
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class kualitasMangga {//awal class kualitasMangga
    public static void main(String[] args) { // Awal metode utama
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        // Meminta pengguna untuk memasukkan jumlah mangga yang akan diproses
        System.out.print("Masukkan jumlah mangga yang akan diproses: ");
        int jumlahMangga = keyboard.nextInt(); // Menyimpan input jumlah mangga dalam variabel jumlahMangga

        // Variabel untuk menghitung jumlah setiap kualitas mangga
        int biasaCount = 0; // Menghitung jumlah mangga berkualitas BIASA
        int bagusCount = 0; // Menghitung jumlah mangga berkualitas BAGUS
        int unggulCount = 0; // Menghitung jumlah mangga berkualitas UNGGUL

        // Memproses setiap mangga sesuai jumlah yang dimasukkan pengguna
        for (int i = 1; i <= jumlahMangga; i++) { // Loop dari 1 hingga jumlahMangga
            double berat; // Mendeklarasikan variabel untuk menyimpan berat mangga

            // Menggunakan do-while untuk memastikan berat yang dimasukkan positif
            do {
                // Meminta pengguna untuk memasukkan berat mangga ke-i
                System.out.print("Masukkan berat mangga ke-" + i + " (dalam gram): ");
                berat = keyboard.nextDouble(); // Membaca input berat mangga dari pengguna

                // Memeriksa apakah berat yang dimasukkan kurang dari atau sama dengan 0
                if (berat <= 0) {
                    // Memberitahu pengguna bahwa berat harus positif
                    System.out.println("Berat harus positif! Silakan coba lagi.");
                }
            } while (berat <= 0); // Mengulangi input jika berat tidak valid

            // Menentukan kualitas mangga berdasarkan berat yang dimasukkan
            if (berat < 500) { // Jika berat kurang dari 500 gram
                biasaCount++; // Tambah jumlah mangga berkualitas BIASA
            } else if (berat >= 500 && berat < 750) { // Jika berat antara 500 dan 749 gram
                bagusCount++; // Tambah jumlah mangga berkualitas BAGUS
            } else { // Jika berat 750 gram atau lebih
                unggulCount++; // Tambah jumlah mangga berkualitas UNGGUL
            }
        }

        // Menampilkan hasil jumlah mangga berdasarkan kualitas
        System.out.println("Jumlah mangga berdasarkan kualitas:");
        System.out.println("BIASA: " + biasaCount); // Menampilkan jumlah mangga BIASA
        System.out.println("BAGUS: " + bagusCount); // Menampilkan jumlah mangga BAGUS
        System.out.println("UNGGUL: " + unggulCount); // Menampilkan jumlah mangga UNGGUL

    }// Akhir metode utama
}// Akhir class kualitasMangga

