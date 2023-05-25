package com.learning.exercise18;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 4;
        int columns = 4;
        int[][] matriz = new int[rows][columns];
        int[][] matrizTranspuesta = new int[rows][columns];

        System.out.println("Matriz original");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               matriz[i][j] = (int)(Math.random()*10);
               matrizTranspuesta[j][i] = matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }

            System.out.print("\n");

        }
        System.out.println(" ");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
