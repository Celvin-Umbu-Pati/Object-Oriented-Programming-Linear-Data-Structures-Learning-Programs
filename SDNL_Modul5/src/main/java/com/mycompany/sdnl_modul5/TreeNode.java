/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sdnl_modul5;

/**
 *
 * @author Celvin Pati
 */
class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    public int getData() { return data; }
    public void setData(int data) { this.data = data; }

    public TreeNode getLeftNode() { return leftNode; }
    public void setLeftNode(TreeNode leftNode) { this.leftNode = leftNode; }

    public TreeNode getRightNode() { return rightNode; }
    public void setRightNode(TreeNode rightNode) { this.rightNode = rightNode; }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }
}

 