/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Celvin Pati
 */
// Kelas utama yang berisi metode main untuk menjalankan program
public class Main {
    public static void main(String [] args){
      
        // Membuat objek penerbit dengan nama, alamat, dan tahun berdiri
        penerbit penerbit1 = new penerbit("Gramedia", "Jakarta", 1970);

        // Membuat objek buku dengan kode, judul, pengarang, dan tahun terbit
        Buku buku1 = new Buku("B001", "Belajar Java", "John Doe", 2015);

        // Menampilkan informasi buku
        System.out.println("Informasi Buku:");
        System.out.println("Kode Buku\t\t: " + buku1.getKodeBuku());   // Menampilkan kode buku
        System.out.println("Judul\t\t\t: " + buku1.getJudul());         // Menampilkan judul buku
        System.out.println("Pengarang\t\t: " + buku1.getNamaPengarang()); // Menampilkan nama pengarang
        System.out.println("Tahun Terbit\t\t: " + buku1.gettahunTerbit()); // Menampilkan tahun terbit

        // Menampilkan informasi penerbit
        System.out.println("Informasi Penerbit:");
        System.out.println("Nama Penerbit\t\t: " + penerbit1.getnamaPenerbit()); // Menampilkan nama penerbit
        System.out.println("Alamat\t\t\t: " + penerbit1.getalamat());         // Menampilkan alamat penerbit
        System.out.println("Tahun Berdiri\t\t: " + penerbit1.gettahunBerdiri()); // Menampilkan tahun berdiri penerbit

        // Menentukan apakah buku termasuk buku lama atau baru
        int tahunSekarang = 2019; // Tahun acuan
        if (tahunSekarang - buku1.gettahunTerbit() > 5) { // Jika tahun terbit lebih dari 5 tahun sebelum tahun 2019
            System.out.println("\t\t\tBUKU LAMA"); // Menampilkan status buku lama
        } else {
            System.out.println("\t\t\tBUKU BARU"); // Menampilkan status buku baru
        }
    }}
