package com.learning.exercise19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int columns = 3;
        boolean logic = false;

        int[][] matrizA = new int[rows][columns];
        int[][] matrizAT = new int[rows][columns];

        llenarMatriz(matrizA);
        transpuesta(matrizA,matrizAT,rows,columns);


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                logic = (-matrizAT[i][j]) == matrizA[i][j];

            }

        }

        System.out.println("Matriz original");
        imprimirMatriz(matrizA,rows,columns);
        System.out.print("\n");
        System.out.println("Matriz transpuesta con signos invertidos");
        imprimirMatriz(matrizAT,rows, columns);
        System.out.println(logic ? "La matriz es antisimetrica":"La matriz no es antisimetrica");



    }

    public static void llenarMatriz(int[][] matriz){

        matriz[0][0] = 0;
        matriz[0][1] = 3;
        matriz[0][2] = 9;
        matriz[1][0] = -3;
        matriz[1][1] = 0;
        matriz[1][2] = -5;
        matriz[2][0] = -9;
        matriz[2][1] = 5;
        matriz[2][2] = 0;

    }

    public static void transpuesta(int[][] matriz,int[][] matrizT,int rows,int columns){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                matrizT[j][i] = matriz[i][j];

            }

        }
    }

    public static void imprimirMatriz(int[][] matriz, int rows, int columns){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.print("\n");

        }
    }

}
