/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author Celvin Pati
 */
public class penerbit {
       private String namaPenerbit;
        private String alamat;
        private int tahunBerdiri;

        public penerbit(String namaPenerbit, String alamat, int tahunBerdiri) {
            this.namaPenerbit = namaPenerbit;
            this.alamat = alamat;
            this.tahunBerdiri = tahunBerdiri;
        }

        public String getnamaPenerbit() {
            return namaPenerbit;
        }

        public String getalamat() {
            return alamat;
        }

        public int gettahunBerdiri() {
            return tahunBerdiri;
        }
}


