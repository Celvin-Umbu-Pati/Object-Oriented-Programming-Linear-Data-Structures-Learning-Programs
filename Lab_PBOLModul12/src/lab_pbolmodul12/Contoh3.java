/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_pbolmodul12;

/**
 *
 * @author Celvin Pati
 */
public class Contoh3 extends Thread {
  public void run(){
      try{
          for (int x = 1; x <= 5; x++){
              System.out.println("Angka" + x);
              Thread.sleep(1000);
          }
      }catch (Exception exc){
          exc.printStackTrace();
      }
  }

  
    public static void main(String[] args) {
        Contoh1 out = new Contoh1();
        out.start();
    }
    
}
