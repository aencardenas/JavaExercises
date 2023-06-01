package com.learning.exercise28;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int max = 0;
        int min = 0;
        boolean logic = false;
        int n;
        float contador = 0f;
        float suma = 0f;
        boolean firstNumber = true;


        while(!logic){

            System.out.println("Type a number: ");
            n = Integer.parseInt(input.nextLine());

            if(n>0){
                contador += 1;
                suma = suma + n;

                if(firstNumber){
                    min = n;
                    max = n;
                    firstNumber = false;

                } else{

                    if(n > max){
                        max = n;
                    }

                    if(n<min){
                        min = n;
                    }
                }
            }
            else{
                logic = true;
            }


        }

        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + decimalFormat.format((suma/contador)));

    }


}


