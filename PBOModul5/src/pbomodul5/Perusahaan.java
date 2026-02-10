/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbomodul5;

import java.util.ArrayList;

/**
 *
 * @author Celvin Pati
 */
public class Perusahaan {//awal kelas perusahaan
    private String nama;//deklarasi nama yang bersifat private
    private GajiPegawai[] pegawaiList;//deklarasi gaji pegawai dengan array of objek
    private int jumlahPegawai;//deklarasi jumlah pegawai bersifat private

    public Perusahaan(String nama, int kapasitas) {//inikonstruktor Perusahaan dengan atribut String nama, int kapasitas
        this.nama = nama;//untuk atur nama
        this.pegawaiList = new GajiPegawai[kapasitas];  // untuk atur pegawai dan membuat objek barus
        this.jumlahPegawai = 0;//untuk atur jumlah pegawai
    }

    public void tambahPegawai(GajiPegawai pegawai) {//ini metode untuk tambah  pegawai
        if (jumlahPegawai < pegawaiList.length) {//loop untuk menambah pegawai
            pegawaiList[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {//jika melewati kapasitas maka false
            System.out.println("Kapasitas pegawai sudah penuh!");
        }
    }

    public void tampilkanPegawai() {//metode untuk menampilkan pegawai
        System.out.println("\nDaftar Pegawai di " + nama + ":");//untuk daftar pegawai
        for (int i = 0; i < jumlahPegawai; i++) {//ini loop untuk menampilkan pegawai
            pegawaiList[i].tampilkanInfo();
        }
    }}

    
    

