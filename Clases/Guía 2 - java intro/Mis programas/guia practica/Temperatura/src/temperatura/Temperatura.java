package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      float f,c;
      
      System.out.println("Ingrese la temperatura en Celcius");
      c = leer.nextFloat();
      f = 32 + (9 * c / 5);
      System.out.println("En farenheit son; " + f);
    }
    
}
