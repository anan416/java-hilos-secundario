package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] ids = {1,2,3};
        int[] vector1 = {6,2,8,4,1,7,8,3,5,10,9};
        int[] vector2 = {10,4,8,2,6,3,1,9,5,7};
        int[] vector3 = {3,7,1,9,6,2,5,4,10,8};
       
        Hilo h1 = new Hilo(ids[0], vector1);
        Hilo h2 = new Hilo(ids[1], vector2);
        Hilo h3 = new Hilo(ids[2], vector3);
       
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);
       
        t1.start();
        t2.start();
        t3.start();
    }
}
