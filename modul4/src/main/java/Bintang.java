/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Bintang {
public static void main(String[] args) {
// Menulis bintang( * ) memakai metode
bintang (5);// 5 bintang
bintang (7);// 7 bintang
bintang(10);// 10bintang
}
static void bintang(int n) {
System.out.print( n +" bintang : ");
for (int i = 1; i <= n; i++) System.out.print(" * ");System.out.println("");
}

}
