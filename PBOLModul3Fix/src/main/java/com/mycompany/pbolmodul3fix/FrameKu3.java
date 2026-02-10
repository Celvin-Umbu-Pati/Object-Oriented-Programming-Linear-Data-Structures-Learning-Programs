/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul3fix;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

public class FrameKu3 extends JFrame {

    /**
     *
     */
    public FrameKu3() {
  
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo Komponen Swing");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("Nama:");

        JTextField textField = new JTextField(15);

        JCheckBox checkBox = new JCheckBox("Setuju");

        JRadioButton radio1 = new JRadioButton("Pilihan 1");
        JRadioButton radio2 = new JRadioButton("Pilihan 2");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        JButton tombol = new JButton("Klik Saya");

        panel.add(label);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(tombol);

        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameKu();
    }
}
