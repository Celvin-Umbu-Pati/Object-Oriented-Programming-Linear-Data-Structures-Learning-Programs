/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class gajiPegawaiMain {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan NPP anda:");
        String NPP = keyboard.nextLine();
        System.out.print("Masukkan nama anda:");
        String nama = keyboard.nextLine();
        System.out.print("Masukkan status anda:");
        String status = keyboard.nextLine();
        System.out.print("Masukkan golongan 1,2,3 anda:");
        int golongan = keyboard.nextInt();
        System.out.print("Masukkan Jumlah anak anda:");
        int jumlahanak = keyboard.nextInt();

        gajiPegawai gaji = new gajiPegawai(NPP, nama, status, golongan, jumlahanak);

        System.out.println("Gaji pokok         : " + gaji.hitungGaji());
        System.out.println("Tunjangan Keluarga : " + gaji.hitungtunjangan());
        System.out.println("Gaji Total        : " + gaji.hitungTotslgaji());

    }
}
