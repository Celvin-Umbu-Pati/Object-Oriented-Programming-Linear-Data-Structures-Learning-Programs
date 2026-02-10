
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class discount {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Harga per barang
        int HARGA_PER_BARANG = 100000;
        // Persentase diskon
        double BESARNYA_DISCOUNT = 0.10;

        // Meminta input jumlah barang
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        int jumlahBarang = keyboard.nextInt();

        // Menghitung total harga
        int totalHarga = jumlahBarang * HARGA_PER_BARANG;

        // Menghitung diskon jika total harga mencapai 1 juta
        double diskon =(totalHarga * BESARNYA_DISCOUNT);
        
        if (totalHarga >= 1000000) {
             
           
        }
         
       System.out.println(" besar nya discount dari pembeli ini adalah :" +diskon);
    
    
}
}
