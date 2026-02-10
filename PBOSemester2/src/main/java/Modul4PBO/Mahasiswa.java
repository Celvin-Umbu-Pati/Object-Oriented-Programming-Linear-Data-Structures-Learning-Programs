/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4PBO;

/**
 *
 * @author Celvin Pati
 */
public class Mahasiswa {

   String Nim;
     String Nama;
    String TanggalLahir;
    double Uts1;
    double Uts2;
   double Uas;
   double Final;
    String NilaiKonversi;

    public Mahasiswa(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Uts1 = Uts1;
        this.Uts2 = Uts2;
        this.Uas = Uas;
    }

    public String getNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }

    public String SetTanggalLahir() {
        return TanggalLahir;
    }

    public double SetUts1() {
        return Uts1;
    }

    public double SetUts2() {
        return Uts2;
    }

    public double Uas() {
        return Uas;
    }

    public double NilaiFinal() {
        Final = (30 * Uts1) + (30 * Uts2) + (40 * Uas);
        return 0;
    }

    public int Konversi() {
        char NilaiFinal;
      if (Final >= 80) {   
            NilaiFinal = 'A';
        } else if (Final >= 70 && Final < 80) {
            NilaiFinal = 'B';
        } else if (Final >= 56 && Final < 70) {
            NilaiFinal = 'C';
        } else if (Final >= 45 && Final < 56) {
            NilaiFinal = 'D';
        } else {
            NilaiFinal = 'E';
        }
        
       return 0; 
    }
}
