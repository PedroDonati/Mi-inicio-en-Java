package Main;
import java.util.Scanner;
public class Dias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de minutos");
        float minutos, horas, dias;
        minutos = leer.nextFloat();
        horas = minutos / 60;
        dias = horas / 24;
        System.out.println("Esta cantidad de minutos son: ");
        System.out.println("* " + horas + " horas");
        System.out.println("* " + dias + " días");
    }
    
}
