/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */
public class Deforestasi {

    public static void main(String[] args) {
    
        int[] deforestasi = {5, 1500, 266, 32, 7500, 94, 130, 108, 2190, 75};

        int totalArea = hitungTotalArea(deforestasi);
        double rataRata = hitungRataRata(deforestasi);
        
        int jumlahHijau = 0;
        int jumlahOranye = 0;
        int jumlahMerah = 0;

        System.out.println("Daerah\tJml Area\tKategori");
        System.out.println("===================================");
        for (int i = 0; i < deforestasi.length; i++) {
            String kategori = tentukanKategori(deforestasi[i]);
            String output = (i + 1) + "\t" + deforestasi[i] + "\t\t" + kategori + "\n";
            System.out.print(output);
            
            // Hitung jumlah kategori
            if (kategori.equals("Hijau")) {
                jumlahHijau++;
            } else if (kategori.equals("Oranye")) {
                jumlahOranye++;
            } else {
                jumlahMerah++;
            }
        }

        System.out.println("===================================");
        System.out.printf("Jumlah total area\t\t=" +totalArea+  "hektar\n");
        System.out.printf("Rata-rata jumlah area\t\t=" +rataRata+ "hektar\n");
        System.out.printf("Jumlah daerah zona hijau\t=" +jumlahHijau+ "\n");
        System.out.printf("Jumlah daerah zona oranye\t=" +jumlahOranye+ "\n");
        System.out.printf("Jumlah daerah zona merah\t=" +jumlahMerah+ "\n");
    }

    // Method untuk menghitung total area
    public static int hitungTotalArea(int[] deforestasi) {
        int total = 0;
        for (int area : deforestasi) {
            total += area;
        }
        return total;
    }

    // Method untuk menghitung rata-rata area
    public static double hitungRataRata(int[] deforestasi) {
        return (double) hitungTotalArea(deforestasi) / deforestasi.length;
    }

    // Method untuk menentukan kategori tingkat deforestasi
    public static String tentukanKategori(int area) {
        if (area < 100) {
            return "Hijau";
        } else if (area >= 100 && area <= 1000) {
            return "Oranye";
        } else {
            return "Merah";
        }
    }
}

    

