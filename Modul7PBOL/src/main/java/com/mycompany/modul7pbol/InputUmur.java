/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7pbol;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JOptionPane;

public class InputUmur {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Age:");
        int age; // deklarasi variabel age

        try {
            getAge(inputStr);
            JOptionPane.showMessageDialog(null, "Sukses");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "'" + inputStr 
                    +"' is invalid\n"
                    + "Please enter digits only");
        } finally {
            JOptionPane.showMessageDialog(null, "Input Umur selesai");
        }
    }
    public static int getAge(String inputStr)throws NumberFormatException{
        int age = Integer.parseInt(inputStr);
        return age;
    }
}