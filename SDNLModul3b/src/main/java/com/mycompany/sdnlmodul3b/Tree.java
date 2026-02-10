/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul3b;

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

    }

    
