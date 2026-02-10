/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulstack;

/**
 *
 * @author Celvin Pati
 */
import java.util.NoSuchElementException;
public class Stack {
    private int[] element;  // Array untuk simpan elemen stack
    private int front;      // Indeks elemen teratas
    private int size;       // Jumlah elemen dalam stack

    // Constructor default (ukuran array = 10)
    public Stack() {
        this(10);
    }

    // Constructor dengan parameter ukuran array
    public Stack(int ukuran) {
        element = new int[ukuran];
        front   = -1;  // kosong
        size    = 0;
    }

    // Tambah elemen ke stack
    public boolean push(int data) {
        if (size < element.length) {
            front++;
            element[front] = data;
            size++;
            return true;
        }
        return false; // penuh
    }

    // Hapus dan kembalikan elemen teratas
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack kosong");
        }
        int hapus = element[front];
        front--;
        size--;
        return hapus;
    }

    // Ukuran saat ini
    public int getSize() {
        return size;
    }

    // Cek apakah kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cetak isi stack dari atas ke bawah
    public void cetak() {
        System.out.print("Isi Stack (atas -> bawah): ");
        for (int i = front; i >= 0; i--) {
            System.out.print(element[i] + " ");
        }
        System.out.println();
    }
}
