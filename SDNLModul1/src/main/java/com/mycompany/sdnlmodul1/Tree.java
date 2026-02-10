/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul1;

/**
 *
 * @author Celvin Pati
 */
public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insertNode(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }

        if (data < current.getData()) {
            current.setLeftNode(insertRec(current.getLeftNode(), data));
        } else if (data > current.getData()) {
            current.setRightNode(insertRec(current.getRightNode(), data));
        }
        return current;
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inorderTraversal(node.getRightNode());
        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTraversal(node.getLeftNode());
            preorderTraversal(node.getRightNode());
        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.getLeftNode());
            postorderTraversal(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}
