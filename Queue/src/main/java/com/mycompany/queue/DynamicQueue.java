/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author Celvin Pati
 */
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DynamicQueue {
    private LinkedList<Integer> antrian;

    public DynamicQueue() {
        antrian = new LinkedList<>();
    }

    public void enqueue(int element) {
        antrian.addLast(element);
    }

    public int dequeue() {
        if (antrian.isEmpty()) {
            throw new NoSuchElementException("Antrian kosong");
        }
        return antrian.removeFirst();
    }
    
public int size() {
    return antrian.size();
}

public boolean isEMpty() {
    return antrian.isEmpty();
}
}


 
