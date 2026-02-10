/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4lma;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class kelolaBuku {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah buku yang akan dimasukkan
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // Membersihkan newline buffer

        Buku[] daftarBuku = new Buku[jumlahBuku]; // Array untuk menyimpan daftar buku

        // Input data buku
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));

            System.out.print("Kode Buku: ");
            String kode = input.nextLine();

            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Nama Pengarang: ");
            String pengarang = input.nextLine();

            System.out.print("Tahun Terbit: ");
            int tahun = input.nextInt();
            input.nextLine(); // Membersihkan newline buffer

            // Menyimpan objek buku ke dalam array daftarBuku
            daftarBuku[i] = new Buku(kode, judul, pengarang, tahun);
        }

        // Menampilkan daftar buku dalam bentuk tabel
        System.out.println("\nDaftar Buku:");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "Kode", "Judul", "Pengarang", "Tahun Terbit");
        System.out.println("----------------------------------------------------------");
        for (Buku buku : daftarBuku) {
            buku.tampilkanBuku();
        }
        System.out.println("----------------------------------------------------------");

        // Menampilkan jumlah buku yang terbit pada tahun tertentu
        System.out.print("\nMasukkan tahun terbit yang ingin dicari: ");
        int tahunCari = input.nextInt();
        int jumlahTahun = 0;

        System.out.println("\nBuku yang terbit pada tahun " + tahunCari + ":");
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() == tahunCari) {
                buku.tampilkanBuku();
                jumlahTahun++;
            }
        }

        if (jumlahTahun == 0) {
            System.out.println("Tidak ada buku yang terbit pada tahun tersebut.");
        }

        // Menampilkan data buku berdasarkan pengarang tertentu
        input.nextLine(); // Membersihkan newline buffer
        System.out.print("\nMasukkan nama pengarang yang ingin dicari: ");
        String pengarangCari = input.nextLine();
        int jumlahPengarang = 0;

        System.out.println("\nBuku yang ditulis oleh " + pengarangCari + ":");
        for (Buku buku : daftarBuku) {
            if (buku.getNamaPengarang().equalsIgnoreCase(pengarangCari)) {
                buku.tampilkanBuku();
                jumlahPengarang++;
            }
        }

        if (jumlahPengarang == 0) {
            System.out.println("Tidak ada buku yang ditulis oleh pengarang tersebut.");
        }

        input.close(); // Menutup scanner untuk menghindari kebocoran resource
    }
}

