package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        int vector1[], vector2[];
        vector1 = new int[200];
        vector2 = new int[200];
        int[] ids = {1,2};
        for (int i = 0; i <= 199; i++){
            vector1[i] = (int)(Math.random() * 999 + 100);
            vector2[i] = (int)(Math.random() * 999 + 100);
        }
        
        Hilo h1 = new Hilo(ids[0], vector1);
        Hilo h2 = new Hilo(ids[1], vector2);
       
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
       
        t1.start();
        t2.start();
        
    }
    
}
