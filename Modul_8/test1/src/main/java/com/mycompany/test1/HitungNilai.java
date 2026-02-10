/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;
  import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class HitungNilai {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> nilai = new ArrayList<Double>();
        double total = 0;

        System.out.print("Masukkan jumlah nilai yang ingin dihitung: ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            double n = input.nextDouble();
            nilai.add(n);
            total += n;
        }

        double rata = total / nilai.size();

        System.out.println("\n====================");
        System.out.println("Daftar Nilai: " + nilai);
        System.out.println("Jumlah Nilai : " + total);
        System.out.println("Rata-rata    : " + rata);
    }
}

    

