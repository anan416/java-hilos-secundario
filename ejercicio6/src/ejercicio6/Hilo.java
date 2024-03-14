package ejercicio6;

import java.util.concurrent.Semaphore;
import java.util.ArrayList;


public class Hilo extends Thread{
    static Semaphore osemaforo = new Semaphore(1);
    public int ide;
    public ArrayList<String> clientes = new ArrayList();
    
    public Hilo(int identificador, ArrayList<String> cliente){ 
        this.ide = identificador; 
        this.clientes = cliente;
     }
 
    public void run(){
        entrada_cliente();
    }
    
    public void entrada_cliente(){
    
        int tiempo;
        try{
            osemaforo.acquire();
            System.out.println("Entró el cliente " + ide);   
            tiempo = ((int)(Math.random() * 10 + 1)); 
            Thread.sleep(tiempo * 1000);
            System.out.println("Salió el cliente " + ide);
            clientes.add(Integer.toString(ide));
            osemaforo.release();
        } catch(InterruptedException ex){}

    }
}