/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOmodul4;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class MainArrMhsBimb {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[5];

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Email: ");
            String imil = scanner.nextLine();
        
         
            scanner.nextLine(); // Membersihkan newline

            mhs[i] = new Mahasiswa(nim, nama);
            mhs[i].setEmail(imil);
      
        }

        Dosen dsn = new Dosen("67", "Agung");
        dsn.setMahasiswa(mhs);

        System.out.println("\nDaftar Mahasiswa yang dibimbing oleh Dosen " + dsn.getNama() + " (NIM: " + dsn.getNim() + "):");
        Mahasiswa[] tampung = dsn.getMahasiswa();
        for (Mahasiswa mahasiswa : tampung) {
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim());
        }

        scanner.close();
    }
}
