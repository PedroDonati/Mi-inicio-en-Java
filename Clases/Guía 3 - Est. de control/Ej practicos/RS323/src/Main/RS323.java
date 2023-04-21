package Main;

import java.util.Scanner;

public class RS323 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int largo, correctas, incorrectas;
        String primera, ultima, frase;
        
        correctas = 0;
        incorrectas = 0;
               
        do {        
            
        System.out.println("Ingrese la cadena de caracteres a analizar");
        frase = leer.next();    
        
        largo = frase.length();
        primera = frase.substring(0, 1);
        ultima = frase.substring((largo - 1), largo);
                
        if ("X".equalsIgnoreCase(primera) && "O".equalsIgnoreCase(ultima) && largo == 5) {
            System.out.println("CORRECTO");
            correctas = correctas + 1;
        } else {
            System.out.println("INCORRECTO");  
            incorrectas = incorrectas + 1;
        }
        
        } while (!frase.equalsIgnoreCase("&&&&&"));
        System.out.println("Informe de lecturas:");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
    
}
