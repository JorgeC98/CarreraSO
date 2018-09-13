/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincarrera;

import java.util.Random;
/**
 *
 * @author JorgeRicardo
 */
public class Equipo extends Thread {

    String name;
    int mLeft = 4;
    Random rand = new Random(System.nanoTime());
    int max = 10000;
    int min = 1;
    

    public Equipo(String name) {
        this.name = name;
    }
    
    
    public void display(){
        mLeft--;
        if(mLeft==0){
            Resultado.finished(name);
        }
        if(mLeft==1){
            System.out.println("Equipo "+ name + " ha terminado");
        }
        try {
            Thread.sleep(rand.nextInt((max-min) + 1));
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
