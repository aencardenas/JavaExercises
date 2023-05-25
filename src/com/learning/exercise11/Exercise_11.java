package com.learning.exercise11;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int choice;
        boolean logic;
        String exit;

        System.out.println("Type the first number: ");
        firstNumber = Integer.parseInt(input.nextLine());
        System.out.println("Type the second number: ");
        secondNumber = Integer.parseInt(input.nextLine());
        logic = false;

        do{
            showMenu();
            choice =Integer.parseInt(input.nextLine());

            switch (choice){

                case 1:
                    System.out.println("The sum is: " + sum(firstNumber,secondNumber));
                    break;

                case 2:
                    System.out.println("The subtraction is: " + subtrac(firstNumber,secondNumber));
                    break;

                case 3:
                    System.out.println("The multiplication is: " + mult(firstNumber,secondNumber));
                    break;

                case 4:
                    System.out.println("The division is: " + div(firstNumber,secondNumber));
                    break;

                case 5:
                    System.out.println("Are you sure you want to exit (S/N): ");
                    exit = input.nextLine();

                    if(exit.equalsIgnoreCase("s")){
                    logic = true;

                    }
                    break;

                default:
                    System.out.println("Type a correct choice");
                    break;
            }

        }while(!logic);

    }

    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Option: ");
    }

    public static int sum(int firstNumber, int secondNumber){

        return firstNumber + secondNumber;
    }

    public static int subtrac(int firstNumber,int secondNumber){

        return firstNumber - secondNumber;
    }

    public static int mult(int firstNumber,int secondNumber){

        return firstNumber * secondNumber;
    }

    public static float div(int firstNumber,int secondNumber){

        return firstNumber / secondNumber;
    }
}
