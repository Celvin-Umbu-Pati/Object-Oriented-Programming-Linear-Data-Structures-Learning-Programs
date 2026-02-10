/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class bilanganPrima {//awal kelas
    public static void main(String[] args) {//awal metode main
        int n = 10; 
        System.out.print("Bilangan prima dari 1 sampai " + n + ": ");
        cetakBilangan(n, 2); 
    }
    //untuk mencetak bilangan prima
    public static void cetakBilangan(int n, int awal) {
        if (awal > n) {
            return; 
        }

        if (prima(awal, 2)) {
            System.out.print(awal + " ");
        }
        cetakBilangan(n, awal + 1); 
    }
    // untuk mengecek jika suatu bilangan adalah prima
    public static boolean prima(int nomer, int pembagi) {
        if (nomer <= 1) {
            return false; 
        }
        if (pembagi >= nomer) {
            return true; 
        }
        if (nomer % pembagi == 0) {
            return false; 
        }
        return prima(nomer, pembagi + 1); 
    }//akhir metode main
}//akhir kelas
