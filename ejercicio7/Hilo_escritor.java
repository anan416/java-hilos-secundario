package com.mycompany.ejercicio7;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_escritor implements Runnable{
    Hilo h = new Hilo();
    
    public void run() {
        try{
            System.out.println("El hilo 2 va a escribir el texto: ");
            h.escribir();
        } catch (IOException ex) {
            Logger.getLogger(Hilo_lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
