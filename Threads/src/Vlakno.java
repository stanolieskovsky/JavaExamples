/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liesko3
 */
class Vlakno extends Thread {
 boolean istrue;
 int i=1;
 int min;
 int max;
 Generator gen=new Generator();
    public Vlakno(String jmeno,boolean paspustene, int pamin,int pamax) {
        super(jmeno);
        istrue=paspustene;
           min=pamin;
           max=pamax;
    
    }
    @Override
    public void run() {
        System.out.println("Vlákno " + getName() + " spustene");
        while(istrue==true) {
            i=gen.genDiskretne(min, max);
            System.out.println("Vlákno " + getName() + ": " +" min,max<"+min+","+max+">"+"hodnota"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Vlákno " + getName() + " prerusene");
                return;
            }
        }
        System.out.println("Vlákno " + getName() + " ukončene");
    }

    public boolean isIstrue() {
        return istrue;
    }

    public void setIstrue(boolean istrue) {
        this.istrue = istrue;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Generator getGen() {
        return gen;
    }

    public void setGen(Generator gen) {
        this.gen = gen;
    }
    
}