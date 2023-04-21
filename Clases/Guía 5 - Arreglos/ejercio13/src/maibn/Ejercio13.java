package maibn;

import java.util.Scanner;

public class Ejercio13 {

    public static void main(String[] args) {
        String[] equipo = new String[10];
        int i;
        Scanner l = new Scanner(System.in);
        
        for (i = 0; i<10; i++) {
        System.out.println("Ingrese un nombre");
        equipo[i] = l.next();
        }
            
    }
    
}
