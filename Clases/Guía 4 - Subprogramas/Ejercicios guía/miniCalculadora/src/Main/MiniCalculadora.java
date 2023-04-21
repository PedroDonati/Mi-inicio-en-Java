package Main;

import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Elija una opción");
        int opcion = leer.nextInt();
      
        switch (opcion){
            case 1 : Suma();
            break;
            case 2 : Resta();
            break;
            case 3 : Multi();
            break;
            case 4 : Divi();
            break;
        }
    }
    public static float Suma(){
      Scanner leer = new Scanner(System.in);
      float a, b, r;
      System.out.println("Ingrese dos números");
      a = leer.nextInt();
      b = leer.nextInt();
      r = a + b;
      System.out.println(r);
      return (r);
    }
    public static float Resta(){
        System.out.println("Ingrese dos números");
        Scanner leer = new Scanner(System.in);
        float a, b, r;
        a = leer.nextFloat();
        b = leer.nextFloat();
        r = a - b;
        System.out.println(r);
        return (r);
    }
    public static float Multi(){
        Scanner leer = new Scanner(System.in);
        float a, b, r;
        System.out.println("Ingrese dos números");
        a = leer.nextFloat();
        b = leer.nextFloat();
        r = a * b;
        System.out.println(r);
        return (r);
    }
    public static float Divi(){
        Scanner leer = new Scanner(System.in);
        float a, b, r;
        System.out.println("Ingrese dos números");
        a = leer.nextFloat();
        b = leer.nextFloat();
        r = a / b;
        System.out.println(r);
        return (r);
    }
}
