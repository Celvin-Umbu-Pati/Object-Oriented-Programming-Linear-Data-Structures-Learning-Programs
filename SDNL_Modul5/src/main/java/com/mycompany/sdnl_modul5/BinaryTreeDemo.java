/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul5;

/**
 *
 * @author Celvin Pati
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int val : data) tree.add(val);

        System.out.println("=== Pohon Biner Awal ===");
        tree.printTree(tree.getRoot(), "", false);

        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.getRoot());
        System.out.println("\n----------------------");

        int[] hapus = {12, 55, 21, 42};
        for (int val : hapus) {
            System.out.println("\nMenghapus node: " + val);
            tree.remove(val);
            tree.printTree(tree.getRoot(), "", false);
            System.out.print("Preorder setelah hapus " + val + ": ");
            tree.preorder(tree.getRoot());
            System.out.println("\n----------------------");
        }
    }
}
