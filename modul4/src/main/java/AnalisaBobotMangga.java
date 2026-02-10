
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class AnalisaBobotMangga {//awal class
     public static void main(String[] args) {//awal metode utama
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner keyboard = new Scanner(System.in);
        // Meminta pengguna memasukkan jumlah mangga yang akan diproses
        System.out.print("Jumlah mangga yang akan diproses: ");
        int n = keyboard.nextInt();
        // Deklarasi variabel untuk menghitung jumlah mangga di setiap kategori
        int jumlahMangaKecil = 0;
        int jumlahMangaSedang = 0;
        int jumlahMangaBesar = 0;
        // Loop untuk menerima berat setiap mangga dari pengguna
        for (int i = 1; i <= n; i++) {
            System.out.print("Berat mangga " + i + ": ");
            int beratMangga = keyboard.nextInt();
            // Menentukan kategori mangga berdasarkan beratnya
            if (beratMangga < 200) {
                jumlahMangaKecil++;
            } else if (beratMangga < 600) {
                jumlahMangaSedang++;
            } else {
                jumlahMangaBesar++;
            }
        }
        // Mencetak hasil analisis berat mangga
        System.out.println("Dari " + n + " mangga yang ditimbang:");
        System.out.println("Mangga Kecil: " + jumlahMangaKecil + " buah");
        System.out.println("Mangga Sedang: " + jumlahMangaSedang + " buah");
        System.out.println("Mangga Besar: " + jumlahMangaBesar + " buah");
    }//akhir metode utama
}//alhir class
