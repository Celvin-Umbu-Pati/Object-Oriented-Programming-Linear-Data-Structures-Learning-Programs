/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul2;

/**
 *
 * @author Celvin Pati
 */
public class Manager extends Pegawai implements TugasBelajar {

    private int jumAnak;
    private int jamKerja;
    private int istri;
    private boolean studi;

    public Manager() {}

    public void setJumAnak(int jumAnak) {
        this.jumAnak = jumAnak;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setIstri(int istri) {
        this.istri = istri;
    }

    public void setStudi(boolean studi) {
        this.studi = studi;
    }

    public int getJumAnak() {
        return jumAnak;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getIstri() {
        return istri;
    }

    public double hitTunjangan() {
        int anak = (jumAnak > 3) ? 3 : jumAnak;
        return anak * 100000;
    }

    public double hitLembur() {
        if (jamKerja > 8) {
            return (jamKerja - 8) * 50000;
        }
        return 0;
    }

    @Override
    public double hitungGatot() {
        return hitGajiPokok() + hitTunjangan() + hitLembur();
    }

    @Override
    public boolean isSelesai() {
        return studi;
    }
}
