package com.learning.exercise37;

import java.util.Scanner;

public class Exercise_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digita el numero de personas a ingresar: ");
        int numberOfPersons = Integer.parseInt(input.nextLine());
        String[] nombres = new String[numberOfPersons];
        int[] edades = new int[numberOfPersons];

        for (int i = 0; i < numberOfPersons ; i++) {
            System.out.println("Ingresa el nombre de la persona " + (i+1) + ":");
            nombres[i] = input.nextLine();
            System.out.println("Ingresa la edad de la persona " + (i+1) + ":");
            edades[i] = Integer.parseInt(input.nextLine());

        }

        printInformation(nombres, edades);

    }

    public static void printInformation(String[] nombres, int[] edades){
        Scanner input = new Scanner(System.in);
        boolean logic = false;
        String choice = "";

        for (int i = 0; i < nombres.length; i++) {

                if(edades[i] >= 18){

                    System.out.println("Nombre: " + nombres[i] + " Edad: " + edades[i] + " (Mayor de Edad)");

                }else{

                    System.out.println("Nombre: " + nombres[i] + " Edad: " + edades[i] + " (Menor de Edad)");
                }

                if(i == nombres.length){
                    break;
                }
            System.out.println();
            System.out.println("Quieres seguir imprimiendo informacion? (Si/No)");
            choice = input.nextLine();

            if(choice.equalsIgnoreCase("No")){
                break;
            }

        }

    }
}
