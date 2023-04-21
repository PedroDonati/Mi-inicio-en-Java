package límite;

import java.util.Scanner;

public class Limite {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limit = 100, n, n2;
        n2 = 0;
        do{
         System.out.println("Ingrese un valor");
         n = leer.nextInt();
         n2 = n + n2;
        }while (n2 < limit);
        if (limit < n2){
         System.out.println("Límite superado con; " + n2);
        }
    }
    
}
