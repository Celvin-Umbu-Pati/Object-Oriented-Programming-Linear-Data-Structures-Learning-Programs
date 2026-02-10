/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner; // Import kelas Scanner untuk mengambil input dari pengguna
/**
 *
 * @author Celvin Pati
 */
public class Bintang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Mengambil input n dari pengguna
        System.out.print("Masukkan nilai n untuk segitiga Pascal: ");
        int n = scanner.nextInt();

        // Menghasilkan segitiga Pascal hingga baris n
        for (int i = 0; i <= n; i++) {
            // Menampilkan nilai kombinasi C(n, r) untuk setiap r dari 0 hingga i
            for (int j = 0; j <= i; j++) {
                System.out.print(Combinasi(i, j) + " "); // Memanggil metode Combinasi
            }
            System.out.println(); // Pindah ke baris berikutnya
        }

        // Menulis bintang ( * ) menggunakan metode
        bintang(5); // 5 bintang
        bintang(7); // 7 bintang
        bintang(10); // 10 bintang
    }

    // Metode untuk menghitung faktorial
    static int faktorial(int n) {
        int hasFak = 1; // Inisialisasi hasil faktorial
        if (n == 0) return 1; // Faktorial dari 0 adalah 1
        for (int i = 1; i <= n; i++) {
            hasFak = hasFak * i; // Menghitung faktorial
        }
        return hasFak; // Mengembalikan hasil faktorial
    }

    // Metode untuk menghitung kombinasi C(n, r)
    static int Combinasi(int n, int r) {
        if (r > n) return 0; // Jika r lebih besar dari n, hasilnya 0
        return faktorial(n) / (faktorial(r) * faktorial(n - r)); // Menghitung C(n, r)
    }

    // Metode untuk menulis bintang
    static void bintang(int n) {
        System.out.print(n + " bintang: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("* "); // Menampilkan bintang
        }
        System.out.println(); // Pindah ke baris berikutnya
    }
}  

