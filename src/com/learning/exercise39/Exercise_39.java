package com.learning.exercise39;

import java.util.Scanner;


public class Exercise_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] sopaDeLetras = new String[20][20];
        int contadorPalabras = 0;

        //Inicializar la sopa de letras
        inicializarSopa(sopaDeLetras);

        //Validar palabras
        while (contadorPalabras<5) {

            System.out.println("Ingresa una palabra entre 3 y 5 caracteres");
            String palabra = input.nextLine();

            //La palabra debe tener entre 3 y 5 caracteres de longitud
            if (palabra.length() >= 3 && palabra.length() <= 5){
                contadorPalabras += 1;
                ubicarPalabras(sopaDeLetras,palabra);
            } else {
                System.out.println("Ingrese una palabra valida");
            }
        }

        //Llenar los espacios que quedaron vacios en la matriz
        llenarEspaciosVacios(sopaDeLetras);

        //Imprimir matriz
        printMatriz(sopaDeLetras);



    }

    public static void ubicarPalabras(String[][] sopaDeLetras, String palabra){
        int posicion = (int)(Math.random()*20);

        for (int i = 0; i < palabra.length(); i++) {
            // Condicional por si estamos en la ultima posicion del string y no genere
            // StringIndexOutOfBoundsException
            if(i == (palabra.length())-1){
                sopaDeLetras[posicion][i] = String.valueOf(palabra.charAt(i));

            } else{
                //Si no estamos en la ultima posicion se agregan las letras con el metodo substring
                sopaDeLetras[posicion][i] = palabra.substring(i,i+1);
            }

        }

    }

    public static void llenarEspaciosVacios(String[][] sopaDeLetras){
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[0].length; j++) {
                if(sopaDeLetras[i][j].equals("*")){
                    sopaDeLetras[i][j] = String.valueOf((int)(Math.random()*10));
                }
            }

        }
    }

    public static void inicializarSopa(String[][] sopaDeLetras){
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[0].length; j++) {
                sopaDeLetras[i][j] = "*";
            }
        }
    }

    public static void printMatriz(String[][] sopaDeLetras){
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[0].length; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }

            System.out.println();
        }
    }


}
