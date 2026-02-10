


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class matriksIdentitas { //awal kelas matriksIdentitas
    public static void main(String[] args) { // Metode utama untuk menjalankan program
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        // Meminta pengguna untuk memasukkan ukuran matriks identitas
        System.out.print("Masukkan ukuran matrik identitas (N): "); 
        int N = scanner.nextInt(); // Menyimpan input ukuran matriks ke variabel N
        // Membuat matriks identitas dengan ukuran N x N
        int[][] matrikIdentitas = new int[N][N]; 
        // Mengisi matriks identitas
        for (int i = 0; i < N; i++) { // Loop untuk setiap baris
            for (int j = 0; j < N; j++) { // Loop untuk setiap kolom
                if (i == j) { // Memeriksa apakah indeks baris sama dengan indeks kolom
                    matrikIdentitas[i][j] = 1; // Jika sama, elemen diagonal utama diisi dengan 1
                } else {
                    matrikIdentitas[i][j] = 0; // Jika tidak, elemen lainnya diisi dengan 0
                }
            }
        }
        // Menampilkan matriks identitas
        System.out.println("Matrik Identitas " + N + " x " + N + ":"); // Menginformasikan ukuran matriks yang akan ditampilkan
        for (int i = 0; i < N; i++) { // Loop untuk setiap baris
            for (int j = 0; j < N; j++) { // Loop untuk setiap kolom
                System.out.print(matrikIdentitas[i][j] + " "); // Mencetak elemen matriks dengan spasi
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris matriks
        }//akhir Metode utama untuk menjalankan program
    }
}//akhir kelas matriksIdentitas

