package Main;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número");
        n = leer.nextInt();
        if ((n % 2) == 0){
            System.out.println("El n° " + n + " es par");
        } else {
            System.out.println("El n° " + n + " no es par");
        } 
    }
    
}
