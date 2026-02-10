/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Celvin Pati
 */
public class FramePertama {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku");

        int tinggi = 400;
        int lebar = 400;

        frame.setBounds(0, 0, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
