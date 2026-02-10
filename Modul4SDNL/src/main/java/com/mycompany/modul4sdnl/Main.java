/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4sdnl;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] values = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int v : values) {
            tree.add(v);
        }

        System.out.println("Preorder setelah input:");
        tree.preorder();

        int[] toRemove = {12, 27, 6, 55};
        for (int v : toRemove) {
            tree.remove(v);
            System.out.println("Preorder setelah hapus " + v + ":");
            tree.preorder();
        }
    }
}
