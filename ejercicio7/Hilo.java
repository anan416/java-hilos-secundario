package com.mycompany.ejercicio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.concurrent.Semaphore;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo{
    public static Semaphore osemaforo = new Semaphore(1);
    public String palabras;
    public int cant_palabras;
    public String cont[];
    
    public int leer() throws IOException{
        FileReader ArchivoLeyendo = new FileReader("ejercicio7.txt");
        BufferedReader lectura = new BufferedReader(ArchivoLeyendo);
        try{
            palabras = lectura.readLine();
            cont = palabras.split(" ");
            cant_palabras = cont.length;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        lectura.close();
        return cant_palabras;
    }
    
    public void escribir() throws IOException{
        FileReader ArchivoLeyendo = new FileReader("ejercicio7.txt");
        BufferedReader lectura = new BufferedReader(ArchivoLeyendo);
        try{
            palabras = lectura.readLine();
            while(palabras != null){
                System.out.println(palabras);
                palabras = lectura.readLine();
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

   