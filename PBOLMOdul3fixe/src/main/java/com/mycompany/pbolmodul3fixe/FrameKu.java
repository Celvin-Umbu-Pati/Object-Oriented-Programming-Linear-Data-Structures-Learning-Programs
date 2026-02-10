/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul3fixe;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JFrame;

public class FrameKu extends JFrame {

    public FrameKu() {

        this.setSize(300, 500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Ini Class turunan dari class JFrame");

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameKu();
    }
}
