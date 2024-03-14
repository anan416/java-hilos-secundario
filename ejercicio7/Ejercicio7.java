package com.mycompany.ejercicio7;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Hilo_escritor he = new Hilo_escritor();
        Hilo_lector hl = new Hilo_lector();
       
       
        Thread t1 = new Thread(hl);
        Thread t2 = new Thread(he);
     
        t1.start();
        t2.start();      
    }
    
}
