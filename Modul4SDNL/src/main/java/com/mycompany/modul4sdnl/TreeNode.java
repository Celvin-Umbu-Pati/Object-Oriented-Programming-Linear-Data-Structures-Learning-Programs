/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul4sdnl;

/**
 *
 * @author Celvin Pati
 */
class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
    public boolean isLeaf() {
        return (leftNode == null && rightNode == null);
    }
}
