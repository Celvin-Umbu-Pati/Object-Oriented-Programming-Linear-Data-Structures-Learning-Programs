/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul5sdnl;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Celvin Pati
 */
public class PenjumlahanDuaBilangan extends JFrame implements ActionListener {

    private JTextField bil1Field, bil2Field, hasilField;
    private JButton jumlahButton;

    public PenjumlahanDuaBilangan() {
        setTitle("Input Data");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));  // 4 baris, 2 kolom, spasi 5 px

        // Label dan textfield bilangan 1
        add(new JLabel("Bilangan 1"));
        bil1Field = new JTextField();
        add(bil1Field);

        // Label dan textfield bilangan 2
        add(new JLabel("Bilangan 2"));
        bil2Field = new JTextField();
        add(bil2Field);

        // Label dan textfield hasil
        add(new JLabel("Hasil"));
        hasilField = new JTextField();
        hasilField.setEditable(false); // hasil tidak bisa diketik manual
        add(hasilField);

        // Tombol jumlah
        jumlahButton = new JButton("Jumlah");
        jumlahButton.addActionListener(this);
        add(jumlahButton);

        // Kosongkan cell terakhir supaya tombol ada di tengah
        add(new JLabel());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Ambil input angka
            double bil1 = Double.parseDouble(bil1Field.getText());
            double bil2 = Double.parseDouble(bil2Field.getText());

            // Hitung jumlah
            double hasil = bil1 + bil2;

            // Tampilkan hasil di textfield hasil
            hasilField.setText(String.valueOf(hasil));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        PenjumlahanDuaBilangan frame = new PenjumlahanDuaBilangan();
        frame.setVisible(true);
    }
}

