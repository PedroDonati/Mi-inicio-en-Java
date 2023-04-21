package principal;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        conversion();
    }
    public static void conversion(){
        Scanner l = new Scanner(System.in); 
        double dollar, euros, yenes, libras;
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = l.nextDouble();
        dollar = euros * 1.28611;
        yenes = euros * 129.852;
        libras = euros * 0.86;
        System.out.println("Esta cantidad de Euros " + euros + " son: ");
        System.out.println("libras" + libras);
        System.out.println("Yenes" +  yenes);
        System.out.println("Dólares" + dollar);
    }
}
