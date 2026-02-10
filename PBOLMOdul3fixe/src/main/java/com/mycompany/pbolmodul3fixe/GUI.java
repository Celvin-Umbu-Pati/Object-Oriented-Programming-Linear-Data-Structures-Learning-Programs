/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul3fixe;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
    
        this.setTitle("Find");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Keyword:", JLabel.CENTER);

        JTextField textField = new JTextField();

        JButton button = new JButton("Find");

        add(label);
        add(textField);
        add(button);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}

