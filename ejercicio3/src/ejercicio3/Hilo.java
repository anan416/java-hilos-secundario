package ejercicio3;

import java.util.Arrays;

public class Hilo implements Runnable {
    public int[] _numeros;
    public int ide;
 
    public Hilo(int identificador, int[] vector){
        this.ide = identificador; 
        this._numeros = vector;
     }
 
    public void run(){
        System.out.println("La suma del vector " + ide + " es: " + resultadoVector());
    }
    
    public int resultadoVector(){
        int resultado = 0;
        for (int i = 0; i <= 199; i++){
            resultado += _numeros[i];
        }
        return resultado;
    }

}