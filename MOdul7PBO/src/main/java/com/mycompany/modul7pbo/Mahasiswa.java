/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7pbo;

/**
 *
 * @author Celvin Pati
 */
public class Mahasiswa {
    // atribut
    protected String Nim;
    protected String Nama;
    protected String TanggalLahir;
    protected double Uts1;
    protected double Uts2;
    protected double Uas;
    protected double Final;
    protected String NilaiKonversi;
    // cosntruktor
    public Mahasiswa(String Nim, String Nama, String TanggalLahir, double Uts1, double Uts2, double Uas) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.Uts1 = Uts1;
        this.Uts2 = Uts2;
        this.Uas = Uas;
        this.Final = hitungNilaiFinal();
        this.NilaiKonversi = konversiNilai();
    }
    // metod untuk hitung nilai final
    public double hitungNilaiFinal() {
        return (0.3 * Uts1) + (0.3 * Uts2) + (0.4 * Uas);
    }
    public String konversiNilai() {
        if (Final >= 80) {
            return "A";
        } else if (Final >= 70) {
            return "B";
        } else if (Final >= 56) {
            return "C";
        } else if (Final >= 45) {
            return "D";
        } else {
            return "E";
        }
    }
    // metode getter
    public String getNim() {
        return Nim;
    }

    public String getNama() {
        return Nama;
    }

    public double getFinal() {
        return Final;
    }

    public String getNilaiKonversi() {
        return NilaiKonversi;
    }
}
