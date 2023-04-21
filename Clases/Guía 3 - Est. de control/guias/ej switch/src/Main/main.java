package Main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción");
        System.out.println( "1. motor 1");
        System.out.println( "2. motor 2");
        System.out.println( "3. motor 3");
        System.out.println( "4. motor 4");
        int opcion;
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("Bomba de gasolina");
                break;
            case 3:
                System.out.println("Bomba de pasta alimenticia");
                break;
            case 4: 
                System.out.println("Bomba de hormigon");
                break;
                
            default:
                System.out.println("Error");
        }
    }
}
