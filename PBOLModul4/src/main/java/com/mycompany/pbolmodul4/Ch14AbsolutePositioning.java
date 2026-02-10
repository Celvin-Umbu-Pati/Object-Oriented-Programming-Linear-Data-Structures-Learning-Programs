/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Celvin Pati
 */
class Ch14AbsolutePositioning extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 40;
    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        Ch14AbsolutePositioning frame = new Ch14AbsolutePositioning();
        frame.setVisible(true);
    }

    public Ch14AbsolutePositioning() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Program Ch14AbsolutePositioning");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        okButton = new JButton("OK");
        okButton.setBounds(50, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(150, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
