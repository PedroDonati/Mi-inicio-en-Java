package main;

import java.util.Scanner;

public class Magia {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int[][] magico = new int[3][3];      

        System.out.println("Ingrese de forma aleatoria numeros del 1 al 9");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                int n = l.nextInt();
                if( n < 0 || n > 10){
                    System.out.println("Error, debe ingresar numeros del 1 al 9");
                return;
                }
                magico[i][j] = n;
            }
        }
        int suma = 15;
        boolean esCuadradoMagico = true;

        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += magico[i][j];
            }
            if (sumaFila != suma) {
                esCuadradoMagico = false;
                break;
            }
        }

        if (esCuadradoMagico) {
            for (int j = 0; j < 3; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 3; i++) {
                    sumaColumna += magico[i][j];
                }
                if (sumaColumna != suma) {
                    esCuadradoMagico = false;
                    break;
                }
            }
        }

        if (esCuadradoMagico) {
            int sumaDiagonal1 = 15;
            int sumaDiagonal2 = 15;
            if (sumaDiagonal1 != suma || sumaDiagonal2 != suma) {
                esCuadradoMagico = false;
            }
        }

        if (esCuadradoMagico) {
            System.out.println("¡Es un cuadrado mágico!");
        } else {
            System.out.println("No es un cuadrado mágico.");
        }
    }
}
