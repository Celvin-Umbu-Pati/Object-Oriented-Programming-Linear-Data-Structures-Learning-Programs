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

public class FrameKu2 extends JFrame {

    public FrameKu2() {
   
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Frame dengan Komponen");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Nama:");

        JTextField textField = new JTextField(15);

        JCheckBox checkBox = new JCheckBox("Saya setuju");

        JRadioButton radio1 = new JRadioButton("Laki-laki");
        JRadioButton radio2 = new JRadioButton("Perempuan");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        panel.add(label);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(radio1);
        panel.add(radio2);

        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameKu();
    }
}
