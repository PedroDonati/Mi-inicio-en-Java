package main;

import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Bienvenido a 'El Boliche' ");
        algo();
    }
    public static void algo(){
        Scanner l = new Scanner(System.in);
        String nombre, fin = "Fin";
        int edad;
        do{
            System.out.println("Digame su edad y su nombre");
            nombre = l.next();
            edad = l.nextInt();
            if (edad < 18){
            System.out.println(nombre + ", usted no es mayor de edad. Tiene solo " + edad);
            }else{
            System.out.println(nombre + " pase, usted es mayor de edad");
            }
        }while(!nombre.equals(fin));
    }  
}
