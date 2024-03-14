package com.mycompany.ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] ids = {1,2};
        String[] clientes = {"Juana","Juan"};
        int tickets = 10;
        
        Hilo h1 = new Hilo(ids[0], tickets, clientes[0]);
        Hilo h2 = new Hilo(ids[1], tickets, clientes[1]);
       
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
     
        t1.start();
        t2.start();       
    }
    
}