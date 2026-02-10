/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul3fix;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import java.awt.*;

public class FindFrame extends JFrame {

    public FindFrame() {

        setTitle("Find");

        setSize(300, 150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 5, 5));

        JLabel label = new JLabel("Keyword:", JLabel.CENTER);

        JTextField textField = new JTextField();

        JButton button = new JButton("Find");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FindFrame();
    }
}

