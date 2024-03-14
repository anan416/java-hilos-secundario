package com.mycompany.ejercicio7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_lector implements Runnable{
    Hilo a = new Hilo();
    
    public void run(){
        int cantidad;
        try {
            cantidad = a.leer();
            System.out.println("El primer hilo leyo y encontro " + cantidad + " palabras");
        } catch (IOException ex) {
            Logger.getLogger(Hilo_lector.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
