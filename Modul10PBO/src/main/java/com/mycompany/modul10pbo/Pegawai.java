/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
abstract class Pegawai implements Email {
    protected int npp;           // Nomor pegawai 
    protected String nama;       // Nama lengkap pegawai
    protected double gajiPokok;  // Gaji pokok pegawai
    // Getter untuk npp
    public int getNpp() {
        return npp;
    }
    // Setter untuk npp
    public void setNpp(int npp) {
        this.npp = npp;
    }
    // Getter untuk nama
    public String getName() {
        return nama;
    }
    // Setter untuk nama
    public void setName(String nama) {
        this.nama = nama;
    }
    // Getter untuk gaji pokok
    public double getGapok() {
        return gajiPokok;
    }
    // Setter untuk gaji pokok
    public void setGapok(double gapok) {
        this.gajiPokok = gapok;
    }
    // Method abstract
    abstract String getStatus();      // Status jabatan
    abstract double getTunjangan();   // Besar tunjangan
    abstract double hitungGatot();    // Total gaji (gapok + tunjangan)
    public abstract String getEmail(); // Alamat email sesuai format
}
