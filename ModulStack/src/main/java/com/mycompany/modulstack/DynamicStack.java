/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulstack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DynamicStack {
    private LinkedList<Integer> tumpukan;

    public DynamicStack() {
        tumpukan = new LinkedList<>();
    }

    // Tambah elemen ke depan (top)
    public void push(int element) {
        tumpukan.addFirst(element);
    }

    // Hapus dan kembalikan elemen teratas
    public int pop() {
        if (tumpukan.isEmpty()) {
            throw new NoSuchElementException("Stack kosong");
        }
        return tumpukan.removeFirst();
    }

    // Ukuran saat ini
    public int getSize() {
        return tumpukan.size();
    }

    // Cek apakah kosong
    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }

    // Cetak isi stack dari atas ke bawah
    public void cetak() {
        System.out.print("Isi Stack (atas -> bawah): ");
        for (int num : tumpukan) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
