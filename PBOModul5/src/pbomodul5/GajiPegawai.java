/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbomodul5;

/**
 *
 * @author Celvin Pati
 */
public class GajiPegawai {//awal kelas pegawai
    private String NPP, nama;//atribut NPP, nama
    private int golongan;//atribut untuk golongan

    public GajiPegawai(String NPP, String nama, int golongan) {//konstrkuktor GajiPegawai dengan parameter NPP, nama, golonga
        this.NPP = NPP;//mengatur NPP
        this.nama = nama;//mengatur nama
        this.golongan = golongan;//mengatur golongan
    }

    public int hitungGaji() {//ini adalah metode untuk hitung gaji pegawai
        if (golongan == 1) {
            return 1300000;//gaji pegawai golongan 1
        } else if (golongan == 2) {
            return 1750000;//gaji pegawai golongan 2
        } else if (golongan == 3) {
            return 2000000;//gaji pegawai golongan 3
        } else {
            return 0;//jadi nilai akan kembali 0 jika input salah
        }
    }

    public void tampilkanInfo() {//metode untuk menampilkan info pegawai
        System.out.println("NPP: " + NPP + ", Nama: " + nama + ", Gaji: Rp" + hitungGaji());
    }
} 

