/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class DectoBin {

    public static void decToBin(int num) {
        if (num > 0) {
            decToBin(num / 2);
            System.out.print(num % 2);
        }
    }

    public static void main(String[] args) {
        decToBin(4);
        System.out.println("");
        decToBin(10);
        System.out.println("");
        decToBin(100);
    }
}
