/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul10pbo;

/**
 *
 * @author Celvin Pati
 */
class Pemasaran extends Pegawai {
    protected double bonus; // Besar bonus 
    // Getter bonus
    public double getBonus() {
        return bonus;
    }
    // Setter bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    // Implementasi status
    @Override
    String getStatus() {
        return "Pemasaran";
    }
    // Implementasi tunjangan
    @Override
    double getTunjangan() {
        return bonus;
    }
    // Implementasi total gaji
    @Override
    double hitungGatot() {
        return getGapok() + bonus;
    }
    // Implementasi email: nip@marketing.usd.ac.id
    @Override
    public String getEmail() {
        return getNpp() + "@marketing.usd.ac.id";
    }
}
