/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
public class Customer {
    private String id;
    private String name;
    private String phone;
    private String memberType;
    private double points;

    public Customer(String id, String name, String phone, String memberType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.memberType = memberType;
        this.points = 0;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getMemberType() { return memberType; }
    public double getPoints() { return points; }

    public void addPoints(double amount) {
        this.points += amount;
    }
}