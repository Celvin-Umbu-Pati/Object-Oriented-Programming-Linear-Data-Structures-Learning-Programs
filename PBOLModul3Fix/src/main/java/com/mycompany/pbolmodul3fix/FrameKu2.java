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
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameKu2 extends JFrame {

    public FrameKu2() {
 
        this.setSize(300, 500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Ini Class turunan dari class JFrame");

        JPanel panel = new JPanel();

        JButton tombol = new JButton();
        tombol.setText("Ini Tombol");

        panel.add(tombol);

        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameKu();
    }
}

