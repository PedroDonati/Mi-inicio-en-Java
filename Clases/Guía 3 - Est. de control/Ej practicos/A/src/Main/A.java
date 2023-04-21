package Main;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, f, letra = "a";
        System.out.println("Ingrese una frase");
        frase = leer.next();
        f = frase.substring(0, 1);
        if (letra.equals(frase.substring(0,1))){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
