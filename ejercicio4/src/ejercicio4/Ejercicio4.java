package ejercicio4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] ids = {1,2,3,4,5,6,7,8,9,10};
        int vuelta;
        boolean continuar;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                continuar = false;
                System.out.println("Ingrese la cantidad de vueltas: ");
                vuelta = sc.nextInt(); 
                
                Hilo h1 = new Hilo(ids[0], vuelta);
                Hilo h2 = new Hilo(ids[1], vuelta);
                Hilo h3 = new Hilo(ids[2], vuelta);
                Hilo h4 = new Hilo(ids[3], vuelta);
                Hilo h5 = new Hilo(ids[4], vuelta);
                Hilo h6 = new Hilo(ids[5], vuelta);
                Hilo h7 = new Hilo(ids[6], vuelta);
                Hilo h8 = new Hilo(ids[7], vuelta);
                Hilo h9 = new Hilo(ids[8], vuelta);
                Hilo h10 = new Hilo(ids[9], vuelta);        
       
                Thread t1 = new Thread(h1);
                Thread t2 = new Thread(h2);
                Thread t3 = new Thread(h3);
                Thread t4 = new Thread(h4);
                Thread t5 = new Thread(h5);
                Thread t6 = new Thread(h6);
                Thread t7 = new Thread(h7);
                Thread t8 = new Thread(h8);
                Thread t9 = new Thread(h9);
                Thread t10 = new Thread(h10);        
       
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
                t6.start();
                t7.start();
                t8.start();
                t9.start();
                t10.start(); 
            }catch (InputMismatchException ex) {
                System.out.println("Lo ingresado no es un número entero. Ingrese de nuevo: ");
                sc.next();
                continuar = true;
            }
        }
        while(continuar);
    }
}
