package ejercicio5;

public class Hilo implements Runnable {
    public String personas[];
    public int ide;
    
    public Hilo(int identificador,String competidores[]){ 
        this.ide = identificador;
        this.personas = competidores;
     }
 
    public void run(){
        System.out.println(personas[ide] + " empieza la carrera!");
        correr();
    }    
    
    public void correr(){
        int cant_obstaculos = 4;
        try{
            int obstaculo;        
            for (int i = 0; i <= cant_obstaculos; i++){
                obstaculo = ((int)(Math.random() * 10 + 1));
                Thread.sleep(obstaculo * 1000);
            }
            System.out.println(personas[ide] + " termino la carrera.");

            
        } catch(InterruptedException ex){
            
        }     
    }

}