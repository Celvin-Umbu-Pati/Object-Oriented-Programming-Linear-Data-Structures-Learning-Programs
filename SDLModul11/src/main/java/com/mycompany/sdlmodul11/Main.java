/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlmodul11;

import java.util.NoSuchElementException;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Queue antrian = new Queue(7);
        
        antrian.enqueue(26);
        antrian.enqueue(15);
        antrian.enqueue(8);
        antrian.enqueue(14);
        
        try {
            System.out.println(antrian.dequeue()); // 26
            System.out.println(antrian.dequeue()); // 15
            System.out.println(antrian.dequeue()); // 8
            System.out.println(antrian.dequeue()); // 14
            System.out.println(antrian.dequeue()); // jadi dibagian ini akan ada hrow exception
        } catch (NoSuchElementException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
