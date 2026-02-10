/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5sdnl;

/**
 *
 * @author Celvin Pati
 */
import java.awt.event.*;
import javax.swing.*;

class ButtonHandler implements ActionListener {
    public ButtonHandler() { }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        JFrame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();

        frame.setTitle("You clicked " + buttonText);
    }
}
