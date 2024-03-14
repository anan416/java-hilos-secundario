package com.mycompany.ejercicio8;

import java.util.concurrent.Semaphore;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Hilo extends Thread{
    public static Semaphore osemaforo=new Semaphore(1);
    public int ide;
    public int boletos;
    public String comprador;

    /**
     *
     */
    public static int butacas = 10;
    
    public Hilo(int identificador, int ticket, String cliente){ 
        this.ide = identificador; 
        this.boletos = ticket;
        this.comprador = cliente;
     }
 
    public void run(){
        System.out.println("Boletos del vendedor " + ide + ": " + boletos);
        try {
            venta();
        } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public void venta() throws IOException{ 
        try{
            File archivo = new File("compradores.dat");
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            osemaforo.acquire();
            int ventas = (int)(Math.random() * 10 + 1);
            if (ventas <= butacas){
                boletos = boletos - ventas;
                butacas = butacas - boletos;
            }
            else{
                boletos = boletos - boletos;
                butacas = butacas - boletos;    
            }
            System.out.println("El vendedor " + ide + " vendio " + boletos + " tickets al cliente " + comprador + " y quedan " + butacas + " butacas");
            
            bw.write(comprador);
            bw.close();
        }catch (InterruptedException ex) {

        }
        finally{
            osemaforo.release();
        } 
        
       
    }
}
