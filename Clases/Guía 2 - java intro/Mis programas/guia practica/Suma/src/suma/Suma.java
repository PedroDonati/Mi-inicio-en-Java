package suma;

import java.util.Scanner;

public class Suma {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1,n2,n3;
        System.out.println("Ingrese numero 1");
        n1 =leer.nextInt();
        System.out.println("Ingrese numero 2");
        n2 = leer.nextInt();
        n3 = n1 + n2;
       System.out.println(n1+"+"+n2+"="+n3);
    }
    
}
