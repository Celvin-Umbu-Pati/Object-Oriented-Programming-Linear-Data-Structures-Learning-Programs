/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul5fix;

/**
 *
 * @author Celvin Pati
 */
class BinaryTree {
    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);
        return root;
    }

    public TreeNode search(int value) {
        return searchRec(root, value);
    }

    private TreeNode searchRec(TreeNode root, int value) {
        if (root == null || root.data == value)
            return root;
        if (value < root.data)
            return searchRec(root.left, value);
        return searchRec(root.right, value);
    }

    public TreeNode getPredecessor(int value) {
        TreeNode node = root;
        TreeNode predecessor = null;

        while (node != null) {
            if (value > node.data) {
                predecessor = node; 
                node = node.right;
            } else if (value < node.data) {
                node = node.left;
            } else {
            
                if (node.left != null) {
                    predecessor = node.left;
                    while (predecessor.right != null)
                        predecessor = predecessor.right;
                }
                break;
            }
        }
        return predecessor;
    }

    public void remove(int value) {
        root = removeRec(root, value);
    }
    private TreeNode removeRec(TreeNode root, int value) {
        if (root == null)
            return null;

        if (value < root.data)
            root.left = removeRec(root.left, value);
        else if (value > root.data)
            root.right = removeRec(root.right, value);
        else {
      
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            TreeNode pred = root.left;
            while (pred.right != null)
                pred = pred.right;

            root.data = pred.data;
         
            root.left = removeRec(root.left, pred.data);
        }
        return root;
    }
    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void printTree(TreeNode node, String indent, boolean isRight) {
        if (node == null)
            return;
        System.out.println(indent + (isRight ? "└── " : "├── ") + node.data);
        printTree(node.left, indent + (isRight ? "    " : "│   "), false);
        printTree(node.right, indent + (isRight ? "    " : "│   "), true);
    }
}