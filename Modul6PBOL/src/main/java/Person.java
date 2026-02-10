/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Person {
    private String nip;
    private String nama;
    private String jenisKelamin;
    private String status;
    private String agama;
    private String alamat;

    public Person(String nip, String nama, String jenisKelamin, String status, String agama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.agama = agama;
        this.alamat = alamat;
    }

    public String getNip() { return nip; }
    public String getNama() { return nama; }
    public String getJenisKelamin() { return jenisKelamin; }
    public String getStatus() { return status; }
    public String getAgama() { return agama; }
    public String getAlamat() { return alamat; }

    @Override
    public String toString() {
        return "NIP: " + nip +
               "\nNama: " + nama +
               "\nJenis Kelamin: " + jenisKelamin +
               "\nStatus: " + status +
               "\nAgama: " + agama +
               "\nAlamat: " + alamat;
    }
}
