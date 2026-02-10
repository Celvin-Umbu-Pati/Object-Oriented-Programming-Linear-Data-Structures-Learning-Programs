
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Celvin Pati
 */
public class beratBadan {//awal program
   
    public static void main (String[]args){//program untuk melihat kondisi tubuh orang dengan input berat badan
        Scanner keyboard = new Scanner (System.in);
        //meminta input dari user untuk nama, tinggi, dan berat badan pasien lewat keyboard
        System.out.println(" masukkan nama anda :");
        String nama = keyboard.next();
        //input tinggi badan
        System.out.println(" masukan tinggi badan :");
        int tinggi = keyboard.nextInt();
        //input berat badan
        System.out.println(" masukkan berat badan :");
        int berat = keyboard.nextInt();
        //untuk deklarasi variabel selisih
        int selisih = tinggi - berat;
        //ubtuk melakukan kondisi tubuh pasien berdasarkan input
        if (90<= selisih && selisih>=110) {
            System.out.println(nama + " mempunyai berat badan ideal");
        }else if( selisih <90){
            System.out.println(nama+" mempunyai berat badan terlalu kurus");
        }else{
            System.out.println(nama + " mempunyai berat badan terlalu gemuk");
        }    
        }
    }//akhir program
  




