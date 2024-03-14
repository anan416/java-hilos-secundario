package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] ids = {0,1,2,3,4};
        String nombres[];
        nombres = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 5 nombres: ");
        for(int i = 0; i <= 4; i++){
            System.out.print(i + "-");
            nombres[i] = sc.nextLine();   
        }
        
        Hilo h1 = new Hilo(ids[0], nombres);
        Hilo h2 = new Hilo(ids[1], nombres);
        Hilo h3 = new Hilo(ids[2], nombres);
        Hilo h4 = new Hilo(ids[3], nombres);
        Hilo h5 = new Hilo(ids[4], nombres);
    
       
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