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

public class MultiComponentGUI extends JFrame {

    public MultiComponentGUI() {

        setTitle("GUI dengan 10 Komponen");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(10, 1, 5, 5));

        JLabel labelNama = new JLabel("Nama:", JLabel.LEFT);

        JTextField textNama = new JTextField(15);

        JPasswordField passwordField = new JPasswordField(15);

        JTextArea textArea = new JTextArea("Tulis sesuatu di sini...", 3, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JCheckBox checkBox = new JCheckBox("Saya setuju dengan syarat & ketentuan");

        JRadioButton male = new JRadioButton("Laki-laki");
        JRadioButton female = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);

        String[] pilihan = {"Indonesia", "Malaysia", "Singapura", "Thailand"};
        JComboBox<String> comboBox = new JComboBox<>(pilihan);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JButton submitButton = new JButton("Submit");

        add(labelNama);
        add(textNama);
        add(passwordField);
        add(scrollPane);
        add(checkBox);
        add(genderPanel);
        add(comboBox);
        add(slider);
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiComponentGUI();
    }
}
