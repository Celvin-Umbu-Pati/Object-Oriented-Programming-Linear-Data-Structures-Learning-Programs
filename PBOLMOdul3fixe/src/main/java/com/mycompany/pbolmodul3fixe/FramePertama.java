/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbolmodul3fixe;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JFrame;

public class FramePertama {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku");

        int tinggi = 400;
        int lebar = 400;

        frame.setBounds(100, 100, lebar, tinggi);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
