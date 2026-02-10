/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4lma;

/**
 *
 * @author Celvin Pati
 */
public class Buku {
  String kodeBuku, judul, namaPengarang;
    int tahunTerbit;

    // Konstruktor
    public Buku(String kodeBuku, String judul, String namaPengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter untuk atribut buku
    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Metode untuk menampilkan informasi buku dalam format tabel
    public void tampilkanBuku() {
        System.out.printf("%-10s %-20s %-15s %-10d\n", kodeBuku, judul, namaPengarang, tahunTerbit);
    }
}

// Kelas Penerbit untuk menyimpan informasi tentang penerbit buku
class Penerbit {
    String namaPenerbit, alamat;
    int tahunBerdiri;

    // Konstruktor
    public Penerbit(String namaPenerbit, String alamat, int tahunBerdiri) {
        this.namaPenerbit = namaPenerbit;
        this.alamat = alamat;
        this.tahunBerdiri = tahunBerdiri;
    }

    // Getter untuk atribut penerbit
    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }
}
