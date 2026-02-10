/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul8;
import java.util.LinkedList;
/**
 *
 * @author Celvin Pati
 */
public class Queue<E> {
    private LinkedList<E> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(E e) {
        linkedList.addLast(e);
    }

    public E dequeue() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
