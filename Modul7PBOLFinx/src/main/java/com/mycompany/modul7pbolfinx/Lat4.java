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

public class Lat4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1 = 0, bil2 = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan bilangan 1 :");
            String strBil1 = input.nextLine();

            try {
                bil1 = Integer.parseInt(strBil1);
                valid = true; 
            } catch (NumberFormatException e) {
                System.out.println("Terjadi kesalahan input, mohon diulangi!");
            }
        }

        valid = false;

        while (!valid) {
            System.out.print("Masukkan bilangan 2 :");
            String strBil2 = input.nextLine();

            try {
                bil2 = Integer.parseInt(strBil2);
                valid = true; 
            } catch (NumberFormatException e) {
                System.out.println("Terjadi kesalahan input, mohon diulangi!");
            }
        }

        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahan kedua bilangan itu : " + hasil);

        input.close();
    }
}
