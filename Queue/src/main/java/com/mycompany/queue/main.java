/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author Celvin Pati
 */
public class main {
    public static void main(String[] args) {
     Queue antrian = new Queue(7);
     antrian.enqueue(26);
     antrian.enqueue(15);
     antrian.enqueue(8);
     antrian.enqueue(14);
     
     System.out.println(antrian.dequeue());
     System.out.println(antrian.dequeue());
     System.out.println(antrian.dequeue());
     System.out.println(antrian.dequeue());
     System.out.println(antrian.dequeue());
     
    }

    }