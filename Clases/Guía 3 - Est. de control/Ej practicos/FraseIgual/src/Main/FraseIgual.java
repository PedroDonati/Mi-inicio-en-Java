package Main;

import java.util.Scanner;

public class FraseIgual {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, frase1;
        boolean verificacion;
        frase = "Eureka";
        System.out.println("Escribe la contraseña");
        frase1 = leer.next();
        if (frase1.equals(frase)){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
