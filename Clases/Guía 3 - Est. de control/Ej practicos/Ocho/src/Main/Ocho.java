package Main;

import java.util.Scanner;

public class Ocho {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
       int largo;
       frase = leer.next();
       largo = frase.length();
       if(frase.length() == 8) {
           System.out.println("Correcto");
       }else{
       System.out.println("Incorreccto");
       }
    }
}
