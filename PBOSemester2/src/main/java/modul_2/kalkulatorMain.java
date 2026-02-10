/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class kalkulatorMain {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Bilangan a: ");
        int a = keyboard.nextInt();

        System.out.print("Masukkan Bilangan b: ");
        int b = keyboard.nextInt();

        kalkulator kalkulator = new kalkulator(a, b);

        System.out.println("Hasil penjumlahan: " + kalkulator.penjumlahan());

        System.out.println("Hasil pengurangan: " + kalkulator.pengurangan());

        System.out.println("Hasil perkalian  : " + kalkulator.perkalian());

        System.out.println("Hasil pembagian  : " + kalkulator.pembagian());
    }
}
