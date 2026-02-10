/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;

/**
 *
 * @author Celvin Pati
 */
public class gajiPegawai {

    private String NPP, nama, status;
    private int golongan, jumlahanak;

    public gajiPegawai(String NPP, String nama, String status, int golongan, int jumlahanak) {
        this.NPP = NPP;
        this.nama = nama;
        this.status = status;
        this.golongan = golongan;
        this.jumlahanak = jumlahanak;

    }

    public int hitungGaji() {
        if (golongan == 1) {
            return 1300000;
        } else if (golongan == 2) {
            return 1750000;
        } else if (golongan == 3) {
            return 2000000;
        } else {
            return 0;
        }
    }

    public int hitungtunjangan() {
        if (status.equals("sudah")) {
            return 3000000 + (jumlahanak + 1000000);
        } else {
            return 0;
        }
    }

    public int hitungTotslgaji() {
        return hitungGaji() + hitungtunjangan();

    }

}
