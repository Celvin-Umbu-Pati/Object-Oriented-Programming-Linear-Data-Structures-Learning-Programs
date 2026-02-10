/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOmodul4;

/**
 *
 * @author Celvin Pati
 */
public class Dosen {
    private String nim;
    private String nama;
    private  Mahasiswa[]  bimbingan;
  
    public Dosen(String nim, String nama)  {
        this.nim=nim;
        this.nama=nama;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }

    public void setMahasiswa(Mahasiswa[] mhs) {
        this.bimbingan= mhs;
    }
   
    public Mahasiswa[] getMahasiswa() {
        return bimbingan;
    }
}

