/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
// Deklarasi kelas MahasiswaS2 yang merupakan turunan dari kelas Mahasiswa
public class MahasiswaS2 extends Mahasiswa {

    // Konstruktor untuk kelas MahasiswaS2
    public MahasiswaS2(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        // Memanggil konstruktor dari kelas induk (Mahasiswa) dengan parameter yang diberikan
        super(Nim, Nama, TanggalLahir, Uts1, Uts2, Uas);
    }

    // Override method konversiNilai() dari kelas induk
    @Override
    public String konversiNilai() {
        // Jika nilai Final >= 85, return "A"
        if (Final >= 85) return "A";
        // Jika nilai Final >= 70 (dan <85), return "B"
        else if (Final >= 70) return "B";
        // Jika nilai Final >= 56 (dan <70), return "C"
        else if (Final >= 56) return "C";
        // Jika nilai Final >= 45 (dan <56), return "D"
        else if (Final >= 45) return "D";
        // Jika nilai Final < 45, return "E"
        else return "E";
    }
}