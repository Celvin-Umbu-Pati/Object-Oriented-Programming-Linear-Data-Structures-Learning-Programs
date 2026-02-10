/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue;

/**
 *
 * @author Celvin Pati
 */
import java.util.NoSuchElementException;

public class Queue {
    private int[] element;
    private int front;
    private int rear;
    private int size;


    public Queue() {
        this(10);
    }

    public Queue(int ukuran) {
        element = new int[ukuran];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enqueue(int data) {
        if (size < element.length) {
            element[rear] = data;
            rear = (rear == element.length - 1) ? 0 : rear + 1;
            size++;
            return true;
        }
        return false; 
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Antrian kosong");
        }
        int hapus = element[front];
        front = (front == element.length - 1) ? 0 : front + 1;
        size--;
        return hapus;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
