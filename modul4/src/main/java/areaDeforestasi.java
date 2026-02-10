/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class areaDeforestasi {
     public static void main(String[] args) {

        int[] deforestasi = {5, 1500, 266, 32, 7500, 94, 130, 108, 2190, 75};
        
        int totalArea = hitungTotalArea(deforestasi);
        double rataRata = hitungRataRata(deforestasi);
        
        System.out.println("Total Area Deforestasi: " + totalArea + " hektar");
        System.out.println("Rata-rata Total Area Deforestasi: " + rataRata + " hektar");
        
        for (int area : deforestasi) {
            String kategori = tentukanKategori(area);
            System.out.println("Area: " + area + " hektar - Kategori: " + kategori);
        }
    }

    // untuk menghitung total area
    public static int hitungTotalArea(int[] deforestasi) {
        int total = 0;
        for (int area : deforestasi) {
            total += area;
        }
        return total;
    }

    //untuk menghitung rata-rata area
    public static double hitungRataRata(int[] deforestasi) {
        return (double) hitungTotalArea(deforestasi) / deforestasi.length;
    }

    //ntuk menentukan kategori tingkat deforestasi
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




    
    

