
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Perusahaan {//awal kelas Perusahaan
     private String nama;//deklarasi nama bersifat private
    private ArrayList<GajiPegawai> pegawaiList; //deklarasi private ArrayList<GajiPegawai> pegawaiList

    public Perusahaan(String nama) {
        this.nama = nama;//untuik atur nama
        this.pegawaiList = new ArrayList<>();//untuk atur pegawai list dan membuat objek
    }

    public void tambahPegawai(GajiPegawai pegawai) {//ini metode tambah pegawai dengan konstruktor GajiPegawai pegawai
        pegawaiList.add(pegawai);// saya tambah dengan pegawaiList.add
    
    }
    public class GajiPegawai {//awal kelas pegawai
    private String NPP, nama;//atribut NPP, nama
    private int golongan;//atribut untuk golongan

    public GajiPegawai(String NPP, String nama, int golongan) {//konstrkuktor GajiPegawai dengan parameter NPP, nama, golonga
        this.NPP = NPP;//mengatur npp
        this.nama = nama;//mengatur nama
        this.golongan = golongan;//mengatur golongan
    }
    
    public int hitungGaji() {//ini metode untuk hitung gaji pokok
        if (golongan == 1) {
            return 1300000;//gaji pokok untuk golongan 1
        } else if (golongan == 2) {
            return 1750000;//gaji pokok untuk golongan 2
        } else if (golongan == 3) {
            return 2000000;//gaji pokok untuk golongan 3
        } else {
            return 0;//jika tidak valid maka nilai kembali 0
        }
    }

    public void tampilkanInfo() {//ini metode untuk tampilkan info
        System.out.println("NPP: " + NPP + ", Nama: " + nama + ", Gaji: Rp" + hitungGaji());//untuk cetak NPP, nama, dan gaji
    }
    public void tampilkanPegawai() {//ini metode untuk tampilkan pegawai
        System.out.println("\nDaftar Pegawai di " + nama + ":");
        for (GajiPegawai p : pegawaiList) {
            p.tampilkanInfo();
        }
} 
}
}
    

