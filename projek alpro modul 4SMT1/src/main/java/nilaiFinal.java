
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class nilaiFinal {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Meminta input nilai UTS dan UAS
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = keyboard.next();
        
        System.out.print("Masukkan nilai UTS1: ");
        double uts1 = keyboard.nextDouble();
        
        System.out.print("Masukkan nilai UTS2: ");
        double uts2 = keyboard.nextDouble();
        
        System.out.print("Masukkan nilai UAS: ");
        double uas = keyboard.nextDouble();

        // Menghitung nilai total
        double nilaiTotal = (0.30*uts1) + (0.30*uts2) + (0.40*uas);

        // Menentukan nilai final
        char nilaiFinal;
        if (nilaiTotal >= 80) {
            nilaiFinal = 'A';
        } else if (nilaiTotal >= 65) {
            nilaiFinal = 'B';
        } else if (nilaiTotal >= 55) {
            nilaiFinal = 'C';
        } else if (nilaiTotal >= 50) {
            nilaiFinal = 'D';
        } else {
            nilaiFinal = 'E';
        }

        // Menampilkan hasil
        System.out.println("Nilai Total Mahasiswa Atas Nama " +nama+" Adalah : "+ nilaiTotal);
        System.out.println("Nilai Final Mahasiswa Atas Nama " +nama+" Adalah : "+nilaiFinal);

        
    }
}
    

