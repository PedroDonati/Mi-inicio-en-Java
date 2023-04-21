package main;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = true;
        String letra, v1 = "a", v2 = "e", v3 = "i", v4 = "0", v5 = "u", fin2 = "&&";
        do{
            System.out.println("Ingrese una letra (para terminar el ciclo escriba '&&')");
            letra = sc.next();
            if (letra.equals(v1)|| letra.equals(v2) || letra.equals(v3) || letra.equals(v4) || letra.equals(v5)){
                System.out.println("Su letra es una vocal");
            }else{
                if (letra.equals(fin2)){
                    fin = false;
                }
                else{  
                    System.out.println("Su letra es una consonante");
                }
            }
        }while(fin == true); 
    }
    
}
