/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */

public class Mahasiswa {
    private String nim, nama, matkul;
    private int pertemuan, hadir;
    private double persentase;
    private String status;

    public Mahasiswa(String nim, String nama, String matkul, int pertemuan, int hadir) {
        this.nim = nim;
        this.nama = nama;
        this.matkul = matkul;
        this.pertemuan = pertemuan;
        this.hadir = hadir;
        hitungPersentase();
    }
    private void hitungPersentase() {
        persentase = ((double) hadir / pertemuan) * 100;
        status = (persentase >= 75) ? "Memenuhi" : "Tidak Memenuhi";
    }
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getMatkul() { return matkul; }
    public int getPertemuan() { return pertemuan; }
    public int getHadir() { return hadir; }
    public double getPersentase() { return persentase; }
    public String getStatus() { return status; }
}

