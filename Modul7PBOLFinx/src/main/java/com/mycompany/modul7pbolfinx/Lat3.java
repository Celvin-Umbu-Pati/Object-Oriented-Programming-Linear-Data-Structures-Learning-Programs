/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7pbolfinx;

/**
 *
 * @author Celvin Pati
 */
import javax.swing.JOptionPane;

public class Lat3 {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda!");
        int age = 0; 

        try {
            age = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "'" + inputStr + "' bukan angka yang valid. Silakan masukkan angka saja.");
        }

        System.out.println("Umur anda : " + age + " tahun");
    }
}

