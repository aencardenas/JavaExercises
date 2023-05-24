package com.learning.exercise5;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integerNumber;

        System.out.println("Type an integer number: ");
        integerNumber = input.nextInt();

        System.out.println("The double of " + integerNumber + " is: " + 2*integerNumber);
        System.out.println("The triple of " + integerNumber + " is: " + 3*integerNumber);
        System.out.println("The square root of " + integerNumber + " is: " + Math.sqrt(integerNumber));

    }
}
