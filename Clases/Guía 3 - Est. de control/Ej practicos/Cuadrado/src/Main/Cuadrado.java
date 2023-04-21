package Main;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int n = leer.nextInt();
        for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1 || j == n) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
        }   
    }
}