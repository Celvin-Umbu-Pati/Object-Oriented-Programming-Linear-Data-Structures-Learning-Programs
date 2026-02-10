/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

/**
 *
 * @author Celvin Pati
 */
public class Buku {
      private String kodeBuku;
    private String judul;
    private String namaPengarang;
    private int tahunTerbit;
  
    public Buku(String kodeBuku, String judul, String namaPengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
       
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public int gettahunTerbit() {
        return tahunTerbit;
    }        
}


