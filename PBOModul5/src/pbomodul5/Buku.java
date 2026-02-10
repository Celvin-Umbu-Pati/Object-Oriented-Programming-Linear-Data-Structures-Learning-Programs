/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class Buku {
    // Atribut untuk simpan informasi buku
    String kodeBuku, judul, namaPengarang;
    int TahunTerbit;

    // Konstruktor untuk menginisialisasi objek Buku dengan data tertentu
    public Buku(String kodeBuku, String judul, String namaPengarang, int TahunTerbit) {
        this.kodeBuku = kodeBuku;  // untuk simpan kode buku
        this.judul = judul;  // untuk simpan judul buku
        this.namaPengarang = namaPengarang;  // untuk simpan nama pengarang
        this.TahunTerbit = TahunTerbit;  // untuk simpan tahun terbit buku
    }

    // Getter untuk mendapatkan kode buku
    public String getKodeBuku() {
        return kodeBuku;
    }

    // Getter untuk mendapatkan judul buku
    public String getJudul() {
        return judul;
    }

    // Getter untuk mendapatkan nama pengarang buku
    public String getNamaPengarang() {
        return namaPengarang;
    }

    // Getter untuk mendapatkan tahun terbit buku
    public int getTahunTerbit() {
        return TahunTerbit;
    }

    // Metode untuk menampilkan informasi buku dalam format tabel
    public void tampilkanBuku() {
        // untuk menampilkan data buku dengan format tabel menggunakan printf
        System.out.printf("\n", kodeBuku , judul, namaPengarang, TahunTerbit);
    }
}

// Kelas Penerbit untuk simpan informasi tentang penerbit buku
class Penerbit {  
    // Atribut untuk menyimpan informasi penerbit
    String namaPenerbit, alamat;
    int tahunBerdiri;

    // Konstruktor untuk menginisialisasi objek Penerbit dengan data tertentu
    public Penerbit(String namaPenerbit, String alamat, int tahunBerdiri) {
        this.namaPenerbit = namaPenerbit;  // untuk simpan nama penerbit
        this.alamat = alamat;  // untuk simpan alamat penerbit
        this.tahunBerdiri = tahunBerdiri;  // untuk simpan tahun berdiri penerbit
    }

    // Getter untuk mendapatkan nama penerbit
    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    // Getter untuk mendapatkan alamat penerbit
    public String getAlamat() {
        return alamat;
    }

    // Getter untuk mendapatkan tahun berdiri penerbit
    public int getTahunBerdiri() {
        return tahunBerdiri;
    }
}// akhir kelas Buku 

