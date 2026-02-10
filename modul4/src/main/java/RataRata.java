
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class RataRata {//awal kelas ratarata
   public static void main(String[] args) {//awal metode utama
        // Jumlah data yang akan diproses
        int N = 3;

        // Inisialisasi jumlah data
        double totalData = 0;

        // Menerima input data dari pengguna
        Scanner keyboard = new Scanner(System.in);  // Membuat objek Scanner untuk menerima input
        for (int i = 0; i < N; i++) {  // Loop untuk menerima N buah input
            System.out.print("Data ke " + (i+1) + ": ");  // Meminta pengguna memasukkan data ke-i
            double data = keyboard.nextDouble(); 
            // Menerima input dari pengguna dan menyimpannya dalam variabel data
            totalData += data;  // Menambahkan data ke total data
        }
        // Menghitung rata-rata
        double rataRata = totalData / N; 
        // Menghitung rata-rata dengan membagi total data dengan jumlah data
//{50.43, 114.15, 324.5, 67.9, 45.99, 34.5, 89.56, 97.3, 75.2, 52.6, 8.39};
        // Menampilkan hasil
        System.out.println("Banyak data yang akan diproses = " + N); 
        // Menampilkan jumlah data yang diproses
        System.out.printf("Rata-rata data adalah = " + rataRata); 
        // Menampilkan hasil rata-rata dengan format 2 angka di belakang koma
    } //akhir metode utama
}//akhir klass ratarata
