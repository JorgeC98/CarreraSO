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

public class MainCarrera {
    
 public static void main(String args[]) {

        Equipo rojo = new Equipo("Rojo");
        Equipo azul = new Equipo("Azul");
        Equipo rosa = new Equipo("Rosa");
        Equipo amarillo = new Equipo("Amarillo");
        Corredor r1 = new Corredor (rojo,"runner");
        Corredor r2 = new Corredor(rojo,"veloz");
        Corredor r3 = new Corredor(rojo,"viento");
        Corredor a1 = new Corredor(azul,"flash");
        Corredor a2 = new Corredor(azul,"quick");
        Corredor a3 = new Corredor(azul,"faster");
        Corredor o1 = new Corredor(rosa,"demon");
        Corredor o2 = new Corredor(rosa,"light");
        Corredor o3 = new Corredor(rosa,"rayo");
        Corredor m1 = new Corredor(amarillo,"trueno");
        Corredor m2 = new Corredor(amarillo,"crack");
        Corredor m3 = new Corredor(amarillo,"relampago");
        
        
    }
    
}

