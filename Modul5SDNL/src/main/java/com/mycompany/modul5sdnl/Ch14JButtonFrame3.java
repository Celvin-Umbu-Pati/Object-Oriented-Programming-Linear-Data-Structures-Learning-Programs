/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5sdnl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Celvin Pati
 */
public class Ch14JButtonFrame3 extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private Container contentPane;

    // Ukuran Frame
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 100;
    private static final int FRAME_Y_ORIGIN = 100;

    // Ukuran Button
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 40;

    public Ch14JButtonFrame3() {
        // Set Judul dan ukuran frame
        setTitle("Latihan 3 - Dua Tombol");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 1. Membuat button pertama
        button1 = new JButton("Click Me");
        button1.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button1);

        // 1. Membuat button kedua
        button2 = new JButton("Tombol2");
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button2);

        // 3. Registrasi listener
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // 2. Method actionPerformed untuk mendeteksi tombol mana yang ditekan
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();

        if (buttonText.equals("Click Me")) {
            setTitle("(Dibuat dengan cara - 2) You clicked " + buttonText);
        } else {
            setTitle("You clicked " + buttonText);
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Ch14JButtonFrame3 frame = new Ch14JButtonFrame3();
        frame.setVisible(true);
    }
}

