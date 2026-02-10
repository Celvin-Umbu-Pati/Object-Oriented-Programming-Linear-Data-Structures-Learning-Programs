/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlmodul11;

/**
 *
 * @author Celvin Pati
 *
**/
import java.util.NoSuchElementException;

public class Queue {
    // Array untuk simpan elemen queue
    private int[] elements;
    // Pointer ke depan queue
    private int front;
    // Pointer ke belakang queue
    private int rear;
    // Jumlah elemen yang sekarang ini dalam queue
    private int size;
    // Kapasitas maksimum queue
    private int capacity;

    // Constructor default
    public Queue() {
        this(10); // untuk panggil constructor dengan kapasitas default 10
    }

    // Constructor dengan parameter ukuran
    public Queue(int ukuran) {
        capacity = ukuran;  // untuk set kapasitas
        elements = new int[capacity];  // Inisialisasi array
        front = 0;  // Pointer depan di awal
        rear = -1;  // Pointer belakang di -1 
        size = 0;   // Ukuran awal 0
    }

    // untuk tambah elemen ke belakang queue
    public boolean enqueue(int elemen) {
        // untuk cek jika queue penuh
        if (size == capacity) {
            return false; // untuk mengembalikan false jika penuh
        }
        // untuk geser rear dengan cara circular 
        rear = (rear + 1) % capacity;
        elements[rear] = elemen;  // Simpan elemen
        size++;  // Tambah ukuran
        return true;
    }

    // untuk ambil elemen dari depan queue
    public int dequeue() {
        // untuk cek jika queue kosong
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int hapus = elements[front];  // Ambil elemen depan
        // untuk geser front secara circular
        front = (front + 1) % capacity;
        size--;  // Kurangi ukuran
        return hapus;
    }

    // untuk mengembali jumlah elemen dalam queue
    public int size() {
        return size;
    }

    // untuk cek kalau ada  queue kosong
    public boolean isEmpty() {
        return size == 0;
    }
}