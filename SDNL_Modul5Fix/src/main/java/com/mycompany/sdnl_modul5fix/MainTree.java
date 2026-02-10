/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul5fix;

/**
 *
 * @author Celvin Pati
 */
public class MainTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int v : data)
            tree.insert(v);

        System.out.println("=== Pohon Awal (Preorder) ===");
        tree.preorder(tree.root);
        System.out.println("\nStruktur Pohon:");
        tree.printTree(tree.root, "", true);

        int[] hapus = {12, 55, 21, 42};
        for (int h : hapus) {
            System.out.println("\n>>> Menghapus " + h);
            tree.remove(h);
            System.out.print("Preorder: ");
            tree.preorder(tree.root);
            System.out.println("\nStruktur Pohon:");
            tree.printTree(tree.root, "", true);
        }
    }
}