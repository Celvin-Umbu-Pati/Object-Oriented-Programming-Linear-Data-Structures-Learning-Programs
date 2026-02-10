/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
class Manajer extends Pegawai {
    protected double tunjanganJabatan; // Tunjangan jabatan
    protected double lemburan;         // Lembur
    // Getter tunjangan jabatan
    public double getTunJab() {
        return tunjanganJabatan;
    }
    // Setter tunjangan jabatan
    public void setTunJab(double tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }
    // Getter lembur
    public double getLembur() {
        return lemburan;
    }
    // Setter lembur
    public void setLembur(double lemburan) {
        this.lemburan = lemburan;
    }
    // Implementasi status
    @Override
    String getStatus() {
        return "Manajer";
    }
    // Implementasi tunjangan = tunjanganJabatan + lembur
    @Override
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }
    // Implementasi total gaji
    @Override
    double hitungGatot() {
        return getGapok() + tunjanganJabatan + lemburan;
    }
    // Implementasi email: nip@manajer.usd.ac.id
    @Override
    public String getEmail() {
        return getNpp() + "@manajer.usd.ac.id";
    }
}
