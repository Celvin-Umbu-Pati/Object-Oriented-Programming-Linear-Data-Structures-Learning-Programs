/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
// Deklarasi kelas utama Mahasiswa
public class Mahasiswa {
    // Deklarasi atribut-atribut kelas dengan visibility protected
    protected String Nim;          // Nomor Induk Mahasiswa
    protected String Nama;         // Nama lengkap mahasiswa
    protected String TanggalLahir; // Tanggal lahir format DD-MM-YYYY
    protected double Uts1;         // Nilai Ujian Tengah Semester 1
    protected double Uts2;         // Nilai Ujian Tengah Semester 2
    protected double Uas;          // Nilai Ujian Akhir Semester
    protected double Final;        // Nilai akhir yang dihitung
    protected String NilaiKonversi;// Huruf mutu (A-E)
    // Konstruktor kelas Mahasiswa
    public Mahasiswa(String Nim, String Nama, String TanggalLahir, 
                   double Uts1, double Uts2, double Uas) {
        // Inisialisasi atribut Nim dengan parameter Nim
        this.Nim = Nim;
        // Inisialisasi atribut Nama dengan parameter Nama
        this.Nama = Nama;
        // Inisialisasi atribut TanggalLahir dengan parameter TanggalLahir
        this.TanggalLahir = TanggalLahir;
        // Inisialisasi atribut Uts1 dengan parameter Uts1
        this.Uts1 = Uts1;
        // Inisialisasi atribut Uts2 dengan parameter Uts2
        this.Uts2 = Uts2;
        // Inisialisasi atribut Uas dengan parameter Uas
        this.Uas = Uas;
        // Hitung nilai Final menggunakan method hitungNilaiFinal()
        this.Final = hitungNilaiFinal();
        // Konversi nilai ke huruf menggunakan method konversiNilai()
        this.NilaiKonversi = konversiNilai();
    }
    // Method untuk menghitung nilai akhir
    public double hitungNilaiFinal() {
        // Rumus perhitungan nilai akhir:
        // 30% UTS1 + 30% UTS2 + 40% UAS
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }
    // Method untuk mengkonversi nilai angka ke huruf
    public String konversiNilai() {
        // Jika nilai Final >= 80, return "A"
        if (Final >= 80) {
            return "A";
        } 
        // Jika nilai Final >= 70, return "B"
        else if (Final >= 70) {
            return "B";
        } 
        // Jika nilai Final >= 56, return "C"
        else if (Final >= 56) {
            return "C";
        } 
        // Jika nilai Final >= 45, return "D"
        else if (Final >= 45) {
            return "D";
        } 
        // Jika nilai Final < 45, return "E"
        else {
            return "E";
        }
    }
    // Getter untuk atribut Nim
    public String getNim() {
        return Nim;
    }
    // Getter untuk atribut Nama
    public String getNama() {
        return Nama;
    }
    // Getter untuk atribut Final (nilai akhir)
    public double getFinal() {
        return Final;
    }
    // Getter untuk atribut NilaiKonversi (huruf mutu)
    public String getNilaiKonversi() {
        return NilaiKonversi;
    }
    // Method untuk menampilkan data (masih kosong)
    public void tampilanData(int i) {
      
    }
}
    

