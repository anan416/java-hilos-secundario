package ejercicio4;

public class Hilo implements Runnable{
    public int ide, meta;
 
    public Hilo(int identificador, int llegada){
        this.ide = identificador; 
        this.meta = llegada;
     }
 
    public void run(){
        System.out.println("El coche " + ide + " empieza la carrera!");
        carrera();
    }
    
    public void carrera(){
        boolean fin = false;
        int iteracion = 0;
        while(fin == false){
            iteracion += (int)(Math.random() * meta + 1);
            if (iteracion == meta | iteracion > meta){
                System.out.println("Llegó a la meta el coche " + ide + "!");
                fin = true;
            }
            else{
                System.out.println("El coche " + ide + " está en la vuelta " + iteracion);        
            }
            
        }

    }
   
}
