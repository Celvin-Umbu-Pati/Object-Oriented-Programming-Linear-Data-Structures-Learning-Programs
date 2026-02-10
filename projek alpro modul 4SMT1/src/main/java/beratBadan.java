
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class beratBadan {
   
    public static void main (String[]args){
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println(" masukkan nama pasien anda :");
        String nama = keyboard.next();
        
        System.out.println(" masukan tinggi badan pasien :");
        int tinggi = keyboard.nextInt();
        
        System.out.println(" masukkan berat badan pasien :");
        int berat = keyboard.nextInt();
        
        int selisih = tinggi - berat;
        
        if (90<= selisih && selisih>=110) {
            System.out.println(nama + " mempunyai berat badan ideal");
        }else if( selisih <90){
            System.out.println(nama+" mempunyai berat badan terlalu kurus");
            
        }else{
            System.out.println(nama + " mempunyai berat badan terlalu gemuk");
        }
        
      
          
            
            
        }
    }
  




