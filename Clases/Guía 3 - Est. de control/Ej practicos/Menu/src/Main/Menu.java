package Main;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       float n1, n2, suma, resta, multi, divi; 
       int opcion;
       boolean s = false;
            while(!s){
            System.out.println("*** MENU ***");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija su opcion");
            opcion = leer.nextInt();
            switch(opcion){
            case 1 : 
                 System.out.println("Ingrese un número");
                 n1 = leer.nextFloat();
                 System.out.println("Ingrese otro número");
                 n2 = leer.nextFloat();
                 suma = n1 + n2;
                 System.out.print("El resultado es" + suma);
                 break;
            case 2 :
                 System.out.println("Ingrese un número");
                 n1 = leer.nextFloat();
                 System.out.println("Ingrese otro número");
                 n2 = leer.nextFloat();
                 resta = n1 - n2;
                 System.out.println("El resultado es: " + resta);
            break;
            case 3 : 
                 System.out.println("Ingrese un número");
                 n1 = leer.nextFloat();
                 System.out.println("Ingrese otro número");
                 n2 = leer.nextFloat(); 
                multi = n1 * n2;
                 System.out.println("El resultado es: " + multi);
            break;
            case 4 :
                 System.out.println("Ingrese un número");
                 n1 = leer.nextFloat();
                 System.out.println("Ingrese otro número");
                 n2 = leer.nextFloat();
                 divi = n1 / n2;
                 System.out.println("El resultado es: " + divi);
            break;
            case 5 : 
                 System.out.println("Adiós");
                 s = true ;
            break;
            }
        }
    }   
}
