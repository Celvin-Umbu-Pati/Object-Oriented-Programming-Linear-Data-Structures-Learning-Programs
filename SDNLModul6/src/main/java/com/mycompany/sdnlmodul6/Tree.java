/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul6;

import java.util.Stack;

/**
 *
 * @author Celvin Pati
 */
class Tree {
    TreeNode root;

    public void addExpressionInfix(String x) {
        Stack<TreeNode> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == ' ') continue;

            if (c == '(') {
                operator.push(c);
            } else if (Character.isLetterOrDigit(c)) {
                operand.push(new TreeNode(c));
            } else if (c == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    char op = operator.pop();
                    TreeNode right = operand.pop();
                    TreeNode left = operand.pop();
                    TreeNode node = new TreeNode(op);
                    node.left = left;
                    node.right = right;
                    operand.push(node);
                }
                operator.pop(); 
            } else { 
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            char op = operator.pop();
            TreeNode right = operand.pop();
            TreeNode left = operand.pop();
            TreeNode node = new TreeNode(op);
            node.left = left;
            node.right = right;
            operand.push(node);
        }

        root = operand.pop();
    }

    public void printPrefix(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPrefix(node.left);
            printPrefix(node.right);
        }
    }

    public void printInfix(TreeNode node) {
        if (node != null) {
            if (node.left != null) System.out.print("(");
            printInfix(node.left);
            System.out.print(node.data);
            printInfix(node.right);
            if (node.right != null) System.out.print(")");
        }
    }

    public void printPostfix(TreeNode node) {
        if (node != null) {
            printPostfix(node.left);
            printPostfix(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void printAll() {
        System.out.print("Prefix  : "); printPrefix(root); System.out.println();
        System.out.print("Infix   : "); printInfix(root); System.out.println();
        System.out.print("Postfix : "); printPostfix(root); System.out.println();
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        String exp = "((A/B)*(C-D))^(E+F)";
        t.addExpressionInfix(exp);
        t.printAll();
    }
}