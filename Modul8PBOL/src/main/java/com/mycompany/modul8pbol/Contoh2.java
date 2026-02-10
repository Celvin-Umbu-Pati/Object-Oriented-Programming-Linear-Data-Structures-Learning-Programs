/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul8pbol;

import java.util.ArrayList;

/**
 *
 * @author Celvin Pati
 */
public class Contoh2 {
    public static void main(String[] args) {
            ArrayList<Integer> memori = new ArrayList<Integer>();
        System.out.println("Ukuran Sebelum ArrayList: " + memori.size());
        System.out.println("====================");
        System.out.println("Mengisi ArrayList");
        System.out.println("====================");
        for (int i = 0; i < 10; i++) {
            memori.add(i);
        }
        System.out.println("====================");
        System.out.println("Menampilkan ArrayList");
        System.out.println("====================");
	 System.out.println(memori);
        for (int nilai : memori) {
            System.out.println(nilai);
        }

}}
