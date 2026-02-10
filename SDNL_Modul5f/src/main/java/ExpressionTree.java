/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import java.util.Stack;

public class ExpressionTree {
    private TreeNode root;

    public void addExpressionInfix(String x) {
        Stack<TreeNode> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        char c;

        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if (c == ' ') continue; 

            if (Character.isLetterOrDigit(c)) {
                operand.push(new TreeNode(c)); 
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    makeSubTree(operand, operator.pop());
                }
                operator.pop(); 
            } else if (isOperator(c)) {
                while (!operator.isEmpty() && precedence(operator.peek()) >= precedence(c)) {
                    makeSubTree(operand, operator.pop());
                }
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            makeSubTree(operand, operator.pop());
        }

        root = operand.pop();
    }

    private void makeSubTree(Stack<TreeNode> operand, char op) {
        TreeNode right = operand.pop();
        TreeNode left = operand.pop();
        TreeNode node = new TreeNode(op);
        node.left = left;
        node.right = right;
        operand.push(node);
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return 0;
    }

    public void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    public void printTree() {
        printInorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        ExpressionTree et = new ExpressionTree();
        et.addExpressionInfix("(A+B)*C");
        System.out.print("Inorder traversal: ");
        et.printTree();
    }
}
