/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul2;

/**
 *
 * @author Celvin Pati
 */
public abstract class Pegawai implements Pendapatan {

    protected String nip;
    protected String nama;
    protected int golongan;

    public Pegawai() {
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public int getGolongan() {
        return golongan;
    }
    public double hitGajiPokok() {
        switch (golongan) {
            case 1:
                return 500000;
            case 2:
                return 750000;
            case 3:
                return 1000000;
            default:
                return 0;
        }
    }
    public abstract double hitungGatot();
}
