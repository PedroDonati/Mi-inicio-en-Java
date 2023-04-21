package matematica;

import java.util.Scanner;

public class Matematica {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       double n, nd, nt, nrc;
       System.out.println("Ingrese un número");
       n = leer.nextDouble();
       nd = n * 2;
       nt = n * 3;
       nrc = Math.sqrt(n);
       System.out.print("Número base: " + n + ". El doble: " + nd + ". El triple: " + nt + ". La raíz cuadrada: " + nrc);
    }
    
}
