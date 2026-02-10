/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbomodul6fix;

import java.util.Scanner;

public class KelolaBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Pemain: ");
        int jumlahPemain = scanner.nextInt();
        scanner.nextLine();
        
        Pemain[] daftarPemain = new Pemain[jumlahPemain];
        
         for (int i = 0; i < jumlahPemain; i++) {
           System.out.println("\nMasukkan pemain ke-" + (i + 1));
            System.out.print("nomer punggung: ");
            String nPunggung = scanner.nextLine();
            System.out.print("nama pemain: ");
            String nama = scanner.nextLine(); 
            System.out.print("usia pemain: ");
            int usia = scanner.nextInt();
         
            scanner.nextLine();
         }
           
         System.out.print("INPUT DATA TIM BASKET"); 
         scanner.nextLine();
         System.out.print("masukkan kode tim: ");
         int kodeTim = scanner.nextInt();
         System.out.print("masukkan nama tim:");
         String namaTim =scanner.nextLine();
         scanner.nextLine();
           
         System.out.print("Daftar Pemain:");
         System.out.print("No Punggung- - -Nama Pemain- - -Usia");
         System.out.print("------------------------------------");
         
    }
}


