
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class switchDemo {//awal dari class switchDemo
    public static void main(String[] args) {//awal dari metode utama
    Scanner keyboard = new Scanner(System.in);//membuat objek scanner untuk input nama bulan lewat keyboard

        System.out.println("Masukkan bulan:");//untuk meminta input bulan pada pengguna
        int month = keyboard.nextInt();
String monthString;//deklarasi variabel monthString untuk menyimpan nama bulaan
switch (month) {//meulai pernyataan switch untuk memeriksa nilai month
case 1: monthString = "January";//mengatur monthString ke januari
    break;// Keluar dari switch
case 2: monthString = " February ";//mengatur monthString ke februari
    break;// Keluar dari switch
case 3: monthString = " March ";//mengatur monthString ke maret
    break;// Keluar dari switch
case 4: monthString = " April ";//mengatur monthString ke april
    break;// Keluar dari switch
case 5: monthString = " May ";//mengatur monthString ke may
    break;// Keluar dari switch
case 6: monthString = " June ";//mengatur monthString ke juni
    break;// Keluar dari switch
case 7: monthString = " July ";//mengatur monthString ke juli
    break;// Keluar dari switch
case 8: monthString = " August ";//mengatur monthString ke agustus
    break;// Keluar dari switch
case 9: monthString = " September ";//mengatur monthString ke september
    break;// Keluar dari switch
case 10: monthString = " October ";//mengatur monthString ke oktober
    break;// Keluar dari switch
case 11: monthString = " November ";//mengatur monthString ke november
    break;// Keluar dari switch 
case 12: monthString = " December ";//mengatur monthString ke desember
    break;// Keluar dari switch
default: monthString = "Invalid month";//mengatur monthString ke invalid month
    break;// Keluar dari switch
}
System.out.println(monthString);// Mencetak nama bulan atau pesan bahwa ada kesalahan ke konsol
 }//akhir dari metode utama
 }//akhir dari class switchDemo

