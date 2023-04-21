package main;

import java.util.Scanner;

public class Descendente {

      public static void main(String[] args) {
        int[] n = new int[100];
        int i, j;
        Scanner l = new Scanner(System.in);
        for (i = 0; i <100; i++){
        n[i] = i;
        }
        for (j = 99; j >= 0; j--){
        System.out.print(n[j] + " ");
        }
    }
    
}
