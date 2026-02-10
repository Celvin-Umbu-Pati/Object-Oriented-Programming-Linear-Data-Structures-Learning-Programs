/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;
import java.util.Scanner;
/**
 * @author Celvin Pati
 */
public class Pemangkatan {//awal kelas
        //ini adalah metode rekursif untuk melakukan pemangkatan
    public static int pangkat(int x, int y) {//awal metode rekursif
        //ini untuk jika y = 0 maka hasilnya 1
        if (y == 0) {
            return 1;
        }
        //rekursif untuk mengkalikan x dengan pangkat(x, y - 1)
        return x * pangkat(x, y - 1);
    }
        //ini adalah metode main untuk meminta pengguna memasukan bilangan x dan y 
    public static void main(String[] args) {//awal metode utama
        Scanner keyboard = new Scanner(System.in);
        
        //meminta user untuk memasukkan bilangan x dan y
        System.out.println("--Bilangan x Pangkat y--");
        System.out.println("Bilangan x : ");
        int x = keyboard.nextInt();
        System.out.println("Bilangan y : ");
        int y = keyboard.nextInt();

        //menghitung pemangkatan x dan y
        int hasil = pangkat(x, y);
        
        //mencetak hasil pemangkatan    
        System.out.println( x + " Dipangkatkan " + y + " = " + hasil);
    }//akhir metode utama
}//akhir kelas
