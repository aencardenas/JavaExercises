package com.learning.exercise1;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Type two intgers numbers: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();

        System.out.println("The sum of " + firstNumber + " + " + secondNumber + " is " + sum(firstNumber,secondNumber));

    }

    public static int sum(int firstNumber, int secondNumber){
        int totalSum;
        totalSum = firstNumber + secondNumber;
        return totalSum;
    }
}
