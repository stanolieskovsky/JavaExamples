
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liesko3
 */
public class Main {
 public static Random nasada = new Random();
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

    
    System.out.println("Hlavne vlákno spustene");
    Vlakno mojeVlakno2 = new Vlakno("Druhe",true,40, 60);
   // Vlakno mojeVlakno3 = new Vlakno("Tretie",true);
    mojeVlakno2.start();
   // mojeVlakno3.start();
   /* for(int i = 0; i < 6; ++i) {
        System.out.println("Hlavní vlákno: " + i);
        if(i==2){
        mojeVlakno2.setMax(80);}
        try {
            Thread.sleep(3750);
        } catch (InterruptedException ex) {
            System.out.println("Hlavní vlákno prerusene");
            return;
        }
    }
    System.out.println("Hlavní vlákno ukoncene");*/
   // mojeVlakno2.setIstrue(false);
  
}
    
}
