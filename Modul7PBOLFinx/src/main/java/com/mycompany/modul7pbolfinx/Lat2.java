/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7pbolfinx;

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner;

public class Lat2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jarak Perjalanan Anda (km):");
        int jarak = sc.nextInt();

        System.out.print("Masukkan banyaknya bensin yang dihabiskan (liter):");
        int liter = sc.nextInt();

        int konsumsi = 0;
        try {
            konsumsi = jarak / liter;
        } catch (Exception e) {
            konsumsi = 0;
        }

        System.out.println("Konsumsi BBM anda adalah= " + konsumsi + " km/liter");
    }
}
