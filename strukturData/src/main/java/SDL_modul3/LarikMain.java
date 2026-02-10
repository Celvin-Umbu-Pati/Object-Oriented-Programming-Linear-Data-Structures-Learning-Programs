/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SDL_modul3;

import static SDL_modul3.Larik.bacaData;
import static SDL_modul3.Larik.bubbleSort;
import static SDL_modul3.Larik.tampilkanLarik;
import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class LarikMain {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam larik: ");
        int jumlah = scanner.nextInt();
        int[] larik = new int[jumlah];

        bacaData(larik);
        
        System.out.println("Larik sebelum diurutkan:");
        tampilkanLarik(larik);

        bubbleSort(larik);
        
        System.out.println("Larik setelah diurutkan:");
        tampilkanLarik(larik);
    }
}

