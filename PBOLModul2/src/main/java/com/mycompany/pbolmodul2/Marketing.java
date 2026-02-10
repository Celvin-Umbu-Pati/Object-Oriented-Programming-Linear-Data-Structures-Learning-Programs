/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul2;

/**
 *
 * @author Celvin Pati
 */
public class Marketing extends Pegawai implements TugasBelajar {
    private int jamKerja;
    private boolean studi;

    public Marketing() {}

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public void setStudi(boolean studi) {
        this.studi = studi;
    }
    public int getJamKerja() { return jamKerja; }

    public double hitLembur() {
        if (jamKerja > 8) {
            return (jamKerja - 8) * 50000;
        }
        return 0;
    }
    @Override
    public double hitungGatot() {
        return hitGajiPokok() + hitLembur();
    }
    @Override
    public boolean isSelesai() {
        return studi;
    }
}
