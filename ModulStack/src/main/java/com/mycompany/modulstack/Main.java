/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulstack;


/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        // Uji Stack Statis (Array)
        Stack stackStatis = new Stack(7); 
        stackStatis.push(26);
        stackStatis.push(15);
        stackStatis.push(8);
        stackStatis.push(14);

        System.out.println("Pop (Statis): " + stackStatis.pop());  // 14
        System.out.println("Pop (Statis): " + stackStatis.pop());  // 8
        stackStatis.cetak();  // 15 26

        System.out.println();

        // Uji Stack Dinamis (LinkedList)
        DynamicStack stackDinamis = new DynamicStack();
        stackDinamis.push(100);
        stackDinamis.push(200);
        System.out.println("Pop (Dinamis): " + stackDinamis.pop());  // 200
        stackDinamis.cetak();  // 100
    }
}
