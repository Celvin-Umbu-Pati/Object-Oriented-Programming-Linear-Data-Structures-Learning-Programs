

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class segitigaPascal { // Mendefinisikan kelas dengan nama segitigaPascal
    public static void main(String[] args) { // Metode utama yang dijalankan saat program dimulai
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        System.out.print("Masukkan nilai n: "); // Meminta pengguna memasukkan nilai n
        int n = keyboard.nextInt(); // Menerima input n dari pengguna
        System.out.print("Masukkan nilai k: "); // Meminta pengguna memasukkan nilai k
        int k = keyboard.nextInt(); // Menerima input k dari pengguna

        int hasil = hitungKoefisienBinomial(n, k); // Menghitung koefisien binomial C(n, k)
        System.out.println("C(" + n + ", " + k + ") = " + hasil); // Menampilkan hasil perhitungan
    }

    // Metode untuk menghitung koefisien binomial C(n, k)
    public static int hitungKoefisienBinomial(int n, int k) {
        if (k == 0 || k == n) { // Memeriksa kondisi dasar (k = 0 atau k = n)
            return 1; // Mengembalikan 1 jika k = 0 atau k = n
        } else { // Jika k tidak sama dengan 0 atau n
            // Menghitung koefisien binomial secara rekursif
            return hitungKoefisienBinomial(n - 1, k - 1) + hitungKoefisienBinomial(n - 1, k);
        }
    }
}
