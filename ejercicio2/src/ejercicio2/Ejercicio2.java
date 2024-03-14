package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] ids = {1,2};
        int[] vector1 = {6,2,8,4,1,7,8,3,5,10,9};
        int[] vector2 = {10,4,8,2,6,3,1,9,5,7};
     
        Hilo h1 = new Hilo(ids[0], vector1);
        Hilo h2 = new Hilo(ids[1], vector2);
       
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
       
        t1.start();
        t2.start();
    }
    
}
