/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fix;

/**
 *
 * @author Celvin Pati
 */
class KaryawanTetap extends Karyawan {

    private int gajiPokok;    // Gaji pokok karyawan tetap

    // Constructor karyawan tetap
    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        super(npp, nama, jumlahAnak);  // Panggil constructor parent class
        this.gajiPokok = gajiPokok;    // Set nilai gajiPokok
    }

    // Method hitung total gaji (gaji pokok + tunjangan anak)
    public int hitungTotalGaji() {
        return gajiPokok + super.hitungTunjanganAnak();
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
}
