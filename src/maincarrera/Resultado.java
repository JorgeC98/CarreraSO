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
class Resultado {
    
 private static int place = 1;
 String name; 
    
    public static void finished(String name){
        System.out.println("Equipo "+ name + " termino en el lugar: #" + place);
        place++;
    }
    
}
