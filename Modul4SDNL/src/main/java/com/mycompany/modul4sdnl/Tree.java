/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul4sdnl;

/**
 *
 * @author Celvin Pati
 */
class Tree {
    private TreeNode root;


    public Tree() {
        root = null;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private TreeNode addRecursive(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }
        if (data < current.data) {
            current.leftNode = addRecursive(current.leftNode, data);
        } else if (data > current.data) {
            current.rightNode = addRecursive(current.rightNode, data);
        }
        return current;
    }

    public TreeNode getNode(int data) {
        return findNode(root, data);
    }

    private TreeNode findNode(TreeNode current, int data) {
        if (current == null) return null;
        if (current.data == data) return current;
        return (data < current.data) ? findNode(current.leftNode, data) : findNode(current.rightNode, data);
    }

    public TreeNode getParent(int data) {
        return findParent(root, data);
    }

    private TreeNode findParent(TreeNode current, int data) {
        if (current == null) return null;
        if ((current.leftNode != null && current.leftNode.data == data) ||
            (current.rightNode != null && current.rightNode.data == data)) {
            return current;
        }
        if (data < current.data) {
            return findParent(current.leftNode, data);
        } else {
            return findParent(current.rightNode, data);
        }
    }

    public void remove(int data) {
        root = removeRecursive(root, data);
    }

    private TreeNode removeRecursive(TreeNode current, int data) {
        if (current == null) return null;

        if (data < current.data) {
            current.leftNode = removeRecursive(current.leftNode, data);
        } else if (data > current.data) {
            current.rightNode = removeRecursive(current.rightNode, data);
        } else {
        
            if (current.leftNode == null && current.rightNode == null) {
                return null; // 0 anak
            } else if (current.leftNode == null) {
                return current.rightNode; // 1 anak kanan
            } else if (current.rightNode == null) {
                return current.leftNode; // 1 anak kiri
            }
       
        }
        return current;
    }

    public void preorder() {
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRecursive(node.leftNode);
            preorderRecursive(node.rightNode);
        }
    }
}
