/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul5;

/**
 *
 * @author Celvin Pati
 */
class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public TreeNode getRoot() { return root; }
    public void setRoot(TreeNode root) { this.root = root; }

    public void add(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.getData())
            root.setLeftNode(insertRec(root.getLeftNode(), value));
        else if (value > root.getData())
            root.setRightNode(insertRec(root.getRightNode(), value));
        return root;
    }

    public TreeNode getPredecessor(TreeNode node) {
        if (node == null) return null;

        if (node.getLeftNode() != null) {
            TreeNode current = node.getLeftNode();
            while (current.getRightNode() != null)
                current = current.getRightNode();
            return current;
        }

        TreeNode ancestor = root;
        TreeNode predecessor = null;
        while (ancestor != null) {
            if (node.getData() > ancestor.getData()) {
                predecessor = ancestor;
                ancestor = ancestor.getRightNode();
            } else if (node.getData() < ancestor.getData()) {
                ancestor = ancestor.getLeftNode();
            } else break;
        }
        return predecessor;
    }

    public boolean remove(int value) {
        if (getNode(value) == null) return false;
        root = removeRec(root, value);
        return true;
    }

    private TreeNode removeRec(TreeNode root, int value) {
        if (root == null) return null;

        if (value < root.getData()) {
            root.setLeftNode(removeRec(root.getLeftNode(), value));
        } else if (value > root.getData()) {
            root.setRightNode(removeRec(root.getRightNode(), value));
        } else {
       
            if (root.getLeftNode() == null && root.getRightNode() == null) {
                return null;
            } else if (root.getLeftNode() == null) {
                return root.getRightNode();
            } else if (root.getRightNode() == null) {
                return root.getLeftNode();
            } else {
                TreeNode predecessor = getPredecessor(root);
                root.setData(predecessor.getData());
                root.setLeftNode(removeRec(root.getLeftNode(), predecessor.getData()));
            }
        }
        return root;
    }

    public TreeNode getNode(int value) {
        TreeNode current = root;
        while (current != null) {
            if (value == current.getData()) return current;
            else if (value < current.getData()) current = current.getLeftNode();
            else current = current.getRightNode();
        }
        return null;
    }

    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeftNode());
            preorder(node.getRightNode());
        }
    }

    public void printTree(TreeNode node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());
            printTree(node.getLeftNode(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRightNode(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}

