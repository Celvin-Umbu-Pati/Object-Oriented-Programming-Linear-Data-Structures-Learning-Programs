/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnlmodul1;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTreeDemoApp extends JFrame {
    private JTree tree;
    private JLabel jlab;

    public JTreeDemoApp() {
        super("JTree Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        makeGUI();
    }
    private void makeGUI() {
        // Root node
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        // Subtree A
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        a.add(new DefaultMutableTreeNode("A1"));
        a.add(new DefaultMutableTreeNode("A2"));
        // Subtree B
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        b.add(new DefaultMutableTreeNode("B1"));
        b.add(new DefaultMutableTreeNode("B2"));
        b.add(new DefaultMutableTreeNode("B3"));

        tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp, BorderLayout.CENTER);

        jlab = new JLabel("Select a node");
        add(jlab, BorderLayout.SOUTH);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                jlab.setText("Selection is " + e.getPath());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JTreeDemoApp().setVisible(true);
        });
    }
}
