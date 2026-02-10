/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlsenaraiberantai;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("SBBTK");

        list.addFirst(8);
        System.out.println(list);

        list.addFirst(15);
        System.out.println(list);

        list.addLast(26);
        System.out.println(list);

        list.addLast(14);
        System.out.println(list);
        
         list.removeLast();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
    }
}

