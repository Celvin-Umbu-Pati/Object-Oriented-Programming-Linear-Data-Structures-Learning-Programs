/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlmodul11;

/**
 *
 * @author Celvin Pati
 */
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DinamicQueue {
    //LinkedList untuk simpanan internal
    private LinkedList<Integer> antrian;
    // Constructor
    public DinamicQueue() {
        antrian = new LinkedList<>();  // Inisialisasi LinkedList
    }
    //untuk tambah elemen ke belakang queue
    public void enqueue(int elemen) {
        antrian.addLast(elemen);  // LinkedList untuk menangani penambahan
    }
    // untuk ambil elemen dari depan queue
    public int dequeue() {
        // Cek jika queue kosong
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return antrian.removeFirst();  // LinkedList menangani penghapusan
    }
    // untuk mengembalikan jumlah elemen
    public int size() {
        return antrian.size();  // Ukuran dari LinkedList
    }
    // untuk cek apakah queue kosong
    public boolean isEmpty() {
        return antrian.isEmpty();  // Cek kosong dari LinkedList
    }
}