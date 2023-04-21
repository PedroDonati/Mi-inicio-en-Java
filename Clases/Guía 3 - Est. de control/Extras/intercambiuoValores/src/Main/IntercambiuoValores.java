package Main;

public class IntercambiuoValores {

    public static void main(String[] args) {
       int a = 1, b = 23, c = 678, d = 234789, aux;
       System.out.println("El valor de A es " + a);
       System.out.println("El valor de B es " + b);
       System.out.println("El valor de C es " + c);
       System.out.println("El valor de D es " + d);
       
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       System.out.println();
       
       System.out.println("El valor de A es " + a);
       System.out.println("El valor de B es " + b);
       System.out.println("El valor de C es " + c);
       System.out.println("El valor de D es " + d);
    }
    
}
