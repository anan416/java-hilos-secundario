package ejercicio6;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] ids = {1,2,3,4,5};
        ArrayList<String> entrada = new ArrayList();
        
        Hilo h1 = new Hilo(ids[0], entrada);
        Hilo h2 = new Hilo(ids[1], entrada);
        Hilo h3 = new Hilo(ids[2], entrada);
        Hilo h4 = new Hilo(ids[3], entrada);
        Hilo h5 = new Hilo(ids[4], entrada);
       
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
    }
}