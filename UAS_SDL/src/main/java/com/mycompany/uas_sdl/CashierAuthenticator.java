/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_sdl;

/**
 *
 * @author Celvin Pati
 */
public class CashierAuthenticator {
    public boolean authenticate(String username, String password) {
        return username.equals("kasir01") && password.equals("kasir123");
    }

    public String getCashierName(String username) {
        return "Agung Setiawan";
    }
}