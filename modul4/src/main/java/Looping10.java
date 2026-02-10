/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Looping10 {
    public static void main (String [] args){
         System.out.println("Perulangan ke  Jml  Bilangan");
        System.out.println("==================");
        int jumlah = 0, bilangan = 0, i = 1;
        while (bilangan < 10){
            
                jumlah = jumlah + bilangan;
                bilangan = bilangan + 2;
                System.out.println(" " + i + " "+ jumlah +" "+ bilangan);
                i = i + 1;
        }
        
    }
}
