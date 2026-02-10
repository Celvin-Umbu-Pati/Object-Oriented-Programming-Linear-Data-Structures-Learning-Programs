
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class MainKaryawan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input data karyawan tetap
        System.out.println("DATA KARYAWAN TETAP");
        System.out.print("Masukkan NPP: ");
        int nppTetap = scanner.nextInt();  // Membaca NPP
        scanner.nextLine(); // Membersihkan newline
        System.out.print("Masukkan Nama: ");
        String namaTetap = scanner.nextLine(); // Membaca nama
        System.out.print("Masukkan Jumlah Anak: ");
        int anakTetap = scanner.nextInt(); // Membaca jumlah anak
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = scanner.nextInt(); // Membaca gaji pokok
        // Membuat objek karyawan tetap
        KaryawanTetap tetap = new KaryawanTetap(nppTetap, namaTetap, anakTetap, gajiPokok);
        
        // Input data karyawan kontrak
        System.out.println("\nDATA KARYAWAN KONTRAK");
        System.out.print("Masukkan NPP: ");
        int nppKontrak = scanner.nextInt();  // Membaca NPP
        scanner.nextLine(); // Membersihkan newline
        System.out.print("Masukkan Nama: ");
        String namaKontrak = scanner.nextLine(); // Membaca nama
        System.out.print("Masukkan Jumlah Anak: ");
        int anakKontrak = scanner.nextInt(); // Membaca jumlah anak
        System.out.print("Masukkan Upah Harian: ");
        int upahHarian = scanner.nextInt(); // Membaca upah harian
        System.out.print("Masukkan Jumlah Hari Masuk: ");
        int hariMasuk = scanner.nextInt(); // Membaca jumlah hari masuk
        // Membuat objek karyawan kontrak
        KaryawanKontrak kontrak = new KaryawanKontrak(nppKontrak, namaKontrak, anakKontrak, upahHarian);
        
        // Menampilkan hasil perhitungan
        System.out.println("\nHASIL PERHITUNGAN");
        System.out.println("Karyawan Tetap:");
        System.out.println("NPP: " + tetap.getNpp()); // Menampilkan NPP
        System.out.println("Nama: " + tetap.getNama()); // Menampilkan nama
        System.out.println("Total Gaji: Rp" + tetap.hitungTotalGaji()); // Menampilkan total gaji
        
        System.out.println("\nKaryawan Kontrak:");
        System.out.println("NPP: " + kontrak.getNpp()); // Menampilkan NPP
        System.out.println("Nama: " + kontrak.getNama()); // Menampilkan nama
        // Menampilkan total upah dengan parameter hari masuk
        System.out.println("Total Upah: Rp" + kontrak.hitungUpahTotal(hariMasuk));
        
        // Menutup scanner
        scanner.close();
    }
}

