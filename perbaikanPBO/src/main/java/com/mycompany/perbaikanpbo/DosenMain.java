/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perbaikanpbo;

/**
 *
 * @author Celvin Pati
 */
public class DosenMain {
    public static void main(String[] args) {
        // 1. Membuat objek dari kelas Dosen
        Dosen ketua = new Dosen("12345", "Dr. Andi", "S.T., M.T."); // Membuat objek Dosen dengan NPP, nama, dan gelar

        // 2. Membuat objek dari kelas ProgramStudi
        ProgramStudi prodi = new ProgramStudi("TI", "Teknik Informatika", ketua); // Membuat objek ProgramStudi dengan kode, nama, dan ketuaProdi

        // 3. Menampilkan nama Program Studi dan ketua program studi (nama dan NPP)
        System.out.println("Nama Program Studi: " + prodi.getNamaProdi() + 
                           " diketuai oleh " + prodi.getKetuaProdi().getNama() + 
                           " (NPP: " + prodi.getKetuaProdi().getNpp() + ")");
    }
}

