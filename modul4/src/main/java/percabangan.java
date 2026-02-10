


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class percabangan {
    
  public static void main(String[] args){
     int number = 1;
     int k = number + 9 * number + 1;
     if ((number > 0)&& (number < 10))number = number + 10;
     else number = ++k;
     System.out.println("k =" + k);
     System.out.println("number =" + number);
  }
}