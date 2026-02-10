/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.Scanner; // Import kelas Scanner untuk mengambil input dari pengguna
/**
 *
 * @author Celvin Pati
 */
public class metode {//awal class metode
    public static void main(String[] args) {//awal metode utama
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input
        // Mengambil input n dari pengguna
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        // Mengambil input r dari pengguna
        System.out.print("Masukkan nilai r (r ≤ n): ");
        int r = scanner.nextInt();
        // Memeriksa syarat r ≤ n
        if (r > n) {
            System.out.println("Error: r harus kurang dari atau sama dengan n.");
            return; // Keluar dari program jika syarat tidak terpenuhi
        }
        // Menghitung nilai kombinasi C(n, r)
        int kombinasi = kombinasi(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasi); // Menampilkan hasil
    }
    // Fungsi untuk menghitung faktorial
    static int faktorial(int n) {
        int hasFak = 1; // Inisialisasi hasil faktorial
        if (n == 0) return 1; // Faktorial dari 0 adalah 1
        else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i; // Menghitung faktorial
            }
        }
        return hasFak; // Mengembalikan hasil faktorial
    }
    // Fungsi untuk menghitung kombinasi C(n, r)
    static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(n - r) * faktorial(r)); // Menghitung C(n, r)
    }//akhir metode utama
}//akhir class metode

