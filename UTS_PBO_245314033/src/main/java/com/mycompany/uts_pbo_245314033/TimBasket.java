/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_245314033;

/**
 *
 * @author Celvin Pati
 */
public class TimBasket {
    private int kodeTim;
    private String namaTim;
    private Pemain[] daftarPemain;
    
public TimBasket(int kodeTim, String namaTim){
    this.kodeTim = kodeTim;
    this.namaTim = namaTim;
}
public int setkodeTim(){
    return kodeTim;
}
public String setnamaTim(){
    return namaTim;
}
public int getkodeTim(){
    return kodeTim;
}
public String getnamaTim(){
    return namaTim;
}
public void setPemain(Pemain[] pmn) {
        this.daftarPemain= pmn;
    }
public Pemain[] getPemain(){
    return daftarPemain;
}

}
