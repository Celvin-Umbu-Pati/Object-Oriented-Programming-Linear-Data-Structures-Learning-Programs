/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul3b;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int num : data) {
            tree.add(num);
        }

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

    }
}
