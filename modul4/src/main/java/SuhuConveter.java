/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class SuhuConveter {
    // Mendefinisikan sebuah kelas bernama SuhuConverter
    // Semua kode program akan berada di dalam kelas ini
    
    public static void main(String[] args) {
        // Metode main() adalah titik masuk program
        // Semua eksekusi program akan dimulai dari sini

        // Mendefinisikan batas minimum dan maksimum suhu dalam derajat Celcius
        int celciusMin = 0;
        int celciusMax = 100;
        int celciusIncrement = 20;
        int celcius;

        // Mencetak judul dan informasi tentang tabel konversi suhu
        System.out.println("Tabel Konversi Celcius ke Reamur dan Fahrenheit");
        System.out.println("Nilai suhu minimum: " + celciusMin);
        System.out.println("Nilai suhu maksimum: " + celciusMax);
        System.out.println("Kenaikan: " + celciusIncrement);
        System.out.println("Celcius\tReamur\tFahrenheit");
        System.out.println("=================================");

        // Melakukan loop untuk menghitung dan mencetak tabel konversi suhu
        for (celcius = celciusMin; celcius <= celciusMax; celcius += celciusIncrement) {
            // Menghitung nilai suhu dalam derajat Reamur dan Fahrenheit
            // menggunakan rumus yang diberikan
            int reamur = (int) Math.round((4.0 / 5.0) * celcius);
            int fahrenheit = (int) Math.round((9.0 / 5.0) * celcius + 32);

            // Mencetak nilai suhu Celcius, Reamur, dan Fahrenheit dalam format tabel
            System.out.println(celcius + "\t" + reamur + "\t" + fahrenheit);
        }//akhir looping
    }//akhit metode utama
}//akhir class