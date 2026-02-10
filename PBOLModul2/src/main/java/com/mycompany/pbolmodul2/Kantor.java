/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul2;

/**
 *
 * @author Celvin Pati
 */
public class Kantor {
    private Manager manager;
    private Pegawai[] pegawai;

    public Kantor() {}

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setPegawai(Pegawai[] pegawai) {
        this.pegawai = pegawai;
    }

    public Manager getManager() {
        return manager;
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public double hitGajiPeg() {
        double total = 0;
        for (Pegawai p : pegawai) {
            total += p.hitungGatot();
        }
        return total;
    }
}

