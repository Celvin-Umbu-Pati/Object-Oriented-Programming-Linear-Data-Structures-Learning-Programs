/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2;

/**
 *
 * @author Celvin Pati
 */
public class kalkulator {

    private int a, b;

    public kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int penjumlahan() {
        return a + b;
    }

    public int pengurangan() {
        return a - b;
    }

    public int perkalian() {
        return a * b;
    }

    public int pembagian() {
        return a / b;
    }
}
