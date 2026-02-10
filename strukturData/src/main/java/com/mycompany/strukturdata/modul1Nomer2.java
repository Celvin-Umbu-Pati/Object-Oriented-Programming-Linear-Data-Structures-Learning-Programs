/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class modul1Nomer2 {
     public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
      
        System.out.print("Masukkan ukuran array: ");
        int n = keyboard.nextInt();
        
        if (n <= 0) {
            System.out.println("Ukuran array harus lebih dari 0.");
            return;
        }
        
        int[] A = new int[n];
        
        System.out.println("Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            A[i] = keyboard.nextInt();
        }
        
        System.out.println("Elemen array A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
    }
}
