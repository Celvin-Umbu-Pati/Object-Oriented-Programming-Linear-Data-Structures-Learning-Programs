
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class usiaSeseorang {
    public static void main (String[]args){
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan nama orang pertama: ");
        String namaPertama = keyboard.next();
        System.out.println("Masukkan umur orang pertama: ");
        int umurPertama = keyboard.nextInt();
        
        System.out.println("Masukkan nama orang kedua: ");
        String namaKedua = keyboard.next();
        System.out.println("Masukkan umur orang kedua: ");
        int umurKedua = keyboard.nextInt();
        
        if (umurPertama >= umurKedua ){
            System.out.println(namaPertama + " lebih tua dari " + namaKedua);
    }
        else {
            System.out.println(namaPertama + " lebih muda dari " + namaKedua);
        }
        
         
}
}