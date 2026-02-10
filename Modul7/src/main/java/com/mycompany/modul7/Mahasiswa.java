/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul7;

/**
 *
 * @author Celvin Pati
 */
public class Mahasiswa {
// Kelas turunan MahasiswaS1
class MahasiswaS1 extends Mahasiswa {
    public MahasiswaS1(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        super(Nim, Nama, TanggalLahir, Uts1, Uts2, Uas);
    }

    @Override
    public double hitungNilaiFinal() {
        // Perhitungan nilai akhir S1: 30% UTS1, 30% UTS2, 40% UAS
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }

    @Override
    public String konversiNilai() {
        // Konversi nilai untuk S1
        if (Final >= 80) return "A";
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
}

// Kelas turunan MahasiswaS2
class MahasiswaS2 extends Mahasiswa {
    public MahasiswaS2(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        super(Nim, Nama, TanggalLahir, Uts1, Uts2, Uas);
    }

    @Override
    public double hitungNilaiFinal() {
        // Perhitungan nilai akhir S2: 30% UTS1, 30% UTS2, 40% UAS
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }

    @Override
    public String konversiNilai() {
        // Konversi nilai untuk S2 (standar lebih tinggi)
        if (Final >= 85) return "A";
        else if (Final >= 70) return "B";
        else if (Final >= 56) return "C";
        else if (Final >= 45) return "D";
        else return "E";
    }
}

// Kelas MainMahasiswa untuk testing
public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa S1
        MahasiswaS1 mhsS1 = new MahasiswaS1(
            "S1123456", 
            "Budi Santoso", 
            "15-08-2000", 
            85, 75, 90
        );
        
        // Membuat objek Mahasiswa S2
        MahasiswaS2 mhsS2 = new MahasiswaS2(
            "S2123456", 
            "Ani Wijaya", 
            "20-05-1998", 
            90, 80, 85
        );
        
        // Menampilkan data mahasiswa S1
        System.out.println("Data Mahasiswa S1:");
        System.out.println("NIM: " + mhsS1.Nim);
        System.out.println("Nama: " + mhsS1.Nama);
        System.out.println("Nilai Final: " + mhsS1.Final);
        System.out.println("Nilai Huruf: " + mhsS1.NilaiKonversi);
        System.out.println();
        
        // Menampilkan data mahasiswa S2
        System.out.println("Data Mahasiswa S2:");
        System.out.println("NIM: " + mhsS2.Nim);
        System.out.println("Nama: " + mhsS2.Nama);
        System.out.println("Nilai Final: " + mhsS2.Final);
        System.out.println("Nilai Huruf: " + mhsS2.NilaiKonversi);
    }
}
}
