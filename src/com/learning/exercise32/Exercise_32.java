package com.learning.exercise32;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int cont = 0;

        System.out.println("Type a number: ");
        number = input.nextInt();


        while(number > 0){
            number = number / 10;
            cont += 1;
        }

        System.out.println("La cantidad de digitos es: " + cont);

    }
}
