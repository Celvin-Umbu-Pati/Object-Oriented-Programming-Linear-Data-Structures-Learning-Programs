/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul3fix;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import java.awt.*;

public class FormSederhana extends JFrame {

    public FormSederhana() {
        setTitle("Form Registrasi");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        JLabel lblJudul = new JLabel("Form Registrasi", JLabel.CENTER);
        lblJudul.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel lblNama = new JLabel("Nama:");
        JTextField txtNama = new JTextField();

        JLabel lblPass = new JLabel("Password:");
        JPasswordField txtPass = new JPasswordField();

        JLabel lblHobi = new JLabel("Hobi:");
        JCheckBox cbMembaca = new JCheckBox("Membaca");
        JCheckBox cbOlahraga = new JCheckBox("Olahraga");

        JLabel lblGender = new JLabel("Jenis Kelamin:");
        JRadioButton rbLaki = new JRadioButton("Laki-laki");
        JRadioButton rbPerempuan = new JRadioButton("Perempuan");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLaki);
        bg.add(rbPerempuan);

        JLabel lblJurusan = new JLabel("Jurusan:");
        String[] jurusan = {"Informatika", "Sistem Informasi", "Teknik Elektro"};
        JComboBox<String> cbJurusan = new JComboBox<>(jurusan);

        JLabel lblUmur = new JLabel("Umur:");
        JSlider sliderUmur = new JSlider(15, 60, 20);
        sliderUmur.setMajorTickSpacing(15);
        sliderUmur.setPaintTicks(true);
        sliderUmur.setPaintLabels(true);

        JButton btnDaftar = new JButton("Daftar");

        panel.add(lblJudul);
        panel.add(lblNama);
        panel.add(txtNama);
        panel.add(lblPass);
        panel.add(txtPass);
        panel.add(lblHobi);
        panel.add(cbMembaca);
        panel.add(cbOlahraga);
        panel.add(lblGender);
        panel.add(rbLaki);
        panel.add(rbPerempuan);
        panel.add(lblJurusan);
        panel.add(cbJurusan);
        panel.add(lblUmur);
        panel.add(sliderUmur);
        panel.add(btnDaftar);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormSederhana();
    }
}


