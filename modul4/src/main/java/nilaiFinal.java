
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Celvin Pati
 */
public class nilaiFinal {//awal program
     public static void main(String[] args) {//program untuk menghitung nilai total dan final mahasiswa
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");// Meminta input nama mahasiswa dari user lewat keyboard
        String nama = keyboard.next();
        System.out.print("Masukkan nilai UTS1: "); //meminta input nilai uts1
        double uts1 = keyboard.nextDouble();
        System.out.print("Masukkan nilai UTS2: ");//meminta input nilai uts2
        double uts2 = keyboard.nextDouble();
        System.out.print("Masukkan nilai UAS: "); //meminta input nilai uas
        double uas = keyboard.nextDouble();
        double nilaiTotal = (0.30*uts1) + (0.30*uts2) + (0.40*uas);  // Menghitung nilai total
        char nilaiFinal; // Menentukan nilai final
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
        System.out.println("Nilai Total Mahasiswa Atas Nama " +nama+" Adalah : "+ nilaiTotal);// Menampilkan hasil
        System.out.println("Nilai Final Mahasiswa Atas Nama " +nama+" Adalah : "+nilaiFinal);// Menampilkan hasil
    }
}//akhir program
    

