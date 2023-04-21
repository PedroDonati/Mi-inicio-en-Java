package mainn;

import java.util.Scanner;

public class NroPrimo {

    public static void main(String[] args) {
        primo();
    }
    public static void primo(){
        Scanner sc = new Scanner(System.in);
        boolean primito = true;
        int n;
        String continuar;
        
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();

            primito = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primito = false;
                    break;
                }
            }

            if (primito) {
                System.out.println("El número " + n + " es primo");
            } else {
                System.out.println("El número " + n + " no es primo");
            }
            
            System.out.print("¿Desea continuar? (s/n): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));
    }
}
