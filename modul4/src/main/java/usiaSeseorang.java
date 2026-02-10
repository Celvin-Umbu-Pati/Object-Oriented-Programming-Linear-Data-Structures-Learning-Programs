
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Celvin Pati
 */
public class usiaSeseorang {//awal program
    public static void main (String[]args){//program java untuk membandigkan umur seseorang
       
        Scanner keyboard = new Scanner(System.in);
        //meminta user untuk menginput nama dan umur orang pertama lewat keyboard  
        System.out.println("Masukkan nama orang pertama: ");
        String namaPertama = keyboard.next();
        System.out.println("Masukkan umur orang Kedua: ");
        int umurPertama = keyboard.nextInt();
        //meminta user untuk memasukan nama dan umur orang kedua
        System.out.println("Masukkan nama orang kedua: ");
        String namaKedua = keyboard.next();
        System.out.println("Masukkan umur orang kedua: ");
        int umurKedua = keyboard.nextInt();
        //untuk melakukkan perbandingan orang pertama lebih muda atau lebih tua dari orang kedua
        if (umurPertama >= umurKedua ){
            System.out.println(namaPertama + " lebih tua dari " + namaKedua);
    }
        else {
            System.out.println(namaPertama + " lebih muda dari " + namaKedua);
        }     
}
}//akhir program