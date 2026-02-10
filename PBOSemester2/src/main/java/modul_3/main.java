/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

/**
 *
 * @author Celvin Pati
 */
public class main {
  public static void main(String [] args){
      
        penerbit penerbit1 = new penerbit("Gramedia", "Jakarta", 1970);

       
        Buku buku1 = new Buku("B001", "Belajar Java", "John Doe", 2015);

    
        System.out.println("Informasi Buku:");
        System.out.println("Kode Buku\t\t: " + buku1.getKodeBuku());
        System.out.println("Judul\t\t\t: " + buku1.getJudul());
        System.out.println("Pengarang\t\t: " + buku1.getNamaPengarang());
        System.out.println("Tahun Terbit\t\t: " + buku1.gettahunTerbit());

       
        System.out.println("Informasi Penerbit:");
        System.out.println("Nama Penerbit\t\t: " + penerbit1.getnamaPenerbit());
        System.out.println("Alamat\t\t\t: " + penerbit1.getalamat());
        System.out.println("Tahun Berdiri\t\t: " + penerbit1.gettahunBerdiri());

    
        int tahunSekarang = 2019;
        if (tahunSekarang - buku1.gettahunTerbit() > 5) {
            System.out.println("\t\t\tBUKU LAMA");
        } else {
            System.out.println("\t\t\tBUKU BARU");
        }
    }   
}
