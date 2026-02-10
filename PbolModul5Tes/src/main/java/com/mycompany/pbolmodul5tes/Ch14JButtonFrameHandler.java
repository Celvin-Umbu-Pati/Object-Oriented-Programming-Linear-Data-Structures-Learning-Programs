/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul5tes;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Celvin Pati
 */
class Ch14JButtonFrameHandler extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton cancelButton;
    private JButton okButton;

    public Ch14JButtonFrameHandler() {
        Container contentPane = getContentPane();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch14JButtonFrameHandler");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        cancelButton.addActionListener(this);      
        okButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        String buttonText = clickedButton.getText();
        if (buttonText.equals("OK")) {
            this.setTitle("Tombol OK yang di klik");
        } else {
            this.setTitle("Tombol CANCEL yang di klik");
        }
    }
//    public void actionPerformed(ActionEvent event) {
//        JButton clickedButton = (JButton) event.getSource();
//        String buttonText = clickedButton.getText();
//        this.setTitle("You clicked " + buttonText);
//    }

    public static void main(String[] args) {
        Ch14JButtonFrameHandler frame = new Ch14JButtonFrameHandler();
        frame.setVisible(true);
    }
}