/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utssdnlb_245314033;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        int[] tanggalLahir = {2, 8, 0, 4, 0, 6};
        int[] tambahan = {3, 5, 1, 5, 3, 1};
        int[] hasil = new int[tanggalLahir.length];

        for (int i = 0; i < tanggalLahir.length; i++) {
            hasil[i] = tanggalLahir[i] + tambahan[i];
        }

        Tree tree = new Tree();
        for (int val : hasil) {
            tree.insert(val);
        }

        System.out.println("Preorder sebelum penghapusan:");
        tree.preorder(tree.root);
        System.out.println();

        tree.root = tree.deleteLeaf(tree.root, 3);
        tree.deleteRoot();

        System.out.println("Preorder setelah penghapusan:");
        tree.preorder(tree.root);
    }
}


i(9) , a(1), b(2), e(6), g(5), f(7), c(3), d(4), h(8) i terhubung ke 1, a terhubung ke f,i dan b, b terhubung ke c,a dan e, c terhubung ke b,e dan d
d terhubung ke g dan h , c , g terhubung ke d,e,f angka itu adalah urutan index fertex nya buatlah program untuk baca dfs
dengan data graf itu dengan seed vertex b

kan ada clas clas nya ini java di netbeans biasanya saya buat ada main class vertex dan class graph