package com.learning.exercise34;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int cont = 1;

        System.out.println("Escribe un numero: ");
        number = input.nextInt();

        /*while(number>0){
            for (int i = 1; i <= cont; i++) {
                System.out.print(i);
            }
            System.out.print("\n");
            cont++;
            number--;
        }*/

        //Iterar desde uno hasta la altura ingresada
        for (int i = 1; i <= number ; i++) {
            //Imprimir los numeros desde 1 hasta el valor actual de i
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }



}



