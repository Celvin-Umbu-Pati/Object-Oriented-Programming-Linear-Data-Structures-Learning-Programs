
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class suhuConveter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan suhu dalam Celsius
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double celsius = scanner.nextDouble();

        // Meminta pengguna memilih jenis konversi
        System.out.println("Pilih konversi:");
        System.out.println("1. Konversi ke Fahrenheit");
        System.out.println("2. Konversi ke Kelvin");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();

        // Menggunakan percabangan untuk menentukan hasil konversi
        if (pilihan == 1) {
            // Konversi ke Fahrenheit
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("Suhu dalam Fahrenheit: %.2f°F%n", fahrenheit);
        } else if (pilihan == 2) {
            // Konversi ke Kelvin
            double kelvin = celsius + 273;
            System.out.printf("Suhu dalam Kelvin: %.2f K%n", kelvin);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

       
    }
}
    

