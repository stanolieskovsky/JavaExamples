/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;


/**
 *
 * @author liesko3
 */
public class Generator {
public static Random nasada = new Random();
    Random randde1;

    Random randsr;
 

    public Generator() {
        randde1 = new Random(nasada.nextLong());
        randsr = new Random(nasada.nextLong());

    }

    public int genDiskretne(int min, int max) {
        int hodnota = randde1.nextInt((max - min) + 1) + min;
       // System.out.println(""+hodnota);
        return hodnota;
    }

    public double genRovnomerne() {
        double hodnota = randsr.nextDouble();
        return hodnota;
    }

    public Random getRandde1() {
        return randde1;
    }

    public void setRandde1(Random randde1) {
        this.randde1 = randde1;
    }


    public Random getRandsr() {
        return randsr;
    }

    public void setRandsr(Random randsr) {
        this.randsr = randsr;
    }


}
