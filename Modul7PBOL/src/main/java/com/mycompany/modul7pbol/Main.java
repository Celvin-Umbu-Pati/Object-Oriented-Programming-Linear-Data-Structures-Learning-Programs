/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul7pbol;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Age:");
        int age; // deklarasi variabel age

        try {
            age = Integer.parseInt(inputStr);
            JOptionPane.showMessageDialog(null, "Your age is: " + age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "'" + inputStr 
                + "' is invalid\nPlease enter digits only");
        } finally {
            JOptionPane.showMessageDialog(null, "Input Umur selesai");
        }
    }
}


