/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Celvin Pati
 */
// Kelas Buk untuk menyuimpan informasi tentang buku
public class Buku {

    // Atribut private untuk menyimpan data buku
    private String kodeBuku;      // Kode unik untuk buku
    private String judul;         // Judul buku
    private String namaPengarang; // Nama pengarang buku
    private int tahunTerbit;      // Tahun terbit buku
  
    // Konstruktor untuk menginisialisasi objek Buku
    public Buku(String kodeBuku, String judul, String namaPengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;         // Mengisi kode buku
        this.judul = judul;               // Mengisi judul buku
        this.namaPengarang = namaPengarang; // Mengisi nama pengarang
        this.tahunTerbit = tahunTerbit;   // Mengisi tahun terbit buku
    }

    // Metode getter untuk mendapatkan kode buku
    public String getKodeBuku() {
        return kodeBuku; // Mengembalikan kode buku
    }

    // Metode getter untuk mendapatkan judul buku
    public String getJudul() {
        return judul; // Mengembalikan judul buku
    }

    // Metode getter untuk mendapatkan nama pengarang buku
    public String getNamaPengarang() {
        return namaPengarang; // Mengembalikan nama pengarang
    }

    // Metode getter untuk mendapatkan tahun terbit buku
    public int gettahunTerbit() {
        return tahunTerbit; // Mengembalikan tahun terbit buku
    }    
}

// Kelas penerbit untuk menyimpan informasi tentang penerbit buku
class penerbit {
    
    // Atribut private untuk menyimpan data penerbit
    private String namaPenerbit;  // Nama penerbit
    private String alamat;        // Alamat penerbit
    private int tahunBerdiri;     // Tahun berdirinya penerbit

    // Konstruktor untuk menginisialisasi objek penerbit
    public penerbit(String namaPenerbit, String alamat, int tahunBerdiri) {
        this.namaPenerbit = namaPenerbit;  // Mengisi nama penerbit
        this.alamat = alamat;              // Mengisi alamat penerbit
        this.tahunBerdiri = tahunBerdiri;  // Mengisi tahun berdiri penerbit
    }

    // Metode getter untuk mendapatkan nama penerbit
    public String getnamaPenerbit() {
        return namaPenerbit; // Mengembalikan nama penerbit
    }

    // Metode getter untuk mendapatkan alamat penerbit
    public String getalamat() {
        return alamat; // Mengembalikan alamat penerbit
    }

    // Metode getter untuk mendapatkan tahun berdiri penerbit
    public int gettahunBerdiri() {
        return tahunBerdiri; // Mengembalikan tahun berdiri penerbit
    }
}
