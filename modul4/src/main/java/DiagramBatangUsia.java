

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

import java.util.Scanner;

public class DiagramBatangUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah penduduk
        System.out.print("Masukkan jumlah penduduk: ");
        int N = scanner.nextInt();

        // Array untuk menyimpan usia setiap penduduk
        int[] usia = new int[N];

        // Mengumpulkan data usia penduduk
        for (int i = 0; i < N; i++) {
            System.out.print("Usia warga " + (i + 1) + ": ");
            usia[i] = scanner.nextInt();
        }

        // Variabel untuk menghitung jumlah penduduk dalam rentang usia tertentu
        int[][] rentangUsia = new int[5][2];

        // Menghitung jumlah penduduk dalam setiap rentang usia menggunakan nested loop
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j == 0 && usia[i] >= 0 && usia[i] <= 20) ||
                    (j == 1 && usia[i] >= 21 && usia[i] <= 40) ||
                    (j == 2 && usia[i] >= 41 && usia[i] <= 60) ||
                    (j == 3 && usia[i] >= 61 && usia[i] <= 80) ||
                    (j == 4 && usia[i] >= 81 && usia[i] <= 100)) {
                        rentangUsia[j][0]++;
                }
            }
        }

        // Menampilkan diagram batang untuk distribusi usia
        System.out.println("Distribusi usia " + N + " penduduk di atas adalah:");
        System.out.println("0 - 20  : " + "*".repeat(rentangUsia[0][0]));
        System.out.println("21 - 40 : " + "*".repeat(rentangUsia[1][0]));
        System.out.println("41 - 60 : " + "*".repeat(rentangUsia[2][0]));
        System.out.println("61 - 80 : " + "*".repeat(rentangUsia[3][0]));
        System.out.println("81 - 100: " + "*".repeat(rentangUsia[4][0]));
    }
}
