/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class animals {//awal program
    public static void main(String [] args) // Metode utama untuk menjalankan program
 {
 boolean rabbit = true;// Mendeklarasikan variabel rabbit dan menginisialisasi dengan true
 boolean donkey = false; // Mendeklarasikan variabel donkey dan menginisialisasi dengan false
 boolean leporidae = true;// Mendeklarasikan variabel leporidae dan menginisialisasi dengan true
 
    // Mengevaluasi kondisi untuk mencetak "DOG"
 if (rabbit & donkey | donkey & leporidae | donkey)
 System.out.print("DOG ");// Jika kondisi di atas benar, cetak "DOG"
 // Mengevaluasi kondisi untuk mencetak "CAT"
 if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
 System.out.println("CAT ");// Jika kondisi di atas benar, cetak "CAT"
 }//akhir metode utama
}//akhir program
    

