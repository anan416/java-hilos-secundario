package ejercicio10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio10 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] archivos = {"nombres1.txt","nombres2.txt","nombres3.txt","nombres4.txt", "nombres5.txt"};
        String nombres[] = {"juana","maria","juan", "carlos","isabella", "mario", "catalina", "ana", "julian"};
        int cant_nombres[] = {0,0,0,0,0,0,0,0,0};

        Hilo h1 = new Hilo(archivos[0], nombres, cant_nombres);
        Hilo h2 = new Hilo(archivos[1], nombres, cant_nombres);
        Hilo h3 = new Hilo(archivos[2], nombres, cant_nombres);
        Hilo h4 = new Hilo(archivos[3], nombres, cant_nombres);
        Hilo h5 = new Hilo(archivos[4], nombres, cant_nombres);
       
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);
        Thread t4 = new Thread(h4);
        Thread t5 = new Thread(h5);
     
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        for(int i = 0; i < nombres.length;i++){
            System.out.println(nombres[i] + " se repite " + cant_nombres[i] + " veces.");
        }
    }
    
}
