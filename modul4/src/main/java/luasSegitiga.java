/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.Scanner; // Import kelas Scanner untuk mengambil input dari pengguna

/**
 *
 * @author Celvin Pati
 */
public class luasSegitiga {//awal program luasSegitiga
    public static void main(String[] args) {//awal metode utama
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Membaca titik-titik sudut segitiga
        System.out.println("Masukkan koordinat titik A:");
        int[] titikA = bacaTitik(scanner);
        
        System.out.println("Masukkan koordinat titik B:");
        int[] titikB = bacaTitik(scanner);
        
        System.out.println("Masukkan koordinat titik C:");
        int[] titikC = bacaTitik(scanner);

        // Menghitung jarak antara titik-titik untuk mendapatkan sisi-sisi segitiga
        double sisiA = hitungJarak(titikB[0], titikB[1], titikC[0], titikC[1]); // BC
        double sisiB = hitungJarak(titikA[0], titikA[1], titikC[0], titikC[1]); // AC
        double sisiC = hitungJarak(titikA[0], titikA[1], titikB[0], titikB[1]); // AB

        // Menghitung keliling segitiga
        double keliling = hitungKeliling(sisiA, sisiB, sisiC);
        
        // Menghitung luas segitiga menggunakan rumus Heron
        double semiKeliling = keliling / 2;
        double luas = Math.sqrt(semiKeliling * (semiKeliling - sisiA) * (semiKeliling - sisiB) * (semiKeliling - sisiC));

        // Menampilkan hasil
        System.out.printf("Keliling segitiga: %.2f\n", keliling);
        System.out.printf("Luas segitiga: %.2f\n", luas);
    }

    // Metode untuk membaca koordinat titik
    static int[] bacaTitik(Scanner scanner) {
        System.out.print("Masukkan absis (x): ");
        int x = scanner.nextInt();
        System.out.print("Masukkan ordinat (y): ");
        int y = scanner.nextInt();
        return new int[]{x, y}; // Mengembalikan array yang berisi koordinat
    }

    // Metode untuk menghitung jarak antara dua titik
    static double hitungJarak(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Rumus jarak
    }

    // Metode untuk menghitung keliling segitiga
    static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC; // Mengembalikan keliling
    }//akhir metode utama
}//akhir program luasSegitiga

