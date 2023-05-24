package com.learning.exercise7;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;

        System.out.println("Type the secret word:");
        phrase = input.nextLine();

        if(phrase.equals("eureka")){
            System.out.println("You've guessed the secret word!");
        }else{
            System.out.println(phrase + " isn't the secret word");
        }

    }
}
