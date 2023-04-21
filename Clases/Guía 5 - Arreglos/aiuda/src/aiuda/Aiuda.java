package aiuda;

import java.util.Random;
import java.util.Scanner;

public class Aiuda {

    public static void main(String[] args) {
        //1-TRAIGO EL LEER
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        //2-PREGUNTO LA CANTIDAD DE NUMEROS QUE VA A TENER EL VECTOR
        System.out.println("Ingrese la cantidad de subindices que tendra el vector");
        int n =leer.nextInt();
        //3-DECLARO VECTOR
        int[] arregloV = new int[n];
        //4-RELLENO EL VECTOR CON ALEATORIOS ENTRE 1 y 2
        for(int i = 0; i < n; i++) {
        arregloV[i] = random.nextInt(10000000);
        }
        //5-Pregunto CUAL ES EL NUMERO QUE QUIERO BUSCAR Y LO GUARDO EN UNA VARIABLE QUE DEBO DECLARAR PREVIAMENTE
        System.out.println("Ingrese el numero que desea buscar");
        int busco = leer.nextInt();
        //6-BUSCO COINSIDENCIAS RECORRIENDO EL VECTOR Y DONDE LAS EXISTA COMPARTO LA POSICION DEL VECTOR
        boolean encontrado = false;
        int contador = 0;
        
        for (int i=0; i <n; i++){
        if(arregloV[i] == busco){
            encontrado = true;
            contador++;
            System.out.println("El numero buscado está en la posición " + n );
        }
        }
        
        if(encontrado == false) {
        System.out.println("El numero " + busco + " no se encuentra en ninguna posicion");
        } else {
         //8-se encuentra repetido el numero?
        System.out.println("El numero " + busco + " se encuentra en la posición se repite " + contador + " de veces");
        }
    }
}