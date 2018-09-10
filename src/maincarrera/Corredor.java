/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincarrera;

/**
 *
 * @author JorgeRicardo
 */

public class Corredor extends Thread {

	String str;
    Equipo team;
    
    public Corredor(Equipo target,String name) {
        team = target;
        str = name;

        start();
    }

    
    @Override
    public void run() {
        synchronized (team){
            for (int i = 1; i <= 100; i++) {
                String name = str;
                if (i==100){
                    System.out.format("%s ran his distance\n", name);
                    team.display();
                }
            }
        }
    }

    
}