
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class suhuConveter2 {
   public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan 10 nilai suhu dalam derajat Celcius:");

        // Loop untuk menerima 10 nilai suhu Celcius dari pengguna
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai suhu ke-" + i + ": ");
            int celcius = keyboard.nextInt(); // Menerima input suhu Celcius dari pengguna

            // Menghitung nilai suhu dalam derajat Reamur dan Fahrenheit
            double reamur = (4.0 / 5.0) * celcius;
            int fahrenheit = (int)((9.0 / 5.0) * celcius + 32);

            // Mencetak tabel konversi suhu Celcius ke Reamur dan Fahrenheit
            System.out.println("Masukan suhu Celcius: " + celcius);
            System.out.println("Hasil konversi Reamur: " + reamur);
            System.out.println("Hasil konversi Fahrenheit: " + fahrenheit);
            System.out.println("===================================");
        }//akhir loop

    }//akhir metode utama
}//akhir class

