/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbosemester2;

/**
 *
 * @author Celvin Pati
 */ 
public class Buku {
    
    //atribut private
    
    private String judul;
    private String pengarang;
    private String ISBN;
    private String penerbit;
    private String kategori;
    
    //kosnstruktor dengan parameter judul dan ISBN
    
    public Buku(String jdl, String isbn){
        judul = jdl;
        ISBN = isbn;
    }


//method pinjam bertipe public

public void pinjam(){
System.out.println(judul+" "+ISBN +" Sedang pinjam");
}
public void kembali(){
    System.out.println(judul+" "+ISBN +" Sudah dikembalikan");
}
}