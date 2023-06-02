package com.learning.exercise36;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_36 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        float firstNumber = input.nextInt();

        System.out.println("Type another number: ");
        float secondNumber = input.nextInt();

        System.out.println();
        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Option: ");
        int choice = input.nextInt();

        switch(choice){

            case 1:
                System.out.println("The sum is: " + decimalFormat.format(sum(firstNumber,secondNumber)));
                break;
            case 2:
                System.out.println("The substract is: " + decimalFormat.format(subtrac(firstNumber,secondNumber)));
                break;

            case 3:
                System.out.println("The multiplication is: " + decimalFormat.format(multiply(firstNumber,secondNumber)));
                break;
            case 4:
                System.out.println("The division is: " + decimalFormat.format(divide(firstNumber,secondNumber)));
        }
    }


    public static float sum(float firstNumber, float secondNumber){
        return firstNumber + secondNumber;
    }

    public static float subtrac(float firstNumber, float secondNumber){
        return firstNumber - secondNumber;
    }

    public static float multiply(float firstNumber, float secondNumber){
        return firstNumber * secondNumber;
    }

    public static float divide(float firstNumber, float secondNumber){
        return firstNumber / secondNumber;
    }

}
