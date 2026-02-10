/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
import javax.swing.*;
import javax.swing.table.TableModel;

import javax.swing.*;

import javax.swing.*;

import javax.swing.*;

public class LoginFrame extends JFrame {

    private JLabel lblUser, lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnHubungkan, btnBatal;

    public LoginFrame() {
        setTitle("Hubungkan ke Database");
        setSize(350, 220);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblUser = new JLabel("Username:");
        lblUser.setBounds(20, 20, 100, 25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(120, 20, 180, 25);
        add(txtUser);

        lblPass = new JLabel("Password:");
        lblPass.setBounds(20, 60, 100, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 60, 180, 25);
        add(txtPass);

        btnHubungkan = new JButton("Hubungkan");
        btnHubungkan.setBounds(50, 110, 120, 30);
        add(btnHubungkan);

        btnBatal = new JButton("Batal");
        btnBatal.setBounds(180, 110, 120, 30);
        add(btnBatal);

        // Action untuk test tampilan
        btnHubungkan.addActionListener(e -> {
            new EmployeeFrame().setVisible(true);
            this.dispose(); // tutup frame login
        });

        btnBatal.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}
