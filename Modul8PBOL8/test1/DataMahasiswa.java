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
public class DataMahasiswa {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> mahasiswa = new ArrayList<String>();

        System.out.println("Masukkan nama 10 mahasiswa:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = input.nextLine();
            mahasiswa.add(nama);
        }

        System.out.println("\n====================");
        System.out.println("Daftar Mahasiswa:");
        System.out.println("====================");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + mahasiswa.get(i));
        }
    }
}

    

