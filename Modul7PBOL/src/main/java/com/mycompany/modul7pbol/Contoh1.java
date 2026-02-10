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

public class Contoh1 {
    public static void main(String[] args) throws Exception {
        String inputStr = JOptionPane.showInputDialog(null, "Age:");
        int age; // deklarasi variabel age

        try {
            getAge(inputStr);
            JOptionPane.showMessageDialog(null, "Sukses");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "'" + inputStr 
                    + "' is invalid\n"
                    + "Please enter digits only");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null, "Input Umur selesai");
        }
    }

    public static int getAge(String inputStr) throws Exception {
        int age = Integer.parseInt(inputStr);
        if (age > 100) {
            throw new Exception("Nggak Mungkin");
        }
        return age;
    }
}
