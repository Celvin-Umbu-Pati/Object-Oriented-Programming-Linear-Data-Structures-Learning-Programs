/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul5tes;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Celvin Pati
 */
class Ch14JButtonFrameHandler2 extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton cancelButton;
    private JButton okButton;

    public Ch14JButtonFrameHandler2() {
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14JButtonFrameHandler");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                JRootPane rootPane = clickedButton.getRootPane();
                Frame frame = (JFrame) rootPane.getParent();
                String buttonText = clickedButton.getText();
                frame.setTitle("You clicked OK " + buttonText);
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                JRootPane rootPane = clickedButton.getRootPane();
                Frame frame = (JFrame) rootPane.getParent();
                String buttonText = clickedButton.getText();
                frame.setTitle("You clicked CANCEL " + buttonText);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ch14JButtonFrameHandler2 frame = new Ch14JButtonFrameHandler2();
        frame.setVisible(true);
}
}
