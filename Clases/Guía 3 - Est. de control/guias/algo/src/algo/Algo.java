package algo;

import java.util.Scanner;

public class Algo {

    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        n2 = leer.nextInt();
        if (n1 >= 25 || n2 >= 25) {
          System.out.println("Uno o ambos números ingresados son iguales o mayores a 25");
        }else { System.out.print("Ninguno de los numeros ingresados son mayores a 25");
    }
    }    
}
