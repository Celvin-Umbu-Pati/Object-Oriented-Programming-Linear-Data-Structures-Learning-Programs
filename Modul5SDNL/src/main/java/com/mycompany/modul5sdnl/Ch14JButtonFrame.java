/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul5sdnl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Celvin Pati
 */
public class Ch14JButtonFrame extends JFrame implements ActionListener {

    private JButton button1, button2;
    private JTextField pesan;

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 30;

    public Ch14JButtonFrame() {
        setTitle("Latihan 4");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // Tombol 1 : Click Me
        button1 = new JButton("Click Me");
        button1.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        contentPane.add(button1);
        button1.addActionListener(this);   // registrasi listener

        // Tombol 2 : Tombol2
        button2 = new JButton("Tombol2");
        button2.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        contentPane.add(button2);
        button2.addActionListener(this);   // registrasi listener

        // TextField pesan
        pesan = new JTextField();
        pesan.setColumns(20);   // panjang textfield 20 kolom
        contentPane.add(pesan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();

        if (buttonText.equals("Click Me")) {
            // ambil isi dari textfield ketika tombol "Click Me" ditekan
            String isiPesan = pesan.getText();
            setTitle(isiPesan);   // tampilkan isi pesan di title bar
        } else {
            // kalau tombol lain ditekan
            setTitle("You clicked " + buttonText);
        }
    }

    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }
}
