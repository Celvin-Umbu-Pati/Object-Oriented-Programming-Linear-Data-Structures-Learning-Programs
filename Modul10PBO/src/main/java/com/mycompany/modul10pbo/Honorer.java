/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
class Honorer extends Pegawai {
    protected double lemburan; // Jumlah lembur 
    // Getter lemburan
    public double getLembur() {
        return lemburan;
    }
    // Setter lemburan
    public void setLembur(double lemburan) {
        this.lemburan = lemburan;
    }
    // Implementasi status
    @Override
    String getStatus() {
        return "Honorer";
    }
    // Implementasi tunjangan
    @Override
    double getTunjangan() {
        return lemburan;
    }
    // Implementasi total gaji
    @Override
    double hitungGatot() {
        return getGapok() + lemburan;
    }
    // Implementasi email: nip@honorer.usd.ac.id
    @Override
    public String getEmail() {
        return getNpp() + "@honorer.usd.ac.id";
    }
}
