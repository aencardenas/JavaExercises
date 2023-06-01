package com.learning.exercise30;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dividendo;
        int divisor;
        int cociente =0;

        System.out.println("Digita el dividendo de la division: ");
        dividendo = input.nextInt();

        System.out.println("Digita el divisor de la division: ");
        divisor = input.nextInt();

        // Validar los numeros
        while(dividendo < 1 && divisor < 1){
            System.out.println("Digita los numeros de nuevo, dividendo y divisor deben ser mayor a 1");
            dividendo = input.nextInt();
            divisor = input.nextInt();
        }

        restaSucesiva(dividendo,divisor,cociente);

    }

    public static void restaSucesiva(int dividendo, int divisor, int cociente){
        int resto = 0;

        if(dividendo < divisor){
            cociente = 0;
            resto = divisor;
        } else {

            do{
                resto = dividendo - divisor;
                dividendo = resto;
                cociente += 1;
            }while(resto >= divisor);
        }

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + resto);

    }
}
