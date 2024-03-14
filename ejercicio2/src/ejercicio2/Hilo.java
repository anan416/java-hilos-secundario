package ejercicio2;

import java.util.Arrays;

public class Hilo implements Runnable{
    public int[] _numeros;
    public int ide;

    public Hilo(int numeros, int[] nums){
        this.ide = numeros; 
        this._numeros = nums;
    }

    public void run(){
        System.out.println("ID: " + ide + ". Numeros: " + Arrays.toString(_numeros));
        ascendente(_numeros);
        System.out.println("Se ordenó ascendentemente el de ID " + ide + ". Numeros: " + Arrays.toString(_numeros));
        descendente(_numeros);
        System.out.println("Se ordenó descendentemente el de ID " + ide + ". Numeros: " + Arrays.toString(_numeros));
    }

    public static void ascendente(int[] numeros) {
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) { 
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }  
    public static void descendente(int[] numeros) {
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) { 
                if (numeros[j + 1] > numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
}
