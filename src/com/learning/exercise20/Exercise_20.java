package com.learning.exercise20;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers;
        int rows = 3;
        int columns = 3;
        boolean filas;
        boolean columnas;
        boolean diagonales;
        int[][] cuadradoMagico = new int[rows][columns];

        System.out.println("Ingresa los digitos del cuadrado magico");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                do {
                    numbers = Integer.parseInt(input.nextLine());
                    if(numbers > 0 && numbers < 10){
                        cuadradoMagico[i][j] = numbers;
                    }else{
                        System.out.println("Digita un numero valido");
                    }
                }while(numbers < 0 || numbers > 9);

            }

        }

        filas = validarFilasCuadradoMagico(cuadradoMagico,rows,columns);
        columnas = validarColumnasCuadradoMagico(cuadradoMagico,rows,columns);
        diagonales = validarDiagonalesCuadradoMagico(cuadradoMagico,rows,columns);

        System.out.println(filas && columnas && diagonales ? "El cuadrado es magico" : "El cuadrado no es magico");
    }

    public static boolean validarFilasCuadradoMagico(int[][] matriz, int rows, int columns){
        int sumaPorFilas = 0;
        int aux = 0;

        //Suma de la primera fila
        for (int i = 0; i < columns; i++) {
            sumaPorFilas += matriz[0][i];
        }

        //Validar la suma de la primera fila con las filas restantes
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                aux += matriz[i][j];
            }

            if(sumaPorFilas != aux){
                return false;
            }

            aux = 0;

        }

        return true;


    }

    public static boolean validarColumnasCuadradoMagico(int[][] matriz, int rows, int columns){
        int sumaPorColumnas = 0;
        int aux = 0;

        //Suma de la primera columna
        for (int i = 0; i < columns; i++) {
            sumaPorColumnas += matriz[i][0];
        }

        //Validar la suma de la primera columna con las columnas restantes
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                aux += matriz[j][i];
            }

            if(sumaPorColumnas != aux){
                return false;
            }

            aux = 0;

        }

        return true;
    }

    public static boolean validarDiagonalesCuadradoMagico(int[][] matriz, int rows, int columns){
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if( i == j){
                    sumaDiagonalPrincipal += matriz[i][j];
                }

                if((i == (rows-1)-j) && (j == (columns-1)-i)){
                    sumaDiagonalSecundaria += matriz[i][j];
                }
            }

        }

        return sumaDiagonalPrincipal == sumaDiagonalSecundaria;

    }


}
