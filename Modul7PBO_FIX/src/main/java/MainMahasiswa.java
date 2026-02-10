/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
// Import Scanner untuk input dari user
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // ==============================================
        // INPUT DATA MAHASISWA S1
        // ==============================================
        System.out.println("=== INPUT DATA MAHASISWA S1 ===");
        
        // Meminta dan membaca NIM mahasiswa S1
        System.out.print("Masukkan NIM: ");
        String nimS1 = input.nextLine();
        
        // Meminta dan membaca nama mahasiswa S1
        System.out.print("Masukkan Nama: ");
        String namaS1 = input.nextLine();
        
        // Meminta dan membaca tanggal lahir mahasiswa S1
        System.out.print("Masukkan Tanggal Lahir (DD-MM-YYYY): ");
        String tglS1 = input.nextLine();
        
        // Meminta dan membaca nilai UTS 1 mahasiswa S1
        System.out.print("Masukkan Nilai UTS 1: ");
        double uts1S1 = input.nextDouble();
        
        // Meminta dan membaca nilai UTS 2 mahasiswa S1
        System.out.print("Masukkan Nilai UTS 2: ");
        double uts2S1 = input.nextDouble();
        
        // Meminta dan membaca nilai UAS mahasiswa S1
        System.out.print("Masukkan Nilai UAS: ");
        double uasS1 = input.nextDouble();
        
        // Membersihkan newline di buffer setelah input angka
        input.nextLine(); 
        
        // Membuat objek MahasiswaS1 dengan data yang diinput
        MahasiswaS1 mhsS1 = new MahasiswaS1(nimS1, namaS1, tglS1, uts1S1, uts2S1, uasS1);
        
        // ==============================================
        // INPUT DATA MAHASISWA S2
        // ==============================================
        System.out.println("\n=== INPUT DATA MAHASISWA S2 ===");
        
        // Meminta dan membaca NIM mahasiswa S2
        System.out.print("Masukkan NIM: ");
        String nimS2 = input.nextLine();
        
        // Meminta dan membaca nama mahasiswa S2
        System.out.print("Masukkan Nama: ");
        String namaS2 = input.nextLine();
        
        // Meminta dan membaca tanggal lahir mahasiswa S2
        System.out.print("Masukkan Tanggal Lahir (DD-MM-YYYY): ");
        String tglS2 = input.nextLine();
        
        // Meminta dan membaca nilai UTS 1 mahasiswa S2
        System.out.print("Masukkan Nilai UTS 1: ");
        double uts1S2 = input.nextDouble();
        
        // Meminta dan membaca nilai UTS 2 mahasiswa S2
        System.out.print("Masukkan Nilai UTS 2: ");
        double uts2S2 = input.nextDouble();

        // Meminta dan membaca nilai UAS mahasiswa S2
        System.out.print("Masukkan Nilai UAS: ");
        double uasS2 = input.nextDouble();
        
        // Membuat objek MahasiswaS2 dengan data yang diinput
        MahasiswaS2 mhsS2 = new MahasiswaS2(nimS2, namaS2, tglS2, uts1S2, uts2S2, uasS2);
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        
        // Menampilkan data mahasiswa S1
        System.out.println("MAHASISWA S1:");
        System.out.println("NIM\t\t: " + mhsS1.getNim()); // Menampilkan NIM
        System.out.println("Nama\t\t: " + mhsS1.getNama()); // Menampilkan nama
        System.out.println("Tanggal Lahir\t: " + mhsS1.TanggalLahir); // Menampilkan tanggal lahir
        System.out.println("Nilai Final\t: " + mhsS1.getFinal()); // Menampilkan nilai final
        System.out.println("Grade\t\t: " + mhsS1.getNilaiKonversi()); // Menampilkan grade
        
        // Menampilkan data mahasiswa S2
        System.out.println("\nMAHASISWA S2:");
        System.out.println("NIM\t\t: " + mhsS2.getNim()); // Menampilkan NIM
        System.out.println("Nama\t\t: " + mhsS2.getNama()); // Menampilkan nama
        System.out.println("Tanggal Lahir\t: " + mhsS2.TanggalLahir); // Menampilkan tanggal lahir
        System.out.println("Nilai Final\t: " + mhsS2.getFinal()); // Menampilkan nilai final
        System.out.println("Grade\t\t: " + mhsS2.getNilaiKonversi()); // Menampilkan grade
        
        // Menutup Scanner untuk mencegah resource leak
        input.close();
    }
}
        
