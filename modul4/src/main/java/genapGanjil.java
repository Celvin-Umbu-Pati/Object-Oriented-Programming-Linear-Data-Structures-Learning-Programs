
import java.util.Scanner;

 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class genapGanjil {//awal program
    public static void main (String[]args) {
      
        //membuat objec scanner untuk membaca bilangan ganjil genap dari keyboard    
      
       Scanner keyboard = new Scanner (System.in);
      
       //memintah pengguna untuk memasukan sebuah bilangan
      
       System.out.println("masukkan sebuah bilangan bulat  :");
       int bilangan = keyboard.nextInt();
       
       //mengecek apakah bilangan ganjil atau genap
       
       if (bilangan % 2 == 0){
           System.out.println(bilangan + " adalah bilangan genap.");
       }
       else {
           System.out.println(bilangan + "  adalah bilangan ganjil.");
       } 
}
}//akhir program