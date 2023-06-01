package com.learning.exercise31;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        int firstRandomNumber;
        int secondRandomNumber;
        int guessNumber;
        boolean logic;

        logic = false;
        firstRandomNumber = (int)(Math.random()*11);
        secondRandomNumber = (int)(Math.random()*11);

        guessNumber = firstRandomNumber * secondRandomNumber;

        System.out.println("Guess a number between 0 to 100");

        do {
            userNumber = input.nextInt();
            if(userNumber != guessNumber){
                System.out.println("Intentalo de nuevo");
            } else {
                logic = true;
            }

        } while (!logic);

        System.out.println("Congrats, you have guess the number");
    }
}
