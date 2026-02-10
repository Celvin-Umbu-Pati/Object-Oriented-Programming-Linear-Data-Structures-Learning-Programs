/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utssdnlb_245314033;

/**
 *
 * @author Celvin Pati
 */
public class Tree {
    TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode node, int data) {
        if (node == null) return new TreeNode(data);
        if (data < node.data) node.left = insertRec(node.left, data);
        else node.right = insertRec(node.right, data);
        return node;
    }

    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public TreeNode deleteLeaf(TreeNode node, int value) {
        if (node == null) return null;
        if (node.left == null && node.right == null && node.data == value) return null;
        node.left = deleteLeaf(node.left, value);
        node.right = deleteLeaf(node.right, value);
        return node;
    }

    public void deleteRoot() {
        root = deleteNode(root, root.data);
    }

    private TreeNode deleteNode(TreeNode node, int key) {
        if (node == null) return null;
        if (key < node.data) node.left = deleteNode(node.left, key);
        else if (key > node.data) node.right = deleteNode(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            TreeNode successor = minValueNode(node.right);
            node.data = successor.data;
            node.right = deleteNode(node.right, successor.data);
        }
        return node;
    }

    private TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) current = current.left;
        return current;
    }
}
