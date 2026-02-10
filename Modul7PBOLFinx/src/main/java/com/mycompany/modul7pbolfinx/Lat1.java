/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul7pbolfinx;

/**
 *
 * @author Celvin Pati
 */
import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak perjalanan Anda (km): ");
        int jarak = sc.nextInt();

        System.out.print("Masukkan banyaknya bensin yang dihabiskan (liter): ");
        int liter = sc.nextInt();

        int konsumsi = jarak / liter;
        System.out.println("Konsumsi BBM Anda adalah = " + konsumsi + " km/liter");
    }
}

