/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul2fixpbo;

/**
 *
 * @author Celvin Pati
 */
public class RekeningBank {//awal kelas rekeningBank
 private String nomorRekening;//atribut nomorRekening untuk simpan nomor rekening
    private int saldo;//atribut Saldo untuk simpan saldo

    public RekeningBank(String nomor) {  //metode unntuk  rekeningBannk
        nomorRekening = nomor;//untuk seting nomorRekening
        saldo = 0;//untuk seting saldo nilai defuld 0
    }

    public int cekSaldo() {//metode untuk cek salco
        return saldo;
    }

    public void tabung(int jumlah) {//metode untuk tabungan
        saldo = saldo + jumlah;
    }

    public void ambil(int jumlah) {//metode untuk ambil saldo
        saldo = saldo - jumlah;  
    }
}
