package frase;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Frase {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
       frase = leer.nextLine();
       System.out.println(toUpperCase(frase));
       System.out.println(toLowerCase(frase));
    }
}