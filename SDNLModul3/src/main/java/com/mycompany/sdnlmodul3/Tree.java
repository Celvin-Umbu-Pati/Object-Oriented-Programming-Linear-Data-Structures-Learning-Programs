/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul3;

/**
 *
 * @author Celvin Pati
 */
public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void add(int data) {
        root = addRec(root, data);
    }

    private TreeNode addRec(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }
        if (data < node.getData()) {
            node.setLeftNode(addRec(node.getLeftNode(), data));
        } else if (data > node.getData()) {
            node.setRightNode(addRec(node.getRightNode(), data));
        }
        return node;
    }

    public TreeNode getNode(int data) {
        return getNodeRec(root, data);
    }

    private TreeNode getNodeRec(TreeNode node, int data) {
        if (node == null || node.getData() == data) {
            return node;
        }
        if (data < node.getData()) {
            return getNodeRec(node.getLeftNode(), data);
        } else {
            return getNodeRec(node.getRightNode(), data);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preorderTraversal() {
        preorderHelper(root);
        System.out.println();
    }

    private void preorderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderHelper(node.getLeftNode());
            preorderHelper(node.getRightNode());
        }
    }

    public void inorderTraversal() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(TreeNode node) {
        if (node != null) {
            inorderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inorderHelper(node.getRightNode());
        }
    }

    public void postorderTraversal() {
        postorderHelper(root);
        System.out.println();
    }

    private void postorderHelper(TreeNode node) {
        if (node != null) {
            postorderHelper(node.getLeftNode());
            postorderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}
