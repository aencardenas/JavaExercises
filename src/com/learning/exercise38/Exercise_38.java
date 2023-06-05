package com.learning.exercise38;

import java.util.Scanner;

public class Exercise_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int number = input.nextInt();

        if(isPrimeNumber(number)){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int number){

        if(number <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
