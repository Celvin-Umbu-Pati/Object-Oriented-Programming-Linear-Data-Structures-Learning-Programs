/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul1;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.insertNode(50);
        bst.insertNode(30);
        bst.insertNode(70);
        bst.insertNode(20);
        bst.insertNode(40);
        bst.insertNode(60);
        bst.insertNode(80);

        System.out.print("Inorder Traversal: ");
        bst.inorderTraversal(bst.getRoot());
        System.out.println();

        System.out.print("Preorder Traversal: ");
        bst.preorderTraversal(bst.getRoot());
        System.out.println();

        System.out.print("Postorder Traversal: ");
        bst.postorderTraversal(bst.getRoot());
        System.out.println();
    }
}
