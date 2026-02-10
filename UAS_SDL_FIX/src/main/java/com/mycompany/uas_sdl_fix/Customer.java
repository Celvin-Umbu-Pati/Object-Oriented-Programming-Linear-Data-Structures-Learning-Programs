/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uas_sdl_fix;
/**
 *
 * @author Celvin Pati
 */
public class Customer {
    private String name;        //Nama pelangan
    private String memberType;  //Tipe member (gold, silver, platinum, dan non member)
    private double points;      //Jumlah point yang diiliki oleh pelangan

    public Customer(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
        this.points = 0;
    }

    //Untuk akses nama pelangan
    public String getName() { return name; }

    //Untuk tipe member
    public String getMemberType() { return memberType; }

    //Untuk total poin yang dimiliki oleh pelangan
    public double getPoints() { return points; }
    
    public void addPoints(double amount) { //untuk pengumpulan poin
        this.points += amount; 
    }
}