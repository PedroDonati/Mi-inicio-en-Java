package main;

import java.util.Random;

public class Digitos {

    public static void main(String[] args) {
        Random r = new Random();
        int[] vector = new int[10];
        int[] digitos = new int [10];
        
        for (int i = 0; i<10; i++){
        vector[i] = r.nextInt(100000);
        }
        for (int i = 0; i<10; i++ ){
            int n = Math.abs(vector[i]);
            if (vector[i] < 10) {
                digitos[1]++;
            } else if (vector[i] < 100) {
                digitos[2]++;
            } else if (vector[i] < 1000) {
                digitos[3]++;
            } else if (vector[i] < 10000) {
                digitos[4]++;
            } else if (vector[i] < 100000) {
                digitos[5]++;
            }
        }
        
        for (int i = 0; i <10; i++){
        System.out.print(vector[i]);
        System.out.println();
        }
        for (int i = 0; i <10; i++){
            System.out.printf("%d digitos: %d%n", i, digitos[i]);
            System.out.println();
        }
    }
}

