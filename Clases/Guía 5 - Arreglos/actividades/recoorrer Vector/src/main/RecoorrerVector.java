package main;

import java.util.Random;
import java.util.Scanner;

public class RecoorrerVector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la cantidad de subindices que tendra el vector");
        int n =leer.nextInt();
        int[] arregloV = new int[n];
        for(int i = 0; i < n; i++) {
        arregloV[i] = random.nextInt(3);
        }
        System.out.println("Ingrese el numero que desea buscar");
        int busco = leer.nextInt();
        
        boolean encontrado = false;
        int contador = 0;
        
        for (int i=0; i <n; i++){
        if(arregloV[n] == busco){
            encontrado = true;
            contador++;
            System.out.println("El numero buscado está en la posición " + n );
        }
        }
        
        if(!(encontrado = false)) {

            System.out.println("El numero " + busco + " se encuentra en la posición se repite " + contador + " de veces");
        } else {
            System.out.println("El numero " + busco + " no se encuentra en ninguna posicion");
        }
               
    }
    
}