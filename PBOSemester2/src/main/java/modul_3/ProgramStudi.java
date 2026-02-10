/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_3;

/**
 *
 * @author Celvin Pati
 */
public class ProgramStudi {

    private String kodeProdi;
    private String namaProdi;
    private Dosen ketuaProdi;
    
   public ProgramStudi(String kodeProdi, String namaProdi, Dosen ketuaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.ketuaProdi = ketuaProdi;
    }
   public String getNamaProdi() {
        return namaProdi;
    }
}

class Dosen {

    public String npp;
    public String nama;
    public String gelar;

    public Dosen(String npp, String nama, String gelar) {
        this.npp = npp;
        this.nama = nama;
        this.gelar = gelar;
    }
}
