/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7pbolfinx;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lat5 extends JFrame implements ActionListener {

    private JTextField txtPanjang, txtLebar, txtLuas;
    private JButton btnHitung;

    public Lat5() {
        super("Luas Tanah");
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Panjang (m):"));
        txtPanjang = new JTextField();
        add(txtPanjang);

        add(new JLabel("Lebar (m):"));
        txtLebar = new JTextField();
        add(txtLebar);

        add(new JLabel("Luas (m2):"));
        txtLuas = new JTextField();
        txtLuas.setEditable(false);
        add(txtLuas);

        btnHitung = new JButton("Hitung");
        btnHitung.addActionListener(this);
        add(btnHitung);

        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
           
            int panjang = Integer.parseInt(txtPanjang.getText());
            int lebar = Integer.parseInt(txtLebar.getText());

            int luas = panjang * lebar;
            txtLuas.setText(String.valueOf(luas));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Maaf, hanya integer yang diperbolehkan!",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new Lat5();
    }
}
