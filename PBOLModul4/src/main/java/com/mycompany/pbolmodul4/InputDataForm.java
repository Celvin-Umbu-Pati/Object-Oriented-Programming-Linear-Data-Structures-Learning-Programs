/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul4;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Celvin Pati
 */

public class InputDataForm extends JFrame {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;

    private JTextField txtNama;
    private JRadioButton rbLaki, rbPerempuan;
    private JCheckBox cbOlahraga, cbShopping, cbGames, cbBioskop;
    private JButton btnOk, btnCancel;

    public static void main(String[] args) {
        InputDataForm frame = new InputDataForm();
        frame.setVisible(true);
    }

    public InputDataForm() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Input Data");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.lightGray);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 20, 80, 25);
        contentPane.add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(100, 20, 250, 25);
        contentPane.add(txtNama);

        JLabel lblGender = new JLabel("Jenis kelamin:");
        lblGender.setBounds(20, 60, 100, 25);
        contentPane.add(lblGender);

        rbLaki = new JRadioButton("Laki - Laki");
        rbLaki.setBounds(120, 60, 100, 25);
        rbPerempuan = new JRadioButton("Perempuan");
        rbPerempuan.setBounds(230, 60, 100, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbLaki);
        genderGroup.add(rbPerempuan);

        contentPane.add(rbLaki);
        contentPane.add(rbPerempuan);

        JLabel lblHobi = new JLabel("Hobi:");
        lblHobi.setBounds(20, 100, 80, 25);
        contentPane.add(lblHobi);

        cbOlahraga = new JCheckBox("Olahraga");
        cbOlahraga.setBounds(120, 100, 150, 25);

        cbShopping = new JCheckBox("Shopping");
        cbShopping.setBounds(120, 125, 150, 25);

        cbGames = new JCheckBox("Computer Games");
        cbGames.setBounds(120, 150, 150, 25);

        cbBioskop = new JCheckBox("Nonton Bioskop");
        cbBioskop.setBounds(120, 175, 150, 25);

        contentPane.add(cbOlahraga);
        contentPane.add(cbShopping);
        contentPane.add(cbGames);
        contentPane.add(cbBioskop);

        btnOk = new JButton("OK");
        btnOk.setBounds(120, 210, 80, 30);
        contentPane.add(btnOk);

        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(220, 210, 80, 30);
        contentPane.add(btnCancel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
