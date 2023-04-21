package ica;
 
import java.util.Random;

public class MatrizAntisimetrica {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();
        
        for (int i = 0; i <4; i++){
            for (int j = 0; j<4; j++){
            matriz[i][j] = random.nextInt();
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i <4; i++){
            for (int j = 0; j<4; j++){
            System.out.print(matriz[i][j] + " ");
            }
           System.out.println();  
        }
        int[][] matrizt = new int[4][4];
        System.out.println("Matriz traspuesta");
        for (int i = 0; i <4; i++){
            for (int j = 0; j<4; j++){
                matrizt[j][i] = matriz[i][j] * -1;
                System.out.print(matrizt[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}
